package au.com.leighton.portal.profile;

import java.io.Serializable;

import java.util.List;


/**
 * Encapsulates a set of users experiences
 */
public interface IExperience extends IAbstractBase
{
    List<IExperienceItem> getExperienceItems();
}
