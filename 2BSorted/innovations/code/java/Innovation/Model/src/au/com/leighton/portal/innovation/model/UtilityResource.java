package au.com.leighton.portal.innovation.model;

import java.text.MessageFormat;

import java.util.ResourceBundle;

import oracle.javatools.resourcebundle.BundleFactory;

import oracle.jbo.domain.Number;


/**
 * Encapsulates all of the resource utils
 */
public class UtilityResource
{
    private UtilityResource()
    {
        super();
    }
    private static ResourceBundle _resourceBundle = null;

    private static ResourceBundle getResourceBundle()
    {
        if (_resourceBundle == null)
        {
            _resourceBundle =
                    BundleFactory.getBundle("au.com.leighton.portal.innovation.model.ModelBundle");

            UtilityLog.logFinest(UtilityResource.class,
                                 "Getting resource bundle returned " +
                                 _resourceBundle, null);
        }

        return _resourceBundle;
    }

    public static String getHelpSubmitInnovationIdea()
    {
        return getResourceValue("Help_SubmitInnovation_Idea", null);
    }

    public static String getHelpSubmitInnovationBusinessValue()
    {
        return getResourceValue("Help_SubmitInnovation_BusinessValue", null);
    }

    public static String getHelpSubmitInnovationContactDetails()
    {
        return getResourceValue("Help_SubmitInnovation_ContactDetails", null);
    }

    private static String getResourceValue(String key, Object[] parameters)
    {
        String result = null;
        String stringVal = getResourceBundle().getString(key);

        if (!Utility.isNullOrEmpty(stringVal))
        {
            result = MessageFormat.format(stringVal, parameters);

            UtilityLog.logFinest(UtilityResource.class,
                                 "Getting resource value for \"" + key +
                                 "\" = \"" + result + "\"", null);
        }

        return result;
    }

    public static String newIdeaNotificationSubject(Number newIdeaId)
    {
        return getResourceValue("NewIdeaNotificationSubjectLine", new Object[]
                { newIdeaId });
    }

    public static String newIdeaNotificationMessage(Number newIdeaId)
    {
        return getResourceValue("NewIdeaNotificationMessageContent",
                                new Object[]
                { newIdeaId });
    }

    public static String newIdeaAccepted(Number newIdeaId)
    {
        return getResourceValue("NewIdeaAcceptedMessage", new Object[]
                { newIdeaId });
    }

    public static String ideaNotAdoptedNotificationSubject(Number ideaId,
                                                           String comment)
    {
        return getResourceValue("IdeaNotAdoptedNotificationSubjectLine",
                                new Object[]
                { ideaId, comment });
    }

    public static String ideaNotAdoptedNotificationMessage(Number ideaId,
                                                           String comment)
    {
        return getResourceValue("IdeaNotAdoptedNotificationMessageContent",
                                new Object[]
                { ideaId, comment });
    }

    public static String ideaRefineNotificationSubject(Number ideaId,
                                                       String comment)
    {
        return getResourceValue("IdeaRefineNotificationSubjectLine",
                                new Object[]
                { ideaId, comment });
    }

    public static String ideaRefineNotificationMessage(Number ideaId,
                                                       String comment)
    {
        return getResourceValue("IdeaRefineNotificationMessageContent",
                                new Object[]
                { ideaId, comment });
    }

    public static String ideaAdoptedNotificationSubject(Number ideaId,
                                                        String innovationRegisterId)
    {
        return getResourceValue("IdeaAdoptedNotificationSubjectLine",
                                new Object[]
                { ideaId, innovationRegisterId });
    }

    public static String ideaAdoptedNotificationMessage(Number ideaId,
                                                        String innovationRegisterId)
    {
        return getResourceValue("IdeaAdoptedNotificationMessageContent",
                                new Object[]
                { ideaId, innovationRegisterId });
    }

    public static String innovationUpdatedNotificationSubject(String innovationRegisterId)
    {
        return getResourceValue("InnovationUpdatedNotificationSubjectLine",
                                new Object[]
                { innovationRegisterId });
    }

    public static String innovationUpdatedNotificationMessage(String innovationRegisterId)
    {
        return getResourceValue("InnovationUpdatedNotificationMessageContent",
                                new Object[]
                { innovationRegisterId });
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
}
