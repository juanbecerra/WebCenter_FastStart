package au.com.leighton.portal.profile;

import java.io.Serializable;

public class ProfileResponse implements Serializable
{
    @SuppressWarnings("compatibility:-3372302108344405867")
    private static final long serialVersionUID = 1L;
    private Exception _exception;
    private ISummary _summary;
    private IExperience _experience;
    private IWorkHistory _workHistory;
    private IExperienceItem _experienceItem;
    private IWorkHistoryItem _workHistoryItem;
    private boolean _booleanValue;

    public ProfileResponse()
    {
        super();
    }

    public void setException(Exception _exception)
    {
        this._exception = _exception;
    }

    public Exception getException()
    {
        return _exception;
    }

    public void setSummary(ISummary _summary)
    {
        this._summary = _summary;
    }

    public ISummary getSummary()
    {
        return _summary;
    }

    public void setExperience(IExperience _experience)
    {
        this._experience = _experience;
    }

    public IExperience getExperience()
    {
        return _experience;
    }

    public void setExperienceItem(IExperienceItem _experienceItem)
    {
        this._experienceItem = _experienceItem;
    }

    public IExperienceItem getExperienceItem()
    {
        return _experienceItem;
    }

    public void setWorkHistoryItem(IWorkHistoryItem _workHistoryItem)
    {
        this._workHistoryItem = _workHistoryItem;
    }

    public IWorkHistoryItem getWorkHistoryItem()
    {
        return _workHistoryItem;
    }

    public void setBooleanValue(boolean _booleanValue)
    {
        this._booleanValue = _booleanValue;
    }

    public boolean isBooleanValue()
    {
        return _booleanValue;
    }

    public void setWorkHistory(IWorkHistory _workHistory)
    {
        this._workHistory = _workHistory;
    }

    public IWorkHistory getWorkHistory()
    {
        return _workHistory;
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer();

        sb.append("Exception=");
        sb.append(getException());
        sb.append(", Boolean Value=");
        sb.append(isBooleanValue());
        sb.append(", Experience=");
        sb.append(_experience);
        sb.append(", Work history=");
        sb.append(_workHistory);
        sb.append(", Experience Item=");
        sb.append(_experienceItem);
        sb.append(", Work History Item=");
        sb.append(_workHistoryItem);

        return sb.toString();
    }
}
