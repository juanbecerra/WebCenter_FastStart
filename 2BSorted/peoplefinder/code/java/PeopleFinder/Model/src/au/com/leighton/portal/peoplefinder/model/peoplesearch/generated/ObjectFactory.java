
package au.com.leighton.portal.peoplefinder.model.peoplesearch.generated;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.com.leighton.portal.peoplefinder.model.peoplesearch.generated package. 
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

    private final static QName _ProcessResponse_QNAME = new QName("http://xmlns.oracle.com/Portal/PhoSearchPeople/PhoSearchPeople", "processResponse");
    private final static QName _ProcessPhone_QNAME = new QName("http://xmlns.oracle.com/Portal/PhoSearchPeople/PhoSearchPeople", "Phone");
    private final static QName _ProcessSimpleSearch_QNAME = new QName("http://xmlns.oracle.com/Portal/PhoSearchPeople/PhoSearchPeople", "SimpleSearch");
    private final static QName _ProcessBusUnit_QNAME = new QName("http://xmlns.oracle.com/Portal/PhoSearchPeople/PhoSearchPeople", "BusUnit");
    private final static QName _ProcessDept_QNAME = new QName("http://xmlns.oracle.com/Portal/PhoSearchPeople/PhoSearchPeople", "Dept");
    private final static QName _ProcessLocationID_QNAME = new QName("http://xmlns.oracle.com/Portal/PhoSearchPeople/PhoSearchPeople", "LocationID");
    private final static QName _ProcessDivision_QNAME = new QName("http://xmlns.oracle.com/Portal/PhoSearchPeople/PhoSearchPeople", "Division");
    private final static QName _ProcessSurname_QNAME = new QName("http://xmlns.oracle.com/Portal/PhoSearchPeople/PhoSearchPeople", "Surname");
    private final static QName _ProcessMobile_QNAME = new QName("http://xmlns.oracle.com/Portal/PhoSearchPeople/PhoSearchPeople", "Mobile");
    private final static QName _ProcessExpertise_QNAME = new QName("http://xmlns.oracle.com/Portal/PhoSearchPeople/PhoSearchPeople", "Expertise");
    private final static QName _ProcessLocation_QNAME = new QName("http://xmlns.oracle.com/Portal/PhoSearchPeople/PhoSearchPeople", "Location");
    private final static QName _ProcessFirstName_QNAME = new QName("http://xmlns.oracle.com/Portal/PhoSearchPeople/PhoSearchPeople", "FirstName");
    private final static QName _ProcessTitle_QNAME = new QName("http://xmlns.oracle.com/Portal/PhoSearchPeople/PhoSearchPeople", "Title");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.com.leighton.portal.peoplefinder.model.peoplesearch.generated
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
     * Create an instance of {@link PhoSearchOutput }
     * 
     */
    public PhoSearchOutput createPhoSearchOutput() {
        return new PhoSearchOutput();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoSearchResultOutputCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Portal/PhoSearchPeople/PhoSearchPeople", name = "processResponse")
    public JAXBElement<PhoSearchResultOutputCollection> createProcessResponse(PhoSearchResultOutputCollection value) {
        return new JAXBElement<PhoSearchResultOutputCollection>(_ProcessResponse_QNAME, PhoSearchResultOutputCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Portal/PhoSearchPeople/PhoSearchPeople", name = "Phone", scope = Process.class)
    public JAXBElement<String> createProcessPhone(String value) {
        return new JAXBElement<String>(_ProcessPhone_QNAME, String.class, Process.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Portal/PhoSearchPeople/PhoSearchPeople", name = "SimpleSearch", scope = Process.class)
    public JAXBElement<String> createProcessSimpleSearch(String value) {
        return new JAXBElement<String>(_ProcessSimpleSearch_QNAME, String.class, Process.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Portal/PhoSearchPeople/PhoSearchPeople", name = "BusUnit", scope = Process.class)
    public JAXBElement<String> createProcessBusUnit(String value) {
        return new JAXBElement<String>(_ProcessBusUnit_QNAME, String.class, Process.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Portal/PhoSearchPeople/PhoSearchPeople", name = "Dept", scope = Process.class)
    public JAXBElement<String> createProcessDept(String value) {
        return new JAXBElement<String>(_ProcessDept_QNAME, String.class, Process.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Portal/PhoSearchPeople/PhoSearchPeople", name = "LocationID", scope = Process.class)
    public JAXBElement<BigDecimal> createProcessLocationID(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProcessLocationID_QNAME, BigDecimal.class, Process.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Portal/PhoSearchPeople/PhoSearchPeople", name = "Division", scope = Process.class)
    public JAXBElement<String> createProcessDivision(String value) {
        return new JAXBElement<String>(_ProcessDivision_QNAME, String.class, Process.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Portal/PhoSearchPeople/PhoSearchPeople", name = "Surname", scope = Process.class)
    public JAXBElement<String> createProcessSurname(String value) {
        return new JAXBElement<String>(_ProcessSurname_QNAME, String.class, Process.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Portal/PhoSearchPeople/PhoSearchPeople", name = "Mobile", scope = Process.class)
    public JAXBElement<String> createProcessMobile(String value) {
        return new JAXBElement<String>(_ProcessMobile_QNAME, String.class, Process.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Portal/PhoSearchPeople/PhoSearchPeople", name = "Expertise", scope = Process.class)
    public JAXBElement<String> createProcessExpertise(String value) {
        return new JAXBElement<String>(_ProcessExpertise_QNAME, String.class, Process.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Portal/PhoSearchPeople/PhoSearchPeople", name = "Location", scope = Process.class)
    public JAXBElement<String> createProcessLocation(String value) {
        return new JAXBElement<String>(_ProcessLocation_QNAME, String.class, Process.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Portal/PhoSearchPeople/PhoSearchPeople", name = "FirstName", scope = Process.class)
    public JAXBElement<String> createProcessFirstName(String value) {
        return new JAXBElement<String>(_ProcessFirstName_QNAME, String.class, Process.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Portal/PhoSearchPeople/PhoSearchPeople", name = "Title", scope = Process.class)
    public JAXBElement<String> createProcessTitle(String value) {
        return new JAXBElement<String>(_ProcessTitle_QNAME, String.class, Process.class, value);
    }

}
