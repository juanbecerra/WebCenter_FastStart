package au.com.leighton.portal.peoplefinder.view;

import au.com.leighton.portal.peoplefinder.model.StdUtility;

public class AdvancedCriteriaLocation extends AdvancedCriteria
{
    @SuppressWarnings("compatibility:-8075556025991642887")
    private static final long serialVersionUID = 1L;
    private String _name;
    private String _suburbTown;
    private String _state;
    private String _notes;

    public AdvancedCriteriaLocation()
    {
        super();
    }

    public void setName(String name)
    {
        this._name = name;
    }

    public String getName()
    {
        return _name;
    }

    public void setSuburbTown(String suburbTown)
    {
        this._suburbTown = suburbTown;
    }

    public String getSuburbTown()
    {
        return _suburbTown;
    }

    public void setState(String state)
    {
        this._state = state;
    }

    public String getState()
    {
        return _state;
    }

    public void setNotes(String notes)
    {
        this._notes = notes;
    }

    public String getNotes()
    {
        return _notes;
    }

    public boolean isValid()
    {
        return super.isValid() || !StdUtility.isNullOrEmpty(getName()) ||
            !StdUtility.isNullOrEmpty(getSuburbTown()) ||
            !StdUtility.isNullOrEmpty(getState()) ||
            !StdUtility.isNullOrEmpty(getNotes());
    }
}
