package au.com.leighton.portal.peoplefinder.model;

import java.io.Serializable;

import java.math.BigDecimal;


public abstract class DetailItem implements Serializable
{
    @SuppressWarnings("compatibility:-4545943815612873643")
    private static final long serialVersionUID = 1L;
    private String _errorMessage;
    private String _adminEmail;
    private String _email;
    private BigDecimal _locationId;
    private String _clickedError;

    public DetailItem()
    {
        super();
    }

    public void setAdminEmail(String adminEmail)
    {
        this._adminEmail = adminEmail;
    }

    public String getAdminEmail()
    {
        return _adminEmail;
    }

    public boolean isAdminEmailAvailable()
    {
        return !StdUtility.isNullOrEmpty(getAdminEmail());
    }
    
    public String getAdminEmailUrl()
    {
        return isAdminEmailAvailable() ? "mailto://" + getAdminEmail() : null;
    }

    public void setEmail(String email)
    {
        this._email = email;
    }

    public String getEmail()
    {
        return _email;
    }

    public void setLocationId(BigDecimal locationId)
    {
        this._locationId = locationId;
    }

    public BigDecimal getLocationId()
    {
        return _locationId;
    }

    public boolean isPersonDetail()
    {
        return false;
    }

    public boolean isLocationDetail()
    {
        return false;
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

    public void setClickedError(String _clickedError) {
        this._clickedError = _clickedError;
    }

    public String getClickedError() {
        return _clickedError;
    }
}
