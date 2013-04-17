package au.com.leighton.myspaces.model;

import java.text.MessageFormat;

import java.util.ResourceBundle;

import oracle.javatools.resourcebundle.BundleFactory;

public class Utility {
    private static ResourceBundle _resourceBundle = null;

    public Utility() {
        super();
    }

    private static ResourceBundle getResourceBundle() {
        if (_resourceBundle == null) {
            _resourceBundle =
                    BundleFactory.getBundle("au.com.leighton.myspaces.model.ModelBundle");
        }

        return _resourceBundle;
    }

    private static String getResourceValue(String key, Object[] parameters) {
       String result = null;
        String stringVal = getResourceBundle().getString(key);

        if (!EnvironmentUtil.isNullOrEmpty(stringVal)) {
            if (parameters != null) {
                result = MessageFormat.format(stringVal, parameters);
            } else {
                result = stringVal;
            }
        }
        return result;
    }

    public static String getSpacesImagePrefix() {
        String space_icon = getResourceValue("spaces_icon_prefix", null);
        return space_icon;
    }

}
