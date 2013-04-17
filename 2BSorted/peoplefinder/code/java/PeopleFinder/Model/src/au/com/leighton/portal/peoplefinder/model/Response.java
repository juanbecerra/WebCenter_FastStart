package au.com.leighton.portal.peoplefinder.model;

import au.com.leighton.portal.peoplefinder.model.StdUtility;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;


public class Response implements Serializable
{
    @SuppressWarnings("compatibility:3949124152966665266")
    private static final long serialVersionUID = 1L;
    private String _errorMessage;
    private List<Space> _spaceList = new ArrayList<Space>();
    private List<ActorDetail> _connections = new ArrayList<ActorDetail>();

    public Response()
    {
        super();
    }

    public boolean isErrored()
    {
        return !StdUtility.isNullOrEmpty(getErrorMessage());
    }

    public void setErrorMessage(String errorMessage)
    {
        this._errorMessage = errorMessage;
    }

    public String getErrorMessage()
    {
        return _errorMessage;
    }

    public void setError(String errorMessage, Exception e)
    {
        StringBuffer sb = new StringBuffer();

        if (!StdUtility.isNullOrEmpty(errorMessage))
        {
            sb.append(errorMessage);
        }

        if (e != null)
        {
            if (sb.length() > 0)
            {
                sb.append(":");
            }
            sb.append(e.getMessage());
        }

        _errorMessage = sb.toString();
    }

    public List<Space> getSpaceList()
    {
        return _spaceList;
    }

    public List<ActorDetail> getConnections()
    {
        return _connections;
    }
}
