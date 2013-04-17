
package au.com.leicon.socialmedia.services.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fromName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fromId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="img" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="link" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commentsCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="likeCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemType", propOrder = {
    "id",
    "fromName",
    "fromId",
    "title",
    "message",
    "createdTime",
    "img",
    "link",
    "commentsCount",
    "likeCount"
})
public class ItemType {

    @XmlElement(required = true, nillable = true)
    protected String id;
    @XmlElementRef(name = "fromName", namespace = "http://xmlns.oracle.com/PortalApplication/SocialMediaComposite/SocialMediaComposite", type = JAXBElement.class)
    protected JAXBElement<String> fromName;
    @XmlElementRef(name = "fromId", namespace = "http://xmlns.oracle.com/PortalApplication/SocialMediaComposite/SocialMediaComposite", type = JAXBElement.class)
    protected JAXBElement<String> fromId;
    @XmlElementRef(name = "title", namespace = "http://xmlns.oracle.com/PortalApplication/SocialMediaComposite/SocialMediaComposite", type = JAXBElement.class)
    protected JAXBElement<String> title;
    @XmlElementRef(name = "message", namespace = "http://xmlns.oracle.com/PortalApplication/SocialMediaComposite/SocialMediaComposite", type = JAXBElement.class)
    protected JAXBElement<String> message;
    @XmlElementRef(name = "createdTime", namespace = "http://xmlns.oracle.com/PortalApplication/SocialMediaComposite/SocialMediaComposite", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> createdTime;
    @XmlElementRef(name = "img", namespace = "http://xmlns.oracle.com/PortalApplication/SocialMediaComposite/SocialMediaComposite", type = JAXBElement.class)
    protected JAXBElement<String> img;
    @XmlElementRef(name = "link", namespace = "http://xmlns.oracle.com/PortalApplication/SocialMediaComposite/SocialMediaComposite", type = JAXBElement.class)
    protected JAXBElement<String> link;
    @XmlElementRef(name = "commentsCount", namespace = "http://xmlns.oracle.com/PortalApplication/SocialMediaComposite/SocialMediaComposite", type = JAXBElement.class)
    protected JAXBElement<Long> commentsCount;
    @XmlElementRef(name = "likeCount", namespace = "http://xmlns.oracle.com/PortalApplication/SocialMediaComposite/SocialMediaComposite", type = JAXBElement.class)
    protected JAXBElement<Long> likeCount;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the fromName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFromName() {
        return fromName;
    }

    /**
     * Sets the value of the fromName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFromName(JAXBElement<String> value) {
        this.fromName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fromId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFromId() {
        return fromId;
    }

    /**
     * Sets the value of the fromId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFromId(JAXBElement<String> value) {
        this.fromId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMessage(JAXBElement<String> value) {
        this.message = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the createdTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCreatedTime() {
        return createdTime;
    }

    /**
     * Sets the value of the createdTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCreatedTime(JAXBElement<XMLGregorianCalendar> value) {
        this.createdTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the img property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImg() {
        return img;
    }

    /**
     * Sets the value of the img property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImg(JAXBElement<String> value) {
        this.img = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLink(JAXBElement<String> value) {
        this.link = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the commentsCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCommentsCount() {
        return commentsCount;
    }

    /**
     * Sets the value of the commentsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCommentsCount(JAXBElement<Long> value) {
        this.commentsCount = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the likeCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLikeCount() {
        return likeCount;
    }

    /**
     * Sets the value of the likeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLikeCount(JAXBElement<Long> value) {
        this.likeCount = ((JAXBElement<Long> ) value);
    }

}
