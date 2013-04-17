package au.com.leighton.portal.profile;

import java.io.Serializable;

/**
 * Encapsulates a single work experience item
 */
public interface IExperienceItem extends IAbstractBase
{
    String getTitle();

    String getExperienceDescription();
}
