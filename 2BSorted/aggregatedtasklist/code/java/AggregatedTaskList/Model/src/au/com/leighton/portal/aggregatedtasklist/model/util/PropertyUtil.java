package au.com.leighton.portal.aggregatedtasklist.model.util;

import java.text.MessageFormat;

import java.util.ResourceBundle;
import java.util.Set;

import oracle.javatools.resourcebundle.BundleFactory;


public class PropertyUtil
{
    private PropertyUtil()
    {
        super();
    }

    private static ResourceBundle _resourceBundle = null;

    private static ResourceBundle getResourceBundle()
    {
        if (_resourceBundle == null)
        {
            _resourceBundle =
                    BundleFactory.getBundle("au.com.leighton.portal.aggregatedtasklist.model.AggregatedTaskList");
        }

        return _resourceBundle;
    }

    private static String getResourceValue(String key, Object[] parameters)
    {
        String result = null;
        String stringVal = getResourceBundle().getString(key);

        if ((stringVal != null) && (stringVal.trim().length() > 0))
        {
            if (parameters != null)
            {
                result = MessageFormat.format(stringVal, parameters);
            }
            else
            {
                result = stringVal;
            }
        }
        return result;
    }

    public static String getServiceWSDL()
    {
        if (EnvironmentUtil.isDevelopment())
        {
            return getResourceValue("service.WSDL.DEV", null);
        }
        else if (EnvironmentUtil.isSIT())
        {
            return getResourceValue("service.WSDL.SIT", null);
        }
            else if (EnvironmentUtil.isUAT())
            {
                return getResourceValue("service.WSDL.UAT", null);
            }
        
        else if (EnvironmentUtil.isPSUP())
        {
            return getResourceValue("service.WSDL.PSUP", null);
        }
        else
        {
            return getResourceValue("service.WSDL.PROD", null);
        }
    }

    public static String getServiceNamespace()
    {
        return getResourceValue("service.namespace", null);
    }

    public static String getServiceName()
    {
        return getResourceValue("service.name", null);
    }

    public static String getDefaultSubjectText()
    {
        return getResourceValue("default.task.subject.text", null);
    }

    public static String getWarningMessageSystemsDown(Set<String> systemNames)
    {
        String result = null;

        if (systemNames != null)
        {
            if (systemNames.size() == 1)
            {
                result =
                        getResourceValue("warning.message.1.system.down", systemNames.toArray());
            }
            else
            {
                StringBuilder systems = new StringBuilder();

                for (String systemName : systemNames)
                {
                    if (systems.length() > 0)
                    {
                        systems.append(", ");
                    }

                    systems.append(systemName);
                }
                result =
                        getResourceValue("warning.message.many.systems.down", new String[]
                            { systems.toString() });
            }
        }
        return result;
    }

}
