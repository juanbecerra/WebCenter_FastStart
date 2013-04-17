
package au.com.leighton.portal.peoplefinder.model.peoplesearch.generated;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhoSearchOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhoSearchOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="P_PERSON_ID" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="P_FIRSTNAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="P_SURNAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="P_TITLE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="P_DEPT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="P_DEPT_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="L_LOCATION_ID" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="L_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoSearchOutput", propOrder = {
    "ppersonid",
    "pfirstname",
    "psurname",
    "ptitle",
    "pdeptid",
    "pdeptname",
    "llocationid",
    "lname"
})
public class PhoSearchOutput {

    @XmlElement(name = "P_PERSON_ID", required = true, nillable = true)
    protected BigDecimal ppersonid;
    @XmlElement(name = "P_FIRSTNAME", required = true, nillable = true)
    protected String pfirstname;
    @XmlElement(name = "P_SURNAME", required = true, nillable = true)
    protected String psurname;
    @XmlElement(name = "P_TITLE", required = true, nillable = true)
    protected String ptitle;
    @XmlElement(name = "P_DEPT_ID", required = true, nillable = true)
    protected String pdeptid;
    @XmlElement(name = "P_DEPT_NAME", required = true, nillable = true)
    protected String pdeptname;
    @XmlElement(name = "L_LOCATION_ID", required = true, nillable = true)
    protected BigDecimal llocationid;
    @XmlElement(name = "L_NAME", required = true, nillable = true)
    protected String lname;

    /**
     * Gets the value of the ppersonid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPPERSONID() {
        return ppersonid;
    }

    /**
     * Sets the value of the ppersonid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPPERSONID(BigDecimal value) {
        this.ppersonid = value;
    }

    /**
     * Gets the value of the pfirstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPFIRSTNAME() {
        return pfirstname;
    }

    /**
     * Sets the value of the pfirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPFIRSTNAME(String value) {
        this.pfirstname = value;
    }

    /**
     * Gets the value of the psurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSURNAME() {
        return psurname;
    }

    /**
     * Sets the value of the psurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSURNAME(String value) {
        this.psurname = value;
    }

    /**
     * Gets the value of the ptitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTITLE() {
        return ptitle;
    }

    /**
     * Sets the value of the ptitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTITLE(String value) {
        this.ptitle = value;
    }

    /**
     * Gets the value of the pdeptid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDEPTID() {
        return pdeptid;
    }

    /**
     * Sets the value of the pdeptid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDEPTID(String value) {
        this.pdeptid = value;
    }

    /**
     * Gets the value of the pdeptname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDEPTNAME() {
        return pdeptname;
    }

    /**
     * Sets the value of the pdeptname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDEPTNAME(String value) {
        this.pdeptname = value;
    }

    /**
     * Gets the value of the llocationid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLLOCATIONID() {
        return llocationid;
    }

    /**
     * Sets the value of the llocationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLLOCATIONID(BigDecimal value) {
        this.llocationid = value;
    }

    /**
     * Gets the value of the lname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLNAME() {
        return lname;
    }

    /**
     * Sets the value of the lname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLNAME(String value) {
        this.lname = value;
    }

}
