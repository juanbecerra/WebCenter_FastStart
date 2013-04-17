
package au.com.leighton.portal.peoplefinder.model.locationsearch.generated;

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
 *         &lt;element name="i_locn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="i_company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="i_suburb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="i_state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="i_phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="i_vpn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="i_notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "iLocn",
    "iCompany",
    "iSuburb",
    "iState",
    "iPhone",
    "iVpn",
    "iNotes"
})
@XmlRootElement(name = "process")
public class Process {

    @XmlElement(name = "SearchType", required = true)
    protected String searchType;
    @XmlElementRef(name = "SimpleSearch", namespace = "http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", type = JAXBElement.class)
    protected JAXBElement<String> simpleSearch;
    @XmlElementRef(name = "i_locn", namespace = "http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", type = JAXBElement.class)
    protected JAXBElement<String> iLocn;
    @XmlElementRef(name = "i_company", namespace = "http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", type = JAXBElement.class)
    protected JAXBElement<String> iCompany;
    @XmlElementRef(name = "i_suburb", namespace = "http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", type = JAXBElement.class)
    protected JAXBElement<String> iSuburb;
    @XmlElementRef(name = "i_state", namespace = "http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", type = JAXBElement.class)
    protected JAXBElement<String> iState;
    @XmlElementRef(name = "i_phone", namespace = "http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", type = JAXBElement.class)
    protected JAXBElement<String> iPhone;
    @XmlElementRef(name = "i_vpn", namespace = "http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", type = JAXBElement.class)
    protected JAXBElement<String> iVpn;
    @XmlElementRef(name = "i_notes", namespace = "http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", type = JAXBElement.class)
    protected JAXBElement<String> iNotes;

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
     * Gets the value of the iLocn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getILocn() {
        return iLocn;
    }

    /**
     * Sets the value of the iLocn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setILocn(JAXBElement<String> value) {
        this.iLocn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the iCompany property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getICompany() {
        return iCompany;
    }

    /**
     * Sets the value of the iCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setICompany(JAXBElement<String> value) {
        this.iCompany = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the iSuburb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getISuburb() {
        return iSuburb;
    }

    /**
     * Sets the value of the iSuburb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setISuburb(JAXBElement<String> value) {
        this.iSuburb = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the iState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIState() {
        return iState;
    }

    /**
     * Sets the value of the iState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIState(JAXBElement<String> value) {
        this.iState = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the iPhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIPhone() {
        return iPhone;
    }

    /**
     * Sets the value of the iPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIPhone(JAXBElement<String> value) {
        this.iPhone = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the iVpn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIVpn() {
        return iVpn;
    }

    /**
     * Sets the value of the iVpn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIVpn(JAXBElement<String> value) {
        this.iVpn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the iNotes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getINotes() {
        return iNotes;
    }

    /**
     * Sets the value of the iNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setINotes(JAXBElement<String> value) {
        this.iNotes = ((JAXBElement<String> ) value);
    }

}
