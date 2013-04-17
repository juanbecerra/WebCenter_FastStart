package au.com.leighton.portal.innovation.model;


import au.com.leighton.portal.innovation.model.common.AppModuleModel;
import au.com.leighton.portal.innovation.wcmodel.common.AppModuleWcModel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

import oracle.adf.share.ADFContext;
import oracle.adf.share.security.SecurityContext;

import oracle.jbo.client.Configuration;

import oracle.mds.core.MDSSession;

import oracle.webcenter.spaces.Space;
import oracle.webcenter.spaces.context.SpacesContext;


/**
 * Encapsulates the faces utilities
 */
public class UtilityFaces
{
    public enum FacesValue
    {
        //        CURRENT_USER_EMAIL_ADDRESS("WebCenterProfile[securityContext.userName].businessEmail"),
        CURRENT_USERNAME("securityContext.userName"),

        IDEA("bindings.idea.inputValue"),
        ORIGINATOR("bindings.originator.inputValue"),
        BUSINESS_VALUE("bindings.businessValue.inputValue"),
        CONTACT_DETAILS("bindings.contactDetails.inputValue"),
        SUBMITTED_IDEA_ID("bindings.submittedInnovationId.inputValue"),
        DATE_SUBMITTED("bindings.dateSubmitted.inputValue"),
        SOURCE("bindings.source.inputValue"),
        COMMENTS("bindings.comments.inputValue"),
        STATUS("bindings.status.inputValue"),
        SUBMITTED_BY("bindings.submittedBy.inputValue"),
        DIVISION("bindings.division.inputValue"),

        CURRENT_USER_DISPLAY_NAME("WebCenterProfile[securityContext.userName].displayName"),

        BENEFIT("bindings.benefit.inputValue"),
        ADDITIONAL_COMMENTS("bindings.additionalComments.inputValue"),
        INITIATIVE_NAME("bindings.initiativeName.inputValue"),
        BUSINESS_OPTIMISATION("bindings.businessOptimisation.inputValue"),
        PROJECT("bindings.project.inputValue"),
        CASE_STUDY("bindings.caseStudy.inputValue"),
        OWNER("bindings.owner.inputValue"),
        NEWS_FLASH("binding.newsFlash.inputValue"),
        IR_NUMBER("bindings.irNumber.inputValue"),
        INNOVATION_DESCRIPTION("bindings.innovationDescription.inputValue"),
        CATEGORY("bindings.category.inputValue");

        protected String name;

        FacesValue(String nameVal)
        {
            name = "#{" + nameVal + "}";
        }
    }

    public static String getCurrentUsername()
    {
        return (String)getFacesValue(FacesValue.CURRENT_USERNAME);
    }

    public static String getCurrentUserDisplayName()
    {
        return (String)getFacesValue(FacesValue.CURRENT_USER_DISPLAY_NAME);
    }

