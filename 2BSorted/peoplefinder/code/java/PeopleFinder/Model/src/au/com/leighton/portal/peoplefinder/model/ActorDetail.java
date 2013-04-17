package au.com.leighton.portal.peoplefinder.model;

import java.io.Serializable;

import oracle.jbo.domain.Number;
import oracle.jbo.domain.Timestamp;


public class ActorDetail implements Serializable
{
    @SuppressWarnings("compatibility:-1401535156030927931")
    private static final long serialVersionUID = 1L;
    private String _activityActorDetailId;
    private String _actorId;
    private String _actorName;
    private String _displayName;
    private String _email;
    private String _department;
    private String _jobTitle;
    private Timestamp _updatedOn;
    private Number _version;
    private String _status;
    private String _managerId;
    private String _applicationId;
    private Number _enterpriseId;
    private ActorPhoto _photo;

    public ActorDetail()
    {
        super();
    }

    public void setActivityActorDetailId(String activityActorDetailId)
    {
        this._activityActorDetailId = activityActorDetailId;
    }

    public String getActivityActorDetailId()
    {
        return _activityActorDetailId;
    }

    public void setActorId(String actorId)
    {
        this._actorId = actorId;
    }

    public String getActorId()
    {
        return _actorId;
    }

    public void setActorName(String actorName)
    {
        this._actorName = actorName;
    }

    public String getActorName()
    {
        return _actorName;
    }

    public void setDisplayName(String displayName)
    {
        this._displayName = displayName;
    }

    public String getDisplayName()
    {
        return _displayName;
    }

    public void setEmail(String email)
    {
        this._email = email;
    }

    public String getEmail()
    {
        return _email;
    }

    public void setDepartment(String department)
    {
        this._department = department;
    }

    public String getDepartment()
    {
        return _department;
    }

    public void setJobTitle(String jobTitle)
    {
        this._jobTitle = jobTitle;
    }

    public String getJobTitle()
    {
        return _jobTitle;
    }

    public void setUpdatedOn(Timestamp updatedOn)
    {
        this._updatedOn = updatedOn;
    }

    public Timestamp getUpdatedOn()
    {
        return _updatedOn;
    }

    public void setVersion(Number version)
    {
        this._version = version;
    }

    public Number getVersion()
    {
        return _version;
    }

    public void setStatus(String status)
    {
        this._status = status;
    }

    public String getStatus()
    {
        return _status;
    }

    public void setManagerId(String managerId)
    {
        this._managerId = managerId;
    }

    public String getManagerId()
    {
        return _managerId;
    }

    public void setApplicationId(String applicationId)
    {
        this._applicationId = applicationId;
    }

    public String getApplicationId()
    {
        return _applicationId;
    }

    public void setEnterpriseId(Number enterpriseId)
    {
        this._enterpriseId = enterpriseId;
    }

    public Number getEnterpriseId()
    {
        return _enterpriseId;
    }

    public void setPhoto(ActorPhoto photo)
    {
        this._photo = photo;
    }

    public ActorPhoto getPhoto()
    {
        return _photo;
    }
}
