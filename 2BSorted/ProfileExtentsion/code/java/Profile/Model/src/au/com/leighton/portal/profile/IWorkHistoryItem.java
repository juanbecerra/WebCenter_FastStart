package au.com.leighton.portal.profile;

import java.io.Serializable;

import java.util.Date;


public interface IWorkHistoryItem extends IAbstractBase
{
    String getRole();

    String getCompany();

    String getLocation();

    Date getFromDate();

    Date getToDate();

    String getJobDescription();
}
