
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
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="system" type="{http://www.w3.org/2001/XMLSchema}string"/>
 * &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder =
        { "system", "description" })
@XmlRootElement(name = "error")
public class Error
{

    @XmlElement(required = true, nillable = true)
    protected String system;
    @XmlElement(required = true, nillable = true)
    protected String description;

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
     * possible object is
     * {@link String}
     *
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Sets the value of the subject property.
     *
     * @param value
     * allowed object is
     * {@link String}
     *
     */
    public void setDescription(String value)
    {
        this.description = value;
    }

}
