package au.com.leighton.portal.profile.view;


import au.com.leighton.portal.profile.IWorkHistory;
import au.com.leighton.portal.profile.Utility;

import java.io.Serializable;

import java.util.List;


public class WorkHistoryBean extends AbstractBean
{
    @SuppressWarnings("compatibility:-7410263896765494832")
    private static final long serialVersionUID = 1L;
    protected List<WorkHistoryItemBean> _workHistoryItemBeans = null;
    protected WorkHistoryItemBean _selectedWorkHistoryItem = null;

    public WorkHistoryBean()
    {
    }


    public String getSectionTitle()
    {
        String result =
            (String)Utility.getFacesValue(Utility.FacesValue.TASKFLOW_PARAMETER_TITLE);

        if (Utility.isNullOrEmpty(result))
        {
            result = Utility.getDefaultWorkHistoryTitle();
        }

        return result;
    }

    public IWorkHistory getWorkHistory()
    {
        return (IWorkHistory)getAbstractBase();
    }

    public List<WorkHistoryItemBean> getWorkHistoryItemBeans()
    {
        return _workHistoryItemBeans;
    }

    public void setSelectedWorkHistoryItem(WorkHistoryItemBean itemBean)
    {
        _selectedWorkHistoryItem = itemBean;
    }

    public WorkHistoryItemBean getSelectedWorkHistoryItem()
    {
        return _selectedWorkHistoryItem;
    }
}
