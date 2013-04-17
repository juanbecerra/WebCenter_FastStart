package au.com.leighton.portal.peoplefinder.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

import oracle.adf.share.ADFContext;
import oracle.adf.share.security.SecurityContext;

import oracle.webcenter.spaces.context.SpacesContext;


/**
 * This class contains project independant utility methods related to ADF
 * development
 */
public class StdUtility
{
    private StdUtility()
    {
        super();
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

    public static String getCurrentUsername()
    {
        return (String)getFacesValue("#{securityContext.userName}");
    }

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

                            LogUtility.logFinest("Faces value for " +
                                                 keyValue + " = " + result);
                        }
                        else
                        {
                            LogUtility.logFinest("Unable to get ValueExpression from ExpressionFactory");
                        }
                    }
                    else
                    {
                        LogUtility.logFinest("Unable to get ExpressionFactory from Application");
                    }
                }
                else
                {
                    LogUtility.logWarning("Unable to get application from faces context");
                }
            }
            else
            {
                LogUtility.logWarning("Unable to get faces context");
            }
        }
        catch (Exception e)
        {
            LogUtility.logWarning("Failed to get faces value for " + keyValue);
        }

        return result;
    }

    private static List<String> getFacesMessages(FacesMessage.Severity severity)
    {
        List<String> result = new ArrayList<String>();

        FacesContext context = getFacesContext();

        if (context != null)
        {
            Iterator<FacesMessage> i = context.getMessages();

            if (i != null)
            {
                while (i.hasNext())
                {
                    FacesMessage message = i.next();

                    if ((message != null) &&
                        (message.getSeverity() == severity))
                    {
                        result.add(message.getDetail());
                    }
                }
            }
        }

        return result;
    }

    public static List<String> getFacesErrorMessages()
    {
        return getFacesMessages(FacesMessage.SEVERITY_ERROR);
    }

    public static List<String> getFacesInfoMessages()
    {
        return getFacesMessages(FacesMessage.SEVERITY_INFO);
    }

    public static List<String> getFacesFatalMessages()
    {
        return getFacesMessages(FacesMessage.SEVERITY_FATAL);
    }

    public static List<String> getFacesWarnMessages()
    {
        return getFacesMessages(FacesMessage.SEVERITY_WARN);
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

    public static UIComponent findControl(String name)
    {
        UIComponent result = null;

        FacesContext context = getFacesContext();

        if (context != null)
        {
            UIViewRoot viewRoot = context.getViewRoot();

            if (viewRoot != null)
            {
                result = findControl(viewRoot, name);
            }
        }

        return result;
    }

    private static UIComponent findControl(UIComponent parent, String name)
    {
        UIComponent result = null;

        if ((parent != null) && !isNullOrEmpty(name))
        {
            if ((parent.getId() != null) &&
                parent.getId().equalsIgnoreCase(name))
            {
                result = parent;
            }
            else
            {
                if (parent.getChildCount() > 0)
                {
                    for (UIComponent child : parent.getChildren())
                    {
                        result = findControl(child, name);

                        if (result != null)
                        {
                            break;
                        }
                    }
                }

                if (result == null)
                {
                    Map<String, UIComponent> facets = parent.getFacets();

                    if ((facets != null) && (facets.size() > 0))
                    {
                        for (UIComponent childFacet : facets.values())
                        {
                            result = findControl(childFacet, name);

                            if (result != null)
                            {
                                break;
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    protected static FacesContext getFacesContext()
    {
        FacesContext result = null;
        try
        {
            result = FacesContext.getCurrentInstance();

            if (result == null)
            {
                LogUtility.logWarning("Unable to get current FacesContext");
            }
        }
        catch (Exception e)
        {
            LogUtility.logWarning("Unable to get current FacesContext");
        }

        return result;
    }

    protected static ADFContext getADFContext()
    {
        ADFContext result = null;
        try
        {
            result = ADFContext.getCurrent();

            if (result == null)
            {
                LogUtility.logWarning("Unable to get current ADFContext");
            }
        }
        catch (Exception e)
        {
            LogUtility.logWarning("Unable to get current ADFContext");
        }

        return result;
    }

    protected static SpacesContext getSpacesContext()
    {
        SpacesContext result = null;
        try
        {
            result = SpacesContext.getCurrentInstance();

            if (result == null)
            {
                LogUtility.logWarning("Unable to get current SpacesContext");
            }
        }
        catch (Exception e)
        {
            LogUtility.logWarning("Unable to get current SpacesContext");
        }

        return result;
    }

    protected static SecurityContext getSecurityContext()
    {
        SecurityContext result = null;

        ADFContext context = getADFContext();

        if (context != null)
        {
            result = context.getSecurityContext();

            if (result == null)
            {
                LogUtility.logWarning("Unable to get SecurityContext");
            }
        }

        return result;
    }

    public static String append(List<String> strings, String separater)
    {
        return append(strings.toArray(new String[strings.size()]), separater);
    }

    public static String append(String[] strings, String separater)
    {
        StringBuffer sb = new StringBuffer();

        if ((strings != null) && (strings.length > 0))
        {
            for (String string : strings)
            {
                if (!isNullOrEmpty(string))
                {
                    if (sb.length() > 0)
                    {
                        sb.append(separater);
                    }

                    sb.append(string);
                }
            }
        }

        return sb.toString();
    }
}
