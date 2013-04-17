package au.com.leicon.ess.util;


import java.util.Properties;
import java.util.ResourceBundle;

public class ConfigUtil {

    public static String getEnvConfig(String key){
        ResourceBundle configBundle = ResourceBundle.getBundle("myESSDetails");
        String value = configBundle.getString(key);
        return value;
    }
}
