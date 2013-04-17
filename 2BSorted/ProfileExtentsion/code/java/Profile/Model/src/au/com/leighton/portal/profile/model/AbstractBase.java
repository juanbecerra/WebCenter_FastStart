package au.com.leighton.portal.profile.model;

import java.io.Serializable;

/**
 * Abstract Class to all the model classes, contains the key data which is used
 * for identification etc and not needed by an end user
 */
class AbstractBase implements Serializable
{
    @SuppressWarnings("compatibility:-1792508206321908559")
    private static final long serialVersionUID = 1L;
    private long _id;
    private String _username;
    private boolean _deleted;

    public void setId(long id)
    {
        this._id = id;
    }

    public long getId()
    {
        return _id;
    }

    public void setUsername(String username)
    {
        this._username = username;
    }

    public String getUsername()
    {
        return _username;
    }

    public void setDeleted(boolean deleted)
    {
        this._deleted = deleted;
    }

    public boolean isDeleted()
    {
        return _deleted;
    }
}
