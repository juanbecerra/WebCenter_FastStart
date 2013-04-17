package au.com.leighton.portal.profile;


import au.com.leighton.portal.profile.model.common.AppModule;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;

import java.util.ResourceBundle;
import java.util.logging.Level;

import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import oracle.adf.share.logging.ADFLogger;

import oracle.javatools.resourcebundle.BundleFactory;

import oracle.jbo.client.Configuration;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;


public class Utility
{
    private static ADFLogger _adfLogger =
        ADFLogger.createADFLogger(Utility.class);

    public enum FacesValue
    {
        LEIGHTON_PROFILE("pageFlowScope.leightonProfileBean"),
        //        EXPERIENCE_BEAN("pageFlowScope.leightonProfileBean.experienceBean"),
        //        WORK_HISTORY_BEAN("pageFlowScope.leightonProfileBean.workHistoryBean"),
        TASKFLOW_PARAMETER_USERNAME("pageFlowScope.username"),
        TASKFLOW_PARAMETER_TITLE("pageFlowScope.title"),

        //        CURRENT_USER_EMAIL_ADDRESS("WebCenterProfile['securityContext.userName'].businessEmail"),
        CURRENT_USERNAME("securityContext.userName");
        //        CURRENT_USER_DISPLAY_NAME("WebCenterProfile['securityContext.userName'].displayName");

        protected String name;

        FacesValue(String nameVal)
        {
            name = "#{" + nameVal + "}";
        }
    }

    public enum TableProfileExperienceView
    {
        ID("Id"),
        DELETED("Deleted"),
        USERNAME("Username"),
        TITLE("Title"),
        EXPERIENCE_DESCRIPTION("Experiencedescription");

        protected String name;

        TableProfileExperienceView(String nameVal)
        {
            name = nameVal;
        }

        public String getName()
        {
            return name;
        }
    }

    public enum TableProfileWorkHistoryView
    {
        ID("Id"),
        DELETED("Deleted"),
        USERNAME("Username"),
        ROLE("Role"),
        LOCATION("Location"),
        START_DATE("Startdate"),
        END_DATE("Enddate"),
        COMPANY("Company"),
        JOB_DESCRIPTION("Jobdescription");

        protected String name;

        TableProfileWorkHistoryView(String nameVal)
        {
            name = nameVal;
        }

        public String getName()
        {
            return name;
        }
    }

    //    public static IExperienceItem fromRowExperienceItem(Row row)
    //    {
    //        ExperienceItem result = null;
    //
    //        if (row != null)
    //        {
    //            result = new ExperienceItem();
    //            result.setId(((Number)row.getAttribute(TableProfileExperienceView.ID.name)).longValue());
    //            result.setUsername((String)row.getAttribute(TableProfileExperienceView.USERNAME.name));
    //            result.setTitle((String)row.getAttribute(TableProfileExperienceView.TITLE.name));
    //            result.setExperienceDescription((String)row.getAttribute(TableProfileExperienceView.EXPERIENCE_DESCRIPTION.name));
    //            result.setDeleted(((Number)row.getAttribute(TableProfileExperienceView.DELETED.name)).intValue() ==
    //                              0);
    //        }
    //
    //        return result;
    //    }

    //    public static IWorkHistoryItem fromRowWorkHistoryItem(Row row)
    //    {
    //        WorkHistoryItem result = null;
    //
    //        if (row != null)
    //        {
    //            result = new WorkHistoryItem();
    //            result.setId(((Number)row.getAttribute(TableProfileWorkHistoryView.ID.name)).longValue());
    //            result.setUsername((String)row.getAttribute(TableProfileWorkHistoryView.USERNAME.name));
    //            result.setCompany((String)row.getAttribute(TableProfileWorkHistoryView.COMPANY.name));
    //            Date fromDate =
    //                (Date)row.getAttribute(TableProfileWorkHistoryView.START_DATE.name);
    //            result.setFromDate(fromDate == null ? null : fromDate.getValue());
    //            result.setJobDescription((String)row.getAttribute(TableProfileWorkHistoryView.JOB_DESCRIPTION.name));
    //            result.setLocation((String)row.getAttribute(TableProfileWorkHistoryView.LOCATION.name));
    //            result.setRole((String)row.getAttribute(TableProfileWorkHistoryView.ROLE.name));
    //            Date toDate =
    //                (Date)row.getAttribute(TableProfileWorkHistoryView.END_DATE.name);
    //            result.setToDate(toDate == null ? null : toDate.getValue());
    //        }
    //        return result;
    //    }
    //

