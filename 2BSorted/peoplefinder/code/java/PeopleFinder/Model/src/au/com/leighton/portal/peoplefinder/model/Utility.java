package au.com.leighton.portal.peoplefinder.model;


import au.com.leighton.portal.peoplefinder.model.common.AppModule;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import java.text.MessageFormat;

import java.util.List;
import java.util.ResourceBundle;

import javax.imageio.ImageIO;
import javax.imageio.stream.MemoryCacheImageInputStream;

import oracle.javatools.resourcebundle.BundleFactory;

import oracle.jbo.client.Configuration;
import oracle.jbo.domain.Date;

import oracle.webcenter.spaces.SpacesException;
import oracle.webcenter.spaces.SpacesManager;
import oracle.webcenter.spaces.context.SpacesContext;
import oracle.webcenter.spaces.metadata.GSMetadata;
import oracle.webcenter.spaces.query.SpacesQueryParameters;
import oracle.webcenter.spaces.query.SpacesQueryPopulation;


public class Utility
{
    public static String makeMultilineDisplayable(String text)
    {
        String result = text;

        if (!StdUtility.isNullOrEmpty(text))
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

    public static boolean includeConnections()
    {
        return (Boolean)StdUtility.getFacesValue("#{pageFlowScope.includeConnections}");
    }

    private static String getEnvironment()
    {
        String env = System.getProperty("Env");
        return env;
//        return (String)StdUtility.getFacesValue("#{pageFlowScope.environment}");
    }

    private static boolean isDevelopmentEnvironment()
    {
        return "DEV".equalsIgnoreCase(getEnvironment());
    }

    private static boolean isSitEnvironment()
    {
        return "SIT".equalsIgnoreCase(getEnvironment());
    }

    private static boolean isUatEnvironment()
    {
        return "UAT".equalsIgnoreCase(getEnvironment());
    }

    private static boolean isProdEnvironment()
    {
        return "PROD".equalsIgnoreCase(getEnvironment());
    }

    private static ResourceBundle _resourceBundle = null;

    private static ResourceBundle getResourceBundle()
    {
        if (_resourceBundle == null)
        {
            _resourceBundle =
                    BundleFactory.getBundle("au.com.leighton.portal.peoplefinder.model.ModelBundle");
        }

        return _resourceBundle;
    }

    private static String getResourceValue(String key, Object[] parameters)
    {
        String result = null;
        String stringVal = getResourceBundle().getString(key);

        if (!StdUtility.isNullOrEmpty(stringVal))
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

    public static String getLocationSearchWSDL()
    {
        if (isDevelopmentEnvironment())
        {
            return getResourceValue("LocationSearch_WSDL_DEV", null);
        }
        else if (isSitEnvironment())
        {
            return getResourceValue("LocationSearch_WSDL_SIT", null);
        }
        else if (isUatEnvironment())
        {
            return getResourceValue("LocationSearch_WSDL_UAT", null);
        }
        else
        {
            return getResourceValue("LocationSearch_WSDL_PROD", null);
        }
    }

    public static String getLocationSearchServiceName()
    {
        return getResourceValue("LocationSearch_ServiceName", null);
    }

    public static String getLocationSearchNameSpace()
    {
        return getResourceValue("LocationSearch_NameSpace", null);
    }

    public static String getLocationDetailWSDL()
    {
        if (isDevelopmentEnvironment())
        {
            return getResourceValue("LocationDetail_WSDL_DEV", null);
        }
        else if (isSitEnvironment())
        {
            return getResourceValue("LocationDetail_WSDL_SIT", null);
        }
        else if (isUatEnvironment())
        {
            return getResourceValue("LocationDetail_WSDL_UAT", null);
        }
        else
        {
            return getResourceValue("LocationDetail_WSDL_PROD", null);
        }
    }

    public static String getLocationDetailServiceName()
    {
        return getResourceValue("LocationDetail_ServiceName", null);
    }

    public static String getLocationDetailNameSpace()
    {
        return getResourceValue("LocationDetail_NameSpace", null);
    }

    public static String getPeopleSearchWSDL()
    {
        if (isDevelopmentEnvironment())
        {
            return getResourceValue("PeopleSearch_WSDL_DEV", null);
        }
        else if (isSitEnvironment())
        {
            return getResourceValue("PeopleSearch_WSDL_SIT", null);
        }
        else if (isUatEnvironment())
        {
            return getResourceValue("PeopleSearch_WSDL_UAT", null);
        }
        else
        {
            return getResourceValue("PeopleSearch_WSDL_PROD", null);
        }
    }

    public static String getPeopleSearchServiceName()
    {
        return getResourceValue("PeopleSearch_ServiceName", null);
    }

    public static String getPeopleSearchNameSpace()
    {
        return getResourceValue("PeopleSearch_NameSpace", null);
    }

    public static String getPeopleDetailWSDL()
    {
        if (isDevelopmentEnvironment())
        {
            return getResourceValue("PeopleDetail_WSDL_DEV", null);
        }
        else if (isSitEnvironment())
        {
            return getResourceValue("PeopleDetail_WSDL_SIT", null);
        }
        else if (isUatEnvironment())
        {
            return getResourceValue("PeopleDetail_WSDL_UAT", null);
        }
        else
        {
            return getResourceValue("PeopleDetail_WSDL_PROD", null);
        }
    }

    public static String getPeopleDetailServiceName()
    {
        return getResourceValue("PeopleDetail_ServiceName", null);
    }

    public static String getPeopleDetailNameSpace()
    {
        return getResourceValue("PeopleDetail_NameSpace", null);
    }

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
                StdUtility.addError("Unable to convert date " + date, e);
            }
        }
        return result;
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

