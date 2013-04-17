
package au.com.leighton.portal.peoplefinder.model.locationsearch.generated;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhoLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhoLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locationId" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="publishedPh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoLocation", propOrder = {
    "locationId",
    "name",
    "publishedPh",
    "faxNo",
    "companyId",
    "companyName"
})
public class PhoLocation {

    @XmlElement(required = true)
    protected BigDecimal locationId;
    @XmlElementRef(name = "name", namespace = "http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", type = JAXBElement.class)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "publishedPh", namespace = "http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", type = JAXBElement.class)
    protected JAXBElement<String> publishedPh;
    @XmlElementRef(name = "faxNo", namespace = "http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", type = JAXBElement.class)
    protected JAXBElement<String> faxNo;
    @XmlElementRef(name = "companyId", namespace = "http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", type = JAXBElement.class)
    protected JAXBElement<String> companyId;
    @XmlElementRef(name = "companyName", namespace = "http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", type = JAXBElement.class)
    protected JAXBElement<String> companyName;

    /**
     * Gets the value of the locationId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the locationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLocationId(BigDecimal value) {
        this.locationId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the publishedPh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPublishedPh() {
        return publishedPh;
    }

    /**
     * Sets the value of the publishedPh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPublishedPh(JAXBElement<String> value) {
        this.publishedPh = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the faxNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaxNo() {
        return faxNo;
    }

    /**
     * Sets the value of the faxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaxNo(JAXBElement<String> value) {
        this.faxNo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the companyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompanyId() {
        return companyId;
    }

    /**
     * Sets the value of the companyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompanyId(JAXBElement<String> value) {
        this.companyId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompanyName(JAXBElement<String> value) {
        this.companyName = ((JAXBElement<String> ) value);
    }

}
