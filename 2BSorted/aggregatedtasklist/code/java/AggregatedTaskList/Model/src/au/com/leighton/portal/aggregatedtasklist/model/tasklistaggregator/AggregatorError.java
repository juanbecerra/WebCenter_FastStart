package au.com.leighton.portal.aggregatedtasklist.model.tasklistaggregrator;

import java.io.Serializable;

public class AggregatorError implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String system;
    private String description;

    public AggregatorError()
    {
        super();
    }

    public void setSystem(String system)
    {
        this.system = system;
    }

    public String getSystem()
    {
        return system;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }
}
