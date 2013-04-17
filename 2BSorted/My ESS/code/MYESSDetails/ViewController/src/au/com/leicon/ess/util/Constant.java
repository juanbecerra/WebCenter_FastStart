package au.com.leicon.ess.util;

public class Constant {
    public static String WS_URL=ConfigUtil.getEnvConfig(System.getProperty("Env")) + ConfigUtil.getEnvConfig("SOA_URL");
    public static String WS_QNAME="http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails";
    public static String WS_SERVICENAME="myessdetails_client_ep";
}
