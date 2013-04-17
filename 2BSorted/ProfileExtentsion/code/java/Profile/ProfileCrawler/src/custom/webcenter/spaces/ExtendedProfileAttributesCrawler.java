package custom.webcenter.spaces;

import java.io.InputStream;

import java.util.Calendar;
import java.util.Date;

//import oracle.adf.share.logging.ADFLogger;

import oracle.adf.share.logging.ADFLogger;

import oracle.webcenter.search.QueryResult;
import oracle.webcenter.search.Row;
import oracle.webcenter.search.crawl.spi.CrawlContext;
import oracle.webcenter.search.crawl.spi.Crawlable;
import oracle.webcenter.security.ses.ServicePermissionEvaluator;


public class ExtendedProfileAttributesCrawler implements Crawlable
{

    public int getTotalNumRows(CrawlContext crawlContext)
    {
        totalNoOfCount = 1000;
        return totalNoOfCount;
    }

    public QueryResult<Row> getRows(CrawlContext crawlContext, int startIndex,
                                    int size)
    {
        final String METHOD_NAME = "getRows";
        LOGGER.entering(CLASS_NAME, METHOD_NAME, new Object[]
                { startIndex, size });
        ExtendedProfileServiceCrawlerQueryResult members = null;
        try
        {
            Date lastCrawlTime = null;
            Calendar cal = crawlContext.getLastCrawlTime();
            if (cal != null)
                lastCrawlTime = cal.getTime();
            members =
                    new ExtendedProfileServiceCrawlerQueryResult(startIndex, size,
                                                                 lastCrawlTime);
        }
        catch (Exception e)
        {
            LOGGER.warning(CLASS_NAME, METHOD_NAME, e.getMessage());
        }
        finally
        {
            LOGGER.exiting(CLASS_NAME, METHOD_NAME);
        }
        return (QueryResult<Row>)members;
    }

    public InputStream getContent(CrawlContext crawlContext)
    {
        return null;
    }

    public ServicePermissionEvaluator getServicePermissionEvaluator()
    {
        return null;
    }

    public ServicePermissionEvaluator getCustomPermissionEvaluator()
    {
        return null;
    }

    public ServicePermissionEvaluator getSimplifiedPermissionEvaluator()
    {
        return null;
    }

    private static String CLASS_NAME =
        ExtendedProfileAttributesCrawler.class.getName();
    private static ADFLogger LOGGER =
        ADFLogger.createADFLogger("custom.webcenter.spaces");
    private int totalNoOfCount = 0;

}

