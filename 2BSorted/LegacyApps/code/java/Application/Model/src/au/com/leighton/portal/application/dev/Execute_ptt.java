package au.com.leighton.portal.application.dev;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 101221.1153.15811)

@WebService(wsdlLocation="http://lclxwcrdapp1.lc.local:7777/soa-infra/services/default/EAgetAppsList/EAgetAppsList_2?WSDL",
  targetNamespace="http://xmlns.oracle.com/Portal/EAgetAppsList/EAgetAppsList",
  name="execute_ptt")
@XmlSeeAlso(
  { au.com.leighton.portal.application.dev.generated.ObjectFactory.class })
@SOAPBinding(style=Style.DOCUMENT, parameterStyle=ParameterStyle.BARE)
public interface Execute_ptt
{
  @WebMethod(action="execute")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="execute", output="http://xmlns.oracle.com/Portal/EAgetAppsList/EAgetAppsList/execute_ptt/executeResponse")
  @WebResult(targetNamespace="http://xmlns.leicon.com.au/GetAppsList",
    partName="reply", name="dbGetAppsListOutputCollection")
  public au.com.leighton.portal.application.dev.generated.DbGetAppsListOutputCollection execute(@WebParam(targetNamespace="http://xmlns.leicon.com.au/GetAppsList",
      partName="request", name="dbGetAppsListInput")
    au.com.leighton.portal.application.dev.generated.DbGetAppsListInput request);
}
