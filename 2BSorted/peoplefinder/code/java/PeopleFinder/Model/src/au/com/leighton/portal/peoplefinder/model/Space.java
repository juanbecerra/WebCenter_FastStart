package au.com.leighton.portal.peoplefinder.model;

import java.io.Serializable;

import java.util.GregorianCalendar;

import oracle.jbo.domain.Number;
import oracle.jbo.domain.Timestamp;


/**
 * Encapsulates the details of a space
 */
public class Space implements Serializable
{
    @SuppressWarnings("compatibility:1591256626188089428")
    private static final long serialVersionUID = 1L;
    private String _spaceId;
    private String _applicationId;
    private String _spaceGuid;
    private String _userGuid;
    private String _userId;
    private String _isGroup;
    private String _spaceRole;
    private String _permissionAction;
    private Number _version;
    private String _createdBy;
    private Timestamp _createDate;
    private String _updatedBy;
    private Timestamp _lastUpdatedDate;
    private String _groupSpaceType;
    private String _permissionName;
    private SpaceHeader _spaceHeader;

    public Space()
    {
        super();
    }

    public void setSpaceId(String spaceId)
    {
        this._spaceId = spaceId;
    }

    public String getSpaceId()
    {
        return _spaceId;
    }

    public void setApplicationId(String applicationId)
    {
        this._applicationId = applicationId;
    }

    public String getApplicationId()
    {
        return _applicationId;
    }

    public void setSpaceGuid(String spaceGuid)
    {
        this._spaceGuid = spaceGuid;
    }

    public String getSpaceGuid()
    {
        return _spaceGuid;
    }

    public void setUserGuid(String userGuid)
    {
        this._userGuid = userGuid;
    }

    public String getUserGuid()
    {
        return _userGuid;
    }

    public void setUserId(String userId)
    {
        this._userId = userId;
    }

    public String getUserId()
    {
        return _userId;
    }

    public void setIsGroup(String isGroup)
    {
        this._isGroup = isGroup;
    }

    public String getIsGroup()
    {
        return _isGroup;
    }

    public void setSpaceRole(String spaceRole)
    {
        this._spaceRole = spaceRole;
    }

    public String getSpaceRole()
    {
        return _spaceRole;
    }

    public void setPermissionAction(String permissionAction)
    {
        this._permissionAction = permissionAction;
    }

    public String getPermissionAction()
    {
        return _permissionAction;
    }

    public void setVersion(Number version)
    {
        this._version = version;
    }

    public Number getVersion()
    {
        return _version;
    }

    public void setCreatedBy(String createdBy)
    {
        this._createdBy = createdBy;
    }

    public String getCreatedBy()
    {
        return _createdBy;
    }

    public void setCreateDate(Timestamp createDate)
    {
        this._createDate = createDate;
    }

    public Timestamp getCreateDate()
    {
        return _createDate;
    }

    public void setUpdatedBy(String updatedBy)
    {
        this._updatedBy = updatedBy;
    }

    public String getUpdatedBy()
    {
        return _updatedBy;
    }

    public void setLastUpdatedDate(Timestamp lastUpdatedDate)
    {
        this._lastUpdatedDate = lastUpdatedDate;
    }

    public Timestamp getLastUpdatedDate()
    {
        return _lastUpdatedDate;
    }

    public void setGroupSpaceType(String groupSpaceType)
    {
        this._groupSpaceType = groupSpaceType;
    }

    public String getGroupSpaceType()
    {
        return _groupSpaceType;
    }

    public void setPermissionName(String permissionName)
    {
        this._permissionName = permissionName;
    }

    public String getPermissionName()
    {
        return _permissionName;
    }

    public void setSpaceHeader(SpaceHeader spaceHeader)
    {
        this._spaceHeader = spaceHeader;
    }

    public SpaceHeader getSpaceHeader()
    {
        return _spaceHeader;
    }
}
