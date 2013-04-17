package custom.webcenter.spaces;

import java.sql.Timestamp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import oracle.adf.share.logging.ADFLogger;

import oracle.webcenter.framework.resource.external.ResourceUri;
import oracle.webcenter.framework.service.ServiceContext;
import oracle.webcenter.framework.service.Utility;
import static oracle.webcenter.search.crawl.spi.CrawlConstants.*;
import static oracle.webcenter.search.AttributeConstants.*;
import oracle.webcenter.peopleconnections.common.settings.SettingsException;
import oracle.webcenter.peopleconnections.profile.ProfileException;
import oracle.webcenter.search.QName;
import oracle.webcenter.search.QueryResult;
import oracle.webcenter.search.Row;
import oracle.webcenter.search.crawl.ses.util.SesFeedUtils;

public class ExtendedProfileServiceCrawlerQueryResult implements QueryResult<Row>
{
    private static ADFLogger LOGGER =
        ADFLogger.createADFLogger("custom.webcenter.spaces");


    public ExtendedProfileServiceCrawlerQueryResult(int startIndex, int size,
                                                    Date lastCrawlTime)
    {

        List<Row> rows = new ArrayList<Row>();

        try
        {
            Row row = null;
            /**
       * In this sample we return rows in the customAttributesMap
       * This can be changed to query from a custom table or from ldap
       * e.g. we can loop over the all the rows returned by the
       * sql query like 'select * from user_table' or from LDAP
       * using the OPSS api's in oracle.security.idm.*
       * pseudocode below.
       * 	  idStore =  oracle.webcenter.framework.service.Utility.getDefaultIdentityStore();
       *    SearchParameters param = new SearchParameters();
       *    param.setSearchIdentityType(SearchParameters.SEARCH_USERS_ONLY);
       *    SearchResponse response = idStore.searchUsers(param);
       *    while (response.hasNext())
       *    {
       *        User user = (User) response.next();
       *      System.out.println("User GUID: " + user.getGUID()+ " , userName: " + user.getName());
       *    }
       *
       */
            for (String userId :
                 CustomProfileDataSource.getCustomAttributesMap().keySet())
            {
                Map<String, String> custAttributes =
                    CustomProfileDataSource.getCustomAttributesMap().get(userId);
                row = new CustomAttributesRows(userId, custAttributes);
            }
            rows.add((Row)row);
        }
        catch (Exception ex)
        {
            LOGGER.warning(ex);
        }
        mResults = rows.iterator();
    }
    private Iterator<Row> mResults;
    private Map<String, String> mProperties = new HashMap<String, String>();

    public Map getProperties()
    {
        return mProperties;
    }

    public boolean hasNext()
    {
        return mResults.hasNext();
    }

    public Row next()
    {
        Row row = mResults.next();
        return row;
    }

    public void remove()
    {
        //no operation
    }

    public class CustomAttributesRows implements Row
    {
        private Map<QName, Object> mAttributes = new HashMap<QName, Object>();

        public CustomAttributesRows(String userID,
                                    Map<String, String> attributes)
        {
            StringBuilder sb = new StringBuilder();
            for (String custAttribute : attributes.keySet())
            {
                String custAttributeValue = attributes.get(custAttribute);
                setAttribute(custAttribute, custAttributeValue);
            }
            setAttribute(DCMI_IDENTIFIER, userID);

            setAttribute(DCMI_TITLE, userID);
            setAttribute(DCMI_DESCRIPTION, userID);
            //Use the DCMI_MODIFIER to set the value when the custom attributes
            //of the user are modified.
            setAttribute(DCMI_MODIFIED,
                         new Timestamp(System.currentTimeMillis()));
            setAttribute(WPSAPI_SCOPE_GUID, "");
            //Based on the visibility of the custom attributes to other user upon search from
            // WebCenter set the value of WCCSPI_AUTH_TYPE to AUTH_AUTHENTICATED for logged in
            // users to see the search result or AUTH_ANONYMOUS for logged in as well as public
            // users to see the search result.
            setAttribute(WCCSPI_AUTH_TYPE, AUTH_ANONYMOUS);
        }

        public Object getObject(QName qName)
        {
            return mAttributes.get(qName);
        }

        public Iterator<QName> getColumns()
        {
            return mAttributes.keySet().iterator();
        }

        private void setAttribute(String attributeName, Object attributeValue)
        {
            QName attr = new QName(NS_WCCSPI, attributeName);
            setAttribute(attr, attributeValue);
        }

        public void setAttribute(QName name, Object value)
        {
            mAttributes.put(name, value);
        }
    }
}

