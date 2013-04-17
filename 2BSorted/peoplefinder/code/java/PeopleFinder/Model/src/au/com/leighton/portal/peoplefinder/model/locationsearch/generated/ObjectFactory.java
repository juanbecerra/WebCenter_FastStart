
package au.com.leighton.portal.peoplefinder.model.locationsearch.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.com.leighton.portal.peoplefinder.model.locationsearch.generated package. 
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

    private final static QName _ProcessResponse_QNAME = new QName("http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", "processResponse");
    private final static QName _PhoLocationCompanyName_QNAME = new QName("http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", "companyName");
    private final static QName _PhoLocationPublishedPh_QNAME = new QName("http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", "publishedPh");
    private final static QName _PhoLocationFaxNo_QNAME = new QName("http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", "faxNo");
    private final static QName _PhoLocationCompanyId_QNAME = new QName("http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", "companyId");
    private final static QName _PhoLocationName_QNAME = new QName("http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", "name");
    private final static QName _ProcessICompany_QNAME = new QName("http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", "i_company");
    private final static QName _ProcessIPhone_QNAME = new QName("http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", "i_phone");
    private final static QName _ProcessIVpn_QNAME = new QName("http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", "i_vpn");
    private final static QName _ProcessINotes_QNAME = new QName("http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", "i_notes");
    private final static QName _ProcessILocn_QNAME = new QName("http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", "i_locn");
    private final static QName _ProcessISuburb_QNAME = new QName("http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", "i_suburb");
    private final static QName _ProcessSimpleSearch_QNAME = new QName("http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", "SimpleSearch");
    private final static QName _ProcessIState_QNAME = new QName("http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", "i_state");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.com.leighton.portal.peoplefinder.model.locationsearch.generated
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
     * Create an instance of {@link PhoSearchResultOutputCollection }
     * 
     */
    public PhoSearchResultOutputCollection createPhoSearchResultOutputCollection() {
        return new PhoSearchResultOutputCollection();
    }

    /**
     * Create an instance of {@link PhoLocation }
     * 
     */
    public PhoLocation createPhoLocation() {
        return new PhoLocation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoSearchResultOutputCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", name = "processResponse")
    public JAXBElement<PhoSearchResultOutputCollection> createProcessResponse(PhoSearchResultOutputCollection value) {
        return new JAXBElement<PhoSearchResultOutputCollection>(_ProcessResponse_QNAME, PhoSearchResultOutputCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", name = "companyName", scope = PhoLocation.class)
    public JAXBElement<String> createPhoLocationCompanyName(String value) {
        return new JAXBElement<String>(_PhoLocationCompanyName_QNAME, String.class, PhoLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", name = "publishedPh", scope = PhoLocation.class)
    public JAXBElement<String> createPhoLocationPublishedPh(String value) {
        return new JAXBElement<String>(_PhoLocationPublishedPh_QNAME, String.class, PhoLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", name = "faxNo", scope = PhoLocation.class)
    public JAXBElement<String> createPhoLocationFaxNo(String value) {
        return new JAXBElement<String>(_PhoLocationFaxNo_QNAME, String.class, PhoLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", name = "companyId", scope = PhoLocation.class)
    public JAXBElement<String> createPhoLocationCompanyId(String value) {
        return new JAXBElement<String>(_PhoLocationCompanyId_QNAME, String.class, PhoLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", name = "name", scope = PhoLocation.class)
    public JAXBElement<String> createPhoLocationName(String value) {
        return new JAXBElement<String>(_PhoLocationName_QNAME, String.class, PhoLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", name = "i_company", scope = Process.class)
    public JAXBElement<String> createProcessICompany(String value) {
        return new JAXBElement<String>(_ProcessICompany_QNAME, String.class, Process.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", name = "i_phone", scope = Process.class)
    public JAXBElement<String> createProcessIPhone(String value) {
        return new JAXBElement<String>(_ProcessIPhone_QNAME, String.class, Process.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", name = "i_vpn", scope = Process.class)
    public JAXBElement<String> createProcessIVpn(String value) {
        return new JAXBElement<String>(_ProcessIVpn_QNAME, String.class, Process.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", name = "i_notes", scope = Process.class)
    public JAXBElement<String> createProcessINotes(String value) {
        return new JAXBElement<String>(_ProcessINotes_QNAME, String.class, Process.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", name = "i_locn", scope = Process.class)
    public JAXBElement<String> createProcessILocn(String value) {
        return new JAXBElement<String>(_ProcessILocn_QNAME, String.class, Process.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", name = "i_suburb", scope = Process.class)
    public JAXBElement<String> createProcessISuburb(String value) {
        return new JAXBElement<String>(_ProcessISuburb_QNAME, String.class, Process.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", name = "SimpleSearch", scope = Process.class)
    public JAXBElement<String> createProcessSimpleSearch(String value) {
        return new JAXBElement<String>(_ProcessSimpleSearch_QNAME, String.class, Process.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Portal/PhoSearchLocations/PhoSearchLocations", name = "i_state", scope = Process.class)
    public JAXBElement<String> createProcessIState(String value) {
        return new JAXBElement<String>(_ProcessIState_QNAME, String.class, Process.class, value);
    }

}
