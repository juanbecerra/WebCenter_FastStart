
package au.com.leighton.portal.peoplefinder.model.peopledetail.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Spaces complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Spaces">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SH_SPACE_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SH_DISPLAY_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SH_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SH_LOGO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SH_CREATE_DATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SH_LAST_UPDATE_DATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SH_GS_MEMBER_COUNT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SU_USER_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SU_SPACE_GUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SU_SPACE_ROLE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SU_PERMISSION_ACTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Spaces", propOrder = {
    "shspaceid",
    "shdisplayname",
    "shdescription",
    "shlogo",
    "shcreatedate",
    "shlastupdatedate",
    "shgsmembercount",
    "suuserid",
    "suspaceguid",
    "suspacerole",
    "supermissionaction"
})
public class Spaces {

    @XmlElement(name = "SH_SPACE_ID", required = true, nillable = true)
    protected String shspaceid;
    @XmlElement(name = "SH_DISPLAY_NAME", required = true, nillable = true)
    protected String shdisplayname;
    @XmlElement(name = "SH_DESCRIPTION", required = true, nillable = true)
    protected String shdescription;
    @XmlElement(name = "SH_LOGO", required = true, nillable = true)
    protected String shlogo;
    @XmlElement(name = "SH_CREATE_DATE", required = true, nillable = true)
    protected String shcreatedate;
    @XmlElement(name = "SH_LAST_UPDATE_DATE", required = true, nillable = true)
    protected String shlastupdatedate;
    @XmlElement(name = "SH_GS_MEMBER_COUNT", required = true, nillable = true)
    protected String shgsmembercount;
    @XmlElement(name = "SU_USER_ID", required = true, nillable = true)
    protected String suuserid;
    @XmlElement(name = "SU_SPACE_GUID", required = true, nillable = true)
    protected String suspaceguid;
    @XmlElement(name = "SU_SPACE_ROLE", required = true, nillable = true)
    protected String suspacerole;
    @XmlElement(name = "SU_PERMISSION_ACTION", required = true, nillable = true)
    protected String supermissionaction;

    /**
     * Gets the value of the shspaceid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHSPACEID() {
        return shspaceid;
    }

    /**
     * Sets the value of the shspaceid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHSPACEID(String value) {
        this.shspaceid = value;
    }

    /**
     * Gets the value of the shdisplayname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHDISPLAYNAME() {
        return shdisplayname;
    }

    /**
     * Sets the value of the shdisplayname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHDISPLAYNAME(String value) {
        this.shdisplayname = value;
    }

    /**
     * Gets the value of the shdescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHDESCRIPTION() {
        return shdescription;
    }

    /**
     * Sets the value of the shdescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHDESCRIPTION(String value) {
        this.shdescription = value;
    }

    /**
     * Gets the value of the shlogo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHLOGO() {
        return shlogo;
    }

    /**
     * Sets the value of the shlogo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHLOGO(String value) {
        this.shlogo = value;
    }

    /**
     * Gets the value of the shcreatedate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHCREATEDATE() {
        return shcreatedate;
    }

    /**
     * Sets the value of the shcreatedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHCREATEDATE(String value) {
        this.shcreatedate = value;
    }

    /**
     * Gets the value of the shlastupdatedate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHLASTUPDATEDATE() {
        return shlastupdatedate;
    }

    /**
     * Sets the value of the shlastupdatedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHLASTUPDATEDATE(String value) {
        this.shlastupdatedate = value;
    }

    /**
     * Gets the value of the shgsmembercount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHGSMEMBERCOUNT() {
        return shgsmembercount;
    }

    /**
     * Sets the value of the shgsmembercount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHGSMEMBERCOUNT(String value) {
        this.shgsmembercount = value;
    }

    /**
     * Gets the value of the suuserid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUUSERID() {
        return suuserid;
    }

    /**
     * Sets the value of the suuserid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUUSERID(String value) {
        this.suuserid = value;
    }

    /**
     * Gets the value of the suspaceguid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUSPACEGUID() {
        return suspaceguid;
    }

    /**
     * Sets the value of the suspaceguid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUSPACEGUID(String value) {
        this.suspaceguid = value;
    }

    /**
     * Gets the value of the suspacerole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUSPACEROLE() {
        return suspacerole;
    }

    /**
     * Sets the value of the suspacerole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUSPACEROLE(String value) {
        this.suspacerole = value;
    }

    /**
     * Gets the value of the supermissionaction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUPERMISSIONACTION() {
        return supermissionaction;
    }

    /**
     * Sets the value of the supermissionaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUPERMISSIONACTION(String value) {
        this.supermissionaction = value;
    }

}
