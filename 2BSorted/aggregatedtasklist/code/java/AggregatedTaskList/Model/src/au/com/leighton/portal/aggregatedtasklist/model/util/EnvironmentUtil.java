package au.com.leighton.portal.aggregatedtasklist.model.util;

import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import oracle.adf.share.ADFContext;

import oracle.webcenter.spaces.context.SpacesContext;


public class EnvironmentUtil
{

    public EnvironmentUtil()
    {
        super();
    }

    private static FacesContext getFacesContext()
    {
        FacesContext result = FacesContext.getCurrentInstance();

        if (result == null)
        {
            LogUtility.logWarning(EnvironmentUtil.class,
                                  "Unable to get current FacesContext", null);
        }

        return result;
    }

    private static ADFContext getADFContext()
    {
        ADFContext result = ADFContext.getCurrent();

        if (result == null)
        {
            LogUtility.logWarning(EnvironmentUtil.class,
                                  "Unable to get current ADFContext", null);
        }

        return result;
    }

    private static SpacesContext getSpacesContext()
    {
        SpacesContext result = SpacesContext.getCurrentInstance();

        if (result == null)
        {
            LogUtility.logWarning(EnvironmentUtil.class,
                                  "Unable to get current SpacesContext", null);
        }

        return result;
    }

    private static void addMessage(FacesMessage.Severity severity,
                                   String message)
    {
        FacesContext context = getFacesContext();

        if (context != null)
        {
            context.addMessage(null,
                               new FacesMessage(severity, "Profile", message));
        }
    }

    public static void addError(String errorMessage)
    {
        addMessage(FacesMessage.SEVERITY_ERROR, errorMessage);
    }

    public static void addError(String errorMessage, Exception e)
    {
        addMessage(FacesMessage.SEVERITY_ERROR,
                   errorMessage + " : " + e.getMessage());
    }

    public static void addInfo(String infoMessage)
    {
        addMessage(FacesMessage.SEVERITY_INFO, infoMessage);
    }

    private static Object getFacesValue(String keyValue)
    {
        Object result = null;

        try
        {
            FacesContext context = getFacesContext();

            if (context != null)
            {
                Application application = context.getApplication();

                if (application != null)
                {
                    ExpressionFactory expressionFactory =
                        application.getExpressionFactory();

                    if (expressionFactory != null)
                    {
                        ValueExpression valueExpression =
                            expressionFactory.createValueExpression(context.getELContext(),
                                                                    keyValue,
                                                                    Object.class);

                        if (valueExpression != null)
                        {
                            result =
                                    valueExpression.getValue(context.getELContext());

                            LogUtility.logFinest(EnvironmentUtil.class,
                                                 "Faces value for " +
                                                 keyValue + " = " + result,
                                                 null);
                        }
                        else
                        {
                            LogUtility.logFinest(EnvironmentUtil.class,
                                                 "Unable to get ValueExpression from ExpressionFactory",
                                                 null);
                        }
                    }
                    else
                    {
                        LogUtility.logFinest(EnvironmentUtil.class,
                                             "Unable to get ExpressionFactory from Application",
                                             null);
                    }
                }
                else
                {
                    LogUtility.logWarning(EnvironmentUtil.class,
                                          "Unable to get application from faces context",
                                          null);
                }
            }
            else
            {
                LogUtility.logWarning(EnvironmentUtil.class,
                                      "Unable to get faces context", null);
            }
        }
        catch (Exception e)
        {
            LogUtility.logWarning(EnvironmentUtil.class,
                                  "Failed to get faces value for " + keyValue,
                                  e);
        }

        return result;
    }

    public static String getCurrentUserName()
    {
        return (String)getFacesValue("#{pageFlowScope.Username}");
    }

    private static String getEnvironment()
    {
        String env = System.getProperty("Env");
        return env;
        //return (String)getFacesValue("#{pageFlowScope.Environment}");
    }

    public static boolean isDevelopment()
    {
        return "DEV".equalsIgnoreCase(getEnvironment());
    }

    public static boolean isSIT()
    {
        return "SIT".equalsIgnoreCase(getEnvironment());
    }

    public static boolean isUAT()
    {
        return "UAT".equalsIgnoreCase(getEnvironment());
    }
    
    public static boolean isPSUP()
    {
        return "PSUP".equalsIgnoreCase(getEnvironment());
    }

    public static boolean isProd()
    {
        return "PROD".equalsIgnoreCase(getEnvironment());
    }

}

