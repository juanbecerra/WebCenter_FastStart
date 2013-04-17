package custom.webcenter.spaces;


import au.com.leighton.portal.profile.IExperienceItem;
import au.com.leighton.portal.profile.IWorkHistoryItem;
import au.com.leighton.portal.profile.Utility;
import au.com.leighton.portal.profile.model.common.AppModule;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import oracle.adf.share.logging.ADFLogger;


public class CustomProfileDataSource
{

    private static String CLASS_NAME = CustomProfileDataSource.class.getName();
    private static ADFLogger LOGGER =
        ADFLogger.createADFLogger("custom.webcenter.spaces");
    private String mUserName = null;

    public CustomProfileDataSource(String userName)
    {
        LOGGER.fine(userName);
        mUserName = userName;
    }

    public String getUserName()
    {
        return mUserName;
    }

    //    public String getDepartment()
    //        throws ProfileException
    //    {
    //        return mUserName + "'s Department";
    //    }

    //    public byte[] getOriginalPhoto()
    //        throws IOException
    //    {
    //        byte[] photo = null;
    //        String profileUserName = mUserName;
    //        InputStream in =
    //            Thread.currentThread().getContextClassLoader().getResourceAsStream("custom/oracle/webcenter/peopleconnections/profile/images/user/" +
    //                                                                               profileUserName +
    //                                                                               ".png");
    //
    //        if (in != null)
    //        {
    //            ByteArrayOutputStream out = new ByteArrayOutputStream();
    //            for (; ; )
    //            {
    //                int c = in.read();
    //                if (c < 0)
    //                    break;
    //                out.write(c);
    //            }
    //            photo = out.toByteArray();
    //        }
    //        return photo;
    //    }


    //    public String getSip()
    //    {
    //        return mUserName + "'s SIP address";
    //    }

    //    public String getProject()
    //    {
    //        return mUserName + "'s Project";
    //    }

    //    public void setSip(String sip)
    //    {
    //        // save new value to custom source
    //    }

    //    public void setProject(String project)
    //    {
    //        // save new value to custom source
    //    }

    /*
    This is a sample created to return custom profile attributes.
    In this sample data is returned only for one user.
    Ideally this can be changed to take a list of userID's and can return
    the custom attributes for all the passed in users by querying the
    custom source of profile data.
    In this example SIPAddress and Project are the custom attributes.
  */

    public static Map<String, Map<String, String>> getCustomAttributesMap()
    {
        Map<String, Map<String, String>> result =
            new HashMap<String, Map<String, String>>();

        AppModule appModule = null;
        
        try
        {
            appModule = Utility.createApplicationModule();

            if (appModule != null)
            {
                // go directly to the manager handling the EJB's to avoid duplicating large
                // blocks of data
                List<IExperienceItem> experienceItems =
                    appModule.getAllExperienceItems();

                if ((experienceItems != null) && (experienceItems.size() > 0))
                {
                    for (IExperienceItem item : experienceItems)
                    {
                        Map<String, String> attributeMap = null;

                        if (result.containsKey(item.getUsername()))
                        {
                            attributeMap = result.get(item.getUsername());
                        }
                        else
                        {
                            attributeMap = new HashMap<String, String>();

                            result.put(item.getUsername(), attributeMap);
                        }

                        String experience = null;

                        if (attributeMap.containsKey("Experience"))
                        {
                            experience = attributeMap.get("Experience");
                            // remove the old value so we caqn replace with the new value
                            attributeMap.remove("Experience");
                        }
                        else
                        {
                            experience = "";
                        }

                        StringBuffer sb = new StringBuffer(experience);
                        sb.append(" ");
                        sb.append(item.getExperienceDescription());

                        attributeMap.put("Experience", sb.toString());
                    }
                }

                List<IWorkHistoryItem> workHistoryItems =
                    appModule.getAllWorkHistoryItems();

                if ((workHistoryItems != null) &&
                    (workHistoryItems.size() > 0))
                {
                    for (IWorkHistoryItem item : workHistoryItems)
                    {
                        Map<String, String> attributeMap = null;

                        if (result.containsKey(item.getUsername()))
                        {
                            attributeMap = result.get(item.getUsername());
                        }
                        else
                        {
                            attributeMap = new HashMap<String, String>();

                            result.put(item.getUsername(), attributeMap);
                        }

                        String workHistory = null;

                        if (attributeMap.containsKey("WorkHistory"))
                        {
                            workHistory = attributeMap.get("WorkHistory");
                            // remove the old value so we caqn replace with the new value
                            attributeMap.remove("WorkHistory");
                        }
                        else
                        {
                            workHistory = "";
                        }

                        StringBuffer sb = new StringBuffer(workHistory);
                        sb.append(" ");
                        sb.append(item.getRole());
                        sb.append(" ");
                        sb.append(item.getCompany());
                        sb.append(" ");
                        sb.append(item.getLocation());
                        sb.append(" ");
                        sb.append(item.getJobDescription());

                        attributeMap.put("WorkHistory", sb.toString());
                    }
                }
            }
        }
        catch (Exception e)
        {
            Utility.logWarning(CustomProfileDataSource.class,
                               "Retrieving experiences and work histories for custom crawler",
                               e);
        }
        finally
        {
          if (appModule != null)
          {
            Utility.releaseApplicationModule(appModule);
          }
        }

        return result;
    }


}
