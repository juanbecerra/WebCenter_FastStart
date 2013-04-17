package au.com.leighton.portal.application;

import java.util.logging.Level;

import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import oracle.adf.share.ADFContext;
import oracle.adf.share.logging.ADFLogger;


public class Utility
{
    private static ADFLogger _adfLogger =
        ADFLogger.createADFLogger(Utility.class);

    private Utility()
    {
        super();
    }

    private static void log(Class clazz, Level logLevel, String message,
                            Throwable t)
    {
        if (_adfLogger != null)
        {
            // only log the class name and the immediate package before it. just for convenience
            String className = clazz.getName();

            int index = className.lastIndexOf('.');
            index = className.substring(0, index - 1).lastIndexOf('.');

            className = className.substring(index + 1);

            _adfLogger.log(logLevel,
                           "(Innovation)(" + className + ")" + message, t);
        }
    }

    public static void logSevere(Class clazz, String message,
                                 Throwable throwable)
    {
        log(clazz, Level.SEVERE, message, throwable);
    }

    public static void logWarning(Class clazz, String message,
                                  Throwable throwable)
    {
        log(clazz, Level.WARNING, message, throwable);
    }

    public static void logInfo(Class clazz, String message,
                               Throwable throwable)
    {
        log(clazz, Level.INFO, message, throwable);
    }

    public static void logConfig(Class clazz, String message,
                                 Throwable throwable)
    {
        log(clazz, Level.CONFIG, message, throwable);
    }

    public static void logFine(Class clazz, String message,
                               Throwable throwable)
    {
        log(clazz, Level.FINE, message, throwable);
    }

    public static void logFiner(Class clazz, String message,
                                Throwable throwable)
    {
        log(clazz, Level.FINER, message, throwable);
    }

    public static void logFinest(Class clazz, String message,
                                 Throwable throwable)
    {
        log(clazz, Level.FINEST, message, throwable);
    }

    /**
     * Tests a string value to see if it is null or contains only white spaces
     * @param value the string to be tested
     * @return true if the value is null or contains only white spaces
     */
    public static boolean isNullOrEmpty(String value)
    {
        return (value == null) || (value.trim().length() == 0);
    }

    /**
     * Utility method to ease the pain of getting faces variables
     * @param facesTag the faces expression for the variable to retrieve.
     * @return the faces object associated withe the passed key, null if invalid key or value not found
     */
    public static Object getFacesValue(String keyValue)
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

                            logFinest(Utility.class,
                                      "Faces value for " + keyValue + " = " +
                                      result, null);
                        }
                        else
                        {
                            logFinest(Utility.class,
                                      "Unable to get ValueExpression from ExpressionFactory",
                                      null);
                        }
                    }
                    else
                    {
                        logFinest(Utility.class,
                                  "Unable to get ExpressionFactory from Application",
                                  null);
                    }
                }
                else
                {
                    logWarning(Utility.class,
                               "Unable to get application from faces context",
                               null);
                }
            }
            else
            {
                logWarning(Utility.class, "Unable to get faces context", null);
            }
        }
        catch (Exception e)
        {
            logWarning(Utility.class,
                       "Failed to get faces value for " + keyValue, e);
        }

        return result;
    }

    private static FacesContext getFacesContext()
    {
        FacesContext result = FacesContext.getCurrentInstance();

        if (result == null)
        {
            logWarning(Utility.class, "Unable to get current FacesContext",
                       null);
        }

        return result;
    }
    
    public static String getCurrentUsername()
    {
      return (String)getFacesValue("#{securityContext.userName}");
    }

    private static ADFContext getADFContext()
    {
        ADFContext result = ADFContext.getCurrent();

        if (result == null)
        {
            logWarning(Utility.class, "Unable to get current ADFContext",
                       null);
        }

        return result;
    }

    public static void addInfoMessage(String functionArea, String message)
    {
        addMessage(functionArea, message, FacesMessage.SEVERITY_INFO);
    }

    public static void addErrorMessage(String functionArea, String message)
    {
        addMessage(functionArea, message, FacesMessage.SEVERITY_ERROR);
    }

    private static void addMessage(String functionArea, String message,
                                   FacesMessage.Severity severity)
    {
        if (!isNullOrEmpty(functionArea) && !isNullOrEmpty(message))
        {
            FacesContext context = FacesContext.getCurrentInstance();

            if (context != null)
            {
                StringBuffer sb = new StringBuffer(functionArea);
                sb.append(" : ");
                sb.append(message);
                context.addMessage(null,
                                   new FacesMessage(severity, functionArea,
                                                    sb.toString()));
            }
        }
    }
}
