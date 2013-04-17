
package au.com.leighton.portal.peoplefinder.model.peopledetail.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhoGetPersonDetailCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhoGetPersonDetailCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RESULT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PhoPerson" type="{http://xmlns.oracle.com/Portal/PhoGetPersonDetail/PhoGetPersonDetail}PhoGetPersonDetailOutput" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoGetPersonDetailCollection", propOrder = {
    "result",
    "phoPerson"
})
public class PhoGetPersonDetailCollection {

    @XmlElement(name = "RESULT", required = true, nillable = true)
    protected String result;
    @XmlElement(name = "PhoPerson")
    protected List<PhoGetPersonDetailOutput> phoPerson;

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
     * Gets the value of the phoPerson property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoPerson property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoGetPersonDetailOutput }
     * 
     * 
     */
    public List<PhoGetPersonDetailOutput> getPhoPerson() {
        if (phoPerson == null) {
            phoPerson = new ArrayList<PhoGetPersonDetailOutput>();
        }
        return this.phoPerson;
    }

}
