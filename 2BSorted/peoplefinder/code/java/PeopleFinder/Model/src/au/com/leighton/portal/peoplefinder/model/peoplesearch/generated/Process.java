
package au.com.leighton.portal.peoplefinder.model.peoplesearch.generated;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="SearchType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SimpleSearch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationID" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Division" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expertise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "searchType",
    "simpleSearch",
    "locationID",
    "surname",
    "firstName",
    "title",
    "dept",
    "location",
    "busUnit",
    "division",
    "phone",
    "mobile",
    "expertise"
})
@XmlRootElement(name = "process")
public class Process {

    @XmlElement(name = "SearchType", required = true)
    protected String searchType;
    @XmlElementRef(name = "SimpleSearch", namespace = "http://xmlns.oracle.com/Portal/PhoSearchPeople/PhoSearchPeople", type = JAXBElement.class)
    protected JAXBElement<String> simpleSearch;
    @XmlElementRef(name = "LocationID", namespace = "http://xmlns.oracle.com/Portal/PhoSearchPeople/PhoSearchPeople", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> locationID;
    @XmlElementRef(name = "Surname", namespace = "http://xmlns.oracle.com/Portal/PhoSearchPeople/PhoSearchPeople", type = JAXBElement.class)
    protected JAXBElement<String> surname;
    @XmlElementRef(name = "FirstName", namespace = "http://xmlns.oracle.com/Portal/PhoSearchPeople/PhoSearchPeople", type = JAXBElement.class)
    protected JAXBElement<String> firstName;
    @XmlElementRef(name = "Title", namespace = "http://xmlns.oracle.com/Portal/PhoSearchPeople/PhoSearchPeople", type = JAXBElement.class)
    protected JAXBElement<String> title;
    @XmlElementRef(name = "Dept", namespace = "http://xmlns.oracle.com/Portal/PhoSearchPeople/PhoSearchPeople", type = JAXBElement.class)
    protected JAXBElement<String> dept;
    @XmlElementRef(name = "Location", namespace = "http://xmlns.oracle.com/Portal/PhoSearchPeople/PhoSearchPeople", type = JAXBElement.class)
    protected JAXBElement<String> location;
    @XmlElementRef(name = "BusUnit", namespace = "http://xmlns.oracle.com/Portal/PhoSearchPeople/PhoSearchPeople", type = JAXBElement.class)
    protected JAXBElement<String> busUnit;
    @XmlElementRef(name = "Division", namespace = "http://xmlns.oracle.com/Portal/PhoSearchPeople/PhoSearchPeople", type = JAXBElement.class)
    protected JAXBElement<String> division;
    @XmlElementRef(name = "Phone", namespace = "http://xmlns.oracle.com/Portal/PhoSearchPeople/PhoSearchPeople", type = JAXBElement.class)
    protected JAXBElement<String> phone;
    @XmlElementRef(name = "Mobile", namespace = "http://xmlns.oracle.com/Portal/PhoSearchPeople/PhoSearchPeople", type = JAXBElement.class)
    protected JAXBElement<String> mobile;
    @XmlElementRef(name = "Expertise", namespace = "http://xmlns.oracle.com/Portal/PhoSearchPeople/PhoSearchPeople", type = JAXBElement.class)
    protected JAXBElement<String> expertise;

    /**
     * Gets the value of the searchType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchType() {
        return searchType;
    }

    /**
     * Sets the value of the searchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchType(String value) {
        this.searchType = value;
    }

    /**
     * Gets the value of the simpleSearch property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSimpleSearch() {
        return simpleSearch;
    }

    /**
     * Sets the value of the simpleSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSimpleSearch(JAXBElement<String> value) {
        this.simpleSearch = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the locationID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getLocationID() {
        return locationID;
    }

    /**
     * Sets the value of the locationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setLocationID(JAXBElement<BigDecimal> value) {
        this.locationID = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSurname(JAXBElement<String> value) {
        this.surname = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstName(JAXBElement<String> value) {
        this.firstName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dept property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDept() {
        return dept;
    }

    /**
     * Sets the value of the dept property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDept(JAXBElement<String> value) {
        this.dept = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocation(JAXBElement<String> value) {
        this.location = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the busUnit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusUnit() {
        return busUnit;
    }

    /**
     * Sets the value of the busUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusUnit(JAXBElement<String> value) {
        this.busUnit = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the division property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDivision() {
        return division;
    }

    /**
     * Sets the value of the division property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDivision(JAXBElement<String> value) {
        this.division = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhone(JAXBElement<String> value) {
        this.phone = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobile(JAXBElement<String> value) {
        this.mobile = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the expertise property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExpertise() {
        return expertise;
    }

    /**
     * Sets the value of the expertise property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExpertise(JAXBElement<String> value) {
        this.expertise = ((JAXBElement<String> ) value);
    }

}
