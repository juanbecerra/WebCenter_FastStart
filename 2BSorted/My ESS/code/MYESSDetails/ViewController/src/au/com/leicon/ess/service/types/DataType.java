
package au.com.leicon.ess.service.types;

import java.io.Serializable;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responsibility_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responsibility_application_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="security_group_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="start_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="end_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="leave_balance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="last_payslip_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="base_url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="leave_func" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payslip_func" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="error" type="{http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails}ErrorType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataType", propOrder = {
    "userId",
    "responsibilityId",
    "responsibilityApplicationId",
    "securityGroupId",
    "startDate",
    "endDate",
    "leaveBalance",
    "lastPayslipDate",
    "baseUrl",
    "leaveFunc",
    "payslipFunc",
    "error"
})
public class DataType implements Serializable {

    private static final long serialVersionUID = 1L;
    @XmlElementRef(name = "user_id", namespace = "http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", type = JAXBElement.class)
    protected JAXBElement<String> userId;
    @XmlElementRef(name = "responsibility_id", namespace = "http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", type = JAXBElement.class)
    protected JAXBElement<String> responsibilityId;
    @XmlElementRef(name = "responsibility_application_id", namespace = "http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", type = JAXBElement.class)
    protected JAXBElement<String> responsibilityApplicationId;
    @XmlElementRef(name = "security_group_id", namespace = "http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", type = JAXBElement.class)
    protected JAXBElement<String> securityGroupId;
    @XmlElementRef(name = "start_date", namespace = "http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> startDate;
    @XmlElementRef(name = "end_date", namespace = "http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> endDate;
    @XmlElementRef(name = "leave_balance", namespace = "http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", type = JAXBElement.class)
    protected JAXBElement<String> leaveBalance;
    @XmlElementRef(name = "last_payslip_date", namespace = "http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", type = JAXBElement.class)
    protected JAXBElement<String> lastPayslipDate;
    @XmlElementRef(name = "base_url", namespace = "http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", type = JAXBElement.class)
    protected JAXBElement<String> baseUrl;
    @XmlElementRef(name = "leave_func", namespace = "http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", type = JAXBElement.class)
    protected JAXBElement<String> leaveFunc;
    @XmlElementRef(name = "payslip_func", namespace = "http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", type = JAXBElement.class)
    protected JAXBElement<String> payslipFunc;
    @XmlElementRef(name = "error", namespace = "http://xmlns.oracle.com/PortalApplication/ESSDetailsComposite/MyESSDetails", type = JAXBElement.class)
    protected JAXBElement<ErrorType> error;

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserId(JAXBElement<String> value) {
        this.userId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the responsibilityId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResponsibilityId() {
        return responsibilityId;
    }

    /**
     * Sets the value of the responsibilityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResponsibilityId(JAXBElement<String> value) {
        this.responsibilityId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the responsibilityApplicationId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResponsibilityApplicationId() {
        return responsibilityApplicationId;
    }

    /**
     * Sets the value of the responsibilityApplicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResponsibilityApplicationId(JAXBElement<String> value) {
        this.responsibilityApplicationId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the securityGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecurityGroupId() {
        return securityGroupId;
    }

    /**
     * Sets the value of the securityGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecurityGroupId(JAXBElement<String> value) {
        this.securityGroupId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.startDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.endDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the leaveBalance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLeaveBalance() {
        return leaveBalance;
    }

    /**
     * Sets the value of the leaveBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLeaveBalance(JAXBElement<String> value) {
        this.leaveBalance = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lastPayslipDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastPayslipDate() {
        return lastPayslipDate;
    }

    /**
     * Sets the value of the lastPayslipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastPayslipDate(JAXBElement<String> value) {
        this.lastPayslipDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the baseUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBaseUrl() {
        return baseUrl;
    }

    /**
     * Sets the value of the baseUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBaseUrl(JAXBElement<String> value) {
        this.baseUrl = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the leaveFunc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLeaveFunc() {
        return leaveFunc;
    }

    /**
     * Sets the value of the leaveFunc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLeaveFunc(JAXBElement<String> value) {
        this.leaveFunc = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the payslipFunc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayslipFunc() {
        return payslipFunc;
    }

    /**
     * Sets the value of the payslipFunc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayslipFunc(JAXBElement<String> value) {
        this.payslipFunc = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ErrorType }{@code >}
     *     
     */
    public JAXBElement<ErrorType> getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ErrorType }{@code >}
     *     
     */
    public void setError(JAXBElement<ErrorType> value) {
        this.error = ((JAXBElement<ErrorType> ) value);
    }

}
