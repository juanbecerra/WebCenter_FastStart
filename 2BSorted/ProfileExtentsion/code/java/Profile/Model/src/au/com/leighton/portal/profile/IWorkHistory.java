package au.com.leighton.portal.profile;

import java.io.Serializable;

import java.util.List;


public interface IWorkHistory extends IAbstractBase
{
    List<IWorkHistoryItem> getWorkHistoryItems();
}
