
package au.com.leicon.socialmedia.services.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.com.leicon.socialmedia.services.types package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ItemTypeImg_QNAME = new QName("http://xmlns.oracle.com/PortalApplication/SocialMediaComposite/SocialMediaComposite", "img");
    private final static QName _ItemTypeCommentsCount_QNAME = new QName("http://xmlns.oracle.com/PortalApplication/SocialMediaComposite/SocialMediaComposite", "commentsCount");
    private final static QName _ItemTypeFromName_QNAME = new QName("http://xmlns.oracle.com/PortalApplication/SocialMediaComposite/SocialMediaComposite", "fromName");
    private final static QName _ItemTypeMessage_QNAME = new QName("http://xmlns.oracle.com/PortalApplication/SocialMediaComposite/SocialMediaComposite", "message");
    private final static QName _ItemTypeFromId_QNAME = new QName("http://xmlns.oracle.com/PortalApplication/SocialMediaComposite/SocialMediaComposite", "fromId");
    private final static QName _ItemTypeTitle_QNAME = new QName("http://xmlns.oracle.com/PortalApplication/SocialMediaComposite/SocialMediaComposite", "title");
    private final static QName _ItemTypeLikeCount_QNAME = new QName("http://xmlns.oracle.com/PortalApplication/SocialMediaComposite/SocialMediaComposite", "likeCount");
    private final static QName _ItemTypeCreatedTime_QNAME = new QName("http://xmlns.oracle.com/PortalApplication/SocialMediaComposite/SocialMediaComposite", "createdTime");
    private final static QName _ItemTypeLink_QNAME = new QName("http://xmlns.oracle.com/PortalApplication/SocialMediaComposite/SocialMediaComposite", "link");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.com.leicon.socialmedia.services.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Process }
     * 
     */
    public Process createProcess() {
        return new Process();
    }

    /**
     * Create an instance of {@link ProcessResponse }
     * 
     */
    public ProcessResponse createProcessResponse() {
        return new ProcessResponse();
    }

    /**
     * Create an instance of {@link DataType }
     * 
     */
    public DataType createDataType() {
        return new DataType();
    }

    /**
     * Create an instance of {@link ItemType }
     * 
     */
    public ItemType createItemType() {
        return new ItemType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/PortalApplication/SocialMediaComposite/SocialMediaComposite", name = "img", scope = ItemType.class)
    public JAXBElement<String> createItemTypeImg(String value) {
        return new JAXBElement<String>(_ItemTypeImg_QNAME, String.class, ItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/PortalApplication/SocialMediaComposite/SocialMediaComposite", name = "commentsCount", scope = ItemType.class)
    public JAXBElement<Long> createItemTypeCommentsCount(Long value) {
        return new JAXBElement<Long>(_ItemTypeCommentsCount_QNAME, Long.class, ItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/PortalApplication/SocialMediaComposite/SocialMediaComposite", name = "fromName", scope = ItemType.class)
    public JAXBElement<String> createItemTypeFromName(String value) {
        return new JAXBElement<String>(_ItemTypeFromName_QNAME, String.class, ItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/PortalApplication/SocialMediaComposite/SocialMediaComposite", name = "message", scope = ItemType.class)
    public JAXBElement<String> createItemTypeMessage(String value) {
        return new JAXBElement<String>(_ItemTypeMessage_QNAME, String.class, ItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/PortalApplication/SocialMediaComposite/SocialMediaComposite", name = "fromId", scope = ItemType.class)
    public JAXBElement<String> createItemTypeFromId(String value) {
        return new JAXBElement<String>(_ItemTypeFromId_QNAME, String.class, ItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/PortalApplication/SocialMediaComposite/SocialMediaComposite", name = "title", scope = ItemType.class)
    public JAXBElement<String> createItemTypeTitle(String value) {
        return new JAXBElement<String>(_ItemTypeTitle_QNAME, String.class, ItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/PortalApplication/SocialMediaComposite/SocialMediaComposite", name = "likeCount", scope = ItemType.class)
    public JAXBElement<Long> createItemTypeLikeCount(Long value) {
        return new JAXBElement<Long>(_ItemTypeLikeCount_QNAME, Long.class, ItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/PortalApplication/SocialMediaComposite/SocialMediaComposite", name = "createdTime", scope = ItemType.class)
    public JAXBElement<XMLGregorianCalendar> createItemTypeCreatedTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ItemTypeCreatedTime_QNAME, XMLGregorianCalendar.class, ItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/PortalApplication/SocialMediaComposite/SocialMediaComposite", name = "link", scope = ItemType.class)
    public JAXBElement<String> createItemTypeLink(String value) {
        return new JAXBElement<String>(_ItemTypeLink_QNAME, String.class, ItemType.class, value);
    }

}
