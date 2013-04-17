package au.com.leighton.myspaces.model;

import oracle.adf.share.ADFContext;

public class EnvironmentUtil {
    public EnvironmentUtil() {
        super();
    }

    public static String getUsername() {
        String userName = "";
        userName = ADFContext.getCurrent().getSecurityContext().getUserName();

        if (!userName.equals(null) || !userName.equals("")) {

            return userName;

        } else {
            LogUtility.logInfo(EnvironmentUtil.class,
                               "Unable to get current Username from Context",
                               null);
            return "novalue";
        }

    }

    public static boolean isNullOrEmpty(String value) {
        return (value == null) || (value.trim().length() == 0);
    }

}
