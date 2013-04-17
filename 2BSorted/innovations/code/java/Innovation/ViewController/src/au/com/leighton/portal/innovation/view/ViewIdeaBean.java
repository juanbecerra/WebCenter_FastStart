package au.com.leighton.portal.innovation.view;


import au.com.leighton.portal.innovation.model.IdeaBean;
import au.com.leighton.portal.innovation.model.Utility;

import java.io.Serializable;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;

public class ViewIdeaBean implements Serializable
{
    private IdeaBean _ideaBean;
    private Number _submittedId;
    private String _originator;
    private String _idea;
    private String _businessValue;
    private String _division;
    private String _contactDetails;
    private String _submittedBy;
    private Date _dateSubmitted;
    private String _source;
    private String _status;
    private String _comments;

    public ViewIdeaBean()
    {
        super();
    }

    public void setOriginator(String originator)
    {
        this._originator = originator;
    }

    public String getOriginator()
    {
        return _originator;
    }

    public void setIdea(String idea)
    {
        this._idea = idea;
    }

    public String getIdea()
    {
        return _idea;
    }

    public String getDisplayIdea()
    {
        return Utility.makeMultilineDisplayable(getIdea());
    }

    public void setBusinessValue(String businessValue)
    {
        this._businessValue = businessValue;
    }

    public String getBusinessValue()
    {
        return _businessValue;
    }

    public String getDisplayBusinessValue()
    {
        return Utility.makeMultilineDisplayable(getBusinessValue());
    }

    public void setDivision(String division)
    {
        this._division = division;
    }

    public String getDivision()
    {
        return _division;
    }

    public void setContactDetails(String contactDetails)
    {
        this._contactDetails = contactDetails;
    }

    public String getContactDetails()
    {
        return _contactDetails;
    }

    public String getDisplayContactDetails()
    {
        return Utility.makeMultilineDisplayable(getContactDetails());
    }

    public void setSubmittedBy(String submittedBy)
    {
        this._submittedBy = submittedBy;
    }

    public String getSubmittedBy()
    {
        return _submittedBy;
    }

    public void setDateSubmitted(Date dateSubmitted)
    {
        this._dateSubmitted = dateSubmitted;
    }

    public Date getDateSubmitted()
    {
        return _dateSubmitted;
    }

    public void setSource(String source)
    {
        this._source = source;
    }

    public String getSource()
    {
        return _source;
    }

    public void setStatus(String status)
    {
        this._status = status;
    }

    public String getStatus()
    {
        return _status;
    }

    public void setSubmittedId(Number _submittedId)
    {
        this._submittedId = _submittedId;
    }

    public Number getSubmittedId()
    {
        return _submittedId;
    }

    public boolean isCanProcess()
    {
        return "Pending".equalsIgnoreCase(getStatus()) ||
            "Refine".equalsIgnoreCase(getStatus());
    }

    public void setComments(String comments)
    {
        this._comments = comments;
    }

    public String getComments()
    {
        return _comments;
    }

    public String getDisplayComments()
    {
        return Utility.makeMultilineDisplayable(getComments());
    }

    public String toString()
    {
        return "" + getSubmittedId();
    }

    protected void setIdeaBean(IdeaBean _ideaBean)
    {
        this._ideaBean = _ideaBean;
    }

    protected IdeaBean getIdeaBean()
    {
        return _ideaBean;
    }
}
