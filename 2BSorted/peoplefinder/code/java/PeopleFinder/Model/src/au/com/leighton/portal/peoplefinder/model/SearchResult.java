package au.com.leighton.portal.peoplefinder.model;

import java.io.Serializable;

public abstract class SearchResult implements Serializable
{
    @SuppressWarnings("compatibility:-1225436551325676696")
    private static final long serialVersionUID = 1L;
    private int _totalResults;
    private int _actualResults;
    private String _error;

    public SearchResult()
    {
        super();
    }

    public void setTotalResults(int totalResults)
    {
        this._totalResults = totalResults;
    }

    public int getTotalResults()
    {
        return _totalResults;
    }

    public void setError(String error)
    {
        this._error = error;
    }

    public String getError()
    {
        return _error;
    }

    public void setActualResults(int actualResults)
    {
        this._actualResults = actualResults;
    }

    public int getActualResults()
    {
        return _actualResults;
    }
}
