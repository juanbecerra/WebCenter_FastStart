package au.com.leighton.portal.innovation.model;

import java.io.Serializable;

import oracle.jbo.domain.Date;


public class FilterBean implements Serializable
{
    private String _username;
    private String _division = "All";
    private String _status = "All";
    private String _innovationCategory = "All";
    private String _innovationDivision = "All";
    private Date _innovationFromDate;
    private Date _innovationToDate;
    private String _innovationStatus = "All";
    private Date _fromDate;
    private Date _toDate;
    private boolean _mySubmissionsOnly;

    public FilterBean()
    {
        super();
    }

    public void setUsername(String username)
    {
        this._username = username;
    }

    public String getUsername()
    {
        return _username;
    }

    public void setDivision(String division)
    {
        this._division = division;
    }

    public String getDivision()
    {
        return _division;
    }

    public void setStatus(String status)
    {
        this._status = status;
    }

    public String getStatus()
    {
        return _status;
    }

    public void setFromDate(Date _fromDate)
    {
        this._fromDate = _fromDate;
    }

    public Date getFromDate()
    {
        return _fromDate;
    }

    public void setToDate(Date _toDate)
    {
        this._toDate = _toDate;
    }

    public Date getToDate()
    {
        return _toDate;
    }

    public void setInnovationCategory(String innovationCategory)
    {
        this._innovationCategory = innovationCategory;
    }

    public String getInnovationCategory()
    {
        return _innovationCategory;
    }

    public void setInnovationDivision(String innovationDivision)
    {
        this._innovationDivision = innovationDivision;
    }

    public String getInnovationDivision()
    {
        return _innovationDivision;
    }

    public void setInnovationFromDate(Date innovationFromDate)
    {
        this._innovationFromDate = innovationFromDate;
    }

    public Date getInnovationFromDate()
    {
        return _innovationFromDate;
    }

    public void setInnovationToDate(Date innovationToDate)
    {
        this._innovationToDate = innovationToDate;
    }

    public Date getInnovationToDate()
    {
        return _innovationToDate;
    }

    public void setInnovationStatus(String innovationStatus)
    {
        this._innovationStatus = innovationStatus;
    }

    public String getInnovationStatus()
    {
        return _innovationStatus;
    }

    public void resetIdea()
    {
        setDivision("All");
        setStatus("All");
        setFromDate(null);
        setToDate(null);
    }

    public void setMySubmissionsOnly(boolean mySubmissionsOnly)
    {
        this._mySubmissionsOnly = mySubmissionsOnly;
    }

    public boolean isMySubmissionsOnly()
    {
        return _mySubmissionsOnly;
    }
}
