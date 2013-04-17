package au.com.leighton.model.util;

import oracle.adf.share.ADFContext;

public class EnvironmentUtil {
    public EnvironmentUtil() {
        super();
    }

    /**
     * getUsername: Get the username from portal.
     * @throws Exception
     */
    public static String getUsername() {
        String userName="";
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
}