    /**
     * Tests a string value to see if it is null or contains only white spaces
     * @param value the string to be tested
     * @return true if the value is null or contains only white spaces
     */
    public static boolean isNullOrEmpty(String value)
    {
        return (value == null) || (value.trim().length() == 0);
    }

    public static String makeMultilineDisplayable(String text)
    {
        String result = text;

        if (!Utility.isNullOrEmpty(text))
        {
            result = result.replaceAll("\n", "<br/>");
        }

        return result;
    }

    /**
     * Extract the classname minus the package portion of tyhe specified class
     *
     * @param obj
     * @return
     */
    public static String extractClassnameMinusPackage(Object obj)
    {
        String result = null;

        if (obj != null)
        {
            int index = obj.getClass().getName().lastIndexOf('.');

            if (index >= 0)
            {
                result = obj.getClass().getName().substring(index);

                while ((result.length() > 0) && (result.charAt(0) == '.'))
                {
                    result = result.substring(1);
                }
            }
        }
        return result;
    }

    public static String getCurrentUsername()
    {
        return (String)getFacesValue(FacesValue.CURRENT_USERNAME);
    }

    //    public static String getCurrentUserDisplayName()
    //    {
    //        return (String)getFacesValue(FacesValue.CURRENT_USER_DISPLAY_NAME);
    //    }
    //
    //    public static String getCurrentUserEmailAddress()
    //    {
    //        return (String)getFacesValue(FacesValue.CURRENT_USER_EMAIL_ADDRESS);
    //    }

    public static Object getFacesValue(FacesValue value)
    {
        return getFacesValue(value.name);
    }

