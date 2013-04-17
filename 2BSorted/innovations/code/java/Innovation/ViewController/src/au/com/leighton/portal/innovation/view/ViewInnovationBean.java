package au.com.leighton.portal.innovation.view;


import au.com.leighton.portal.innovation.model.InnovationBean;
import au.com.leighton.portal.innovation.model.Utility;

import java.io.Serializable;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;


public class ViewInnovationBean implements Serializable
{
    private InnovationBean _innovationBean;
    private String _irNumber;
    private Date _dateSubmitted;
    private String _division;
    private String _project;
    private String _owner;
    private String _category;
    private String _initiativeName;
    private String _innovationDescription;
    private String _benefit;
    private String _businessValue;
    private String _status;
    private String _businessOptimisation;
    private String _contactDetails;
    private String _caseStudy;
    private String _flashOn;
    private String _additionalComments;
    private String _ideaSubmittedBy;
    private String _adoptedBy;
    private Date _adoptedDate;
    private String _lastModifiedBy;
    private Date _lastModifiedDate;
    private Number _ideaId;

    public ViewInnovationBean()
    {
        super();
    }

    public void setIrNumber(String irNumber)
    {
        this._irNumber = irNumber;
    }

    public String getIrNumber()
    {
        return _irNumber;
    }

    public void setDateSubmitted(Date dateSubmitted)
    {
        this._dateSubmitted = dateSubmitted;
    }

    public Date getDateSubmitted()
    {
        return _dateSubmitted;
    }

    public void setDivision(String division)
    {
        this._division = division;
    }

    public String getDivision()
    {
        return _division;
    }

    public void setProject(String project)
    {
        this._project = project;
    }

    public String getProject()
    {
        return _project;
    }

    public void setOwner(String owner)
    {
        this._owner = owner;
    }

    public String getOwner()
    {
        return _owner;
    }

    public void setCategory(String category)
    {
        this._category = category;
    }

    public String getCategory()
    {
        return _category;
    }

    public void setInitiativeName(String initiativeName)
    {
        this._initiativeName = initiativeName;
    }

    public String getInitiativeName()
    {
        return _initiativeName;
    }

    public void setInnovationDescription(String innovationDescription)
    {
        this._innovationDescription = innovationDescription;
    }

    public String getDisplayInnovationDescription()
    {
        return Utility.makeMultilineDisplayable(getInnovationDescription());
    }

    public String getInnovationDescription()
    {
        return _innovationDescription;
    }

    public void setBenefit(String benefit)
    {
        this._benefit = benefit;
    }

    public String getBenefit()
    {
        return _benefit;
    }

    public void setBusinessValue(String businessValue)
    {
        this._businessValue = businessValue;
    }

    public String getDisplayBusinessValue()
    {
        return Utility.makeMultilineDisplayable(getBusinessValue());
    }

    public String getBusinessValue()
    {
        return _businessValue;
    }

    public void setStatus(String status)
    {
        this._status = status;
    }

    public String getStatus()
    {
        return _status;
    }

    public void setBusinessOptimisation(String businessOptimisation)
    {
        this._businessOptimisation = businessOptimisation;
    }

    public String getBusinessOptimisation()
    {
        return _businessOptimisation;
    }

    public void setContactDetails(String contactDetails)
    {
        this._contactDetails = contactDetails;
    }

    public String getDisplayContactDetails()
    {
        return Utility.makeMultilineDisplayable(getContactDetails());
    }

    public String getContactDetails()
    {
        return _contactDetails;
    }

    public void setCaseStudy(String caseStudy)
    {
        this._caseStudy = caseStudy;
    }

    public String getCaseStudy()
    {
        return _caseStudy;
    }

    public void setFlashOn(String flashOn)
    {
        this._flashOn = flashOn;
    }

    public String getFlashOn()
    {
        return _flashOn;
    }

    public void setAdditionalComments(String additionalComments)
    {
        this._additionalComments = additionalComments;
    }

    public String getDisplayAdditionalComments()
    {
        return Utility.makeMultilineDisplayable(getAdditionalComments());
    }

    public String getAdditionalComments()
    {
        return _additionalComments;
    }

    public String toString()
    {
        return getIrNumber();
    }

    protected void setInnovationBean(InnovationBean _innovationBean)
    {
        this._innovationBean = _innovationBean;
    }

    protected InnovationBean getInnovationBean()
    {
        return _innovationBean;
    }

    public void setIdeaSubmittedBy(String ideaSubmittedBy)
    {
        this._ideaSubmittedBy = ideaSubmittedBy;
    }

    public String getIdeaSubmittedBy()
    {
        return _ideaSubmittedBy;
    }

    public void setAdoptedBy(String adoptedBy)
    {
        this._adoptedBy = adoptedBy;
    }

    public String getAdoptedBy()
    {
        return _adoptedBy;
    }

    public void setAdoptedDate(Date adoptedDate)
    {
        this._adoptedDate = adoptedDate;
    }

    public Date getAdoptedDate()
    {
        return _adoptedDate;
    }

    public void setLastModifiedBy(String lastModifiedBy)
    {
        this._lastModifiedBy = lastModifiedBy;
    }

    public String getLastModifiedBy()
    {
        return _lastModifiedBy;
    }

    public void setLastModifiedDate(Date lastModifiedDate)
    {
        this._lastModifiedDate = lastModifiedDate;
    }

    public Date getLastModifiedDate()
    {
        return _lastModifiedDate;
    }

    protected void setIdeaId(Number ideaId)
    {
        this._ideaId = ideaId;
    }

    protected Number getIdeaId()
    {
        return _ideaId;
    }
}
