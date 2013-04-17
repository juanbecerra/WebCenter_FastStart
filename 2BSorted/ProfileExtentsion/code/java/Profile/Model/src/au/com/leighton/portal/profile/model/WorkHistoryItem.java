package au.com.leighton.portal.profile.model;


import au.com.leighton.portal.profile.IWorkHistoryItem;

import java.util.Date;

/**
 * Encapsulates a single work history item
 */
public class WorkHistoryItem extends AbstractBase implements IWorkHistoryItem
{
    @SuppressWarnings("compatibility:-3958876365442916339")
    private static final long serialVersionUID = 1L;
    private String _role;
    private String _company;
    private String _location;
    private Date _fromDate;
    private Date _toDate;
    private String _jobDescription;

    /**
     * @param role
     */
    public void setRole(String role)
    {
        this._role = role;
    }

    /**
     * @return
     */
    public String getRole()
    {
        return _role;
    }

    /**
     * @param company
     */
    public void setCompany(String company)
    {
        this._company = company;
    }

    /**
     * @return
     */
    public String getCompany()
    {
        return _company;
    }

    /**
     * @param location
     */
    public void setLocation(String location)
    {
        this._location = location;
    }

    /**
     * @return
     */
    public String getLocation()
    {
        return _location;
    }

    /**
     * @param fromDate
     */
    public void setFromDate(Date fromDate)
    {
        this._fromDate = fromDate;
    }

    /**
     * @return
     */
    public Date getFromDate()
    {
        return _fromDate;
    }

    /**
     * @param toDate
     */
    public void setToDate(Date toDate)
    {
        this._toDate = toDate;
    }

    /**
     * @return
     */
    public Date getToDate()
    {
        return _toDate;
    }

    /**
     * @param jobDescription
     */
    public void setJobDescription(String jobDescription)
    {
        this._jobDescription = jobDescription;
    }

    /**
     * @return
     */
    public String getJobDescription()
    {
        return _jobDescription;
    }

    public String toString()
    {
        return "Work History Item(" + _role + ")";
    }
}
