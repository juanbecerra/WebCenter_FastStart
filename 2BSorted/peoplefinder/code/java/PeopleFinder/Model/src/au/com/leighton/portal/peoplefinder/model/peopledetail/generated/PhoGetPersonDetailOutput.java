
package au.com.leighton.portal.peoplefinder.model.peopledetail.generated;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhoGetPersonDetailOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhoGetPersonDetailOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="p_person_id" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="p_surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="p_first_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="p_title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pa_person_id" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="pa_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="d_dept_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="d_dept_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="l_location_id" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="locn_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="l_address_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="l_address_2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="l_suburb" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="l_state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="l_postcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="p_main_vpn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="p_main_ph" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="l_fax_no" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="photo" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="p_email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="p_note" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="admin_email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wc_username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReportLine" type="{http://xmlns.oracle.com/Portal/PhoGetPersonDetail/PhoGetPersonDetail}ReportLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Experience" type="{http://xmlns.oracle.com/Portal/PhoGetPersonDetail/PhoGetPersonDetail}Experience" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Spaces" type="{http://xmlns.oracle.com/Portal/PhoGetPersonDetail/PhoGetPersonDetail}Spaces" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WCconnections" type="{http://xmlns.oracle.com/Portal/PhoGetPersonDetail/PhoGetPersonDetail}WCconnections" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoGetPersonDetailOutput", propOrder = {
    "pPersonId",
    "pSurname",
    "pFirstName",
    "pTitle",
    "paPersonId",
    "paName",
    "dDeptId",
    "dDeptName",
    "lLocationId",
    "locnName",
    "lAddress1",
    "lAddress2",
    "lSuburb",
    "lState",
    "lPostcode",
    "company",
    "pMainVpn",
    "pMainPh",
    "lFaxNo",
    "mobile",
    "photo",
    "pEmail",
    "pNote",
    "adminEmail",
    "wcUsername",
    "username",
    "reportLine",
    "experience",
    "spaces",
    "wCconnections"
})
public class PhoGetPersonDetailOutput {

    @XmlElement(name = "p_person_id", required = true, nillable = true)
    protected BigDecimal pPersonId;
    @XmlElement(name = "p_surname", required = true, nillable = true)
    protected String pSurname;
    @XmlElement(name = "p_first_name", required = true, nillable = true)
    protected String pFirstName;
    @XmlElement(name = "p_title", required = true, nillable = true)
    protected String pTitle;
    @XmlElement(name = "pa_person_id", required = true, nillable = true)
    protected BigDecimal paPersonId;
    @XmlElement(name = "pa_name", required = true, nillable = true)
    protected String paName;
    @XmlElement(name = "d_dept_id", required = true, nillable = true)
    protected String dDeptId;
    @XmlElement(name = "d_dept_name", required = true, nillable = true)
    protected String dDeptName;
    @XmlElement(name = "l_location_id", required = true, nillable = true)
    protected BigDecimal lLocationId;
    @XmlElement(name = "locn_name", required = true, nillable = true)
    protected String locnName;
    @XmlElement(name = "l_address_1", required = true, nillable = true)
    protected String lAddress1;
    @XmlElement(name = "l_address_2", required = true, nillable = true)
    protected String lAddress2;
    @XmlElement(name = "l_suburb", required = true, nillable = true)
    protected String lSuburb;
    @XmlElement(name = "l_state", required = true, nillable = true)
    protected String lState;
    @XmlElement(name = "l_postcode", required = true, nillable = true)
    protected String lPostcode;
    @XmlElement(required = true, nillable = true)
    protected String company;
    @XmlElement(name = "p_main_vpn", required = true, nillable = true)
    protected String pMainVpn;
    @XmlElement(name = "p_main_ph", required = true, nillable = true)
    protected String pMainPh;
    @XmlElement(name = "l_fax_no", required = true, nillable = true)
    protected String lFaxNo;
    @XmlElement(required = true, nillable = true)
    protected String mobile;
    @XmlElement(required = true, nillable = true)
    protected byte[] photo;
    @XmlElement(name = "p_email", required = true, nillable = true)
    protected String pEmail;
    @XmlElement(name = "p_note", required = true, nillable = true)
    protected String pNote;
    @XmlElement(name = "admin_email", required = true, nillable = true)
    protected String adminEmail;
    @XmlElement(name = "wc_username", required = true, nillable = true)
    protected String wcUsername;
    @XmlElement(required = true, nillable = true)
    protected String username;
    @XmlElement(name = "ReportLine")
    protected List<ReportLine> reportLine;
    @XmlElement(name = "Experience")
    protected List<Experience> experience;
    @XmlElement(name = "Spaces")
    protected List<Spaces> spaces;
    @XmlElement(name = "WCconnections")
    protected List<WCconnections> wCconnections;

