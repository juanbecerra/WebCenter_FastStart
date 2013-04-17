
package au.com.leighton.portal.peoplefinder.model.locationdetail.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhoGetLocationDetailCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhoGetLocationDetailCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RESULT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PhoLocation" type="{http://xmlns.oracle.com/Portal/PhoGetLocationDetail/PhoGetLocationDetail}PhoGetLocationDetailOutput" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoGetLocationDetailCollection", propOrder = {
    "result",
    "phoLocation"
})
public class PhoGetLocationDetailCollection {

    @XmlElement(name = "RESULT", required = true, nillable = true)
    protected String result;
    @XmlElement(name = "PhoLocation")
    protected List<PhoGetLocationDetailOutput> phoLocation;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESULT() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESULT(String value) {
        this.result = value;
    }

    /**
     * Gets the value of the phoLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoGetLocationDetailOutput }
     * 
     * 
     */
    public List<PhoGetLocationDetailOutput> getPhoLocation() {
        if (phoLocation == null) {
            phoLocation = new ArrayList<PhoGetLocationDetailOutput>();
        }
        return this.phoLocation;
    }

}
