
package au.com.leighton.portal.aggregatedtasklist.model.service.tasklistaggregator.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="system" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        { "system", "subject", "dueDate", "url" })
@XmlRootElement(name = "task")
public class Task
{

    @XmlElement(required = true, nillable = true)
    protected String system;
    @XmlElementRef(name = "subject",
                   namespace = "http://xmlns.leicon.com.au/Portal/TaskListAggregator/TaskListAggregator",
                   type = JAXBElement.class)
    protected JAXBElement<String> subject;
    @XmlElementRef(name = "dueDate",
                   namespace = "http://xmlns.leicon.com.au/Portal/TaskListAggregator/TaskListAggregator",
                   type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> dueDate;
    @XmlElement(required = true, nillable = true)
    protected String url;

    /**
     * Gets the value of the system property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSystem()
    {
        return system;
    }

    /**
     * Sets the value of the system property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSystem(String value)
    {
        this.system = value;
    }

    /**
     * Gets the value of the subject property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getSubject()
    {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setSubject(JAXBElement<String> value)
    {
        this.subject = ((JAXBElement<String>)value);
    }

    /**
     * Gets the value of the dueDate property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *
     */
    public JAXBElement<XMLGregorianCalendar> getDueDate()
    {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *
     */
    public void setDueDate(JAXBElement<XMLGregorianCalendar> value)
    {
        this.dueDate = ((JAXBElement<XMLGregorianCalendar>)value);
    }

    /**
     * Gets the value of the url property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUrl()
    {
        return url;
    }

    /**
     * Sets the value of the url property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUrl(String value)
    {
        this.url = value;
    }

}
