package au.com.leighton.portal.aggregatedtasklist.model.service;


import au.com.leighton.portal.aggregatedtasklist.model.common.AggregatorContants;
import au.com.leighton.portal.aggregatedtasklist.model.service.tasklistaggregator.TaskListAggregator;
import au.com.leighton.portal.aggregatedtasklist.model.service.tasklistaggregator.TaskListAggregatorFaultMessage;
import au.com.leighton.portal.aggregatedtasklist.model.service.tasklistaggregator.Tasklistaggregator_client_ep;
import au.com.leighton.portal.aggregatedtasklist.model.service.tasklistaggregator.types.Error;
import au.com.leighton.portal.aggregatedtasklist.model.service.tasklistaggregator.types.GetTasksInput;
import au.com.leighton.portal.aggregatedtasklist.model.service.tasklistaggregator.types.GetTasksOutput;
import au.com.leighton.portal.aggregatedtasklist.model.service.tasklistaggregator.types.Task;
import au.com.leighton.portal.aggregatedtasklist.model.tasklistaggregrator.AggregatorError;
import au.com.leighton.portal.aggregatedtasklist.model.tasklistaggregrator.AggregatorRequest;
import au.com.leighton.portal.aggregatedtasklist.model.tasklistaggregrator.AggregatorResponse;
import au.com.leighton.portal.aggregatedtasklist.model.tasklistaggregrator.AggregatorTask;
import au.com.leighton.portal.aggregatedtasklist.model.util.LogUtility;
import au.com.leighton.portal.aggregatedtasklist.model.util.PropertyUtil;
import au.com.leighton.portal.aggregatedtasklist.model.util.XmlUtil;

import java.net.URL;

import java.util.Calendar;
import java.util.Date;

import java.util.GregorianCalendar;

import javax.xml.namespace.QName;
import javax.xml.ws.WebServiceRef;


public class AggregatorService {

    @WebServiceRef
    private Tasklistaggregator_client_ep tasklistaggregatorService;

    public AggregatorService() {
        super();
    }

    public AggregatorResponse getTasks(AggregatorRequest request) throws Exception {

        AggregatorResponse response;
        try {
            URL wsdlLocation = new URL(PropertyUtil.getServiceWSDL());
            QName serviceName = new QName(PropertyUtil.getServiceNamespace(), PropertyUtil.getServiceName());
            tasklistaggregatorService = new Tasklistaggregator_client_ep(wsdlLocation, serviceName);

            GetTasksInput payload = new GetTasksInput();
            payload.setUser(request.getUser());
            TaskListAggregator taskListAggregatorPort = tasklistaggregatorService.getTaskListAggregator_pt();
            GetTasksOutput getTasksOutput = taskListAggregatorPort.getTasks(payload);
            if (getTasksOutput != null) {
                response = readResponse(getTasksOutput);
            } else {
                throw new Exception("Null response");
            }
        } catch (TaskListAggregatorFaultMessage serviceError) {
            LogUtility.logSevere("Service fault: " + serviceError.getFaultInfo().getErrorMessage());
            throw new Exception(serviceError.getFaultInfo().getErrorMessage());
        } catch (Exception e) {
            LogUtility.logSevere("Service error: " + e.getMessage());
            throw new Exception(e.getMessage());
        }
        return response;
    }

    private AggregatorResponse readResponse(GetTasksOutput getTasksOutput) {

        LogUtility.logFine(XmlUtil.convertJAXBToXML(getTasksOutput, "au.com.leighton.portal.aggregatedtasklist.model.service.tasklistaggregator.types"));

        AggregatorResponse response = new AggregatorResponse();
        int id = 0;

        if (getTasksOutput.getTasks() != null) {
            for (Task task : getTasksOutput.getTasks().getTask()) {
                AggregatorTask aggregatorTask = new AggregatorTask(id++);

                String system = task.getSystem();
                // Map "TLW" to "Our Way" for the system
                if (AggregatorContants.tlwSoaCompositeLabel.equals(system)) {
                    system = AggregatorContants.tlwTaskLabel;
                }
                aggregatorTask.setSystem(system);
                aggregatorTask.setSubject(task.getSubject().getValue());

                if ((aggregatorTask.getSubject() == null) || (aggregatorTask.getSubject().trim().length() == 0)) {
                    aggregatorTask.setSubject(PropertyUtil.getDefaultSubjectText());
                }
                if (task.getDueDate() != null && task.getDueDate().getValue() != null && task.getDueDate().getValue().toGregorianCalendar() != null) {
                    aggregatorTask.setDueDate(task.getDueDate().getValue().toGregorianCalendar().getTime());
                }
                aggregatorTask.setUrl(task.getUrl());

                response.getTasks().add(aggregatorTask);
            }
        }

        if (getTasksOutput.getErrors() != null) {
            for (Error error : getTasksOutput.getErrors().getError()) {
                AggregatorError aggregatorError = new AggregatorError();

                String system = error.getSystem();
                // Map "TLW" to "Our Way" for the system
                if (AggregatorContants.tlwSoaCompositeLabel.equals(system)) {
                    system = AggregatorContants.tlwTaskLabel;
                }
                aggregatorError.setSystem(system);
                aggregatorError.setDescription(error.getDescription());

                response.getErrors().add(aggregatorError);
            }
        }
        return response;
    }
}