    public static byte[] resizePhoto(byte[] photoData)
    {
        byte[] result = null;

        if ((photoData != null) && (photoData.length > 0))
        {
            try
            {
                ByteArrayInputStream bais =
                    new ByteArrayInputStream(photoData);
                MemoryCacheImageInputStream mciis =
                    new MemoryCacheImageInputStream(bais);
                BufferedImage bi = ImageIO.read(mciis);

                float height = bi.getHeight();
                float width = bi.getWidth();

                float factor = 1; // 150 / height;

                int newHeight = (int)(factor * height);
                int newWidth = (int)(factor * width);

                BufferedImage resizedImage =
                    new BufferedImage(newWidth, newHeight,
                                      bi.getType() == 0 ? BufferedImage.TYPE_INT_ARGB :
                                      bi.getType());
                Graphics2D g = resizedImage.createGraphics();
                g.drawImage(bi, 0, 0, newWidth, newHeight, null);
                g.dispose();

                ByteArrayOutputStream os = new ByteArrayOutputStream();
                ImageIO.write(resizedImage, "jpg", os);

                result = os.toByteArray();
            }
            catch (Exception e)
            {
                LogUtility.logWarning("Failed to determine photo size", e);
            }
        }

        return result;
    }

    public static void getSpacesModeratedBy(DetailPerson person)
    {
        StdUtility.addInfo("1");
        if ((person != null) &&
            !StdUtility.isNullOrEmpty(person.getWebcenterUsername()))
        {
            StdUtility.addInfo("2");
            SpacesContext context = StdUtility.getSpacesContext();

            if (context != null)
            {
                StdUtility.addInfo("spaces context ok");
                SpacesManager manager;
                try
                {
                    manager = context.getSpacesManager();

                    if (manager != null)
                    {
                        StdUtility.addInfo("manager=" + manager);
                        SpacesQueryParameters sqp =
                            SpacesQueryParameters.createInstance();
                        StdUtility.addInfo("sqp=" + sqp);

                        SpacesQueryPopulation sqpop =
                            SpacesQueryPopulation.createAdminPopulation();

                        StdUtility.addInfo("SpaceQueryPop=" + sqpop);

                        sqp.setPopulation(sqpop);

                        StdUtility.addInfo("about to get spaces");
                        List<GSMetadata> result = manager.getSpaces(sqp);
                        StdUtility.addInfo("result=" + result + ", size=" +
                                           (result == null ? 0 :
                                            result.size()));

                        if ((result != null) && (result.size() > 0))
                        {
                            for (GSMetadata metadata : result)
                            {
                                StdUtility.addInfo("meta=" + metadata);
                                if (metadata != null)
                                {
                                    StdUtility.addInfo("meta.displayname=" +
                                                       metadata.getDisplayName());
                                }

                                //metadata.
                            }
                        }
                    }
                }
                catch (SpacesException e)
                {
                    StdUtility.addError(e.getMessage());
                }
            }
        }
    }

    public static ReportingLineItem getReportingLineItem(DetailPerson person,
                                                         List<Integer> selectionIndexes)
    {
        ReportingLineItem result = null;

        if ((person != null) && (selectionIndexes != null) &&
            (selectionIndexes.size() > 0) &&
            (person.getReportingLine() != null))
        {
            List<ReportingLineItem> current = person.getReportingLine();

            for (Integer index : selectionIndexes)
            {
                if (current.size() > index)
                {
                    result = current.get(index);

                    current = result.getChildren();
                }
            }
        }
        return result;
    }

    public static String buildGoToMapFromAddress(String[] addressDetails)
    {
        String addressLine =
            StdUtility.append(addressDetails, " ").replace(' ', '+');

        StringBuilder sb =
            new StringBuilder(getResourceValue("Google_Map_URL", null));

        sb.append("?q=");
        sb.append(addressLine);

        //sb.append("&t=h"); // type = hybrid
        sb.append("&t=m"); // type = map

        return sb.toString();
    }

    public static String getSpacesImagePrefix()
    {
        if (isDevelopmentEnvironment())
        {
            return getResourceValue("spaces_logo_prefix_DEV", null);
        }
        else if (isSitEnvironment())
        {
            return getResourceValue("spaces_logo_prefix_SIT", null);
        }
        else if (isUatEnvironment())
        {
            return getResourceValue("spaces_logo_prefix_UAT", null);
        }
        else
        {
            return getResourceValue("spaces_logo_prefix_PROD", null);
        }
    }

    public static AppModule createApplicationModule()
    {
        return (AppModule)Configuration.createRootApplicationModule("au.com.leighton.portal.peoplefinder.model.AppModule",
                                                                    "AppModuleLocal");
    }

    public static void releaseApplicationModule(AppModule appModule)
    {
        if (appModule != null)
        {
            Configuration.releaseRootApplicationModule(appModule, false);
        }
    }
  public static String getAdminEmailSubject ()
  {
    if ("PROD".equalsIgnoreCase(getEnvironment()))
    {
      return "People Finder Details Correction";
    }
            
    else
    {
        return getEnvironment()+" - People Finder Details Correction **Testing please ignore**"    ;
     }
  }
  public static String getServiceDeskEmail()
  {
      
    return getResourceValue("admin_email_servicedesk", null);
  }
  public static String getAdminEmailFrom()
  {
    return getResourceValue("admin_email_from", null);
  }
}
