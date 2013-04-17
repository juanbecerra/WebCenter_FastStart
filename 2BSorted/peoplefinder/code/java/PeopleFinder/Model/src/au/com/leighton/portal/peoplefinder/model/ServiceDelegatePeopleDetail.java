package au.com.leighton.portal.peoplefinder.model;


import au.com.leighton.portal.peoplefinder.model.peopledetail.PhoGetPersonDetail;
import au.com.leighton.portal.peoplefinder.model.peopledetail.Phogetpersondetail_client_ep;
import au.com.leighton.portal.peoplefinder.model.peopledetail.generated.Experience;
import au.com.leighton.portal.peoplefinder.model.peopledetail.generated.PhoGetPersonDetailOutput;
import au.com.leighton.portal.peoplefinder.model.peopledetail.generated.ReportLine;

import au.com.leighton.portal.peoplefinder.model.peopledetail.generated.Spaces;
import au.com.leighton.portal.peoplefinder.model.peopledetail.generated.WCconnections;

import java.math.BigDecimal;

import java.net.URL;

import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Holder;
import javax.xml.ws.WebServiceRef;


/**
 * Encapsulates the people detail service
 */
public class ServiceDelegatePeopleDetail extends ServiceDelegate
{
    @WebServiceRef
    private Phogetpersondetail_client_ep _personDetailProxy = null;

    public ServiceDelegatePeopleDetail()
    {
        super();
    }

    private Phogetpersondetail_client_ep getProxy()
    {
        if (_personDetailProxy == null)
        {
            try
            {
                URL wsdl = new URL(Utility.getPeopleDetailWSDL());
                QName qName =
                    new QName(Utility.getPeopleDetailNameSpace(), Utility.getPeopleDetailServiceName());

                _personDetailProxy =
                        new Phogetpersondetail_client_ep(wsdl, qName);
            }
            catch (Exception e)
            {
                LogUtility.logWarning("Unable to initiate connection to Person Detail Service",
                                      e);
            }
        }

        return _personDetailProxy;
    }

    public DetailPerson getDetailPerson(BigDecimal personId)
    {
        return getDetailPerson(personId, null);
    }

    public DetailPerson getDetailPerson(String userName)
    {
        return getDetailPerson(null, userName);
    }

    private DetailPerson getDetailPerson(BigDecimal personId,
                                         String userName)
    {
        DetailPerson result = null;

        if ((getProxy() != null) &&
            ((personId != null) || !StdUtility.isNullOrEmpty(userName)))
        {
            result = new DetailPerson();
            result.setErrorMessage("Unable to retrieve information for Username " +
                                   userName);

            try
            {
                PhoGetPersonDetail phoGetPersonDetail =
                    getProxy().getPhoGetPersonDetail_pt();

                Holder<String> serviceResult = new Holder<String>();
                Holder<List<PhoGetPersonDetailOutput>> phoPerson =
                    new Holder<List<PhoGetPersonDetailOutput>>();

                phoGetPersonDetail.process(personId,
                                           valueOrBlank(userName),
                                           serviceResult, phoPerson);

                if ("OK".equalsIgnoreCase(serviceResult.value))
                {
                    if ((phoPerson.value != null) &&
                        (phoPerson.value.size() == 1))
                    {
                        PhoGetPersonDetailOutput output =
                            phoPerson.value.get(0);
                        result.setErrorMessage(null);
                        result.setPersonId(output.getPPersonId());
                        result.setSurname(output.getPSurname());
                        result.setFirstName(output.getPFirstName());
                        result.setTitle(output.getPTitle());
                        result.setDepartmentId(output.getDDeptId());
                        result.setDepartment(output.getDDeptName());
                        result.setLocationId(output.getLLocationId());
                        result.setLocation(output.getLocnName());
                        result.setLocationAddress1(output.getLAddress1());
                        result.setLocationAddress2(output.getLAddress2());
                        result.setLocationSuburb(output.getLSuburb());
                        result.setLocationState(output.getLState());
                        result.setLocationPostcode(output.getLPostcode());
                        result.setCompany(output.getCompany());
                        result.setMainVpn(output.getPMainVpn());
                        result.setMainPhone(output.getPMainPh());
                        result.setLocationFax(output.getLFaxNo());
                        result.setMobile(output.getMobile());
                        result.setPhotoData(Utility.resizePhoto(output.getPhoto()));
                        result.setEmail(output.getPEmail());
                        result.setNote(output.getPNote());
                        result.setAdminEmail(output.getAdminEmail());
                        //result.setWebcenterUsername(output.getWcUsername());
                        result.setWebcenterUsername("weblogicadmin");
                        result.setUserName(output.getUsername());
                        result.setPersonalAssistantName(output.getPaName());
                        result.setPersonalAssistantId(output.getPaPersonId());
                        buildReportingLine(result, output.getReportLine());
                        buildWCSConnections(result, output.getWCconnections());
                        buildWCSSpacesModerated(result, output.getSpaces());

                        if ((output.getExperience() != null) &&
                            (output.getExperience().size() > 0))
                        {
                            for (Experience experience :
                                 output.getExperience())
                            {
                                ExperienceItem ei = new ExperienceItem();
                                ei.setCompany(experience.getCOMPANY());
                                ei.setLocation(experience.getLOCATION());
                                ei.setRole(experience.getROLE());
                                ei.setDescription(experience.getJOBDESCRIPTION());
                                ei.setFromDate(experience.getSTARTDATE() ==
                                               null ? null :
                                               experience.getSTARTDATE().toGregorianCalendar().getTime());
                                ei.setToDate(experience.getENDDATE() == null ?
                                             null :
                                             experience.getENDDATE().toGregorianCalendar().getTime());
                                result.getExperience().add(ei);
                            }
                        }
                        
                        
                        
                    }
                    else
                    {
                       if(StdUtility.isNullOrEmpty(userName))
                       {
                             result.setErrorMessage("Unable to retrieve information for Username " +
                                                    userName);
                           }
                    }
                }
                else
                {
                    if (StdUtility.isNullOrEmpty(serviceResult.value))
                    {
                       
                      if(StdUtility.isNullOrEmpty(userName))
                      { 
                            result.setErrorMessage("Unable to retrieve information for Username " +
                                                   userName);
                      }
                    }
                    else
                    {
                        result.setErrorMessage(serviceResult.value);
                    }
                }
            }
            catch (Exception e)
            {
                result.setErrorMessage(e.getMessage());
                _personDetailProxy =
                        null; // clear the proxy so it reinitialises next time
            }
        }
        return result;
    }
    
