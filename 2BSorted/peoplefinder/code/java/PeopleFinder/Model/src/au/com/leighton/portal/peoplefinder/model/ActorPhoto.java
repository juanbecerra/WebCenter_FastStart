package au.com.leighton.portal.peoplefinder.model;


import com.sun.org.apache.xml.internal.security.utils.Base64;

import java.io.Serializable;

import oracle.jbo.domain.Number;


public class ActorPhoto implements Serializable
{
    @SuppressWarnings("compatibility:7867873762764015917")
    private static final long serialVersionUID = 1L;
    private String _id;
    private String _userGuiId;
    private String _photoSize;
    private byte[] _imageData;
    private Number _version;
    private String _applicationId;
    private Number _enterpriseId;

    public ActorPhoto()
    {
        super();
    }

    public void setId(String id)
    {
        this._id = id;
    }

    public String getId()
    {
        return _id;
    }

    public void setUserGuiId(String userGuiId)
    {
        this._userGuiId = userGuiId;
    }

    public String getUserGuiId()
    {
        return _userGuiId;
    }

    public void setPhotoSize(String photoSize)
    {
        this._photoSize = photoSize;
    }

    public String getPhotoSize()
    {
        return _photoSize;
    }

    public void setImageData(byte[] imageData)
    {
        this._imageData = imageData;
    }

    public byte[] getImageData()
    {
        return _imageData;
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
