package au.com.leighton.portal.aggregatedtasklist.model.tasklistaggregrator;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;


public class AggregatorResponse implements Serializable
{

    private static final long serialVersionUID = 1L;
    private List<AggregatorTask> tasks;
    private List<AggregatorError> errors;

    public AggregatorResponse()
    {
        super();
    }

    public List<AggregatorTask> getTasks()
    {
        if (tasks == null)
        {
            tasks = new ArrayList<AggregatorTask>();
        }
        return tasks;
    }

    public List<AggregatorError> getErrors()
    {
        if (errors == null)
        {
            errors = new ArrayList<AggregatorError>();
        }
        return errors;
    }
}