  private void buildWCSConnections(DetailPerson person,
                                  List<WCconnections> serviceConnections)
  {
      
    if ((serviceConnections != null) &&
        (serviceConnections.size() > 0))
    {
      WCSConnectionRow r=null;
      int x=1;
        for (WCconnections connection :
             serviceConnections)
        {
            WCSConnectionItem s = new WCSConnectionItem();
            
            s.setConnectionDisplayName(connection.getCSCONNECTIONDISPLAYNAME());
            s.setConnectionEmail(connection.getCSCONNECTIONEMAIL());
            s.setConnectionId(connection.getCSCONNECTIONID());
            s.setConnectionLogo(connection.getPPIMAGE());
            s.setConnectionUsername(connection.getCSCONNECTIONUSERNAME());
            s.setCreationDate(connection.getCSCREATIONDATE());
              if (x==1) 
              {
                  r = new WCSConnectionRow();
                  r.setConnectionC1(s);
              }
              else if (x==2) 
              {
                r.setConnectionC2(s);
              }
              else
              {
                r.setConnectionC3(s);
                person.getWcsConnectionRows().add(r);
                x=0;
              }
            
            person.getWcsConnections().add(s);
            x++;
            
        }
      if (serviceConnections.size()<3 && r!=null) 
      {
        person.getWcsConnectionRows().add(r);
      }
    }
  }
  
  private void buildWCSSpacesModerated(DetailPerson person,
                                  List<Spaces> serviceSpaces)
  {
      
    if ((serviceSpaces != null) &&
        (serviceSpaces.size() > 0))
    {
        for (Spaces space :
             serviceSpaces)
        {
            WCSModeradedSpacesItem s = new WCSModeradedSpacesItem();
            
            s.setSpaceCreateDate(space.getSHCREATEDATE());
            s.setSpaceDescription(space.getSHDESCRIPTION());
            s.setSpaceDisplayName(space.getSHDISPLAYNAME());
            s.setSpaceGuid(space.getSUSPACEGUID());
            s.setSpaceId(space.getSHSPACEID());
            s.setSpaceLastUpdate(space.getSHLASTUPDATEDATE());
            s.setSpaceLogo(space.getSHLOGO());
            s.setSpaceMemberCount(space.getSHGSMEMBERCOUNT());
            s.setSpacePermissionAction(space.getSUPERMISSIONACTION());
            s.setSpaceRole(space.getSUSPACEROLE());
            s.setSpaceuserid(space.getSUUSERID());
            
            person.getWcsModeradedSpaces().add(s);
            
        }
    }
      
  }

    private void buildReportingLine(DetailPerson person,
                                    List<ReportLine> serviceReportLine)
    {
        if (person != null)
        {
            List<ReportingLineItem> result =
                new ArrayList<ReportingLineItem>();
            List<ReportingLineItem> superiors =
                new ArrayList<ReportingLineItem>();

            ReportingLineItem me = new ReportingLineItem();
            me.setDisplayName(person.getFullName());
            me.setPersonId(person.getPersonId());
            me.setUsername(person.getUserName());

            if ((serviceReportLine != null) && (serviceReportLine.size() > 0))
            {
                for (ReportLine reportLine : serviceReportLine)
                {
                    ReportingLineItem item = new ReportingLineItem();
                    item.setDisplayName(reportLine.getNAME());
                    item.setPersonId(reportLine.getPERSONID());
                    item.setUsername(reportLine.getUSERNAME());

                    if ("TO".equalsIgnoreCase(reportLine.getDIRECTION()))
                    {
                        superiors.add(item);
                    }
                    else
                    {
                        me.getChildren().add(item);
                    }
                }
            }

            if (superiors.size() > 0)
            {
                for (ReportingLineItem superior : superiors)
                {
                    result.add(superior);

                    superior.getChildren().add(me);
                }
            }
            else
            {
                result.add(me);
            }

            person.setReportingLine(result);
        }
    }
}
