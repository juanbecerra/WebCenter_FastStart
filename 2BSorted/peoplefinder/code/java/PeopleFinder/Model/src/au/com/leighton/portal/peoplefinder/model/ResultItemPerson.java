package au.com.leighton.portal.peoplefinder.model;

import java.math.BigDecimal;

public class ResultItemPerson extends ResultItem
{
    @SuppressWarnings("compatibility:-1303730710911925829")
    private static final long serialVersionUID = 1L;
    private BigDecimal _personId;
    private String _firstName;
    private String _surname;
    private String _title;
    private String _department;
    private String _departmentId;
    private BigDecimal _locationId;
    private String _locationName;

    public ResultItemPerson(BigDecimal personId, String firstName,
                            String surname, String title, String department,
                            String departmentId, String locationName,
                            BigDecimal locationId)
    {
        setLocationId(locationId);
        setLocationName(locationName);
        setPersonId(personId);
        setFirstName(firstName);
        setSurname(surname);
        setTitle(title);
        setDepartment(department);
        setDepartmentId(departmentId);
    }

    public void setFirstName(String firstName)
    {
        this._firstName = firstName;
    }

    public String getFirstName()
    {
        return _firstName;
    }

    public void setSurname(String surname)
    {
        this._surname = surname;
    }

    public String getSurname()
    {
        return _surname;
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

    public void setDepartmentId(String departmentId)
    {
        this._departmentId = departmentId;
    }

    public String getDepartmentId()
    {
        return _departmentId;
    }

    public void setLocationId(BigDecimal locationId)
    {
        this._locationId = locationId;
    }

    public BigDecimal getLocationId()
    {
        return _locationId;
    }

    public String getFullName()
    {
        return StdUtility.append(new String[]
                { getFirstName(), getSurname() }, " ");
    }

    public void setPersonId(BigDecimal personId)
    {
        this._personId = personId;
    }

    public BigDecimal getPersonId()
    {
        return _personId;
    }

    public void setLocationName(String locationName)
    {
        this._locationName = locationName;
    }

    public String getLocationName()
    {
        return _locationName;
    }
}
