package au.com.leighton.portal.peoplefinder.view;


import au.com.leighton.portal.peoplefinder.model.StdUtility;

import java.io.Serializable;

public abstract class AdvancedCriteria implements Serializable
{
    @SuppressWarnings("compatibility:-967506687313575865")
    private static final long serialVersionUID = 1L;
    private String _businessUnit;
    private String _division;
    private String _phone;

    public AdvancedCriteria()
    {
        super();
    }

    public void setBusinessUnit(String businessUnit)
    {
        this._businessUnit = businessUnit;
    }

    public String getBusinessUnit()
    {
        return _businessUnit;
    }

    public void setDivision(String division)
    {
        this._division = division;
    }

    public String getDivision()
    {
        return _division;
    }

    public void setPhone(String phone)
    {
        this._phone = phone;
    }

    public String getPhone()
    {
        return _phone;
    }

    public boolean isValid()
    {
        return !StdUtility.isNullOrEmpty(getBusinessUnit()) ||
            !StdUtility.isNullOrEmpty(getDivision()) ||
            !StdUtility.isNullOrEmpty(getPhone());
    }
}
