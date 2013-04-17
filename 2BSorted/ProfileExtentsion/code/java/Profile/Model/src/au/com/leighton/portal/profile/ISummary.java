package au.com.leighton.portal.profile;

import java.io.Serializable;

public interface ISummary extends IAbstractBase
{
    String getName();

    String getDepartment();

    String getTitle();

    String getManager();

    String getCompany();

    String getImageUrl();
}
