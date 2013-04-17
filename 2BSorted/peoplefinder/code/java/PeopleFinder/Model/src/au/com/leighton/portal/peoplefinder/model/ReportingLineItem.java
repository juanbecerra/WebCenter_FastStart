package au.com.leighton.portal.peoplefinder.model;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;


public class ReportingLineItem implements Serializable
{

    @SuppressWarnings("compatibility:-2054998172136969288")
    private static final long serialVersionUID = 1L;
    private String _displayName;
  private BigDecimal _personId;
  private String _username;
    private List<ReportingLineItem> _children =
        new ArrayList<ReportingLineItem>();

    public ReportingLineItem()
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

    public List<ReportingLineItem> getChildren()
    {
        return _children;
    }

    public void setPersonId(BigDecimal personId)
    {
        this._personId = personId;
    }

    public BigDecimal getPersonId()
    {
        return _personId;
    }

    public void setUsername(String _username) {
        this._username = _username;
    }

    public String getUsername() {
        return _username;
    }
}
