package au.com.leighton.portal.aggregatedtasklist.model.tasklistaggregrator;

public class AggregatorRequest
{

    private final String user;

    public AggregatorRequest(final String user)
    {
        super();
        this.user = user;
    }

    public String getUser()
    {
        return user;
    }
}