    public static Object getFacesValue(FacesValue value)
    {
        return getFacesValue(value == null ? null : value.name);
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

                            UtilityLog.logFinest(UtilityFaces.class,
                                                 "Faces value for " +
                                                 keyValue + " = " + result,
                                                 null);
                        }
                        else
                        {
                            UtilityLog.logFinest(UtilityFaces.class,
                                                 "Unable to get ValueExpression from ExpressionFactory",
                                                 null);
                        }
                    }
                    else
                    {
                        UtilityLog.logFinest(UtilityFaces.class,
                                             "Unable to get ExpressionFactory from Application",
                                             null);
                    }
                }
                else
                {
                    UtilityLog.logWarning(UtilityFaces.class,
                                          "Unable to get application from faces context",
                                          null);
                }
            }
            else
            {
                UtilityLog.logWarning(UtilityFaces.class,
                                      "Unable to get faces context", null);
            }
        }
        catch (Exception e)
        {
            UtilityLog.logWarning(UtilityFaces.class,
                                  "Failed to get faces value for " + keyValue,
                                  e);
        }

        return result;
    }

    private static void addMessage(FacesMessage.Severity severity,
                                   String message)
    {
        FacesContext context = getFacesContext();

        if (context != null)
        {
            boolean found = false;

            Iterator<FacesMessage> i = context.getMessages();

            while (!found && i.hasNext())
            {
                FacesMessage msg = i.next();

                if ((msg != null) && msg.getDetail().equalsIgnoreCase(message))
                {
                    found = true;
                }
            }

            if (!found)
            {
                context.addMessage(null,
                                   new FacesMessage(severity, "Innovation",
                                                    message));
            }
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

    public static AppModuleModel xcreateApplicationModule()
    {
        AppModuleModel result =
            (AppModuleModel)Configuration.createRootApplicationModule("au.com.leighton.portal.innovation.model.AppModuleModel",
                                                                      "AppModuleModelLocal");

        if (result == null)
        {
            UtilityLog.logWarning(UtilityFaces.class,
                                  "Unable to create root application module",
                                  null);
        }

        return result;
    }

    public static void releaseApplicationModule(AppModuleModel appModule)
    {
        if (appModule != null)
        {
            Configuration.releaseRootApplicationModule(appModule, false);
        }
    }

    public static AppModuleWcModel xcreateApplicationModuleEmail()
    {
        AppModuleWcModel result =
            (AppModuleWcModel)Configuration.createRootApplicationModule("au.com.leighton.portal.innovation.wcmodel.AppModuleWcModel",
                                                                        "AppModuleWcModelLocal");
        if (result == null)
        {
            UtilityLog.logWarning(UtilityFaces.class,
                                  "Unable to create root email application module",
                                  null);
        }

        return result;
    }

    public static void releaseApplicationModule(AppModuleWcModel appModule)
    {
        if (appModule != null)
        {
            Configuration.releaseRootApplicationModule(appModule, false);
        }
    }

    private UtilityFaces()
    {
        super();
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

    private static FacesContext getFacesContext()
    {
        FacesContext result = FacesContext.getCurrentInstance();

        if (result == null)
        {
            UtilityLog.logWarning(UtilityFaces.class,
                                  "Unable to get current FacesContext", null);
        }

        return result;
    }

    private static ADFContext getADFContext()
    {
        ADFContext result = ADFContext.getCurrent();

        if (result == null)
        {
            UtilityLog.logWarning(UtilityFaces.class,
                                  "Unable to get current ADFContext", null);
        }

        return result;
    }

    private static SpacesContext getSpacesContext()
    {
        SpacesContext result = SpacesContext.getCurrentInstance();

        if (result == null)
        {
            UtilityLog.logWarning(UtilityFaces.class,
                                  "Unable to get current SpacesContext", null);
        }

        return result;
    }

    private static List<String> getUserRoles()
    {
        List<String> result = new ArrayList<String>();

        SecurityContext securityContext = getSecurityContext();

        if (securityContext != null)
        {
            SpacesContext spacesContext = getSpacesContext();

            if (spacesContext != null)
            {
                Space space = spacesContext.getCurrentSpace();

                if (space != null)
                {
                    ADFContext adfContext = getADFContext();

                    if (adfContext != null)
                    {
                        Object obj = adfContext.getMDSSessionAsObject();

                        if (obj instanceof MDSSession)
                        {
                            try
                            {
                                String currentSpaceGUID =
                                    space.getGUID((MDSSession)obj);

                                UtilityLog.logFinest(UtilityFaces.class,
                                                     "Getting roles for current space GUID=" +
                                                     currentSpaceGUID, null);

                                String[] roles =
                                    securityContext.getUserRoles();

                                if (roles != null)
                                {
                                    for (String roleString : roles)
                                    {
                                        UtilityLog.logFinest(UtilityFaces.class,
                                                             "Role=" +
                                                             roleString, null);

                                        // are expecting 3 parts to a space role, separated by #.
                                        // the first is the GUID for the current space
                                        // the second is not needed
                                        // the third is the role name
                                        // we can ignore those items that dont fit this pattern
                                        String[] roleBits =
                                            roleString.split("#");

                                        if ((roleBits != null) &&
                                            (roleBits.length == 3))
                                        {
                                            String spaceGUID = roleBits[0];
                                            String roleName = roleBits[2];

                                            if (currentSpaceGUID.equalsIgnoreCase(spaceGUID))
                                            {
                                                UtilityLog.logFinest(UtilityFaces.class,
                                                                     "Role " +
                                                                     roleString +
                                                                     " applicable to user/space",
                                                                     null);

                                                result.add(roleName);

                                            }
                                            else
                                            {
                                                UtilityLog.logFinest(UtilityFaces.class,
                                                                     "Role " +
                                                                     roleString +
                                                                     " not for current space",
                                                                     null);
                                            }
                                        }
                                        else
                                        {
                                            UtilityLog.logFinest(UtilityFaces.class,
                                                                 "Ignoring role " +
                                                                 roleString,
                                                                 null);
                                        }
                                    }
                                }
                            }
                            catch (Exception e)
                            {
                                addError("Unable to retrieve user roles. Unable to get GUID for space",
                                         e);
                            }
                        }
                        else
                        {
                            addError("Unable to retrieve user roles. Cannot get MDS Session");
                        }
                    }
                    else
                    {
                        addError("Unable to retrieve user roles. Cannot get ADF Context");
                    }
                }
                else
                {
                    addError("Unable to retrieve user roles. Cannot get current space");
                }
            }
            else
            {
                addError("Unable to retrieve user roles. Cannot get spaces context");
            }
        }

        UtilityLog.logFinest(UtilityFaces.class, "getUserRoles=" + result,
                             null);
        return result;
    }

    public static boolean isCurrentUserInRole(String roleName)
    {
        boolean result = false;

        if (!Utility.isNullOrEmpty(roleName))
        {
            String username = getCurrentUsername();

            if (!Utility.isNullOrEmpty(username))
            {
                SecurityContext securityContext = getSecurityContext();

                if (securityContext != null)
                {
                    List<String> userRoles = getUserRoles();

                    if (userRoles != null)
                    {
                        result = userRoles.contains(roleName);
                    }
                }
            }
        }

        UtilityLog.logFinest(UtilityFaces.class,
                             "isCurrentUserInRole " + roleName + "=" + result,
                             null);

        return result;
    }

    private static SecurityContext getSecurityContext()
    {
        SecurityContext result = null;

        ADFContext context = getADFContext();

        if (context != null)
        {
            result = context.getSecurityContext();

            if (result == null)
            {
                UtilityLog.logWarning(UtilityFaces.class,
                                      "Unable to get SecurityContext", null);
            }
        }

        return result;
    }

    //    public static String[] getAllSecurityRoles()
    //    {
    //        String[] result = null;
    //
    //        SecurityContext context = getSecurityContext();
    //
    //        if (context != null)
    //        {
    //            result = context.getUserRoles();
    //        }
    //
    //        UtilityLog.logFinest(UtilityFaces.class,
    //                             "getAllSecurityRoles=" + result, null);
    //
    //        return result;
    //    }

    private static UIComponent findControl(UIComponent parent, String name)
    {
        UIComponent result = null;

        if ((parent != null) && !Utility.isNullOrEmpty(name))
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
            }
        }
        return result;
    }

    public static boolean isCurrentUserInAllDivisionsRole()
    {
        boolean result = false;

        List<String> roles = getUserRoles();

        if ((roles != null) && (roles.size() > 0))
        {
            for (String role : roles)
            {
                if (!Utility.isNullOrEmpty(role))
                {
                    role = role.toUpperCase();

                    // standardise the role name. Remove non alphanumeric chars and convert to uppercase
                    StringBuffer sb = new StringBuffer();

                    for (int x = 0; x < role.length(); x++)
                    {
                        char ch = role.charAt(x);

                        if (Character.isLetter(ch))
                        {
                            sb.append(ch);
                        }
                    }
                    role = sb.toString();

                    if ("ALLDIVISIONS".equalsIgnoreCase(role))
                    {
                        result = true;
                        break;
                    }
                }
            }
        }
        return result;
    }
}
