package au.com.leighton.portal.peoplefinder.model;

import java.math.BigDecimal;

public class ResultItemLocation extends ResultItem
{
    @SuppressWarnings("compatibility:2449312404906462723")
    private static final long serialVersionUID = 1L;
    private String _faxNo;
    private String _companyId;
    private String _companyName;
    private BigDecimal _locationId;
    private String _name;
    private String _publishedPhone;

    public ResultItemLocation(String companyId, String companyName,
                              String faxNo, BigDecimal locationId, String name,
                              String publishedPhone)
    {
        setCompanyId(companyId);
        setCompanyName(companyName);
        setFaxNo(faxNo);
        setLocationId(locationId);
        setName(name);
        setPublishedPhone(publishedPhone);
    }

    public void setFaxNo(String faxNo)
    {
        this._faxNo = faxNo;
    }

    public String getFaxNo()
    {
        return _faxNo;
    }

    public void setCompanyId(String companyId)
    {
        this._companyId = companyId;
    }

    public String getCompanyId()
    {
        return _companyId;
    }

    public void setCompanyName(String companyName)
    {
        this._companyName = companyName;
    }

    public String getCompanyName()
    {
        return _companyName;
    }

    public void setLocationId(BigDecimal locationId)
    {
        this._locationId = locationId;
    }

    public BigDecimal getLocationId()
    {
        return _locationId;
    }

    public void setName(String name)
    {
        this._name = name;
    }

    public String getName()
    {
        return _name;
    }

    public void setPublishedPhone(String publishedPhone)
    {
        this._publishedPhone = publishedPhone;
    }

    public String getPublishedPhone()
    {
        return _publishedPhone;
    }
}
