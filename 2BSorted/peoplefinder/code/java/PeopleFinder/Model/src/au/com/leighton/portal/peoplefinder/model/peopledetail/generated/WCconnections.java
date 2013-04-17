
package au.com.leighton.portal.peoplefinder.model.peopledetail.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WCconnections complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WCconnections">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CS_USERNAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CS_CONNECTION_USERNAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CS_CONNECTION_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CS_CONNECTION_DISPLAY_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CS_CONNECTION_EMAIL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CS_CREATION_DATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PP_IMAGE" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WCconnections", propOrder = {
    "csusername",
    "csconnectionusername",
    "csconnectionid",
    "csconnectiondisplayname",
    "csconnectionemail",
    "cscreationdate",
    "ppimage"
})
public class WCconnections {

    @XmlElement(name = "CS_USERNAME", required = true, nillable = true)
    protected String csusername;
    @XmlElement(name = "CS_CONNECTION_USERNAME", required = true, nillable = true)
    protected String csconnectionusername;
    @XmlElement(name = "CS_CONNECTION_ID", required = true, nillable = true)
    protected String csconnectionid;
    @XmlElement(name = "CS_CONNECTION_DISPLAY_NAME", required = true, nillable = true)
    protected String csconnectiondisplayname;
    @XmlElement(name = "CS_CONNECTION_EMAIL", required = true, nillable = true)
    protected String csconnectionemail;
    @XmlElement(name = "CS_CREATION_DATE", required = true, nillable = true)
    protected String cscreationdate;
    @XmlElement(name = "PP_IMAGE", required = true, nillable = true)
    protected byte[] ppimage;

    /**
     * Gets the value of the csusername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSUSERNAME() {
        return csusername;
    }

    /**
     * Sets the value of the csusername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSUSERNAME(String value) {
        this.csusername = value;
    }

    /**
     * Gets the value of the csconnectionusername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSCONNECTIONUSERNAME() {
        return csconnectionusername;
    }

    /**
     * Sets the value of the csconnectionusername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSCONNECTIONUSERNAME(String value) {
        this.csconnectionusername = value;
    }

    /**
     * Gets the value of the csconnectionid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSCONNECTIONID() {
        return csconnectionid;
    }

    /**
     * Sets the value of the csconnectionid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSCONNECTIONID(String value) {
        this.csconnectionid = value;
    }

    /**
     * Gets the value of the csconnectiondisplayname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSCONNECTIONDISPLAYNAME() {
        return csconnectiondisplayname;
    }

    /**
     * Sets the value of the csconnectiondisplayname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSCONNECTIONDISPLAYNAME(String value) {
        this.csconnectiondisplayname = value;
    }

    /**
     * Gets the value of the csconnectionemail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSCONNECTIONEMAIL() {
        return csconnectionemail;
    }

    /**
     * Sets the value of the csconnectionemail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSCONNECTIONEMAIL(String value) {
        this.csconnectionemail = value;
    }

    /**
     * Gets the value of the cscreationdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSCREATIONDATE() {
        return cscreationdate;
    }

    /**
     * Sets the value of the cscreationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSCREATIONDATE(String value) {
        this.cscreationdate = value;
    }

    /**
     * Gets the value of the ppimage property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPPIMAGE() {
        return ppimage;
    }

    /**
     * Sets the value of the ppimage property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPPIMAGE(byte[] value) {
        this.ppimage = ((byte[]) value);
    }

}
