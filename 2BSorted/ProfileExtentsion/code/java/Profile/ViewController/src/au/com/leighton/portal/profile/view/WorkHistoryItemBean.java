package au.com.leighton.portal.profile.view;


import au.com.leighton.portal.profile.IWorkHistoryItem;
import au.com.leighton.portal.profile.Utility;

import java.io.Serializable;

import java.text.SimpleDateFormat;

import java.util.Date;

import javax.faces.event.ValueChangeEvent;


public class WorkHistoryItemBean extends AbstractBean
{
    @SuppressWarnings("compatibility:876350284393916462")
    private static final long serialVersionUID = 4281469056687417364L;
    private WorkHistoryBean _parentBean;
    private String _role;
    private String _company;
    private String _location;
    private Date _fromDate;
    private Date _toDate;
    private String _jobDescription;

    public WorkHistoryItemBean()
    {
        super();
    }

    public void setWorkHistoryItem(WorkHistoryBean parentBean,
                                   IWorkHistoryItem item)
    {
        setAbstractBase(item);
        _parentBean = parentBean;
        setRole(item == null ? null : item.getRole());
        setCompany(item == null ? null : item.getCompany());
        setLocation(item == null ? null : item.getLocation());
        setFromDate(item == null ? null : item.getFromDate());
        setToDate(item == null ? null : item.getToDate());
        setJobDescription(item == null ? null : item.getJobDescription());
    }

    public IWorkHistoryItem getWorkHistoryItem()
    {
        return (IWorkHistoryItem)getAbstractBase();
    }

    public void setSelected(boolean selected)
    {
        if ((_parentBean != null) && selected)
        {
            _parentBean.setSelectedWorkHistoryItem(this);
        }
    }

    public boolean isSelected()
    {
        return (_parentBean != null) &&
            (_parentBean.getSelectedWorkHistoryItem() != null) &&
            (_parentBean.getSelectedWorkHistoryItem().getId() == getId());
    }

    public void selectionChange(ValueChangeEvent valueChangeEvent)
    {
        if ((valueChangeEvent != null) &&
            (Boolean.TRUE.equals(valueChangeEvent.getNewValue()) &&
             (_parentBean != null)))
        {
            _parentBean.setSelectedWorkHistoryItem(this);
        }
    }

    public void setRole(String role)
    {
        this._role = role;
    }

    public String getRole()
    {
        return _role;
    }

    public void setCompany(String company)
    {
        this._company = company;
    }

    public String getCompany()
    {
        return _company;
    }

    public void setLocation(String location)
    {
        this._location = location;
    }

    public String getLocation()
    {
        return _location;
    }

    public void setFromDate(Date fromDate)
    {
        this._fromDate = fromDate;
    }

    public Date getFromDate()
    {
        return _fromDate;
    }

    public void setToDate(Date toDate)
    {
        this._toDate = toDate;
    }

    public Date getToDate()
    {
        return _toDate;
    }

    public void setJobDescription(String jobDescription)
    {
        this._jobDescription = jobDescription;
    }

    public String getJobDescription()
    {
        return _jobDescription;
    }

    public String getViewJobDescription()
    {
        return Utility.makeMultilineDisplayable(getJobDescription());
    }

    public String getTimeframe()
    {
        StringBuffer sb = new StringBuffer();

        SimpleDateFormat sdf = new SimpleDateFormat("MMM yyyy");

        if (getFromDate() == null)
        {
            sb.append("Unknown start date");
        }
        else
        {
            sb.append(sdf.format(getFromDate()));
        }

        sb.append(" - ");

        if (getToDate() == null)
        {
            sb.append("Current");
        }
        else
        {
            sb.append(sdf.format(getToDate()));
        }

        return sb.toString();
    }

    public String saveEdit()
    {
        LeightonProfileBean profileBean = getProfileBean();

        if (profileBean != null)
        {
            profileBean.update(this);
        }
        //        Object facesValue =
        //            Utility.getFacesValue(Utility.FacesValue.WORK_HISTORY_BEAN);
        //
        //        if (facesValue instanceof WorkHistoryBean)
        //        {
        //            WorkHistoryBean whBean = (WorkHistoryBean)facesValue;
        //
        //            if (whBean.getAppModule() != null)
        //            {
        //                if (setProfileResponse(whBean.getAppModule().updateWorkHistoryItem(getWorkHistoryItem(),
        //                                                                                   getRole(),
        //                                                                                   getCompany(),
        //                                                                                   getLocation(),
        //                                                                                   Utility.convert(getFromDate()),
        //                                                                                   Utility.convert(getToDate()),
        //                                                                                   getJobDescription())))
        //                {
        //                    whBean.initialiseWorkHistory(getAppModule());
        //
        //                    //                ViewUtility.addInfoMessage("Work History Item",
        //                    //                                           "\"" + getRole() + "\" at \"" +
        //                    //                                           getCompany() + "\" updated.");
        //                }
        //            }
        //        }
        return "ok";
    }

    public String delete()
    {
        LeightonProfileBean profileBean = getProfileBean();

        if (profileBean != null)
        {
            profileBean.delete(this);
        }
        //        Object facesValue =
        //            Utility.getFacesValue(Utility.FacesValue.WORK_HISTORY_BEAN);
        //
        //        if (facesValue instanceof WorkHistoryBean)
        //        {
        //            WorkHistoryBean whBean = (WorkHistoryBean)facesValue;
        //
        //            if (whBean.getAppModule() != null)
        //            {
        //                if (setProfileResponse(whBean.getAppModule().deleteWorkHistoryItem(whBean.getWorkHistory(),
        //                                                                                   getWorkHistoryItem())))
        //                {
        //                    whBean.initialiseWorkHistory(getAppModule());
        //
        //                    //                ViewUtility.addInfoMessage("Work History Item",
        //                    //                                           "\"" + getRole() + "\" at \"" +
        //                    //                                           getCompany() + "\" deleted.");
        //                }
        //            }
        //        }
        return "ok";
    }

    public String saveNew()
    {
        LeightonProfileBean profileBean = getProfileBean();

        if (profileBean != null)
        {
            profileBean.saveNew(this);
        }
        //        Object facesValue =
        //            Utility.getFacesValue(Utility.FacesValue.WORK_HISTORY_BEAN);
        //
        //        if (facesValue instanceof WorkHistoryBean)
        //        {
        //            WorkHistoryBean whBean = (WorkHistoryBean)facesValue;
        //
        //            if (whBean.getAppModule() != null)
        //            {
        //                if (setProfileResponse(whBean.getAppModule().createWorkHistoryItem(whBean.getWorkHistory(),
        //                                                                                   getRole(),
        //                                                                                   getCompany(),
        //                                                                                   getLocation(),
        //                                                                                   Utility.convert(getFromDate()),
        //                                                                                   Utility.convert(getToDate()),
        //                                                                                   getJobDescription())))
        //                {
        //                    whBean.initialiseWorkHistory(getAppModule());
        //
        //                    //                ViewUtility.addInfoMessage("Work History Item",
        //                    //                                           "\"" + getRole() + "\" at \"" +
        //                    //                                           getCompany() + "\" created.");
        //                }
        //            }
        //        }
        return "ok";
    }
}
