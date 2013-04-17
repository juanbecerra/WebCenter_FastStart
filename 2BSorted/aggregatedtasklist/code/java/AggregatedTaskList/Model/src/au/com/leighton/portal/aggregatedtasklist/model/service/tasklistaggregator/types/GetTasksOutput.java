
package au.com.leighton.portal.aggregatedtasklist.model.service.tasklistaggregator.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://xmlns.leicon.com.au/Portal/TaskListAggregator/TaskListAggregator}tasks"/>
 *         &lt;element ref="{http://xmlns.leicon.com.au/Portal/TaskListAggregator/TaskListAggregator}errors"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder =
        { "tasks", "errors" })
@XmlRootElement(name = "getTasksOutput")
public class GetTasksOutput
{

    @XmlElement(required = true)
    protected Tasks tasks;
    @XmlElement(required = true)
    protected Errors errors;

    /**
     * Gets the value of the tasks property.
     *
     * @return
     *     possible object is
     *     {@link Tasks }
     *
     */
    public Tasks getTasks()
    {
        return tasks;
    }

    /**
     * Sets the value of the tasks property.
     *
     * @param value
     *     allowed object is
     *     {@link Tasks }
     *
     */
    public void setTasks(Tasks value)
    {
        this.tasks = value;
    }

    /**
     * Gets the value of the errors property.
     *
     * @return
     *     possible object is
     *     {@link Errors }
     *
     */
    public Errors getErrors()
    {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     *
     * @param value
     *     allowed object is
     *     {@link Errors }
     *
     */
    public void setErrors(Errors value)
    {
        this.errors = value;
    }

}
