package au.com.leighton.portal.peoplefinder.view;


import au.com.leighton.portal.peoplefinder.model.DetailLocation;
import au.com.leighton.portal.peoplefinder.model.DetailPerson;
import au.com.leighton.portal.peoplefinder.model.ResultItemLocation;
import au.com.leighton.portal.peoplefinder.model.ResultItemPerson;
import au.com.leighton.portal.peoplefinder.model.SearchResultLocation;
import au.com.leighton.portal.peoplefinder.model.SearchResultPeople;
import au.com.leighton.portal.peoplefinder.model.ServiceDelegateLocationDetail;
import au.com.leighton.portal.peoplefinder.model.ServiceDelegateLocationSearch;
import au.com.leighton.portal.peoplefinder.model.ServiceDelegatePeopleDetail;
import au.com.leighton.portal.peoplefinder.model.ServiceDelegatePeopleSearch;
import au.com.leighton.portal.peoplefinder.model.StdUtility;

import java.math.BigDecimal;

public class SearchDelegate
{
    private ServiceDelegatePeopleSearch _peopleSearchDelegate =
        new ServiceDelegatePeopleSearch();
    private ServiceDelegatePeopleDetail _peopleDetailDelegate =
        new ServiceDelegatePeopleDetail();
    private ServiceDelegateLocationSearch _locationSearchDelegate =
        new ServiceDelegateLocationSearch();
    private ServiceDelegateLocationDetail _locationDetailDelegate =
        new ServiceDelegateLocationDetail();

    public SearchDelegate()
    {
        super();
    }

    public SearchResultPeople searchPeople(String simpleCriteria)
    {
        SearchResultPeople result = null;

        if (!StdUtility.isNullOrEmpty(simpleCriteria))
        {
            result = _peopleSearchDelegate.doSimpleSearch(simpleCriteria);
        }

        return result;
    }

    public SearchResultPeople searchPeople(AdvancedCriteriaPeople criteria)
    {
        SearchResultPeople result = null;

        if ((criteria != null) && criteria.isValid())
        {
            result =
                    _peopleSearchDelegate.doAdvancedSearch(criteria.getSurname(),
                                                           criteria.getFirstName(),
                                                           criteria.getTitle(), 
                                                           criteria.getDepartment(), 
                                                           criteria.getLocation(), 
                                                           criteria.getBusinessUnit(),
                                                           criteria.getDivision(),
                                                           criteria.getPhone(),
                                                           criteria.getMobile(),
                                                           criteria.getExperience());
        }

        return result;
    }

    public SearchResultPeople searchPeopleAtLocation(BigDecimal locationId)
    {
        SearchResultPeople result = null;

        if (locationId != null)
        {
            result =
                    _peopleSearchDelegate.doPeopleAtLocationSearch(locationId);
        }
        return result;
    }

    public DetailPerson getDetailPerson(ResultItemPerson selectedPerson)
    {
        DetailPerson result = null;

        if (selectedPerson != null)
        {
            result =
                    mergeFields(getDetailPerson(selectedPerson.getPersonId()), selectedPerson);
        }
        return result;
    }

  public DetailPerson getDetailPerson(BigDecimal personId)
  {
      DetailPerson result = null;

      if (personId != null)
      {
          result = _peopleDetailDelegate.getDetailPerson(personId);
      }
      return result;
  }
  
  
  public DetailPerson getDetailPerson(String userName)
  {
      DetailPerson result = null;

      if (userName != null)
      {
          result = _peopleDetailDelegate.getDetailPerson(userName);
      }
      return result;
  }

    public SearchResultLocation searchLocation(String simpleCriteria)
    {
        SearchResultLocation result = null;

        if (!StdUtility.isNullOrEmpty(simpleCriteria))
        {
            result = _locationSearchDelegate.doSimpleSearch(simpleCriteria);
        }

        return result;
    }

    public SearchResultLocation searchLocation(AdvancedCriteriaLocation criteria)
    {
        SearchResultLocation result = null;

        if ((criteria != null) && criteria.isValid())
        {
            result =
                    _locationSearchDelegate.doAdvancedSearch(criteria.getName(),
                                                             criteria.getNotes(),
                                                             criteria.getPhone(),
                                                             criteria.getState(),
                                                             criteria.getSuburbTown());
        }

        return result;
    }


