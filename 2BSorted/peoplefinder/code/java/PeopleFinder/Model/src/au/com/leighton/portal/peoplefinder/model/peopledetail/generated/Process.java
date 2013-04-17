
package au.com.leighton.portal.peoplefinder.model.peopledetail.generated;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="i_person_id" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="i_username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "iPersonId",
    "iUsername"
})
@XmlRootElement(name = "process")
public class Process {

    @XmlElementRef(name = "i_person_id", namespace = "http://xmlns.oracle.com/Portal/PhoGetPersonDetail/PhoGetPersonDetail", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> iPersonId;
    @XmlElementRef(name = "i_username", namespace = "http://xmlns.oracle.com/Portal/PhoGetPersonDetail/PhoGetPersonDetail", type = JAXBElement.class)
    protected JAXBElement<String> iUsername;

    /**
     * Gets the value of the iPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIPersonId() {
        return iPersonId;
    }

    /**
     * Sets the value of the iPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIPersonId(JAXBElement<BigDecimal> value) {
        this.iPersonId = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the iUsername property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIUsername() {
        return iUsername;
    }

    /**
     * Sets the value of the iUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIUsername(JAXBElement<String> value) {
        this.iUsername = ((JAXBElement<String> ) value);
    }

}
