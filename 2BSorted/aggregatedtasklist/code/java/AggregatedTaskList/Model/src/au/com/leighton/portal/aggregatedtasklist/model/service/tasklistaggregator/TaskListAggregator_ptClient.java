package au.com.leighton.portal.aggregatedtasklist.model.service.tasklistaggregator;

import javax.xml.ws.WebServiceRef;
// !THE CHANGES MADE TO THIS FILE WILL BE DESTROYED IF REGENERATED!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 101221.1153.15811)

public class TaskListAggregator_ptClient
{
    @WebServiceRef
    private static Tasklistaggregator_client_ep tasklistaggregator_client_ep;

    public static void main(String[] args)
    {
        tasklistaggregator_client_ep = new Tasklistaggregator_client_ep();
        TaskListAggregator taskListAggregator =
            tasklistaggregator_client_ep.getTaskListAggregator_pt();
        // Add your code to call the desired methods.
    }
}
