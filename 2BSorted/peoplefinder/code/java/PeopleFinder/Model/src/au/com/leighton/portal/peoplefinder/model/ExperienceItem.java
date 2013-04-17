package au.com.leighton.portal.peoplefinder.model;

import java.io.Serializable;

import java.text.SimpleDateFormat;

import java.util.Date;


public class ExperienceItem implements Serializable
{
    @SuppressWarnings("compatibility:7601138554881064523")
    private static final long serialVersionUID = 1L;
    private String _role;
    private String _company;
    private String _location;
    private Date _fromDate;
    private Date _toDate;
    private String _description;

    public ExperienceItem()
    {
        super();
    }

    public void setRole(String role)
    {
        this._role = role;
    }

    public String getRole()
    {
        return _role;
    }

    public void setCompany(String company)
    {
        this._company = company;
    }

    public String getCompany()
    {
        return _company;
    }

    public void setLocation(String location)
    {
        this._location = location;
    }

    public String getLocation()
    {
        return _location;
    }

    public String getTimeframe()
    {
        StringBuffer sb = new StringBuffer();

        SimpleDateFormat sdf = new SimpleDateFormat("MMM yyyy");

        if (getFromDate() == null)
        {
            sb.append("Unknown start date");
        }
        else
        {
            sb.append(sdf.format(getFromDate()));
        }

        sb.append(" - ");

        if (getToDate() == null)
        {
            sb.append("Current");
        }
        else
        {
            sb.append(sdf.format(getToDate()));
        }

        return sb.toString();
    }


    public void setDescription(String description)
    {
        this._description = description;
    }

    public String getDescription()
    {
        return _description;
    }

    public void setFromDate(Date fromDate)
    {
        this._fromDate = fromDate;
    }

    public Date getFromDate()
    {
        return _fromDate;
    }

    public void setToDate(Date toDate)
    {
        this._toDate = toDate;
    }

    public Date getToDate()
    {
        return _toDate;
    }
}
