package au.com.leighton.portal.aggregatedtasklist.view.managed;

import au.com.leighton.portal.aggregatedtasklist.model.tasklistaggregrator.AggregatorTask;

import au.com.leighton.portal.aggregatedtasklist.model.util.LogUtility;

import java.util.Comparator;


public class TaskListComparator implements Comparator<AggregatorTask> {

    public int compare(AggregatorTask t1, AggregatorTask t2) {
        int task1DaysRemaining = t1.getDaysRemainingSort();
        int task2DaysRemaining = t2.getDaysRemainingSort();
        int retVal = task1DaysRemaining - task2DaysRemaining;
        if (retVal == 0) {
          // use the order the task came in;
          retVal = t1.getId() - t2.getId();
        }
        LogUtility.logFine("task1 days:" + t1.getSystem() + "=" + task1DaysRemaining + ", task2 days:" + t2.getSystem() + "=" + task2DaysRemaining + ", diff=" + retVal);

        return retVal;
    }
}
