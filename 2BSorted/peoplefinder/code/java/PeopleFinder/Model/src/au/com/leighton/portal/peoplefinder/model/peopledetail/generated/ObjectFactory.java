
package au.com.leighton.portal.peoplefinder.model.peopledetail.generated;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.com.leighton.portal.peoplefinder.model.peopledetail.generated package. 
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

    private final static QName _ProcessResponse_QNAME = new QName("http://xmlns.oracle.com/Portal/PhoGetPersonDetail/PhoGetPersonDetail", "processResponse");
    private final static QName _ProcessIPersonId_QNAME = new QName("http://xmlns.oracle.com/Portal/PhoGetPersonDetail/PhoGetPersonDetail", "i_person_id");
    private final static QName _ProcessIUsername_QNAME = new QName("http://xmlns.oracle.com/Portal/PhoGetPersonDetail/PhoGetPersonDetail", "i_username");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.com.leighton.portal.peoplefinder.model.peopledetail.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Parameters }
     * 
     */
    public Parameters createParameters() {
        return new Parameters();
    }

    /**
     * Create an instance of {@link Process }
     * 
     */
    public Process createProcess() {
        return new Process();
    }

    /**
     * Create an instance of {@link PhoGetPersonDetailCollection }
     * 
     */
    public PhoGetPersonDetailCollection createPhoGetPersonDetailCollection() {
        return new PhoGetPersonDetailCollection();
    }

    /**
     * Create an instance of {@link Experience }
     * 
     */
    public Experience createExperience() {
        return new Experience();
    }

    /**
     * Create an instance of {@link WCconnections }
     * 
     */
    public WCconnections createWCconnections() {
        return new WCconnections();
    }

    /**
     * Create an instance of {@link ReportLine }
     * 
     */
    public ReportLine createReportLine() {
        return new ReportLine();
    }

    /**
     * Create an instance of {@link Spaces }
     * 
     */
    public Spaces createSpaces() {
        return new Spaces();
    }

    /**
     * Create an instance of {@link PhoGetPersonDetailOutput }
     * 
     */
    public PhoGetPersonDetailOutput createPhoGetPersonDetailOutput() {
        return new PhoGetPersonDetailOutput();
    }

    /**
     * Create an instance of {@link Parameters.Item }
     * 
     */
    public Parameters.Item createParametersItem() {
        return new Parameters.Item();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoGetPersonDetailCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Portal/PhoGetPersonDetail/PhoGetPersonDetail", name = "processResponse")
    public JAXBElement<PhoGetPersonDetailCollection> createProcessResponse(PhoGetPersonDetailCollection value) {
        return new JAXBElement<PhoGetPersonDetailCollection>(_ProcessResponse_QNAME, PhoGetPersonDetailCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Portal/PhoGetPersonDetail/PhoGetPersonDetail", name = "i_person_id", scope = Process.class)
    public JAXBElement<BigDecimal> createProcessIPersonId(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProcessIPersonId_QNAME, BigDecimal.class, Process.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Portal/PhoGetPersonDetail/PhoGetPersonDetail", name = "i_username", scope = Process.class)
    public JAXBElement<String> createProcessIUsername(String value) {
        return new JAXBElement<String>(_ProcessIUsername_QNAME, String.class, Process.class, value);
    }

}
