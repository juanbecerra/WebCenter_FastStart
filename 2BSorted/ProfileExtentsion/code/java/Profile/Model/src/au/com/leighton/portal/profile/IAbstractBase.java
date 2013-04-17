package au.com.leighton.portal.profile;

import java.io.Serializable;


public interface IAbstractBase extends Serializable
{
    long getId();

    String getUsername();

    boolean isDeleted();
}
