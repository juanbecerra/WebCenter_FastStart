package au.com.leighton.portal.peoplefinder.view;


import au.com.leighton.portal.peoplefinder.model.DetailPerson;
import au.com.leighton.portal.peoplefinder.model.ResultItemPerson;
import au.com.leighton.portal.peoplefinder.model.SearchResultPeople;
import au.com.leighton.portal.peoplefinder.model.StdUtility;

import java.math.BigDecimal;

import org.apache.myfaces.trinidad.model.ChildPropertyTreeModel;
import org.apache.myfaces.trinidad.model.TreeModel;


public class PeopleDelegate extends AbstractItemDelegate
{
    @SuppressWarnings("compatibility:-6532150250132337710")
    private static final long serialVersionUID = 1L;
    private transient TreeModel _treeModel;
    private DetailPerson detailPerson;

    public static PeopleDelegate getPeopleDelegate(){
        PeopleFinderBean bean = new PeopleFinderBean();
        PeopleDelegate delegate = new PeopleDelegate(bean);
        return delegate;
    }
    
    protected static PeopleDelegate simpleSearch(PeopleFinderBean bean,
                                                 String simpleSearcgCriteria)
    {
        PeopleDelegate result = new PeopleDelegate(bean);
        result.doSimpleSearch(simpleSearcgCriteria);

        return result;
    }

    protected static PeopleDelegate advancedSearch(PeopleFinderBean bean,
                                                   AdvancedCriteriaPeople criteria)
    {
        PeopleDelegate result = new PeopleDelegate(bean);
        result.doAdvancedSearch(criteria);

        return result;
    }

    protected static PeopleDelegate searchAtLocation(PeopleFinderBean bean,
                                                     BigDecimal locationId)
    {
        PeopleDelegate result = new PeopleDelegate(bean);
        result.doSearchAtLocation(locationId);

        return result;
    }

    private PeopleDelegate(PeopleFinderBean bean)
    {
        super(bean);
    }
    

    private void doSimpleSearch(String simpleSearchCriteria)
    {
        if (StdUtility.isNullOrEmpty(simpleSearchCriteria))
        {
            setErrorMessage("Invalid search criteria");
        }
        else
        {
            setResult(getSearchDelegate().searchPeople(simpleSearchCriteria));
        }
    }

    private void doSearchAtLocation(BigDecimal locationId)
    {
        if (locationId == null)
        {
            setErrorMessage("Invalid location");
        }
        else
        {
            setResult(getSearchDelegate().searchPeopleAtLocation(locationId));
        }
    }

    private void doAdvancedSearch(AdvancedCriteriaPeople criteria)
    {
        if ((criteria != null) && criteria.isValid())
        {
            setResult(getSearchDelegate().searchPeople(criteria));
        }
        else
        {
            setErrorMessage("Invalid search criteria");
        }
    }

    protected void setSelectedResultItem(int index)
    {
        SearchResultPeople searchResults = (SearchResultPeople)getResult();

        if ((searchResults != null) && (searchResults.getResults() != null) &&
            (index < searchResults.getResults().size()))
        {
            ResultItemPerson selectedResult =
                searchResults.getResults().get(index);

            if ((selectedResult != null) &&
                ((getSelectedItem() != null) && (((DetailPerson)getSelectedItem()).getPersonId().intValue() !=
                                                 selectedResult.getPersonId().intValue())) ||
                (getSelectedItem() == null))
            {
                DetailPerson person =
                    getSearchDelegate().getDetailPerson(selectedResult.getPersonId());

                if (person != null)
                {
                    if (!StdUtility.isNullOrEmpty(person.getErrorMessage()))
                    {
                        setErrorMessage(person.getFullName() + ":" +
                                        person.getErrorMessage());
                    }
                    else
                    {
                        setSelectedItem(person);

                        _treeModel =
                                new ChildPropertyTreeModel(person.getReportingLine(),
                                                           "children");

                    }
                }
            }
        }
    }

    /**
     * @param personID
     * @param personUsername
     * @param origin
     */
    public void setClickedItem(BigDecimal personID, String personUsername, DetailPerson origin)
  {
    DetailPerson person = null;
    if (personID !=null)
    { person =
        getSearchDelegate().getDetailPerson(personID);
    }else
    {
          person =getSearchDelegate().getDetailPerson(personUsername);
    }

    if (person != null)
    { 
      person.setClickedError(null);
        if (!StdUtility.isNullOrEmpty(person.getErrorMessage()))
        {
           // setErrorMessage("Clicked " + personUsername + ":" + person.getErrorMessage());
            
            person =origin;
            person.setClickedError("Unable to get details for "+personUsername);
        }
            setSelectedItem(person);
            detailPerson = person;
            _treeModel =
                    new ChildPropertyTreeModel(person.getReportingLine(),
                                               "children");

    }  
  }

    protected TreeModel getTreeModel()
    {
        return _treeModel;
    }

    protected boolean isPersonDelegate()
    {
        return true;
    }

    public void setDetailPerson(DetailPerson detailPerson) {
        this.detailPerson = detailPerson;
    }

    public DetailPerson getDetailPerson() {
        return detailPerson;
    }
}
