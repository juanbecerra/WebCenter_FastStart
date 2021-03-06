
package au.com.leighton.portal.peoplefinder.model.locationsearch.generated;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhoSearchResultOutputCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhoSearchResultOutputCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NUMFOUND" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="RESULT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PhoLocation" type="{http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations}PhoLocation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoSearchResultOutputCollection", propOrder = {
    "numfound",
    "result",
    "phoLocation"
})
public class PhoSearchResultOutputCollection {

    @XmlElement(name = "NUMFOUND", required = true, nillable = true)
    protected BigDecimal numfound;
    @XmlElement(name = "RESULT", required = true, nillable = true)
    protected String result;
    @XmlElement(name = "PhoLocation")
    protected List<PhoLocation> phoLocation;

    /**
     * Gets the value of the numfound property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNUMFOUND() {
        return numfound;
    }

    /**
     * Sets the value of the numfound property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNUMFOUND(BigDecimal value) {
        this.numfound = value;
    }

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
     * {@link PhoLocation }
     * 
     * 
     */
    public List<PhoLocation> getPhoLocation() {
        if (phoLocation == null) {
            phoLocation = new ArrayList<PhoLocation>();
        }
        return this.phoLocation;
    }

}
