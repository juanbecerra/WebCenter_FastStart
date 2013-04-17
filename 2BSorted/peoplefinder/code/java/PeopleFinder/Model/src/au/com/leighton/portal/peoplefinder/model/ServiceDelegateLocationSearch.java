package au.com.leighton.portal.peoplefinder.model;


import au.com.leighton.portal.peoplefinder.model.locationsearch.PhoSearchLocations;
import au.com.leighton.portal.peoplefinder.model.locationsearch.Phosearchlocations_client_ep;
import au.com.leighton.portal.peoplefinder.model.locationsearch.generated.PhoLocation;

import java.math.BigDecimal;

import java.net.URL;

import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Holder;
import javax.xml.ws.WebServiceRef;


/**
 * Encapsulates the location search service
 */
public class ServiceDelegateLocationSearch extends ServiceDelegate
{
    @WebServiceRef
    private Phosearchlocations_client_ep _locationSearchProxy = null;

    public ServiceDelegateLocationSearch()
    {
        super();
    }

    private Phosearchlocations_client_ep getProxy()
    {
        if (_locationSearchProxy == null)
        {
            try
            {
                URL wsdl = new URL(Utility.getLocationSearchWSDL());
                QName qName =
                    new QName(Utility.getLocationSearchNameSpace(), Utility.getLocationSearchServiceName());

                _locationSearchProxy =
                        new Phosearchlocations_client_ep(wsdl, qName);
            }
            catch (Exception e)
            {
                LogUtility.logWarning("Unable to initiate connection to Location Search Service",
                                      e);
            }
        }

        return _locationSearchProxy;
    }

    public SearchResultLocation doSimpleSearch(String simpleCriteria)
    {
        return doSearch("S", simpleCriteria, null, null, null, null, null);
    }

    public SearchResultLocation doAdvancedSearch(String name, String notes,
                                                 String phone, String state,
                                                 String suburbTown)
    {
        return doSearch("A", null, name, notes, phone, state, suburbTown);
    }

    private SearchResultLocation doSearch(String searchType,
                                          String simpleSearch, String name,
                                          String notes, String phone,
                                          String state, String suburbTown)
    {
        SearchResultLocation result = new SearchResultLocation();

        if (getProxy() != null)
        {
            try
            {
                PhoSearchLocations phoSearchLocations =
                    getProxy().getPhoSearchLocations_pt();

                Holder<BigDecimal> numfound = new Holder<BigDecimal>();
                Holder<String> serviceResult = new Holder<String>();
                Holder<List<PhoLocation>> searchOutput =
                    new Holder<List<PhoLocation>>();
                phoSearchLocations.process(searchType,
                                           valueOrBlank(simpleSearch),
                                           valueOrBlank(name),
                                           valueOrBlank(null),
                                           valueOrBlank(suburbTown),
                                           valueOrBlank(state),
                                           valueOrBlank(phone),
                                           valueOrBlank(null),
                                           valueOrBlank(notes), numfound,
                                           serviceResult, searchOutput);

                if ("OK".equalsIgnoreCase(serviceResult.value))
                {
                    result.setTotalResults(numfound.value.intValue());

                    if ((searchOutput.value != null) &&
                        (searchOutput.value.size() > 0))
                    {
                        result.setActualResults(searchOutput.value.size());

                        for (PhoLocation location : searchOutput.value)
                        {
                            result.getResults().add(new ResultItemLocation(location.getCompanyId().getValue(),
                                                                           location.getCompanyName().getValue(),
                                                                           location.getFaxNo().getValue(),
                                                                           location.getLocationId(),
                                                                           location.getName().getValue(),
                                                                           location.getPublishedPh().getValue()));
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
                _locationSearchProxy =
                        null; // clear the proxy so it reinitialises next time
            }
        }

        return result;
    }
}
