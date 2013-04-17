package au.com.leicon.ess.view;

import au.com.leicon.core.services.cache.CacheService;
import au.com.leicon.core.services.cache.coherence.CoherenceCacheServiceImpl;
import au.com.leicon.ess.service.types.DataType;
import au.com.leicon.ess.service.types.ErrorType;
import au.com.leicon.ess.services.MyESSDetails;
import au.com.leicon.ess.services.Myessdetails_client_ep;

import au.com.leicon.ess.util.Constant;

import au.com.leicon.ess.util.DateUtil;

import au.com.leicon.ess.util.ErrorUtil;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.WebServiceRef;

import oracle.adf.share.ADFContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.lang.Float;

import java.text.DecimalFormat;

import org.apache.myfaces.trinidad.event.PollEvent;

public class MyESSDetailsManagedBean {

    @WebServiceRef
    private static Myessdetails_client_ep myessdetails_client_ep;
    private String leaveBalance;
    private String lastPayslipDate;
    private String baseURL;
    private String payslipFunctionID;
    private String leaveBalanceFunctionID;
    private String responseibilityID;
    private String appID;
    private String securityGroup;
    private String lang;
    private String payslipFullURL;
    private String leaveBalanceFullURL;
    private String errorCode;
    private String errorMessage;
    private static Log LOGGER;
    private static String LOG_SUBSYSTEM = "MyESSDetails";
    private int hasloaded = 0;
    private static CacheService cacheService = new CoherenceCacheServiceImpl("MYESS_CACHE", 14400000 );//4 Hours


    static {

            LOGGER = LogFactory.getFactory().getInstance(LOG_SUBSYSTEM);
            LOGGER.debug("Initialised logger");
    }
    
    
    private DataType getServiceResponse ()
    {
        String username = ADFContext.getCurrent().getSecurityContext().getUserName();
        //String username = "jbecerra";
        DataType response = null;
        
        Object retObjec = getCacheService().get(username);
        
        if (null == retObjec)
        {
            LOGGER.info("Data NOT in cache");
            try {
                LOGGER.info("Connecting to MyESSDetails SOA Service using username: " + username);
                myessdetails_client_ep = new Myessdetails_client_ep(new URL(Constant.WS_URL), new QName(Constant.WS_QNAME, Constant.WS_SERVICENAME));
                MyESSDetails myESSDetails = myessdetails_client_ep.getMyESSDetails_pt();           
                response = myESSDetails.process(username);
                getCacheService().put(username, response);  
               
            } catch (Exception e) {
                errorCode = "1";
                LOGGER.error("ESS Exception \n" + ErrorUtil.getStackTraceAsString(e));
                e.printStackTrace();
            }
        
        }
        else
        {
            LOGGER.info("Data  in cache");
            response = (DataType)retObjec;
        }
        return response;
    }
    public void invokeESSService() {
        
            hasloaded++;
            Float leavetime;
            
            DataType response = getServiceResponse();
           if (response != null) 
           {
            try
            {
                if (response.getLeaveBalance().getValue().length()!=0)
                {
                    leaveBalance = response.getLeaveBalance().getValue()+ " hours";
                }
                if (response.getLastPayslipDate().getValue().length()!=0)
                {
                    lastPayslipDate = DateUtil.formatDate(response.getLastPayslipDate().getValue());
                }
            }
            catch(Exception e)
            {
                leaveBalance="";
                lastPayslipDate="";
                LOGGER.error("ESS Exception getting values\n" + ErrorUtil.getStackTraceAsString(e));
            }
            try
            {
                baseURL = response.getBaseUrl().getValue();
                payslipFunctionID = response.getPayslipFunc().getValue();
                leaveBalanceFunctionID = response.getLeaveFunc().getValue();
                responseibilityID = response.getResponsibilityId().getValue();
                appID = response.getResponsibilityApplicationId().getValue();
                securityGroup = response.getSecurityGroupId().getValue();
                ErrorType errorType = response.getError().getValue();
                errorCode = errorType.getErrorCode().getValue();
                LOGGER.warn("MyESSDetail Service returned error code " + errorCode + " message:" + errorType.getErrorMessage().getValue());
                lang = "US";
           }
           catch(Exception e)
           {
              LOGGER.error("ESS Exception getting values\n" + ErrorUtil.getStackTraceAsString(e));
           }
       }
        
    }

    public void setLeaveBalance(String leaveBalance) {
        this.leaveBalance = leaveBalance;
    }

    public String getLeaveBalance() {
        return leaveBalance;
    }

    public void setLastPayslipDate(String lastPayslipDate) {
        this.lastPayslipDate = lastPayslipDate;
    }

    public String getLastPayslipDate() {
        return lastPayslipDate;
    }

    public void setBaseURL(String baseURL) {
        this.baseURL = baseURL;
    }

    public String getBaseURL() {
        return baseURL;
    }

    public void setResponseibilityID(String responseibilityID) {
        this.responseibilityID = responseibilityID;
    }

    public String getResponseibilityID() {
        return responseibilityID;
    }

    public void setAppID(String appID) {
        this.appID = appID;
    }

    public String getAppID() {
        return appID;
    }

    public void setSecurityGroup(String securityGroup) {
        this.securityGroup = securityGroup;
    }

    public String getSecurityGroup() {
        return securityGroup;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getLang() {
        return lang;
    }

    public void setPayslipFunctionID(String payslipFunctionID) {
        this.payslipFunctionID = payslipFunctionID;
    }

    public String getPayslipFunctionID() {
        return payslipFunctionID;
    }

    public void setLeaveBalanceFunctionID(String leaveBalanceFunctionID) {
        this.leaveBalanceFunctionID = leaveBalanceFunctionID;
    }

    public String getLeaveBalanceFunctionID() {
        return leaveBalanceFunctionID;
    }

    public void setPayslipFullURL(String payslipFullURL) {
        this.payslipFullURL = payslipFullURL;
    }

    public String getPayslipFullURL() {
        payslipFullURL = baseURL + 
                  "/OA_HTML/RF.jsp?function_id=" + payslipFunctionID + 
                  "&resp_id=" + responseibilityID + 
                  "&resp_appl_id=" + appID + 
                  "&security_group_id=" + securityGroup + 
                  "&lang_code=" + lang;   
        return payslipFullURL;
    }

    public void setLeaveBalanceFullURL(String leaveBalanceFullURL) {
        this.leaveBalanceFullURL = leaveBalanceFullURL;
    }

    public String getLeaveBalanceFullURL() {
        leaveBalanceFullURL = baseURL + 
                  "/OA_HTML/RF.jsp?function_id=" + leaveBalanceFunctionID + 
                  "&resp_id=" + responseibilityID + 
                  "&resp_appl_id=" + appID + 
                  "&security_group_id=" + securityGroup + 
                  "&lang_code=" + lang;   
        return leaveBalanceFullURL;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public int getHasloaded() {
        return hasloaded;
    }
    
    public void loadLinks(PollEvent pollEvent) {
                
                if (hasloaded == 0)
                 {
                    invokeESSService();
                   
                 }
            }

    public static CacheService getCacheService() {
        return cacheService;
    }
}
