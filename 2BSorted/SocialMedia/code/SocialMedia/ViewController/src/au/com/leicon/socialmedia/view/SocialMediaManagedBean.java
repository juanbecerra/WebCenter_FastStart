package au.com.leicon.socialmedia.view;

import au.com.leicon.core.services.cache.CacheService;
import au.com.leicon.core.services.cache.coherence.CoherenceCacheServiceImpl;
import au.com.leicon.socialmedia.entity.Twitter;
import au.com.leicon.socialmedia.entity.YouTube;
import au.com.leicon.socialmedia.services.SocialMediaComposite;
import au.com.leicon.socialmedia.services.Socialmediacomposite_client_ep;

import au.com.leicon.socialmedia.services.types.DataType;
import au.com.leicon.socialmedia.services.types.ItemType;

import au.com.leicon.socialmedia.util.Constant;

import au.com.leicon.socialmedia.util.ErrorUtil;

import java.net.URL;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.event.ActionEvent;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.ws.WebServiceRef;

import oracle.adf.share.ADFContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SocialMediaManagedBean {
    @WebServiceRef
    private static Socialmediacomposite_client_ep socialmediacomposite_client_ep;
    private String site;
    private String account;
    private List twitterMessage;
    private List twitterMessage_temp;
    // private List youTubeMessage;
    private YouTube youtube;
    private static Log LOGGER;
    private static String LOG_SUBSYSTEM = "SocialMedia";
    private static CacheService cacheService = new CoherenceCacheServiceImpl("SOCIALMEDIA_CACHE", 10800000 );//3 hours

    static {

            LOGGER = LogFactory.getFactory().getInstance(LOG_SUBSYSTEM);
            LOGGER.debug("Initialised logger");
    }

    public SocialMediaManagedBean() {
        super();
    }

    public void invokeSocialMediaService(String site, String account) {
        
        Object retObjec = getCacheService().get(account+site);
        if (site.equalsIgnoreCase("twitter")) {
            if (null == retObjec) {
                LOGGER.error("twitter not in cache calling service for "+account+site);
                twitterMessage=callTwitterService(site, account);
                getCacheService().put(account+site, twitterMessage);
                
            }
            else
            {
                LOGGER.equals("twitter in cache for "+account+site);
                twitterMessage=(List)retObjec;
            }
        }
        else if (site.equalsIgnoreCase("youtube")) {
            
            if (null == retObjec) {
                youtube= callYoutubeService( site,  account);
                getCacheService().put(site, youtube);
            }
            else
            {
                youtube=(YouTube)retObjec;
            }
        }
    }
    
    private List<ItemType> callSMService(String site, String account)
    {
        
            try {
                if (System.getProperty("Env") ==null){
                    LOGGER.error("Unable to get -DEnv value");
                }else{
                    LOGGER.info("Connecting to : " + System.getProperty("Env") + " Environment" );
                }
                 LOGGER.info("Calling Service URL : " + Constant.WS_URL);
                socialmediacomposite_client_ep = new Socialmediacomposite_client_ep(new URL(Constant.WS_URL), new QName(Constant.WS_QNAME, Constant.WS_SERVICENAME));
                SocialMediaComposite socialMediaComposite = socialmediacomposite_client_ep.getSocialMediaComposite_pt();
                DataType result = socialMediaComposite.process(site, account);

                List<ItemType> items = result.getItem();
                return items;
                
            } catch (Exception e) {
                LOGGER.error("Social Media Exception \n" + ErrorUtil.getStackTraceAsString(e));
                return null;
            }
        }
    
    public YouTube callYoutubeService(String site, String account)
    {
        List<ItemType> items=callSMService(site, account);
        YouTube youtube_rt = new YouTube();
        for (ItemType item : items) {
            youtube_rt.setId(item.getId());
            youtube_rt.setFromName(item.getFromName().getValue());
            youtube_rt.setCreatedTime(item.getCreatedTime().getValue());
            Date convertedDate = item.getCreatedTime().getValue().toGregorianCalendar().getTime();
            youtube_rt.setCreatedTimeText(getDateDifferenceString(convertedDate, new Date()));
            youtube_rt.setTitle(item.getTitle().getValue());
            youtube_rt.setMessage(item.getMessage().getValue());
            youtube_rt.setLink(item.getLink().getValue());
            break; //get the first record only as it is always the latest
        }
        return youtube_rt;
    }
    
    
    public List callTwitterService(String site, String account)
    {
        List<ItemType> items=callSMService(site, account);
        List twitterMessage_rt = new ArrayList();
        if (items.get(0).getId().equalsIgnoreCase("-1"))
        {
            Twitter twitter = new Twitter();
            twitter.setMessage("No recent updates found");
            twitter.setFromName(account);
            twitterMessage_rt.add(twitter);
        }
        else
        {
            for (ItemType item : items) {
                Twitter twitter = new Twitter();
                twitter.setFromName(item.getFromName().getValue());
                twitter.setCreatedTime(item.getCreatedTime().getValue());
                Date convertedDate = item.getCreatedTime().getValue().toGregorianCalendar().getTime();
                twitter.setCreatedTimeText(getDateDifferenceString(convertedDate, new Date()));
                twitter.setTitle(item.getTitle().getValue());
                //twitter.setMessage(item.getMessage().getValue());
                twitter.setMessage(item.getMessage().getValue().replaceAll("<a", "<a target=\"_blank\" "));
                twitterMessage_rt.add(twitter);
            }
        }
        return twitterMessage_rt;
    }

    public void invokeYouTube(){
        this.site = "youtube";
        this.account = "LeightonContractors";
        this.invokeSocialMediaService(this.site,this.account);
    }
    public void invokeTwitterCompany() {
        this.site = "twitter";
        this.account = "LeightonContrac";
        this.invokeSocialMediaService(this.site, this.account);
    }

    public void invokeTwitterCareers() {
        this.site = "twitter";
        this.account = "LeightonCareers";
        this.invokeSocialMediaService(this.site, this.account);
    }

    private String getDateDifferenceString(Date earlierDate, Date laterDate) {
        long nTotalDiff = laterDate.getTime() - earlierDate.getTime();
//        long diffSeconds = nTotalDiff / 1000;
        long diffMinutes = nTotalDiff / (60 * 1000);
        long diffHours = nTotalDiff / (60 * 60 * 1000);
        long diffDays = nTotalDiff / (24 * 60 * 60 * 1000);        String text = "";
        if (diffDays > 0) {
            text = diffDays + " days ";
        }
        if (diffHours > 0) {
            long hourText = diffHours - (diffDays * 24);
            if (hourText > 0)
                text = text + (diffHours - (diffDays * 24)) + " hours ";
        }
        if (diffMinutes > 0) {
            long minText = diffMinutes - (diffHours * 60);
            if (minText > 0)
                text = text + minText + " minutes ";
        }
        return text + " ago";
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getSite() {
        if (site == null) {
            this.site = "twitter";
            this.account = "LeightonContrac";
        }
        return site;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccount() {
        return account;
    }

    public void setTwitterMessage(List twitterMessage) {
        this.twitterMessage = twitterMessage;
    }

    public List getTwitterMessage() {
        return twitterMessage;
    }

   /* public void setYouTubeMessage(List youTubeMessage) {
        this.youTubeMessage = youTubeMessage;
    }

    public List getYouTubeMessage() {
        return youTubeMessage;
    }*/

    public void setYoutube(YouTube youtube) {
        this.youtube = youtube;
    }

    public YouTube getYoutube() {
        return youtube;
    }

    public void compaynTwitterClick(ActionEvent actionEvent) {
        this.invokeTwitterCompany();
    }

    public void careerTwitterClick(ActionEvent actionEvent) {
        this.invokeTwitterCareers();
    }

    public static CacheService getCacheService() {
        return cacheService;
    }
}
