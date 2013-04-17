
package au.com.leighton.portal.application.prod.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dbGetAppsListInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dbGetAppsListInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="i_home" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="i_user" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dbGetAppsListInput", propOrder = {
    "iHome",
    "iUser"
})
public class DbGetAppsListInput {

    @XmlElement(name = "i_home", required = true, nillable = true)
    protected String iHome;
    @XmlElement(name = "i_user", required = true, nillable = true)
    protected String iUser;

    /**
     * Gets the value of the iHome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIHome() {
        return iHome;
    }

    /**
     * Sets the value of the iHome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIHome(String value) {
        this.iHome = value;
    }

    /**
     * Gets the value of the iUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIUser() {
        return iUser;
    }

    /**
     * Sets the value of the iUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIUser(String value) {
        this.iUser = value;
    }

}
