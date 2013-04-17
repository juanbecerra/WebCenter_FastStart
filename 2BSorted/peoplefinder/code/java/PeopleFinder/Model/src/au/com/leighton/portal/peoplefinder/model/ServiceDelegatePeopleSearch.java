package au.com.leighton.portal.peoplefinder.model;


import au.com.leighton.portal.peoplefinder.model.peoplesearch.PhoSearchPeople;
import au.com.leighton.portal.peoplefinder.model.peoplesearch.Phosearchpeople_client_ep;
import au.com.leighton.portal.peoplefinder.model.peoplesearch.generated.PhoSearchOutput;

import java.math.BigDecimal;

import java.net.URL;

import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Holder;
import javax.xml.ws.WebServiceRef;


/**
 * Encapsulates the people search service call
 */
public class ServiceDelegatePeopleSearch extends ServiceDelegate
{
    @WebServiceRef
    private Phosearchpeople_client_ep _peopleSearchProxy = null;

    public ServiceDelegatePeopleSearch()
    {
        super();
    }

    private Phosearchpeople_client_ep getProxy()
    {
        if (_peopleSearchProxy == null)
        {
            try
            {
                URL wsdl = new URL(Utility.getPeopleSearchWSDL());
                QName qName =
                    new QName(Utility.getPeopleSearchNameSpace(), Utility.getPeopleSearchServiceName());

                _peopleSearchProxy =
                        new Phosearchpeople_client_ep(wsdl, qName);
            }
            catch (Exception e)
            {
                LogUtility.logWarning("Unable to initiate connection to Person Search Service",
                                      e);
            }

        }

        return _peopleSearchProxy;
    }

    public SearchResultPeople doSimpleSearch(String simpleSearchCriteria)
    {
        return doSearch("S", simpleSearchCriteria, null, null, null, null,
                        null, null, null, null, null, null, null);
    }

    public SearchResultPeople doAdvancedSearch(String surname,
                                               String firstName, String title,
                                               String dept, String location,
                                               String busUnit, String division,
                                               String phone, String mobile, String experience)
    {
        return doSearch("A", null, surname, firstName, title, dept, location,
                        busUnit, division, phone, mobile, null, experience);
    }

    public SearchResultPeople doPeopleAtLocationSearch(BigDecimal locationId)
    {
        return doSearch("L", null, null, null, null, null, null, null, null,
                        null, null, locationId, null);
    }

    private SearchResultPeople doSearch(String searchType, String simpleSearch,
                                        String surname, String firstName,
                                        String title, String dept,
                                        String location, String busUnit,
                                        String division, String phone,
                                        String mobile, BigDecimal locationId, String experience)
    {
        SearchResultPeople result = new SearchResultPeople();

        if (getProxy() != null)
        {
            try
            {
                PhoSearchPeople phoSearchPeople =
                    getProxy().getPhoSearchPeople_pt();

                Holder<BigDecimal> numfound = new Holder<BigDecimal>();
                Holder<String> serviceResult = new Holder<String>();
                Holder<List<PhoSearchOutput>> searchOutput =
                    new Holder<List<PhoSearchOutput>>();

                phoSearchPeople.process(valueOrBlank(searchType),
                                        valueOrBlank(simpleSearch), locationId,
                                        valueOrBlank(surname),
                                        valueOrBlank(firstName),
                                        valueOrBlank(title),
                                        valueOrBlank(dept),
                                        valueOrBlank(location),
                                        valueOrBlank(busUnit),
                                        valueOrBlank(division),
                                        valueOrBlank(phone),
                                        valueOrBlank(mobile), 
                                        valueOrBlank(experience),
                                        numfound,
                                        serviceResult, searchOutput);

                if ("OK".equalsIgnoreCase(serviceResult.value))
                {
                    result.setTotalResults(numfound.value.intValue());

                    if ((searchOutput.value != null) &&
                        (searchOutput.value.size() > 0))
                    {
                        result.setActualResults(searchOutput.value.size());

                        for (PhoSearchOutput person : searchOutput.value)
                        {
                            result.getResults().add(new ResultItemPerson(person.getPPERSONID(),
                                                                         person.getPFIRSTNAME(),
                                                                         person.getPSURNAME(),
                                                                         person.getPTITLE(),
                                                                         person.getPDEPTNAME(),
                                                                         person.getPDEPTID(),
                                                                         person.getLNAME(),
                                                                         person.getLLOCATIONID()));
                        }
                    }
                }
                else
                {
                    if (StdUtility.isNullOrEmpty(serviceResult.value))
                    {
                        result.setError("Failed to perform search operation");
                    }
                    else
                    {
                        result.setError(serviceResult.value);
                    }
                }
            }
            catch (Exception e)
            {
                result.setError(e.getMessage());
                _peopleSearchProxy =
                        null; // clear the proxy so it reinitialises next time
            }
        }

        return result;
    }
}
