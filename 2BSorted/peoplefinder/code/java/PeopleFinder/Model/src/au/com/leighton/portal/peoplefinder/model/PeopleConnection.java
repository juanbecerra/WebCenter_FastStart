package au.com.leighton.portal.peoplefinder.model;

import java.io.Serializable;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;


public class PeopleConnection implements Serializable
{
    @SuppressWarnings("compatibility:8627860542907331246")
    private static final long serialVersionUID = 1L;
    private String _connectionId;
    private String _ownerId;
    private String _connecteeId;
    private String _deleable;
    private Date _creationDate;
    private Number _version;
    private String _applicationId;
    private Number _enterpriseId;

    public PeopleConnection()
    {
        super();
    }

    public void setConnectionId(String connectionId)
    {
        this._connectionId = connectionId;
    }

    public String getConnectionId()
    {
        return _connectionId;
    }

    public void setOwnerId(String ownerId)
    {
        this._ownerId = ownerId;
    }

    public String getOwnerId()
    {
        return _ownerId;
    }

    public void setConnecteeId(String connecteeId)
    {
        this._connecteeId = connecteeId;
    }

    public String getConnecteeId()
    {
        return _connecteeId;
    }

    public void setDeleable(String deleable)
    {
        this._deleable = deleable;
    }

    public String getDeleable()
    {
        return _deleable;
    }

    public void setCreationDate(Date creationDate)
    {
        this._creationDate = creationDate;
    }

    public Date getCreationDate()
    {
        return _creationDate;
    }

    public void setVersion(Number version)
    {
        this._version = version;
    }

    public Number getVersion()
    {
        return _version;
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
}
