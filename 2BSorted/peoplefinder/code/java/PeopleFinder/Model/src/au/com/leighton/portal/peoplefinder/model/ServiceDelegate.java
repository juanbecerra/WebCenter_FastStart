package au.com.leighton.portal.peoplefinder.model;


/**
 * Encapsulates the actual service connections and calls
 */
public abstract class ServiceDelegate
{
    public ServiceDelegate()
    {
        super();
    }

    protected String valueOrBlank(String value)
    {
        return StdUtility.isNullOrEmpty(value) ? "" : value.trim();
    }
}
