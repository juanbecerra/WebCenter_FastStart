package au.com.leighton.portal.innovation.model;


import java.text.SimpleDateFormat;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import oracle.jbo.domain.Date;


public class Utility
{
    public enum TableIdeaRegisterView
    {
        ID("SubmittedInnovationId"),
        ORIGINATOR("Originator"),
        STATUS("Status"),
        SUBMITTED_BY("SubmittedBy"),
        IDEA("Idea"),
        BUSINESS_VALUE("BusinessValue"),
        DIVISION("Division"),
        CONTACT_DETAILS("ContactDetails"),
        DATE_SUBMITTED("DateSubmitted"),
        COMMENTS("Comments"),
        SOURCE("Source");

        protected String name;

        TableIdeaRegisterView(String nameVal)
        {
            name = nameVal;
        }
    }

    public enum TableIdeaRegister
    {
        ID("Submitted_Innovation_Id"),
        ORIGINATOR("Originator"),
        STATUS("Status"),
        SUBMITTED_BY("Submitted_By"),
        IDEA("Idea"),
        BUSINESS_VALUE("Business_Value"),
        DIVISION("Division"),
        CONTACT_DETAILS("Contact_Details"),
        DATE_SUBMITTED("Date_Submitted"),
        COMMENTS("Comments"),
        SOURCE("Source");

        protected String name;

        TableIdeaRegister(String nameVal)
        {
            name = nameVal;
        }
    }

    public enum TableIdeaRegisterFilter
    {
        USERNAME("Username"),
        DIVISION("Division"),
        STATUS("Status"),
        FROM_DATE("FromDate"),
        TO_DATE("ToDate"),
        INNOVATION_CATEGORY("InnovationCategory"),
        INNOVATION_DIVISION("InnovationDivision"),
        INNOVATION_FROM_DATE("InnovationFromDate"),
        INNOVATION_TO_DATE("InnovationToDate"),
        INNOVATION_STATUS("InnovationStatus");

        protected String name;

        TableIdeaRegisterFilter(String nameVal)
        {
            name = nameVal;
        }
    }

    public enum TableInnovationRegisterView
    {
        IR_NUMBER("IrNumber"),
        DATE_SUBMITTED("DateSubmitted"),
        DIVISION("Division"),
        PROJECT("Project"),
        OWNER("Owner"),
        CATEGORY("Category"),
        INITIATIVE_NAME("InitiativeName"),
        INNOVATION_DESCRIPTION("InnovationDescription"),
        BENEFIT("Benefit"),
        BUSINESS_VALUE("BusinessValue"),
        STATUS("Status"),
        BUSINESS_OPTIMISATION("BusinessOptimisation"),
        CONTACT_DETAILS("ContactDetails"),
        CASE_STUDY("CaseStudy"),
        FLASH_ON("FlashOn"),
        ADDITIONAL_COMMENTS("AdditionalComments");

        protected String name;

        TableInnovationRegisterView(String nameVal)
        {
            name = nameVal;
        }
    }

    public enum TableInnovationRegister
    {
        IR_NUMBER("Ir_Number"),
        DATE_SUBMITTED("Date_Submitted"),
        DIVISION("Division"),
        PROJECT("Project"),
        OWNER("Owner"),
        CATEGORY("Category"),
        INITIATIVE_NAME("Initiative_Name"),
        INNOVATION_DESCRIPTION("Innovation_Description"),
        BENEFIT("Benefit"),
        BUSINESS_VALUE("Business_Value"),
        STATUS("Status"),
        BUSINESS_OPTIMISATION("Business_Optimisation"),
        CONTACT_DETAILS("Contact_Details"),
        CASE_STUDY("Case_Study"),
        FLASH_ON("FlashOn"),
        ADDITIONAL_COMMENTS("Additional_Comments"),
        IDEA_SUBMITTED_BY("Idea_Submitted_By");

        protected String name;

        TableInnovationRegister(String nameVal)
        {
            name = nameVal;
        }
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

    private static void addWhereClause(StringBuffer buffer, String columnName,
                                       String[] values)
    {
        if ((buffer != null) && !Utility.isNullOrEmpty(columnName) &&
            (values != null) && (values.length > 0))
        {
            boolean nonBlankFound = false;

            for (String value : values)
            {
                if ("ALL".equalsIgnoreCase(value))
                {
                    return;
                }

                if (!isNullOrEmpty(value))
                {
                    nonBlankFound = true;
                }
            }

            if (!nonBlankFound)
            {
                return;
            }

            if (buffer.length() > 0)
            {
                buffer.append(" and ");
            }
            if (values.length > 1)
            {
                buffer.append('(');
            }


            for (int x = 0; x < values.length; x++)
            {
                if (x != 0)
                {
                    buffer.append(" or ");
                }
                buffer.append(columnName);
                buffer.append("='");
                buffer.append(values[x]);
                buffer.append("'");
            }

            if (values.length > 1)
            {
                buffer.append(')');
            }
        }
    }

