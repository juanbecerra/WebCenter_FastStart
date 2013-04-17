package au.com.leighton.portal.peoplefinder.model;


import au.com.leighton.portal.peoplefinder.model.locationdetail.PhoGetLocationDetail;
import au.com.leighton.portal.peoplefinder.model.locationdetail.Phogetlocationdetail_client_ep;
import au.com.leighton.portal.peoplefinder.model.locationdetail.generated.PhoGetLocationDetailOutput;

import java.net.URL;

import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Holder;


public class ServiceDelegateLocationDetail extends ServiceDelegate
{
    private Phogetlocationdetail_client_ep _locationDetailProxy = null;

    public ServiceDelegateLocationDetail()
    {
        super();
    }

    private Phogetlocationdetail_client_ep getProxy()
    {
        if (_locationDetailProxy == null)
        {
            try
            {
                URL wsdl = new URL(Utility.getLocationDetailWSDL());
                QName qName =
                    new QName(Utility.getLocationDetailNameSpace(), Utility.getLocationDetailServiceName());

                _locationDetailProxy =
                        new Phogetlocationdetail_client_ep(wsdl, qName);
            }
            catch (Exception e)
            {
                LogUtility.logWarning("Unable to initiate connection to Location Detail Service",
                                      e);
            }
        }

        return _locationDetailProxy;
    }

    public DetailLocation getDetailLocation(ResultItemLocation selectedLocation)
    {
        DetailLocation result = null;

        if ((getProxy() != null) && (selectedLocation != null))
        {
            result = new DetailLocation();
            result.setErrorMessage("Unable to retrieve information for " +
                            selectedLocation.getName());

            try
            {
                PhoGetLocationDetail phoGetLocationDetail =
                    getProxy().getPhoGetLocationDetail_pt();

                Holder<String> serviceResult = new Holder<String>();
                Holder<List<PhoGetLocationDetailOutput>> phoLocation =
                    new Holder<List<PhoGetLocationDetailOutput>>();

                phoGetLocationDetail.process(selectedLocation.getLocationId(),
                                             serviceResult, phoLocation);

                if ("OK".equalsIgnoreCase(serviceResult.value))
                {
                    if ((phoLocation.value != null) &&
                        (phoLocation.value.size() == 1))
                    {
                        PhoGetLocationDetailOutput output =
                            phoLocation.value.get(0);
                        result.setErrorMessage(null);

                        result.setAddress1(output.getADDRESS1());
                        result.setAddress2(output.getADDRESS2());
                        result.setAdminEmail(output.getADMINEMAIL());
                        result.setCompanyId(output.getCOMPANYID());
                        result.setCompanyName(output.getCOMPANYNAME());
                        result.setEmail(output.getEMAIL());
                        result.setFaxNo(output.getFAXNO());
                        result.setLocationId(output.getLOCATIONID());
                        result.setLocationName(output.getLOCNNAME());
                        result.setNote(output.getNOTE());
                        result.setPoBoxAddress(output.getPOBOXADDRESS());
                        result.setPoBoxPostCode(output.getPOBOXPOSTCODE());
                        result.setPoBoxState(output.getPOBOXSTATE());
                        result.setPoBoxSuburb(output.getPOBOXSUBURB());
                        result.setPostcode(output.getPOSTCODE());
                        result.setPublishedPhone(output.getPUBLISHEDPH());
                        result.setState(output.getSTATE());
                        result.setSuburb(output.getSUBURB());
                        result.setVpn(output.getVPN());
                    }
                    else
                    {
                        result.setErrorMessage(selectedLocation.getName() +
                                        " : Failed to retrieve detailed information");
                    }
                }
                else
                {
                    if (StdUtility.isNullOrEmpty(serviceResult.value))
                    {
                        result.setErrorMessage(selectedLocation.getName() +
                                        " : Failed to retrieve detailed information");
                    }
                    else
                    {
                        result.setErrorMessage(selectedLocation.getName() + " : " +
                                        serviceResult.value);
                    }
                }
            }
            catch (Exception e)
            {
                result.setErrorMessage(e.getMessage());
                _locationDetailProxy =
                        null; // clear the proxy so it reinitialises next time
            }
        }
        return result;
    }
}
