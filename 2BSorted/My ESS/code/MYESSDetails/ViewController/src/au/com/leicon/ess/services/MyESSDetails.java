package au.com.leicon.ess.services;

import au.com.leicon.ess.service.types.DataType;
import au.com.leicon.ess.service.types.ObjectFactory;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 110329.0915.20612)

@WebService(wsdlLocation="http://lclxsoar1u.lc.local:8001/soa-infra/services/default/ESSDetailsComposite/myessdetails_client_ep?WSDL",
  targetNamespace="http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails",
  name="MyESSDetails")
@XmlSeeAlso(
  { ObjectFactory.class })
public interface MyESSDetails
{
  @WebMethod(action="process")
  @Action(input="process", output="http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails/MyESSDetails/processResponse")
  @ResponseWrapper(localName="processResponse", targetNamespace="http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails",
    className="au.com.leicon.ess.service.types.ProcessResponse")
  @RequestWrapper(localName="process", targetNamespace="http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails",
    className="au.com.leicon.ess.service.types.Process")
  @WebResult(targetNamespace="http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails",
    name="Data")
  public DataType process(@WebParam(targetNamespace="http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails",
      name="username")
    String username);
}
