package au.com.leighton.portal.peoplefinder.view;


import au.com.leighton.portal.peoplefinder.model.DetailLocation;
import au.com.leighton.portal.peoplefinder.model.DetailPerson;
import au.com.leighton.portal.peoplefinder.model.ResultItemLocation;
import au.com.leighton.portal.peoplefinder.model.SearchResultLocation;
import au.com.leighton.portal.peoplefinder.model.StdUtility;

import java.math.BigDecimal;


public class LocationDelegate extends AbstractItemDelegate
{
    @SuppressWarnings("compatibility:-1208389595638928899")
    private static final long serialVersionUID = 1L;

    protected static LocationDelegate simpleSearch(PeopleFinderBean bean,
                                                   String simpleSearcgCriteria)
    {
        LocationDelegate result = new LocationDelegate(bean);
        result.doSimpleSearch(simpleSearcgCriteria);

        return result;
    }

    protected static LocationDelegate advancedSearch(PeopleFinderBean bean,
                                                     AdvancedCriteriaLocation criteria)
    {
        LocationDelegate result = new LocationDelegate(bean);
        result.doAdvancedSearch(criteria);

        return result;
    }

    private LocationDelegate(PeopleFinderBean bean)
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
            setResult((getSearchDelegate().searchLocation(simpleSearchCriteria)));
        }
    }

    private void doAdvancedSearch(AdvancedCriteriaLocation criteria)
    {
        if ((criteria != null) && criteria.isValid())
        {
            setResult(getSearchDelegate().searchLocation(criteria));
        }
        else
        {
            setErrorMessage("Invalid search criteria");
        }
    }

    protected void setSelectedResultItem(int index)
    {
        SearchResultLocation searchResults = (SearchResultLocation)getResult();

        if ((searchResults != null) && (searchResults.getResults() != null) &&
            (index < searchResults.getResults().size()))
        {
            ResultItemLocation selectedResult =
                searchResults.getResults().get(index);

            if ((selectedResult != null) &&
                ((getSelectedItem() != null) && (((DetailLocation)getSelectedItem()).getLocationId().intValue() !=
                                                 selectedResult.getLocationId().intValue())) ||
                (getSelectedItem() == null))
            {
                DetailLocation location =
                    getSearchDelegate().getDetailLocation(selectedResult);

                if (location != null)
                {
                    if (!StdUtility.isNullOrEmpty(location.getErrorMessage()))
                    {
                        setErrorMessage(location.getLocationName() + ":" +
                                        location.getErrorMessage());
                    }
                    else
                    {
                        setSelectedItem(location);
                    }
                }
            }
        }
    }

    protected boolean isLocationDelegate()
    {
        return true;
    }
    
  public void setClickedItem(BigDecimal personID, String personUsername, DetailPerson origin)
  {
      }
}
