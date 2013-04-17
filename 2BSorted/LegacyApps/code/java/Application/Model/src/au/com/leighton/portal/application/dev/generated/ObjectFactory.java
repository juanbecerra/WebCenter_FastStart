
package au.com.leighton.portal.application.dev.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.com.leighton.portal.application.dev.generated package. 
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

    private final static QName _DbGetAppsListInput_QNAME = new QName("http://xmlns.leicon.com.au/GetAppsList", "dbGetAppsListInput");
    private final static QName _DbGetAppsListOutputCollection_QNAME = new QName("http://xmlns.leicon.com.au/GetAppsList", "dbGetAppsListOutputCollection");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.com.leighton.portal.application.dev.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DbGetAppsListOutputCollection }
     * 
     */
    public DbGetAppsListOutputCollection createDbGetAppsListOutputCollection() {
        return new DbGetAppsListOutputCollection();
    }

    /**
     * Create an instance of {@link DbGetAppsListInput }
     * 
     */
    public DbGetAppsListInput createDbGetAppsListInput() {
        return new DbGetAppsListInput();
    }

    /**
     * Create an instance of {@link DbGetAppsListOutput }
     * 
     */
    public DbGetAppsListOutput createDbGetAppsListOutput() {
        return new DbGetAppsListOutput();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DbGetAppsListInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.leicon.com.au/GetAppsList", name = "dbGetAppsListInput")
    public JAXBElement<DbGetAppsListInput> createDbGetAppsListInput(DbGetAppsListInput value) {
        return new JAXBElement<DbGetAppsListInput>(_DbGetAppsListInput_QNAME, DbGetAppsListInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DbGetAppsListOutputCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.leicon.com.au/GetAppsList", name = "dbGetAppsListOutputCollection")
    public JAXBElement<DbGetAppsListOutputCollection> createDbGetAppsListOutputCollection(DbGetAppsListOutputCollection value) {
        return new JAXBElement<DbGetAppsListOutputCollection>(_DbGetAppsListOutputCollection_QNAME, DbGetAppsListOutputCollection.class, null, value);
    }

}
