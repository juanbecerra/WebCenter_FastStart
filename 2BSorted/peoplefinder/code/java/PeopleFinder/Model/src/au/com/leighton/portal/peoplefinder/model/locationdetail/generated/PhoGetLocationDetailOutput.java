
package au.com.leighton.portal.peoplefinder.model.locationdetail.generated;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhoGetLocationDetailOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhoGetLocationDetailOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LOCATION_ID" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="LOCN_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ADDRESS_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ADDRESS_2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SUBURB" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="STATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="POSTCODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PUBLISHED_PH" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FAX_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VPN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="COMPANY_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="COMPANY_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NOTE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PO_BOX_ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PO_BOX_SUBURB" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PO_BOX_STATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PO_BOX_POSTCODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ADMIN_EMAIL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoGetLocationDetailOutput", propOrder = {
    "locationid",
    "locnname",
    "address1",
    "address2",
    "suburb",
    "state",
    "postcode",
    "publishedph",
    "faxno",
    "email",
    "vpn",
    "companyid",
    "companyname",
    "note",
    "poboxaddress",
    "poboxsuburb",
    "poboxstate",
    "poboxpostcode",
    "adminemail"
})
public class PhoGetLocationDetailOutput {

    @XmlElement(name = "LOCATION_ID", required = true, nillable = true)
    protected BigDecimal locationid;
    @XmlElement(name = "LOCN_NAME", required = true, nillable = true)
    protected String locnname;
    @XmlElement(name = "ADDRESS_1", required = true, nillable = true)
    protected String address1;
    @XmlElement(name = "ADDRESS_2", required = true, nillable = true)
    protected String address2;
    @XmlElement(name = "SUBURB", required = true, nillable = true)
    protected String suburb;
    @XmlElement(name = "STATE", required = true, nillable = true)
    protected String state;
    @XmlElement(name = "POSTCODE", required = true, nillable = true)
    protected String postcode;
    @XmlElement(name = "PUBLISHED_PH", required = true, nillable = true)
    protected String publishedph;
    @XmlElement(name = "FAX_NO", required = true, nillable = true)
    protected String faxno;
    @XmlElement(name = "EMAIL", required = true, nillable = true)
    protected String email;
    @XmlElement(name = "VPN", required = true, nillable = true)
    protected String vpn;
    @XmlElement(name = "COMPANY_ID", required = true, nillable = true)
    protected String companyid;
    @XmlElement(name = "COMPANY_NAME", required = true, nillable = true)
    protected String companyname;
    @XmlElement(name = "NOTE", required = true, nillable = true)
    protected String note;
    @XmlElement(name = "PO_BOX_ADDRESS", required = true, nillable = true)
    protected String poboxaddress;
    @XmlElement(name = "PO_BOX_SUBURB", required = true, nillable = true)
    protected String poboxsuburb;
    @XmlElement(name = "PO_BOX_STATE", required = true, nillable = true)
    protected String poboxstate;
    @XmlElement(name = "PO_BOX_POSTCODE", required = true, nillable = true)
    protected String poboxpostcode;
    @XmlElement(name = "ADMIN_EMAIL", required = true, nillable = true)
    protected String adminemail;

    /**
     * Gets the value of the locationid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLOCATIONID() {
        return locationid;
    }

    /**
     * Sets the value of the locationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLOCATIONID(BigDecimal value) {
        this.locationid = value;
    }

    /**
     * Gets the value of the locnname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCNNAME() {
        return locnname;
    }

    /**
     * Sets the value of the locnname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCNNAME(String value) {
        this.locnname = value;
    }

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDRESS1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDRESS1(String value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDRESS2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDRESS2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the suburb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBURB() {
        return suburb;
    }

    /**
     * Sets the value of the suburb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBURB(String value) {
        this.suburb = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATE() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATE(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSTCODE() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSTCODE(String value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the publishedph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPUBLISHEDPH() {
        return publishedph;
    }

    /**
     * Sets the value of the publishedph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPUBLISHEDPH(String value) {
        this.publishedph = value;
    }

    /**
     * Gets the value of the faxno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAXNO() {
        return faxno;
    }

    /**
     * Sets the value of the faxno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAXNO(String value) {
        this.faxno = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMAIL() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMAIL(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the vpn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVPN() {
        return vpn;
    }

    /**
     * Sets the value of the vpn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVPN(String value) {
        this.vpn = value;
    }

    /**
     * Gets the value of the companyid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPANYID() {
        return companyid;
    }

    /**
     * Sets the value of the companyid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPANYID(String value) {
        this.companyid = value;
    }

    /**
     * Gets the value of the companyname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPANYNAME() {
        return companyname;
    }

    /**
     * Sets the value of the companyname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPANYNAME(String value) {
        this.companyname = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOTE() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOTE(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the poboxaddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOBOXADDRESS() {
        return poboxaddress;
    }

    /**
     * Sets the value of the poboxaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOBOXADDRESS(String value) {
        this.poboxaddress = value;
    }

    /**
     * Gets the value of the poboxsuburb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOBOXSUBURB() {
        return poboxsuburb;
    }

    /**
     * Sets the value of the poboxsuburb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOBOXSUBURB(String value) {
        this.poboxsuburb = value;
    }

    /**
     * Gets the value of the poboxstate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOBOXSTATE() {
        return poboxstate;
    }

    /**
     * Sets the value of the poboxstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOBOXSTATE(String value) {
        this.poboxstate = value;
    }

    /**
     * Gets the value of the poboxpostcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOBOXPOSTCODE() {
        return poboxpostcode;
    }

    /**
     * Sets the value of the poboxpostcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOBOXPOSTCODE(String value) {
        this.poboxpostcode = value;
    }

    /**
     * Gets the value of the adminemail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADMINEMAIL() {
        return adminemail;
    }

    /**
     * Sets the value of the adminemail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADMINEMAIL(String value) {
        this.adminemail = value;
    }

}
