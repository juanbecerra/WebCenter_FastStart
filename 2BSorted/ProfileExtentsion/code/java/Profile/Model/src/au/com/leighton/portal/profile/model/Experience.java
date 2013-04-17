package au.com.leighton.portal.profile.model;


import au.com.leighton.portal.profile.IExperience;
import au.com.leighton.portal.profile.IExperienceItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Encapsulates the experience sections of a profile
 */
public class Experience extends AbstractBase implements IExperience
{
    @SuppressWarnings("compatibility:633731277637069181")
    private static final long serialVersionUID = 1L;
    private List<IExperienceItem> _experienceItems =
        new ArrayList<IExperienceItem>();

    /**
     * @return
     */
    public List<IExperienceItem> getExperienceItems()
    {
        return _experienceItems;
    }

    public String toString()
    {
        return "Experience(" +
            (_experienceItems == null ? 0 : _experienceItems.size()) +
            " Items)";
    }
}
