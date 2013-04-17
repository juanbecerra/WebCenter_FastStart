package au.com.leighton.portal.profile.model;

import au.com.leighton.portal.profile.IExperienceItem;

/**
 * Encapsulates a single experience item
 */
public class ExperienceItem extends AbstractBase implements IExperienceItem
{
    @SuppressWarnings("compatibility:4018916535116087054")
    private static final long serialVersionUID = 1L;
    private String _title;
    private String _experienceDescription;
    private long _displayOrder;

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
     * @param experienceDescription
     */
    public void setExperienceDescription(String experienceDescription)
    {
        this._experienceDescription = experienceDescription;
    }

    /**
     * @return
     */
    public String getExperienceDescription()
    {
        return _experienceDescription;
    }

    public void setDisplayOrder(long _displayOrder)
    {
        this._displayOrder = _displayOrder;
    }

    public long getDisplayOrder()
    {
        return _displayOrder;
    }

    public String toString()
    {
        return "Experience Item(" + _title + ")";
    }
}