    public static void addWhereClause(StringBuffer buffer,
                                      TableIdeaRegister column, String value)
    {
        addWhereClause(buffer, column, new String[]
                { value });
    }

    public static void addWhereClause(StringBuffer buffer,
                                      TableIdeaRegister column,
                                      String[] values)
    {
        addWhereClause(buffer, column == null ? null : column.name, values);
    }

    public static void addWhereClause(StringBuffer buffer,
                                      TableInnovationRegister column,
                                      String value)
    {
        addWhereClause(buffer, column, new String[]
                { value });
    }

    public static void addWhereClause(StringBuffer buffer,
                                      TableInnovationRegister column,
                                      String[] values)
    {
        addWhereClause(buffer, column == null ? null : column.name, values);
    }

    private static void addWhereClause(StringBuffer buffer, String columnName,
                                       Date fromDate, Date toDate)
    {
        if ((buffer != null) && !isNullOrEmpty(columnName))
        {
            if ((fromDate != null) && (toDate != null))
            {
                if (buffer.length() > 0)
                {
                    buffer.append(" and ");
                }

                buffer.append(columnName);
                buffer.append(" between '");
                buffer.append(formatForSql(fromDate));
                buffer.append("' and '");
                buffer.append(formatForSql(toDate));
                buffer.append("'");
            }
            else if (fromDate != null)
            {
                if (buffer.length() > 0)
                {
                    buffer.append(" and ");
                }

                buffer.append(columnName);
                buffer.append(">='");
                buffer.append(formatForSql(fromDate));
                buffer.append("'");
            }
            else if (toDate != null)
            {
                if (buffer.length() > 0)
                {
                    buffer.append(" and ");
                }

                buffer.append(columnName);
                buffer.append("<='");
                buffer.append(formatForSql(toDate));
                buffer.append("'");
            }
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
                                      TableIdeaRegister column, Date fromDate,
                                      Date toDate)
    {
        addWhereClause(buffer, column == null ? null : column.name, fromDate,
                       toDate);
    }

    public static void addWhereClause(StringBuffer buffer,
                                      TableInnovationRegister column,
                                      Date fromDate, Date toDate)
    {
        addWhereClause(buffer, column == null ? null : column.name, fromDate,
                       toDate);
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

    public static void sendNotification(String toUsername,
                                        String toEmailAddress,
                                        String subjectText, String messageText)
    {
        if (!Utility.isNullOrEmpty(toUsername) &&
            !Utility.isNullOrEmpty(subjectText) &&
            !Utility.isNullOrEmpty(messageText) &&
            !Utility.isNullOrEmpty(toEmailAddress))
        {
            Properties properties = new Properties();

            properties.put("mail.smtp.host", UtilityResource.getSmtpHost());
            properties.put("mail.smtp.port", UtilityResource.getSmtpPort());

            Session session = Session.getInstance(properties);

            if (session == null)
            {
                UtilityFaces.addError("Unable to notify user. Failed to retrieve mail session");
            }
            else
            {
                try
                {
                    Message message = new MimeMessage(session);
                    InternetAddress fromAddress =
                        new InternetAddress(UtilityResource.getNotificationFromAddress());

                    InternetAddress toAddress =
                        new InternetAddress(toEmailAddress);

                    message.setFrom(fromAddress);
                    message.addRecipient(Message.RecipientType.TO, toAddress);
                    message.setSubject(subjectText);
                    message.setContent(messageText, "text/plain");
                    Transport.send(message);

                    UtilityFaces.addInfo("User \"" + toUsername +
                                         "\" notified at \"" + toEmailAddress +
                                         "\"");
                }
                catch (Exception e)
                {
                    UtilityFaces.addError("Failed to notify user on " +
                                          toEmailAddress, e);
                }
            }
        }
        else
        {
            UtilityLog.logWarning(Utility.class,
                                  "Unable to notify. Username=" + toUsername +
                                  ", Email Address=" + toEmailAddress +
                                  ", Subject=" + subjectText + ", Message=" +
                                  messageText, null);

            StringBuffer msg = new StringBuffer();

            if (!isNullOrEmpty(toUsername))
            {
                msg.append("Unable to notify user \"");
                msg.append(toUsername);
                msg.append("\".");

                if (isNullOrEmpty(toEmailAddress))
                {
                    if (msg.length() > 0)
                    {
                        msg.append(" ");
                    }

                    msg.append("No email address is available.");
                }
                else
                {
                    msg.append(" At email address \"");
                    msg.append(toEmailAddress);
                    msg.append("\"");
                }
            }

            if (msg.length() > 0)
            {
                UtilityFaces.addError(msg.toString());
            }
        }
    }
}