    public static Object getFacesValue(String keyValue)
    {
        Object result = null;

        try
        {
            FacesContext context = FacesContext.getCurrentInstance();

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

    private static void addMessage(FacesMessage.Severity severity,
                                   String message)
    {
        FacesContext.getCurrentInstance().addMessage(null,
                                                     new FacesMessage(severity,
                                                                      "Profile",
                                                                      message));
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

    public static AppModule createApplicationModule()
    {
        return (AppModule)Configuration.createRootApplicationModule("au.com.leighton.portal.profile.model.AppModule",
                                                                    "AppModuleLocal");
    }

    public static void releaseApplicationModule(AppModule appModule)
    {
        if (appModule != null)
        {
            Configuration.releaseRootApplicationModule(appModule, false);
        }
    }

    private static ResourceBundle _resourceBundle = null;

    private static ResourceBundle getResourceBundle()
    {
        if (_resourceBundle == null)
        {
            _resourceBundle =
                    BundleFactory.getBundle("au.com.leighton.portal.profile.model.ModelBundle");
        }

        return _resourceBundle;
    }

    private static String getResourceValue(String key, Object[] parameters)
    {
        String result = null;
        String stringVal = getResourceBundle().getString(key);

        if (!isNullOrEmpty(stringVal))
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

    public static String getDefaultExperienceTitle()
    {
        return getResourceValue("DefaultExperienceTitle", null);
    }

    public static String getDefaultWorkHistoryTitle()
    {
        return getResourceValue("DefaultWorkHistoryTitle", null);
    }

    public static String getSmtpHost()
    {
        return getResourceValue("SmtpHost", null);
    }

    public static String getSmtpPort()
    {
        return getResourceValue("SmtpPort", null);
    }

    public static String getNotificationFromAddress()
    {
        return getResourceValue("NotificationFromAddress", null);
    }

    private static void addWhereClause(StringBuffer buffer, String columnName,
                                       String value)
    {
        if ((buffer != null) && !Utility.isNullOrEmpty(columnName) &&
            !Utility.isNullOrEmpty(value))
        {
            if (buffer.length() > 0)
            {
                buffer.append(" and ");
            }

            buffer.append(columnName);
            buffer.append("='");
            buffer.append(value);
            buffer.append("'");
        }
    }

    private static String formatForSql(Date date)
    {
        String result = null;

        if (date != null)
        {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");

            result = sdf.format(date.getValue());
        }
        return result;
    }

    public static void addWhereClause(StringBuffer buffer,
                                      TableProfileExperienceView column,
                                      String value)
    {
        addWhereClause(buffer, column == null ? null : column.name, value);
    }

    public static void addWhereClause(StringBuffer buffer,
                                      TableProfileWorkHistoryView column,
                                      String value)
    {
        addWhereClause(buffer, column == null ? null : column.name, value);
    }

    public static void addWhereClause(StringBuffer buffer,
                                      Utility.TableProfileWorkHistoryView column,
                                      Date value)
    {
        addWhereClause(buffer, column == null ? null : column.name,
                       formatForSql(value));
    }

    public static void addWhereClause(StringBuffer buffer,
                                      Utility.TableProfileExperienceView column,
                                      Number value)
    {
        addWhereClause(buffer, column == null ? null : column.name,
                       value == null ? null : value.toString());
    }

    public static void addWhereClause(StringBuffer buffer,
                                      Utility.TableProfileWorkHistoryView column,
                                      Number value)
    {
        addWhereClause(buffer, column == null ? null : column.name,
                       value == null ? null : value.toString());
    }

    //    public static ProfileResponse getExperience(String username)
    //    {
    //        return getApplicationModule().getExperience(username);
    //    }
    //
    //    public static ProfileResponse deleteExperienceItem(IExperience experience,
    //                                                       IExperienceItem experienceItem)
    //    {
    //        return getApplicationModule().deleteExperienceItem(experience,
    //                                                           experienceItem);
    //    }
    //
    //    public static ProfileResponse updateExperienceItem(IExperienceItem experienceItem,
    //                                                       String title,
    //                                                       String experienceDescription)
    //    {
    //        return getApplicationModule().updateExperienceItem(experienceItem,
    //                                                           title,
    //                                                           experienceDescription);
    //    }
    //
    //    public static ProfileResponse createExperienceItem(IExperience experience,
    //                                                       String title,
    //                                                       String experienceDescription)
    //    {
    //        return getApplicationModule().createExperienceItem(experience, title,
    //                                                           experienceDescription);
    //    }
    //
    //    public static ProfileResponse getWorkHistory(String username)
    //    {
    //        return getApplicationModule().getWorkHistory(username);
    //    }
    //
    //    public static ProfileResponse deleteWorkHistoryItem(IWorkHistory workHistory,
    //                                                        IWorkHistoryItem workHistoryItem)
    //    {
    //        return getApplicationModule().deleteWorkHistoryItem(workHistory,
    //                                                            workHistoryItem);
    //    }

    public static Date convert(java.util.Date date)
    {
        Date result = null;

        if (date != null)
        {
            try
            {
                java.sql.Date sqlDate = new java.sql.Date(date.getTime());

                result = new Date(sqlDate);
            }
            catch (Exception e)
            {
                addError("Unable to convert date " + date, e);
            }
        }
        return result;
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

            _adfLogger.log(logLevel, "(Profile)(" + className + ")" + message,
                           t);
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

    public static String buildParmStuff(String[] details)
    {
        StringBuffer sb = new StringBuffer();

        if (details != null)
        {
            for (int x = 0; x < details.length; x += 2)
            {
                if ((x + 1) < details.length)
                {
                    if (sb.length() > 0)
                    {
                        sb.append(", ");
                    }
                    sb.append(details[x]);
                    sb.append("=\"");
                    sb.append(details[x + 1]);
                    sb.append("\"");
                }
            }
        }
        return sb.toString();
    }
}
