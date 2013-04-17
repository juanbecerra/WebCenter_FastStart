package au.com.leighton.portal.peoplefinder.model;


public class DetailLocation extends DetailItem
{
    @SuppressWarnings("compatibility:4509967202831128479")
    private static final long serialVersionUID = 1L;
    private String _address1;
    private String _address2;
    private String _companyId;
    private String _companyName;
    private String _faxNo;
    private String _locationName;
    private String _note;
    private String _poBoxAddress;
    private String _poBoxPostCode;
    private String _poBoxState;
    private String _poBoxSuburb;
    private String _postcode;
    private String _publishedPhone;
    private String _state;
    private String _suburb;
    private String _vpn;

    public void setAddress1(String address1)
    {
        this._address1 = address1;
    }

    public String getAddress1()
    {
        return _address1;
    }

    public void setAddress2(String address2)
    {
        this._address2 = address2;
    }

    public String getAddress2()
    {
        return _address2;
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

    public void setFaxNo(String faxNo)
    {
        this._faxNo = faxNo;
    }

    public String getFaxNo()
    {
        return _faxNo;
    }

    public void setLocationName(String locationName)
    {
        this._locationName = locationName;
    }

    public String getLocationName()
    {
        return _locationName;
    }

    public void setNote(String note)
    {
        this._note = note;
    }

    public String getNote()
    {
        return _note;
    }

    public void setPoBoxAddress(String poBoxAddress)
    {
        this._poBoxAddress = poBoxAddress;
    }

    public String getPoBoxAddress()
    {
        return _poBoxAddress;
    }

    public void setPoBoxPostCode(String poBoxPostCode)
    {
        this._poBoxPostCode = poBoxPostCode;
    }

    public String getPoBoxPostCode()
    {
        return _poBoxPostCode;
    }

    public void setPoBoxState(String poBoxState)
    {
        this._poBoxState = poBoxState;
    }

    public String getPoBoxState()
    {
        return _poBoxState;
    }

    public void setPoBoxSuburb(String poBoxSuburb)
    {
        this._poBoxSuburb = poBoxSuburb;
    }

    public String getPoBoxSuburb()
    {
        return _poBoxSuburb;
    }

    public void setPostcode(String postcode)
    {
        this._postcode = postcode;
    }

    public String getPostcode()
    {
        return _postcode;
    }

    public void setPublishedPhone(String publishedPhone)
    {
        this._publishedPhone = publishedPhone;
    }

    public String getPublishedPhone()
    {
        return _publishedPhone;
    }

    public void setState(String state)
    {
        this._state = state;
    }

    public String getState()
    {
        return _state;
    }

    public void setSuburb(String suburb)
    {
        this._suburb = suburb;
    }

    public String getSuburb()
    {
        return _suburb;
    }

    public void setVpn(String vpn)
    {
        this._vpn = vpn;
    }

    public String getVpn()
    {
        return _vpn;
    }

    public String getStatePostcode()
    {
        return StdUtility.append(new String[]
                { getState(), getPostcode() }, " ");
    }

    public String getPoBoxStatePostcode()
    {
        return StdUtility.append(new String[]
                { getPoBoxState(), getPoBoxPostCode() }, " ");
    }

    public boolean isLocationDetail()
    {
        return true;
    }
}
