package au.com.leighton.portal.peoplefinder.model;

import java.io.Serializable;

import oracle.jbo.domain.Number;
import oracle.jbo.domain.Timestamp;


public class SpaceHeader implements Serializable
{
    @SuppressWarnings("compatibility:2103840280409249105")
    private static final long serialVersionUID = 1L;
    private String _displayName;
    private String _applicationId;
    private String _spaceGuid;
    private String _spaceId;
    private String _description;
    private String _spacePublic;
    private String _spacesUser;
    private String _discoverable;
    private String _spaceOffline;
    private String _closed;
    private String _selfSubEnabled;
    private String _rssEnabled;
    private String _spacesType;
    private Number _version;
    private String _icon;
    private String _logo;
    private String _keywords;
    private String _createdBy;
    private Timestamp _createDate;
    private String _updatedBy;
    private Timestamp _lastUpdateDate;
    private String _parentGuid;
    private String _securityParentGuid;
    private String _ancestorPath;
    private String _isSeeded;
    private Number _subGsCount;
    private Number _memberCount;
    private Number _enterpriseId;

    public SpaceHeader()
    {
        super();
    }

    public void setDisplayName(String displayName)
    {
        this._displayName = displayName;
    }

    public String getDisplayName()
    {
        return _displayName;
    }

    public void setApplicationId(String applicationId)
    {
        this._applicationId = applicationId;
    }

    public String getApplicationId()
    {
        return _applicationId;
    }

    public void setDescription(String description)
    {
        this._description = description;
    }

    public String getDescription()
    {
        return _description;
    }

    public void setSpacePublic(String spacePublic)
    {
        this._spacePublic = spacePublic;
    }

    public String getSpacePublic()
    {
        return _spacePublic;
    }

    public void setSpacesUser(String spacesUser)
    {
        this._spacesUser = spacesUser;
    }

    public String getSpacesUser()
    {
        return _spacesUser;
    }

    public void setDiscoverable(String discoverable)
    {
        this._discoverable = discoverable;
    }

    public String getDiscoverable()
    {
        return _discoverable;
    }

    public void setSpaceOffline(String spaceOffline)
    {
        this._spaceOffline = spaceOffline;
    }

    public String getSpaceOffline()
    {
        return _spaceOffline;
    }

    public void setClosed(String closed)
    {
        this._closed = closed;
    }

    public String getClosed()
    {
        return _closed;
    }

    public void setSelfSubEnabled(String selfSubEnabled)
    {
        this._selfSubEnabled = selfSubEnabled;
    }

    public String getSelfSubEnabled()
    {
        return _selfSubEnabled;
    }

    public void setRssEnabled(String rssEnabled)
    {
        this._rssEnabled = rssEnabled;
    }

    public String getRssEnabled()
    {
        return _rssEnabled;
    }

    public void setSpacesType(String spacesType)
    {
        this._spacesType = spacesType;
    }

    public String getSpacesType()
    {
        return _spacesType;
    }

    public void setVersion(Number version)
    {
        this._version = version;
    }

    public Number getVersion()
    {
        return _version;
    }

    public void setIcon(String icon)
    {
        this._icon = icon;
    }

    public String getIcon()
    {
        return _icon;
    }

    public void setLogo(String logo)
    {
        this._logo = logo;
    }

    public String getLogo()
    {
        return _logo;
    }

    public void setKeywords(String keywords)
    {
        this._keywords = keywords;
    }

    public String getKeywords()
    {
        return _keywords;
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

    public void setLastUpdateDate(Timestamp lastUpdateDate)
    {
        this._lastUpdateDate = lastUpdateDate;
    }

    public Timestamp getLastUpdateDate()
    {
        return _lastUpdateDate;
    }

    public void setParentGuid(String parentGuid)
    {
        this._parentGuid = parentGuid;
    }

    public String getParentGuid()
    {
        return _parentGuid;
    }

    public void setSecurityParentGuid(String securityParentGuid)
    {
        this._securityParentGuid = securityParentGuid;
    }

    public String getSecurityParentGuid()
    {
        return _securityParentGuid;
    }

    public void setAncestorPath(String ancestorPath)
    {
        this._ancestorPath = ancestorPath;
    }

    public String getAncestorPath()
    {
        return _ancestorPath;
    }

    public void setIsSeeded(String isSeeded)
    {
        this._isSeeded = isSeeded;
    }

    public String getIsSeeded()
    {
        return _isSeeded;
    }

    public void setSubGsCount(Number subGsCount)
    {
        this._subGsCount = subGsCount;
    }

    public Number getSubGsCount()
    {
        return _subGsCount;
    }

    public void setMemberCount(Number memberCount)
    {
        this._memberCount = memberCount;
    }

    public Number getMemberCount()
    {
        return _memberCount;
    }

    public void setEnterpriseId(Number enterpriseId)
    {
        this._enterpriseId = enterpriseId;
    }

    public Number getEnterpriseId()
    {
        return _enterpriseId;
    }

    public void setSpaceGuid(String spaceGuid)
    {
        this._spaceGuid = spaceGuid;
    }

    public String getSpaceGuid()
    {
        return _spaceGuid;
    }

    public void setSpaceId(String spaceId)
    {
        this._spaceId = spaceId;
    }

    public String getSpaceId()
    {
        return _spaceId;
    }
}
