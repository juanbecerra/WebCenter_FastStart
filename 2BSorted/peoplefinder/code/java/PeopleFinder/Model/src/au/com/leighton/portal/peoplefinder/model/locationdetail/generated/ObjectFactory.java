
package au.com.leighton.portal.peoplefinder.model.locationdetail.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.com.leighton.portal.peoplefinder.model.locationdetail.generated package. 
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

    private final static QName _ProcessResponse_QNAME = new QName("http://xmlns.oracle.com/Portal/PhoGetLocationDetail/PhoGetLocationDetail", "processResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.com.leighton.portal.peoplefinder.model.locationdetail.generated
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
     * Create an instance of {@link PhoGetLocationDetailCollection }
     * 
     */
    public PhoGetLocationDetailCollection createPhoGetLocationDetailCollection() {
        return new PhoGetLocationDetailCollection();
    }

    /**
     * Create an instance of {@link PhoGetLocationDetailOutput }
     * 
     */
    public PhoGetLocationDetailOutput createPhoGetLocationDetailOutput() {
        return new PhoGetLocationDetailOutput();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoGetLocationDetailCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Portal/PhoGetLocationDetail/PhoGetLocationDetail", name = "processResponse")
    public JAXBElement<PhoGetLocationDetailCollection> createProcessResponse(PhoGetLocationDetailCollection value) {
        return new JAXBElement<PhoGetLocationDetailCollection>(_ProcessResponse_QNAME, PhoGetLocationDetailCollection.class, null, value);
    }

}
