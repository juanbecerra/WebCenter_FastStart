package au.com.leighton.portal.innovation.model;

import java.io.Serializable;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;


public class IdeaBean implements Serializable
{
    private static final long serialVersionUID = 2509681880378410446L;
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

    public IdeaBean()
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

    public void setBusinessValue(String businessValue)
    {
        this._businessValue = businessValue;
    }

    public String getBusinessValue()
    {
        return _businessValue;
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

    public void setComments(String comments)
    {
        this._comments = comments;
    }

    public String getComments()
    {
        return _comments;
    }
}
