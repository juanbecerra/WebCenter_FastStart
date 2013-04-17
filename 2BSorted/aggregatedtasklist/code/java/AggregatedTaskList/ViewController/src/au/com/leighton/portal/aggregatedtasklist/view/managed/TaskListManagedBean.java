package au.com.leighton.portal.aggregatedtasklist.view.managed;


import au.com.leicon.core.services.cache.CacheService;
import au.com.leicon.core.services.cache.coherence.CoherenceCacheServiceImpl;
import au.com.leighton.portal.aggregatedtasklist.business.TaskListController;
import au.com.leighton.portal.aggregatedtasklist.model.tasklistaggregrator.AggregatorError;
import au.com.leighton.portal.aggregatedtasklist.model.tasklistaggregrator.AggregatorResponse;
import au.com.leighton.portal.aggregatedtasklist.model.tasklistaggregrator.AggregatorTask;
import au.com.leighton.portal.aggregatedtasklist.model.util.EnvironmentUtil;
import au.com.leighton.portal.aggregatedtasklist.model.util.LogUtility;
import au.com.leighton.portal.aggregatedtasklist.model.util.PropertyUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

import oracle.adf.view.rich.component.rich.data.RichColumn;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;

import org.apache.myfaces.trinidad.event.PollEvent;


public class TaskListManagedBean {

    private static final TaskListComparator TASK_COMPARATOR = new TaskListComparator();
    private static final String ALL_TASKS = "All";
    private List<AggregatorTask> tasks;
    private List<AggregatorTask> filteredTasks;
    private List<AggregatorError> errors;
    private String errorMessage;
    private String systemFilterChoice;
    private RichSelectOneChoice systemFilterChoiceBinding;
    private int hasloaded = 0;
    private boolean isRefresh = false;
    private static CacheService cacheService = new CoherenceCacheServiceImpl("MYTASKS_CACHE", 14400000 );//4 Hours

    public TaskListManagedBean() {
        super();
        tasks = new ArrayList<AggregatorTask>();
        errors = new ArrayList<AggregatorError>();
        filteredTasks = new ArrayList<AggregatorTask>();
        systemFilterChoice = ALL_TASKS;
    }

    public void loadTasks() {
        hasloaded++;
        
        Object retObjec = getCacheService().get(EnvironmentUtil.getCurrentUserName());
         //List<AggregatorTask> cacheTasks = getCacheService().get(EnvironmentUtil.getCurrentUserName());
         if (null == retObjec || isRefresh) {
             isRefresh = false;
             LogUtility.logFine("Data not in cache");

             try {
                 TaskListController taskListController = new TaskListController();
                 AggregatorResponse response = taskListController.getTasks();
                 tasks = response.getTasks();
                 errors = response.getErrors();
                 getCacheService().put(EnvironmentUtil.getCurrentUserName(), response);  
             }  
             catch (Exception e) {
                 errorMessage = "Error: "+"Unable to load tasks" + (e.getMessage() == null ? "." : ": " + e.getMessage());
             }
         }
         else
         {
             LogUtility.logFine("Data  in cache");
             AggregatorResponse response = (AggregatorResponse)retObjec;
             tasks = response.getTasks();
             errors = response.getErrors();
         }
        
     
            filteredTasks.clear();
            filteredTasks.addAll(tasks);
            Collections.sort(filteredTasks, TASK_COMPARATOR);
            LogUtility.logFine("Loaded filtered tasks count: " + filteredTasks.size());

            
            if ((errors != null) && (errors.size() > 0)) {
                Set<String> systems = new HashSet<String>();

                for (AggregatorError error : errors) {
                    LogUtility.logWarning(error.getSystem() + " - " + error.getDescription());
                    systems.add(error.getSystem());
                }
                errorMessage = "Warning: "+PropertyUtil.getWarningMessageSystemsDown(systems);
            }
        
    }

    public int getRowCountToDisplay() {
        int val = filteredTasks.size();
        return val;
    }

    public List<AggregatorError> getErrors() {
        return errors;
    }

    public void refreshTasks(ActionEvent actionEvent) {
        errorMessage = null;
        isRefresh = true;
        loadTasks();
        systemFilterChoiceBinding.setValue(ALL_TASKS);
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public boolean isErrored() {
        return (errorMessage != null) && (errorMessage.trim().length() > 0);
    }

    public void systemFilterChanged(ValueChangeEvent valueChangeEvent) {
        String filterValue = (String)valueChangeEvent.getNewValue();
        filteredTasks.clear();
        if (ALL_TASKS.equals(filterValue)) {
            filteredTasks.addAll(tasks);
        } else {
            for (AggregatorTask task : tasks) {
                if (filterValue.equals(task.getSystem())) {
                    filteredTasks.add(task);
                }
            }
        }
        Collections.sort(filteredTasks, TASK_COMPARATOR);
        LogUtility.logFine("Filtered tasks count for: " + filterValue + "=" + filteredTasks.size());
    }

    public void setSystemFilterChoice(String systemFilterChoice) {
        this.systemFilterChoice = systemFilterChoice;
    }

    public String getSystemFilterChoice() {
        return systemFilterChoice;
    }

    public List<AggregatorTask> getFilteredTasks() {
        return filteredTasks;
    }

    public void setSystemFilterChoiceBinding(RichSelectOneChoice systemFilterChoiceBinding) {
        this.systemFilterChoiceBinding = systemFilterChoiceBinding;
    }

    public RichSelectOneChoice getSystemFilterChoiceBinding() {
        return systemFilterChoiceBinding;
    }
    
    public void loadTable(PollEvent pollEvent) {
                // Add event code here...
                if (hasloaded == 0)
                 {
                errorMessage = null;
                loadTasks();
                systemFilterChoiceBinding.setValue(ALL_TASKS);
                 }
            }

    public int getHasloaded() {
        return hasloaded;
    }

    public static CacheService getCacheService() {
        return cacheService;
    }
}