    public DetailLocation getDetailLocation(ResultItemLocation selectedLocation)
    {
        DetailLocation result = null;

        if (selectedLocation != null)
        {
            result =
                    mergeFields(_locationDetailDelegate.getDetailLocation(selectedLocation),
                                selectedLocation);
        }
        return result;
    }

    /**
     * This method will populate any missing fields in the detail object if they exist in the selected person object
     * @param detailPerson
     * @param selectedPerson
     * @return
     */
    private DetailPerson mergeFields(DetailPerson detailPerson,
                                     ResultItemPerson selectedPerson)
    {
        if ((detailPerson != null) && (selectedPerson != null))
        {
            detailPerson.setPersonId(selectValue(detailPerson.getPersonId(),
                                                 selectedPerson.getPersonId(),
                                                 detailPerson.getPersonId()));
            detailPerson.setFirstName(selectValue(detailPerson.getFirstName(),
                                                  selectedPerson.getFirstName(),
                                                  detailPerson.getFirstName()));
            detailPerson.setSurname(selectValue(detailPerson.getSurname(),
                                                selectedPerson.getSurname(),
                                                detailPerson.getSurname()));
            detailPerson.setTitle(selectValue(detailPerson.getTitle(),
                                              selectedPerson.getTitle(),
                                              detailPerson.getTitle()));
            detailPerson.setDepartment(selectValue(detailPerson.getDepartment(),
                                                   selectedPerson.getDepartment(),
                                                   detailPerson.getDepartment()));
            detailPerson.setDepartmentId(selectValue(detailPerson.getDepartmentId(),
                                                     selectedPerson.getDepartmentId(),
                                                     detailPerson.getDepartmentId()));
            detailPerson.setLocationId(selectValue(detailPerson.getLocationId(),
                                                   selectedPerson.getLocationId(),
                                                   detailPerson.getLocationId()));
            detailPerson.setLocation(selectValue(detailPerson.getLocation(),
                                                 selectedPerson.getLocationName(),
                                                 detailPerson.getLocation()));
        }

        return detailPerson;
    }

    private BigDecimal selectValue(BigDecimal firstValue,
                                   BigDecimal secondValue,
                                   BigDecimal defaultValue)
    {
        if ((firstValue != null) && (secondValue != null))
        {
            return defaultValue;
        }
        else if (firstValue != null)
        {
            return firstValue;
        }
        else if (secondValue != null)
        {
            return secondValue;
        }
        else

        {
            return defaultValue;
        }
    }

    private String selectValue(String firstValue, String secondValue,
                               String defaultValue)
    {
        if (!StdUtility.isNullOrEmpty(firstValue) &&
            !StdUtility.isNullOrEmpty(secondValue))
        {
            return defaultValue;
        }
        else if (!StdUtility.isNullOrEmpty(firstValue))
        {
            return firstValue;
        }
        else if (!StdUtility.isNullOrEmpty(secondValue))
        {
            return secondValue;
        }
        else

        {
            return defaultValue;
        }
    }

    /**
     * This method will populate any missing fields in the detail object if they exist in the selected location object
     * @param detailLocation
     * @param selectedLocation
     * @return
     */
    private DetailLocation mergeFields(DetailLocation detailLocation,
                                       ResultItemLocation selectedLocation)
    {
        if ((detailLocation != null) && (selectedLocation != null))
        {
            detailLocation.setFaxNo(selectValue(detailLocation.getFaxNo(),
                                                selectedLocation.getFaxNo(),
                                                detailLocation.getFaxNo()));
            detailLocation.setLocationId(selectValue(detailLocation.getLocationId(),
                                                     selectedLocation.getLocationId(),
                                                     detailLocation.getLocationId()));
            detailLocation.setLocationName(selectValue(detailLocation.getLocationName(),
                                                       selectedLocation.getName(),
                                                       detailLocation.getLocationName()));
            detailLocation.setPublishedPhone(selectValue(detailLocation.getPublishedPhone(),
                                                         selectedLocation.getPublishedPhone(),
                                                         detailLocation.getPublishedPhone()));

        }

        return detailLocation;
    }
}