    /**
     * Gets the value of the pPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPPersonId() {
        return pPersonId;
    }

    /**
     * Sets the value of the pPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPPersonId(BigDecimal value) {
        this.pPersonId = value;
    }

    /**
     * Gets the value of the pSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSurname() {
        return pSurname;
    }

    /**
     * Sets the value of the pSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSurname(String value) {
        this.pSurname = value;
    }

    /**
     * Gets the value of the pFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPFirstName() {
        return pFirstName;
    }

    /**
     * Sets the value of the pFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPFirstName(String value) {
        this.pFirstName = value;
    }

    /**
     * Gets the value of the pTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTitle() {
        return pTitle;
    }

    /**
     * Sets the value of the pTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTitle(String value) {
        this.pTitle = value;
    }

    /**
     * Gets the value of the paPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaPersonId() {
        return paPersonId;
    }

    /**
     * Sets the value of the paPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaPersonId(BigDecimal value) {
        this.paPersonId = value;
    }

    /**
     * Gets the value of the paName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaName() {
        return paName;
    }

    /**
     * Sets the value of the paName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaName(String value) {
        this.paName = value;
    }

    /**
     * Gets the value of the dDeptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDeptId() {
        return dDeptId;
    }

    /**
     * Sets the value of the dDeptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDeptId(String value) {
        this.dDeptId = value;
    }

    /**
     * Gets the value of the dDeptName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDeptName() {
        return dDeptName;
    }

    /**
     * Sets the value of the dDeptName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDeptName(String value) {
        this.dDeptName = value;
    }

    /**
     * Gets the value of the lLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLLocationId() {
        return lLocationId;
    }

    /**
     * Sets the value of the lLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLLocationId(BigDecimal value) {
        this.lLocationId = value;
    }

    /**
     * Gets the value of the locnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocnName() {
        return locnName;
    }

    /**
     * Sets the value of the locnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocnName(String value) {
        this.locnName = value;
    }

    /**
     * Gets the value of the lAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLAddress1() {
        return lAddress1;
    }

    /**
     * Sets the value of the lAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLAddress1(String value) {
        this.lAddress1 = value;
    }

    /**
     * Gets the value of the lAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLAddress2() {
        return lAddress2;
    }

    /**
     * Sets the value of the lAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLAddress2(String value) {
        this.lAddress2 = value;
    }

    /**
     * Gets the value of the lSuburb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLSuburb() {
        return lSuburb;
    }

    /**
     * Sets the value of the lSuburb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLSuburb(String value) {
        this.lSuburb = value;
    }

    /**
     * Gets the value of the lState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLState() {
        return lState;
    }

    /**
     * Sets the value of the lState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLState(String value) {
        this.lState = value;
    }

    /**
     * Gets the value of the lPostcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLPostcode() {
        return lPostcode;
    }

    /**
     * Sets the value of the lPostcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLPostcode(String value) {
        this.lPostcode = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the pMainVpn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMainVpn() {
        return pMainVpn;
    }

    /**
     * Sets the value of the pMainVpn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMainVpn(String value) {
        this.pMainVpn = value;
    }

    /**
     * Gets the value of the pMainPh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMainPh() {
        return pMainPh;
    }

    /**
     * Sets the value of the pMainPh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMainPh(String value) {
        this.pMainPh = value;
    }

    /**
     * Gets the value of the lFaxNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLFaxNo() {
        return lFaxNo;
    }

    /**
     * Sets the value of the lFaxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLFaxNo(String value) {
        this.lFaxNo = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * Gets the value of the photo property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPhoto() {
        return photo;
    }

    /**
     * Sets the value of the photo property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPhoto(byte[] value) {
        this.photo = ((byte[]) value);
    }

    /**
     * Gets the value of the pEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPEmail() {
        return pEmail;
    }

    /**
     * Sets the value of the pEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPEmail(String value) {
        this.pEmail = value;
    }

    /**
     * Gets the value of the pNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNote() {
        return pNote;
    }

    /**
     * Sets the value of the pNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNote(String value) {
        this.pNote = value;
    }

    /**
     * Gets the value of the adminEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminEmail() {
        return adminEmail;
    }

    /**
     * Sets the value of the adminEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminEmail(String value) {
        this.adminEmail = value;
    }

    /**
     * Gets the value of the wcUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWcUsername() {
        return wcUsername;
    }

    /**
     * Sets the value of the wcUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWcUsername(String value) {
        this.wcUsername = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the reportLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportLine }
     * 
     * 
     */
    public List<ReportLine> getReportLine() {
        if (reportLine == null) {
            reportLine = new ArrayList<ReportLine>();
        }
        return this.reportLine;
    }

    /**
     * Gets the value of the experience property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the experience property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExperience().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Experience }
     * 
     * 
     */
    public List<Experience> getExperience() {
        if (experience == null) {
            experience = new ArrayList<Experience>();
        }
        return this.experience;
    }

    /**
     * Gets the value of the spaces property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spaces property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpaces().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Spaces }
     * 
     * 
     */
    public List<Spaces> getSpaces() {
        if (spaces == null) {
            spaces = new ArrayList<Spaces>();
        }
        return this.spaces;
    }

    /**
     * Gets the value of the wCconnections property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wCconnections property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWCconnections().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WCconnections }
     * 
     * 
     */
    public List<WCconnections> getWCconnections() {
        if (wCconnections == null) {
            wCconnections = new ArrayList<WCconnections>();
        }
        return this.wCconnections;
    }

}
