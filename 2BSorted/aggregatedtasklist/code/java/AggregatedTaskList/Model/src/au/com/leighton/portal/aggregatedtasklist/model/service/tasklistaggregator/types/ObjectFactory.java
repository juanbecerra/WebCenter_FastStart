
package au.com.leighton.portal.aggregatedtasklist.model.service.tasklistaggregator.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the au.com.leighton.portal.aggregatedtasklist.model.service.tasklistaggregator.types package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory
{

    private final static QName _TaskSubject_QNAME =
        new QName("http://xmlns.leicon.com.au/Portal/TaskListAggregator/TaskListAggregator",
                  "subject");
    private final static QName _TaskDueDate_QNAME =
        new QName("http://xmlns.leicon.com.au/Portal/TaskListAggregator/TaskListAggregator",
                  "dueDate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.com.leighton.portal.aggregatedtasklist.model.service.tasklistaggregator.types
     *
     */
    public ObjectFactory()
    {
    }

    /**
     * Create an instance of {@link TaskListAggregatorFault }
     *
     */
    public TaskListAggregatorFault createTaskListAggregatorFault()
    {
        return new TaskListAggregatorFault();
    }

    /**
     * Create an instance of {@link Errors }
     *
     */
    public Errors createErrors()
    {
        return new Errors();
    }

    /**
     * Create an instance of {@link Error }
     *
     */
    public Error createError()
    {
        return new Error();
    }

    /**
     * Create an instance of {@link Task }
     *
     */
    public Task createTask()
    {
        return new Task();
    }

    /**
     * Create an instance of {@link TimerExpiredFault }
     *
     */
    public TimerExpiredFault createTimerExpiredFault()
    {
        return new TimerExpiredFault();
    }

    /**
     * Create an instance of {@link Tasks }
     *
     */
    public Tasks createTasks()
    {
        return new Tasks();
    }

    /**
     * Create an instance of {@link GetTasksInput }
     *
     */
    public GetTasksInput createGetTasksInput()
    {
        return new GetTasksInput();
    }

    /**
     * Create an instance of {@link GetTasksOutput }
     *
     */
    public GetTasksOutput createGetTasksOutput()
    {
        return new GetTasksOutput();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://xmlns.leicon.com.au/Portal/TaskListAggregator/TaskListAggregator",
                    name = "subject", scope = Task.class)
    public JAXBElement<String> createTaskSubject(String value)
    {
        return new JAXBElement<String>(_TaskSubject_QNAME, String.class,
                                       Task.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://xmlns.leicon.com.au/Portal/TaskListAggregator/TaskListAggregator",
                    name = "dueDate", scope = Task.class)
    public JAXBElement<XMLGregorianCalendar> createTaskDueDate(XMLGregorianCalendar value)
    {
        return new JAXBElement<XMLGregorianCalendar>(_TaskDueDate_QNAME,
                                                     XMLGregorianCalendar.class,
                                                     Task.class, value);
    }

}
