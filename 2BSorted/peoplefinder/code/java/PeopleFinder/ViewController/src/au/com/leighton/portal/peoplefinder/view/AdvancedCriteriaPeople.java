package au.com.leighton.portal.peoplefinder.view;

import au.com.leighton.portal.peoplefinder.model.StdUtility;

public class AdvancedCriteriaPeople extends AdvancedCriteria
{
    @SuppressWarnings("compatibility:2858491274045006803")
    private static final long serialVersionUID = 1L;
    private String _surname;
    private String _firstName;
    private String _title;
    private String _department;
    private String _location;
    private String _mobile;
    private String _experience;

    public AdvancedCriteriaPeople()
    {
        super();
    }

    public boolean isValid()
    {
        return super.isValid() || !StdUtility.isNullOrEmpty(getSurname()) ||
            !StdUtility.isNullOrEmpty(getFirstName()) ||
            !StdUtility.isNullOrEmpty(getTitle()) ||
            !StdUtility.isNullOrEmpty(getDepartment()) ||
            !StdUtility.isNullOrEmpty(getLocation()) ||
            !StdUtility.isNullOrEmpty(getMobile()) ||
            !StdUtility.isNullOrEmpty(getExperience());
    }

    public void setSurname(String surname)
    {
        this._surname = surname;
    }

    public String getSurname()
    {
        return _surname;
    }

    public void setFirstName(String firstName)
    {
        this._firstName = firstName;
    }

    public String getFirstName()
    {
        return _firstName;
    }

    public void setTitle(String title)
    {
        this._title = title;
    }

    public String getTitle()
    {
        return _title;
    }

    public void setDepartment(String department)
    {
        this._department = department;
    }

    public String getDepartment()
    {
        return _department;
    }

    public void setLocation(String location)
    {
        this._location = location;
    }

    public String getLocation()
    {
        return _location;
    }

    public void setMobile(String mobile)
    {
        this._mobile = mobile;
    }

    public String getMobile()
    {
        return _mobile;
    }

    public void setExperience(String experience)
    {
        this._experience = experience;
    }

    public String getExperience()
    {
        return _experience;
    }
}
