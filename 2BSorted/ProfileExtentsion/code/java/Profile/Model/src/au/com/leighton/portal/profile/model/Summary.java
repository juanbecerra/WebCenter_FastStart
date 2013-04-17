package au.com.leighton.portal.profile.model;

import au.com.leighton.portal.profile.ISummary;

/**
 * Encapsulates the summayr portion of a profile
 */
public class Summary extends AbstractBase implements ISummary
{
    @SuppressWarnings("compatibility:-5299850058753846678")
    private static final long serialVersionUID = 1L;
    private String _name;
    private String _department;
    private String _title;
    private String _company;
    private String _manager;
    private String _imageUrl;

    /**
     * @param name
     */
    public void setName(String name)
    {
        this._name = name;
    }

    /**
     * @return
     */
    public String getName()
    {
        return _name;
    }

    /**
     * @param department
     */
    public void setDepartment(String department)
    {
        this._department = department;
    }

    /**
     * @return
     */
    public String getDepartment()
    {
        return _department;
    }

    /**
     * @param title
     */
    public void setTitle(String title)
    {
        this._title = title;
    }

    /**
     * @return
     */
    public String getTitle()
    {
        return _title;
    }

    /**
     * @param company
     */
    public void setCompany(String company)
    {
        this._company = company;
    }

    /**
     * @return
     */
    public String getCompany()
    {
        return _company;
    }

    /**
     * @param imageUrl
     */
    public void setImageUrl(String imageUrl)
    {
        this._imageUrl = imageUrl;
    }

    /**
     * @return
     */
    public String getImageUrl()
    {
        return _imageUrl;
    }

    public void setManager(String manager)
    {
        this._manager = manager;
    }

    public String getManager()
    {
        return _manager;
    }
}
