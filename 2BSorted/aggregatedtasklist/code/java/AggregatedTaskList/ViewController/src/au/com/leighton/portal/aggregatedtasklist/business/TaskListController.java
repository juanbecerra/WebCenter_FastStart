package au.com.leighton.portal.aggregatedtasklist.business;

import au.com.leighton.portal.aggregatedtasklist.model.service.AggregatorService;
import au.com.leighton.portal.aggregatedtasklist.model.tasklistaggregrator.AggregatorRequest;
import au.com.leighton.portal.aggregatedtasklist.model.tasklistaggregrator.AggregatorResponse;
import au.com.leighton.portal.aggregatedtasklist.model.util.EnvironmentUtil;

public class TaskListController {
    public TaskListController() {
        super();
    }

    public AggregatorResponse getTasks() throws Exception {
        AggregatorService aggregatorService = new AggregatorService();
        AggregatorRequest aggregatorRequest = new AggregatorRequest(EnvironmentUtil.getCurrentUserName());
        return aggregatorService.getTasks(aggregatorRequest);
    }
}
