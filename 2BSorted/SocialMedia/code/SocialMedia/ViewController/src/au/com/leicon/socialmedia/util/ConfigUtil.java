package au.com.leicon.socialmedia.util;

import java.util.Properties;
import java.util.ResourceBundle;

public class ConfigUtil {

    public static String getEnvConfig(String key){
        ResourceBundle configBundle = ResourceBundle.getBundle("socialmedia");
        String value = configBundle.getString(key);
        return value;
    }
}
