package au.com.leighton.portal.peoplefinder.model;


import com.sun.org.apache.xml.internal.security.utils.Base64;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;


public class DetailPerson extends DetailItem
{

    @SuppressWarnings("compatibility:2193928467528317223")
    private static final long serialVersionUID = 1L;
    private BigDecimal _personId;
    private String _surname;
    private String _firstName;
    private String _title;
    private String _departmentId;
    private String _department;
    private String _location;
    private String _locationAddress1;
    private String _locationAddress2;
    private String _locationSuburb;
    private String _locationState;
    private String _locationPostcode;
    private String _company;
    private String _mainVpn;
    private String _mainPhone;
    private String _locationFax;
    private String _mobile;
    private byte[] _photoData;
    private String _note;
    private String _personalAssistantName;
    private BigDecimal _personalAssistantId;
    private String _webcenterUsername;
    private String _userName;
    private List<ExperienceItem> _experience = new ArrayList<ExperienceItem>();
    private List<ReportingLineItem> _reportingLine =  new ArrayList<ReportingLineItem>();
    private List<WCSConnectionItem> _wcsConnections =    new ArrayList<WCSConnectionItem>();
    private List<WCSConnectionRow> _wcsConnectionRows =  new ArrayList<WCSConnectionRow>();
    private List<WCSModeradedSpacesItem> _wcsModeradedSpaces =  new ArrayList<WCSModeradedSpacesItem>();
    

    

    public DetailPerson()
    {
        super();
    }

    public String getShowMapUrl()
    {
        return Utility.buildGoToMapFromAddress(new String[]
                { StdUtility.isNullOrEmpty(getLocationAddress2()) ?
                  getLocationAddress1() : getLocationAddress2(),
                  getLocationSuburb(), getLocationState(),
                  getLocationPostcode() });
    }

    public List<ExperienceItem> getExperience()
    {
        return _experience;
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

    public void setDepartmentId(String departmentId)
    {
        this._departmentId = departmentId;
    }

    public String getDepartmentId()
    {
        return _departmentId;
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

    public void setLocationAddress1(String locationAddress1)
    {
        this._locationAddress1 = locationAddress1;
    }

    public String getLocationAddress1()
    {
        return _locationAddress1;
    }

    public void setLocationAddress2(String locationAddress2)
    {
        this._locationAddress2 = locationAddress2;
    }

    public String getLocationAddress2()
    {
        return _locationAddress2;
    }

    public void setLocationSuburb(String locationSuburb)
    {
        this._locationSuburb = locationSuburb;
    }

    public String getLocationSuburb()
    {
        return _locationSuburb;
    }

    public void setLocationState(String locationState)
    {
        this._locationState = locationState;
    }

    public String getLocationState()
    {
        return _locationState;
    }

    public void setLocationPostcode(String locationPostcode)
    {
        this._locationPostcode = locationPostcode;
    }

    public String getLocationPostcode()
    {
        return _locationPostcode;
    }

    public void setCompany(String company)
    {
        this._company = company;
    }

    public String getCompany()
    {
        return _company;
    }

    public void setMainVpn(String mainVpn)
    {
        this._mainVpn = mainVpn;
    }

    public String getMainVpn()
    {
        return _mainVpn;
    }

    public void setMainPhone(String mainPhone)
    {
        this._mainPhone = mainPhone;
    }

    public String getMainPhone()
    {
        return _mainPhone;
    }

    public void setLocationFax(String locationFax)
    {
        this._locationFax = locationFax;
    }

    public String getLocationFax()
    {
        return _locationFax;
    }

    public void setMobile(String mobile)
    {
        this._mobile = mobile;
    }

    public String getMobile()
    {
        return _mobile;
    }

    public void setPhotoData(byte[] photoData)
    {
        this._photoData = photoData;
    }

    public byte[] getPhotoData()
    {
        return _photoData;
    }

    public void setNote(String note)
    {
        this._note = note;
    }

    public String getNote()
    {
        return _note;
    }

    public void setExperience(List<ExperienceItem> experience)
    {
        this._experience = experience;
    }

    public String getLocationStatePostcode()
    {
        return StdUtility.append(new String[]
                { getLocationState(), getLocationPostcode() }, " ");
    }

    public boolean isPhotoAvailable()
    {
        return (getPhotoData() != null) && (getPhotoData().length > 0);
    }

    public String getPhotoSource()
    {
        String result = null;

        if (isPhotoAvailable())
        {
            StringBuffer sb = new StringBuffer("data:image/jpg;base64,");

            sb.append(Base64.encode(getPhotoData()));

            result = sb.toString();
        }
        else
        {
          result ="/nophoto_large.png";    
        }
        
        return result;
        
    }

    public boolean isWebcenterUsernameValid()
    {
        return !StdUtility.isNullOrEmpty(getWebcenterUsername());
    }
    
    public boolean isUserNameValid()
    {
        return !StdUtility.isNullOrEmpty(getUserName());
    }

    public void setWebcenterUsername(String webcenterUsername)
    {
        this._webcenterUsername = webcenterUsername;
    }

    public String getWebcenterUsername()
    {
        return _webcenterUsername;
    }

    public void setReportingLine(List<ReportingLineItem> reportingLine)
    {
        this._reportingLine = reportingLine;
    }

    public List<ReportingLineItem> getReportingLine()
    {
        return _reportingLine;
    }

    public boolean isPersonDetail()
    {
        return true;
    }

    public boolean isHasPersonalAssistant()
    {
        return !StdUtility.isNullOrEmpty(getPersonalAssistantName()) &&
            (getPersonalAssistantId() != null) &&
            (getPersonalAssistantId().intValue() > 0);
    }

    public void setPersonalAssistantName(String personalAssistantName)
    {
        this._personalAssistantName = personalAssistantName;
    }

    public String getPersonalAssistantName()
    {
        return _personalAssistantName;
    }

    public void setPersonalAssistantId(BigDecimal personalAssistantId)
    {
        this._personalAssistantId = personalAssistantId;
    }

    public BigDecimal getPersonalAssistantId()
    {
        return _personalAssistantId;
    }

    public void setWcsConnections(List<WCSConnectionItem> _wcsConnections) {
        this._wcsConnections = _wcsConnections;
    }

    public List<WCSConnectionItem> getWcsConnections() {
        return _wcsConnections;
    }

    /**
     * @param _wcsModeradedSpaces
     */
    public void setWcsModeradedSpaces(List<WCSModeradedSpacesItem> _wcsModeradedSpaces) {
        this._wcsModeradedSpaces = _wcsModeradedSpaces;
    }

    public List<WCSModeradedSpacesItem> getWcsModeradedSpaces() {
        return _wcsModeradedSpaces;
    }

    public void setUserName(String _userName) {
        this._userName = _userName;
    }

    public String getUserName() {
        return _userName;
    }

    /**
     * @return
     */
    public List<WCSConnectionRow> getWcsConnectionRows() {
        return _wcsConnectionRows;
    }

    public boolean isHasWcsConnections() {
        if (! _wcsConnections.isEmpty())
        {
            return true;}
        else
        {return false;}
    }

    public boolean isHasWcsModeradedSpaces() {
      if (! _wcsModeradedSpaces.isEmpty())
      {return true;}
      else
      {return false;}
    }
}
