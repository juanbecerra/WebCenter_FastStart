package au.com.leighton.portal.peoplefinder.view;


import au.com.leighton.portal.peoplefinder.model.DetailItem;
import au.com.leighton.portal.peoplefinder.model.DetailPerson;
import au.com.leighton.portal.peoplefinder.model.SearchResult;
import au.com.leighton.portal.peoplefinder.model.StdUtility;

import java.io.Serializable;

import java.math.BigDecimal;

import javax.faces.component.UIComponent;

import oracle.adf.view.rich.component.rich.data.RichTable;

import org.apache.myfaces.trinidad.event.SelectionEvent;
import org.apache.myfaces.trinidad.model.CollectionModel;
import org.apache.myfaces.trinidad.model.RowKeySet;
import org.apache.myfaces.trinidad.model.RowKeySetImpl;


public abstract class AbstractItemDelegate implements Serializable
{
    @SuppressWarnings("compatibility:-8293699003571265316")
    private static final long serialVersionUID = 1L;
    private PeopleFinderBean _bean;
    private String _errorMessage;
    private SearchResult _result;

    protected AbstractItemDelegate(PeopleFinderBean bean)
    {
        super();

        _bean = bean;
    }

    protected SearchDelegate getSearchDelegate()
    {
        return _bean.getSearchDelegate();
    }

    protected boolean isErrored()
    {
        return !StdUtility.isNullOrEmpty(getErrorMessage());
    }

    protected void setErrorMessage(String errorMessage)
    {
        this._errorMessage = errorMessage;
    }

    protected String getErrorMessage()
    {
        return _errorMessage;
    }

    protected void setResult(SearchResult result)
    {
        this._result = result;

        if ((result != null) && (result.getActualResults() > 0))
        {
                        UIComponent tableObj = null;
            
                        if (isPersonDelegate())
                        {
                        tableObj = StdUtility.findControl("tResPeo");
                        }
                        else if (isLocationDelegate())
                        {
                          tableObj = StdUtility.findControl("tResLoc");
                        }
            
                        if (tableObj instanceof RichTable)
                        {
                            RichTable table =(RichTable)tableObj;
                            RowKeySet rks = new RowKeySetImpl();
                            table.setRowIndex(0);
                            rks.add(table.getRowKey());
                            table.setSelectedRowKeys(rks);
                          /*  CollectionModel model = (CollectionModel)table.getValue();
                            int rowcount = model.getRowCount();
                            model.setRowIndex(0);
                            rks.add(model.getRowKey());
                            table.setSelectedRowKeys(rks);*/
                        }
             //Issue 2 - select first item in results
           setSelectedResultItem(0);
        }
    }

    protected SearchResult getResult()
    {
        return _result;
    }

    protected String getSearchSummary()
    {
        String result = null;

        if (isErrored())
        {
            result = getErrorMessage();
        }
        else
        {
            StringBuffer sb = new StringBuffer();

            int total = getResult().getTotalResults();

            if (total == 0)
            {
                sb.append("No Records match the selected criteria");
            }
            else
            {
                sb.append(total);
                sb.append(" item");
                if (total > 1)
                {
                    sb.append("s");
                }
                sb.append(" found. ");

                total = getResult().getActualResults();

                sb.append(total);
                sb.append(" item");
                if (total > 1)
                {
                    sb.append("s");
                }
                sb.append(" returned.");
            }

            result = sb.toString();
        }

        return result;
    }

    /**
     * @param index
     */
    protected abstract void setSelectedResultItem(int index);
  protected abstract void setClickedItem(BigDecimal personID, String personUsername, DetailPerson origin);

    protected boolean isPersonDelegate()
    {
        return false;
    }

    protected boolean isLocationDelegate()
    {
        return false;
    }

    protected void itemSelected(SelectionEvent selectionEvent)
    {
        if (selectionEvent != null)
        {
            RowKeySet keySet = selectionEvent.getAddedSet();

            if ((keySet != null) && !keySet.isEmpty())
            {
                Object[] keys = keySet.toArray();

                if ((keys != null) && (keys.length > 0) &&
                    (keys[0] instanceof Integer))
                {
                    int index = (Integer)keys[0];

                    setSelectedResultItem(index);
                    
                }
            }
        }
    
    }

    /**
     * @param personID
     * @param personUsername
     */
    protected void itemClicked(BigDecimal personID, String personUsername)
  {
      if (personID != null || !StdUtility.isNullOrEmpty(personUsername))
      {
        setClickedItem(personID, personUsername, _bean.getSelectedPerson());
      }
  
  }

    protected void setSelectedItem(DetailItem item)
    {
        _bean.setSelectedItem(item);
    }

    protected DetailItem getSelectedItem()
    {
        return isLocationDelegate() ? _bean.getSelectedLocation() :
               _bean.getSelectedPerson();
    }
}
