
package au.com.leighton.portal.application.prod.generated;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dbGetAppsListOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dbGetAppsListOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="grp_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="grp_title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="grp_rss" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="grp_channel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="grp_order" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="grp_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PORTLET_SRC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PORTLET_HEIGHT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PORTLET_SCROLLING" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PORTLET_BORDER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="APPLIC_GROUP_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PREFIX_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="app_order" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="WHATS_NEW_FLAG" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="whats_new_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="WHATS_NEW_DAYS" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="AVAILABLE_FLAG" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="app_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="APPLIC_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inst_title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="APPLIC_INST_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="icon" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dbGetAppsListOutput", propOrder = {
    "grpId",
    "grpTitle",
    "grpRss",
    "grpChannel",
    "grpOrder",
    "grpType",
    "portletsrc",
    "portletheight",
    "portletscrolling",
    "portletborder",
    "applicgroupid",
    "prefixid",
    "appOrder",
    "whatsnewflag",
    "whatsNewDate",
    "whatsnewdays",
    "availableflag",
    "appId",
    "applicid",
    "instTitle",
    "url",
    "applicinstid",
    "icon"
})
public class DbGetAppsListOutput {

    @XmlElement(name = "grp_id", required = true, nillable = true)
    protected String grpId;
    @XmlElement(name = "grp_title", required = true, nillable = true)
    protected String grpTitle;
    @XmlElement(name = "grp_rss", required = true, nillable = true)
    protected String grpRss;
    @XmlElement(name = "grp_channel", required = true, nillable = true)
    protected String grpChannel;
    @XmlElement(name = "grp_order", required = true, nillable = true)
    protected BigDecimal grpOrder;
    @XmlElement(name = "grp_type", required = true, nillable = true)
    protected String grpType;
    @XmlElement(name = "PORTLET_SRC", required = true, nillable = true)
    protected String portletsrc;
    @XmlElement(name = "PORTLET_HEIGHT", required = true, nillable = true)
    protected BigDecimal portletheight;
    @XmlElement(name = "PORTLET_SCROLLING", required = true, nillable = true)
    protected String portletscrolling;
    @XmlElement(name = "PORTLET_BORDER", required = true, nillable = true)
    protected String portletborder;
    @XmlElement(name = "APPLIC_GROUP_ID", required = true, nillable = true)
    protected String applicgroupid;
    @XmlElement(name = "PREFIX_ID", required = true, nillable = true)
    protected String prefixid;
    @XmlElement(name = "app_order", required = true, nillable = true)
    protected BigDecimal appOrder;
    @XmlElement(name = "WHATS_NEW_FLAG", required = true, nillable = true)
    protected String whatsnewflag;
    @XmlElement(name = "whats_new_date", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar whatsNewDate;
    @XmlElement(name = "WHATS_NEW_DAYS", required = true, nillable = true)
    protected BigDecimal whatsnewdays;
    @XmlElement(name = "AVAILABLE_FLAG", required = true, nillable = true)
    protected String availableflag;
    @XmlElement(name = "app_id", required = true, nillable = true)
    protected String appId;
    @XmlElement(name = "APPLIC_ID", required = true, nillable = true)
    protected String applicid;
    @XmlElement(name = "inst_title", required = true, nillable = true)
    protected String instTitle;
    @XmlElement(required = true, nillable = true)
    protected String url;
    @XmlElement(name = "APPLIC_INST_ID", required = true, nillable = true)
    protected String applicinstid;
    @XmlElement(required = true, nillable = true)
    protected String icon;

    /**
     * Gets the value of the grpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrpId() {
        return grpId;
    }

    /**
     * Sets the value of the grpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrpId(String value) {
        this.grpId = value;
    }

    /**
     * Gets the value of the grpTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrpTitle() {
        return grpTitle;
    }

    /**
     * Sets the value of the grpTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrpTitle(String value) {
        this.grpTitle = value;
    }

    /**
     * Gets the value of the grpRss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrpRss() {
        return grpRss;
    }

    /**
     * Sets the value of the grpRss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrpRss(String value) {
        this.grpRss = value;
    }

    /**
     * Gets the value of the grpChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrpChannel() {
        return grpChannel;
    }

    /**
     * Sets the value of the grpChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrpChannel(String value) {
        this.grpChannel = value;
    }

    /**
     * Gets the value of the grpOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrpOrder() {
        return grpOrder;
    }

    /**
     * Sets the value of the grpOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrpOrder(BigDecimal value) {
        this.grpOrder = value;
    }

    /**
     * Gets the value of the grpType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrpType() {
        return grpType;
    }

    /**
     * Sets the value of the grpType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrpType(String value) {
        this.grpType = value;
    }

    /**
     * Gets the value of the portletsrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPORTLETSRC() {
        return portletsrc;
    }

    /**
     * Sets the value of the portletsrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPORTLETSRC(String value) {
        this.portletsrc = value;
    }

    /**
     * Gets the value of the portletheight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPORTLETHEIGHT() {
        return portletheight;
    }

    /**
     * Sets the value of the portletheight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPORTLETHEIGHT(BigDecimal value) {
        this.portletheight = value;
    }

    /**
     * Gets the value of the portletscrolling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPORTLETSCROLLING() {
        return portletscrolling;
    }

    /**
     * Sets the value of the portletscrolling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPORTLETSCROLLING(String value) {
        this.portletscrolling = value;
    }

    /**
     * Gets the value of the portletborder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPORTLETBORDER() {
        return portletborder;
    }

    /**
     * Sets the value of the portletborder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPORTLETBORDER(String value) {
        this.portletborder = value;
    }

    /**
     * Gets the value of the applicgroupid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPLICGROUPID() {
        return applicgroupid;
    }

    /**
     * Sets the value of the applicgroupid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPLICGROUPID(String value) {
        this.applicgroupid = value;
    }

    /**
     * Gets the value of the prefixid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPREFIXID() {
        return prefixid;
    }

    /**
     * Sets the value of the prefixid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPREFIXID(String value) {
        this.prefixid = value;
    }

    /**
     * Gets the value of the appOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAppOrder() {
        return appOrder;
    }

    /**
     * Sets the value of the appOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAppOrder(BigDecimal value) {
        this.appOrder = value;
    }

    /**
     * Gets the value of the whatsnewflag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWHATSNEWFLAG() {
        return whatsnewflag;
    }

    /**
     * Sets the value of the whatsnewflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWHATSNEWFLAG(String value) {
        this.whatsnewflag = value;
    }

    /**
     * Gets the value of the whatsNewDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWhatsNewDate() {
        return whatsNewDate;
    }

    /**
     * Sets the value of the whatsNewDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWhatsNewDate(XMLGregorianCalendar value) {
        this.whatsNewDate = value;
    }

    /**
     * Gets the value of the whatsnewdays property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWHATSNEWDAYS() {
        return whatsnewdays;
    }

    /**
     * Sets the value of the whatsnewdays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWHATSNEWDAYS(BigDecimal value) {
        this.whatsnewdays = value;
    }

    /**
     * Gets the value of the availableflag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVAILABLEFLAG() {
        return availableflag;
    }

    /**
     * Sets the value of the availableflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVAILABLEFLAG(String value) {
        this.availableflag = value;
    }

    /**
     * Gets the value of the appId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppId() {
        return appId;
    }

    /**
     * Sets the value of the appId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppId(String value) {
        this.appId = value;
    }

    /**
     * Gets the value of the applicid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPLICID() {
        return applicid;
    }

    /**
     * Sets the value of the applicid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPLICID(String value) {
        this.applicid = value;
    }

    /**
     * Gets the value of the instTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstTitle() {
        return instTitle;
    }

    /**
     * Sets the value of the instTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstTitle(String value) {
        this.instTitle = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the applicinstid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPLICINSTID() {
        return applicinstid;
    }

    /**
     * Sets the value of the applicinstid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPLICINSTID(String value) {
        this.applicinstid = value;
    }

    /**
     * Gets the value of the icon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Sets the value of the icon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcon(String value) {
        this.icon = value;
    }

}
