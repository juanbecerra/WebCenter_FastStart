
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
 *         &lt;element name="system" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
        { "system" })
@XmlRootElement(name = "timerExpiredFault")
public class TimerExpiredFault
{

    @XmlElement(required = true)
    protected Object system;

    /**
     * Gets the value of the system property.
     *
     * @return
     *     possible object is
     *     {@link Object }
     *
     */
    public Object getSystem()
    {
        return system;
    }

    /**
     * Sets the value of the system property.
     *
     * @param value
     *     allowed object is
     *     {@link Object }
     *
     */
    public void setSystem(Object value)
    {
        this.system = value;
    }

}
