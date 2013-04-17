
package au.com.leicon.ess.service.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.com.leicon.ess.service.types package. 
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

    private final static QName _Data_QNAME = new QName("http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", "Data");
    private final static QName _ErrorTypeErrorCode_QNAME = new QName("http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", "error_code");
    private final static QName _ErrorTypeErrorMessage_QNAME = new QName("http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", "error_message");
    private final static QName _DataTypeLastPayslipDate_QNAME = new QName("http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", "last_payslip_date");
    private final static QName _DataTypeUserId_QNAME = new QName("http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", "user_id");
    private final static QName _DataTypeBaseUrl_QNAME = new QName("http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", "base_url");
    private final static QName _DataTypeStartDate_QNAME = new QName("http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", "start_date");
    private final static QName _DataTypeResponsibilityApplicationId_QNAME = new QName("http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", "responsibility_application_id");
    private final static QName _DataTypePayslipFunc_QNAME = new QName("http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", "payslip_func");
    private final static QName _DataTypeLeaveFunc_QNAME = new QName("http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", "leave_func");
    private final static QName _DataTypeEndDate_QNAME = new QName("http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", "end_date");
    private final static QName _DataTypeLeaveBalance_QNAME = new QName("http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", "leave_balance");
    private final static QName _DataTypeError_QNAME = new QName("http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", "error");
    private final static QName _DataTypeResponsibilityId_QNAME = new QName("http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", "responsibility_id");
    private final static QName _DataTypeSecurityGroupId_QNAME = new QName("http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", "security_group_id");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.com.leicon.ess.service.types
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
     * Create an instance of {@link DataType }
     * 
     */
    public DataType createDataType() {
        return new DataType();
    }

    /**
     * Create an instance of {@link ProcessResponse }
     * 
     */
    public ProcessResponse createProcessResponse() {
        return new ProcessResponse();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", name = "Data")
    public JAXBElement<DataType> createData(DataType value) {
        return new JAXBElement<DataType>(_Data_QNAME, DataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", name = "error_code", scope = ErrorType.class)
    public JAXBElement<String> createErrorTypeErrorCode(String value) {
        return new JAXBElement<String>(_ErrorTypeErrorCode_QNAME, String.class, ErrorType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", name = "error_message", scope = ErrorType.class)
    public JAXBElement<String> createErrorTypeErrorMessage(String value) {
        return new JAXBElement<String>(_ErrorTypeErrorMessage_QNAME, String.class, ErrorType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", name = "last_payslip_date", scope = DataType.class)
    public JAXBElement<String> createDataTypeLastPayslipDate(String value) {
        return new JAXBElement<String>(_DataTypeLastPayslipDate_QNAME, String.class, DataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", name = "user_id", scope = DataType.class)
    public JAXBElement<String> createDataTypeUserId(String value) {
        return new JAXBElement<String>(_DataTypeUserId_QNAME, String.class, DataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", name = "base_url", scope = DataType.class)
    public JAXBElement<String> createDataTypeBaseUrl(String value) {
        return new JAXBElement<String>(_DataTypeBaseUrl_QNAME, String.class, DataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", name = "start_date", scope = DataType.class)
    public JAXBElement<XMLGregorianCalendar> createDataTypeStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataTypeStartDate_QNAME, XMLGregorianCalendar.class, DataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", name = "responsibility_application_id", scope = DataType.class)
    public JAXBElement<String> createDataTypeResponsibilityApplicationId(String value) {
        return new JAXBElement<String>(_DataTypeResponsibilityApplicationId_QNAME, String.class, DataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", name = "payslip_func", scope = DataType.class)
    public JAXBElement<String> createDataTypePayslipFunc(String value) {
        return new JAXBElement<String>(_DataTypePayslipFunc_QNAME, String.class, DataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", name = "leave_func", scope = DataType.class)
    public JAXBElement<String> createDataTypeLeaveFunc(String value) {
        return new JAXBElement<String>(_DataTypeLeaveFunc_QNAME, String.class, DataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", name = "end_date", scope = DataType.class)
    public JAXBElement<XMLGregorianCalendar> createDataTypeEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataTypeEndDate_QNAME, XMLGregorianCalendar.class, DataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", name = "leave_balance", scope = DataType.class)
    public JAXBElement<String> createDataTypeLeaveBalance(String value) {
        return new JAXBElement<String>(_DataTypeLeaveBalance_QNAME, String.class, DataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", name = "error", scope = DataType.class)
    public JAXBElement<ErrorType> createDataTypeError(ErrorType value) {
        return new JAXBElement<ErrorType>(_DataTypeError_QNAME, ErrorType.class, DataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", name = "responsibility_id", scope = DataType.class)
    public JAXBElement<String> createDataTypeResponsibilityId(String value) {
        return new JAXBElement<String>(_DataTypeResponsibilityId_QNAME, String.class, DataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", name = "security_group_id", scope = DataType.class)
    public JAXBElement<String> createDataTypeSecurityGroupId(String value) {
        return new JAXBElement<String>(_DataTypeSecurityGroupId_QNAME, String.class, DataType.class, value);
    }

}
