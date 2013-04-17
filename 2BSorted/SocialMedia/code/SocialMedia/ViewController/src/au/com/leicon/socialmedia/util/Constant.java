package au.com.leicon.socialmedia.util;

public class Constant {
    public static String WS_URL=ConfigUtil.getEnvConfig(System.getProperty("Env")) + ConfigUtil.getEnvConfig("SOA_URL");
    public static String WS_QNAME="http://xmlns.oracle.com/PortalApplication/SocialMediaComposite/SocialMediaComposite";
    public static String WS_SERVICENAME="socialmediacomposite_client_ep";
}
