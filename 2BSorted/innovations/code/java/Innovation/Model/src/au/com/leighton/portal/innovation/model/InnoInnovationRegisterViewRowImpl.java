package au.com.leighton.portal.innovation.model;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Aug 17 11:51:34 EST 2011
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class InnoInnovationRegisterViewRowImpl extends ViewRowImpl
{
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum
    {
        IrNumber
        {
            public Object get(InnoInnovationRegisterViewRowImpl obj)
            {
                return obj.getIrNumber();
            }

            public void put(InnoInnovationRegisterViewRowImpl obj,
                            Object value)
            {
                obj.setIrNumber((String)value);
            }
        },
        DateSubmitted
        {
            public Object get(InnoInnovationRegisterViewRowImpl obj)
            {
                return obj.getDateSubmitted();
            }

            public void put(InnoInnovationRegisterViewRowImpl obj,
                            Object value)
            {
                obj.setDateSubmitted((Date)value);
            }
        },
        Division
        {
            public Object get(InnoInnovationRegisterViewRowImpl obj)
            {
                return obj.getDivision();
            }

            public void put(InnoInnovationRegisterViewRowImpl obj,
                            Object value)
            {
                obj.setDivision((String)value);
            }
        },
        Project
        {
            public Object get(InnoInnovationRegisterViewRowImpl obj)
            {
                return obj.getProject();
            }

            public void put(InnoInnovationRegisterViewRowImpl obj,
                            Object value)
            {
                obj.setProject((String)value);
            }
        },
        Owner
        {
            public Object get(InnoInnovationRegisterViewRowImpl obj)
            {
                return obj.getOwner();
            }

            public void put(InnoInnovationRegisterViewRowImpl obj,
                            Object value)
            {
                obj.setOwner((String)value);
            }
        },
        Category
        {
            public Object get(InnoInnovationRegisterViewRowImpl obj)
            {
                return obj.getCategory();
            }

            public void put(InnoInnovationRegisterViewRowImpl obj,
                            Object value)
            {
                obj.setCategory((String)value);
            }
        },
        InitiativeName
        {
            public Object get(InnoInnovationRegisterViewRowImpl obj)
            {
                return obj.getInitiativeName();
            }

            public void put(InnoInnovationRegisterViewRowImpl obj,
                            Object value)
            {
                obj.setInitiativeName((String)value);
            }
        },
        InnovationDescription
        {
            public Object get(InnoInnovationRegisterViewRowImpl obj)
            {
                return obj.getInnovationDescription();
            }

            public void put(InnoInnovationRegisterViewRowImpl obj,
                            Object value)
            {
                obj.setInnovationDescription((String)value);
            }
        },
        Benefit
        {
            public Object get(InnoInnovationRegisterViewRowImpl obj)
            {
                return obj.getBenefit();
            }

            public void put(InnoInnovationRegisterViewRowImpl obj,
                            Object value)
            {
                obj.setBenefit((String)value);
            }
        },
        BusinessValue
        {
            public Object get(InnoInnovationRegisterViewRowImpl obj)
            {
                return obj.getBusinessValue();
            }

            public void put(InnoInnovationRegisterViewRowImpl obj,
                            Object value)
            {
                obj.setBusinessValue((String)value);
            }
        },
        Status
        {
            public Object get(InnoInnovationRegisterViewRowImpl obj)
            {
                return obj.getStatus();
            }

            public void put(InnoInnovationRegisterViewRowImpl obj,
                            Object value)
            {
                obj.setStatus((String)value);
            }
        },
        BusinessOptimisation
        {
            public Object get(InnoInnovationRegisterViewRowImpl obj)
            {
                return obj.getBusinessOptimisation();
            }

            public void put(InnoInnovationRegisterViewRowImpl obj,
                            Object value)
            {
                obj.setBusinessOptimisation((String)value);
            }
        },
        ContactDetails
        {
            public Object get(InnoInnovationRegisterViewRowImpl obj)
            {
                return obj.getContactDetails();
            }

            public void put(InnoInnovationRegisterViewRowImpl obj,
                            Object value)
            {
                obj.setContactDetails((String)value);
            }
        },
        CaseStudy
        {
            public Object get(InnoInnovationRegisterViewRowImpl obj)
            {
                return obj.getCaseStudy();
            }

            public void put(InnoInnovationRegisterViewRowImpl obj,
                            Object value)
            {
                obj.setCaseStudy((String)value);
            }
        },
        FlashOn
        {
            public Object get(InnoInnovationRegisterViewRowImpl obj)
            {
                return obj.getFlashOn();
            }

            public void put(InnoInnovationRegisterViewRowImpl obj,
                            Object value)
            {
                obj.setFlashOn((String)value);
            }
        },
        AdditionalComments
        {
            public Object get(InnoInnovationRegisterViewRowImpl obj)
            {
                return obj.getAdditionalComments();
            }

            public void put(InnoInnovationRegisterViewRowImpl obj,
                            Object value)
            {
                obj.setAdditionalComments((String)value);
            }
        },
        IdeaSubmittedBy
        {
            public Object get(InnoInnovationRegisterViewRowImpl obj)
            {
                return obj.getIdeaSubmittedBy();
            }

            public void put(InnoInnovationRegisterViewRowImpl obj,
                            Object value)
            {
                obj.setIdeaSubmittedBy((String)value);
            }
        },
        AdoptedBy
        {
            public Object get(InnoInnovationRegisterViewRowImpl obj)
            {
                return obj.getAdoptedBy();
            }

            public void put(InnoInnovationRegisterViewRowImpl obj,
                            Object value)
            {
                obj.setAdoptedBy((String)value);
            }
        },
        AdoptedDate
        {
            public Object get(InnoInnovationRegisterViewRowImpl obj)
            {
                return obj.getAdoptedDate();
            }

            public void put(InnoInnovationRegisterViewRowImpl obj,
                            Object value)
            {
                obj.setAdoptedDate((Date)value);
            }
        },
        LastModifiedBy
        {
            public Object get(InnoInnovationRegisterViewRowImpl obj)
            {
                return obj.getLastModifiedBy();
            }

            public void put(InnoInnovationRegisterViewRowImpl obj,
                            Object value)
            {
                obj.setLastModifiedBy((String)value);
            }
        },
        LastModifiedDate
        {
            public Object get(InnoInnovationRegisterViewRowImpl obj)
            {
                return obj.getLastModifiedDate();
            }

            public void put(InnoInnovationRegisterViewRowImpl obj,
                            Object value)
            {
                obj.setLastModifiedDate((Date)value);
            }
        },
        IdeaId
        {
            public Object get(InnoInnovationRegisterViewRowImpl obj)
            {
                return obj.getIdeaId();
            }

            public void put(InnoInnovationRegisterViewRowImpl obj,
                            Object value)
            {
                obj.setIdeaId((Number)value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(InnoInnovationRegisterViewRowImpl object);

        public abstract void put(InnoInnovationRegisterViewRowImpl object,
                                 Object value);

        public int index()
        {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex()
        {
            return firstIndex;
        }

        public static int count()
        {
            return AttributesEnum.firstIndex() +
                AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues()
        {
            if (vals == null)
            {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int IRNUMBER = AttributesEnum.IrNumber.index();
    public static final int DATESUBMITTED =
        AttributesEnum.DateSubmitted.index();
    public static final int DIVISION = AttributesEnum.Division.index();
    public static final int PROJECT = AttributesEnum.Project.index();
    public static final int OWNER = AttributesEnum.Owner.index();
    public static final int CATEGORY = AttributesEnum.Category.index();
    public static final int INITIATIVENAME =
        AttributesEnum.InitiativeName.index();
    public static final int INNOVATIONDESCRIPTION =
        AttributesEnum.InnovationDescription.index();
    public static final int BENEFIT = AttributesEnum.Benefit.index();
    public static final int BUSINESSVALUE =
        AttributesEnum.BusinessValue.index();
    public static final int STATUS = AttributesEnum.Status.index();
    public static final int BUSINESSOPTIMISATION =
        AttributesEnum.BusinessOptimisation.index();
    public static final int CONTACTDETAILS =
        AttributesEnum.ContactDetails.index();
    public static final int CASESTUDY = AttributesEnum.CaseStudy.index();
    public static final int FLASHON = AttributesEnum.FlashOn.index();
    public static final int ADDITIONALCOMMENTS =
        AttributesEnum.AdditionalComments.index();
    public static final int IDEASUBMITTEDBY =
        AttributesEnum.IdeaSubmittedBy.index();
    public static final int ADOPTEDBY = AttributesEnum.AdoptedBy.index();
    public static final int ADOPTEDDATE = AttributesEnum.AdoptedDate.index();
    public static final int LASTMODIFIEDBY =
        AttributesEnum.LastModifiedBy.index();
    public static final int LASTMODIFIEDDATE =
        AttributesEnum.LastModifiedDate.index();
    public static final int IDEAID = AttributesEnum.IdeaId.index();

    /**
     * This is the default constructor (do not remove).
     */
    public InnoInnovationRegisterViewRowImpl()
    {
    }

    /**
     * Gets InnoInnovationRegister entity object.
     * @return the InnoInnovationRegister
     */
    public EntityImpl getInnoInnovationRegister()
    {
        return (EntityImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for IR_NUMBER using the alias name IrNumber.
     * @return the IR_NUMBER
     */
    public String getIrNumber()
    {
        return (String)getAttributeInternal(IRNUMBER);
    }

    /**
     * Sets <code>value</code> as attribute value for IR_NUMBER using the alias name IrNumber.
     * @param value value to set the IR_NUMBER
     */
    public void setIrNumber(String value)
    {
        setAttributeInternal(IRNUMBER, value);
    }

    /**
     * Gets the attribute value for DATE_SUBMITTED using the alias name DateSubmitted.
     * @return the DATE_SUBMITTED
     */
    public Date getDateSubmitted()
    {
        return (Date)getAttributeInternal(DATESUBMITTED);
    }

    /**
     * Sets <code>value</code> as attribute value for DATE_SUBMITTED using the alias name DateSubmitted.
     * @param value value to set the DATE_SUBMITTED
     */
    public void setDateSubmitted(Date value)
    {
        setAttributeInternal(DATESUBMITTED, value);
    }

    /**
     * Gets the attribute value for DIVISION using the alias name Division.
     * @return the DIVISION
     */
    public String getDivision()
    {
        return (String)getAttributeInternal(DIVISION);
    }

    /**
     * Sets <code>value</code> as attribute value for DIVISION using the alias name Division.
     * @param value value to set the DIVISION
     */
    public void setDivision(String value)
    {
        setAttributeInternal(DIVISION, value);
    }

    /**
     * Gets the attribute value for PROJECT using the alias name Project.
     * @return the PROJECT
     */
    public String getProject()
    {
        return (String)getAttributeInternal(PROJECT);
    }

    /**
     * Sets <code>value</code> as attribute value for PROJECT using the alias name Project.
     * @param value value to set the PROJECT
     */
    public void setProject(String value)
    {
        setAttributeInternal(PROJECT, value);
    }

    /**
     * Gets the attribute value for OWNER using the alias name Owner.
     * @return the OWNER
     */
    public String getOwner()
    {
        return (String)getAttributeInternal(OWNER);
    }

    /**
     * Sets <code>value</code> as attribute value for OWNER using the alias name Owner.
     * @param value value to set the OWNER
     */
    public void setOwner(String value)
    {
        setAttributeInternal(OWNER, value);
    }

    /**
     * Gets the attribute value for CATEGORY using the alias name Category.
     * @return the CATEGORY
     */
    public String getCategory()
    {
        return (String)getAttributeInternal(CATEGORY);
    }

    /**
     * Sets <code>value</code> as attribute value for CATEGORY using the alias name Category.
     * @param value value to set the CATEGORY
     */
    public void setCategory(String value)
    {
        setAttributeInternal(CATEGORY, value);
    }

    /**
     * Gets the attribute value for INITIATIVE_NAME using the alias name InitiativeName.
     * @return the INITIATIVE_NAME
     */
    public String getInitiativeName()
    {
        return (String)getAttributeInternal(INITIATIVENAME);
    }

    /**
     * Sets <code>value</code> as attribute value for INITIATIVE_NAME using the alias name InitiativeName.
     * @param value value to set the INITIATIVE_NAME
     */
    public void setInitiativeName(String value)
    {
        setAttributeInternal(INITIATIVENAME, value);
    }

    /**
     * Gets the attribute value for INNOVATION_DESCRIPTION using the alias name InnovationDescription.
     * @return the INNOVATION_DESCRIPTION
     */
    public String getInnovationDescription()
    {
        return (String)getAttributeInternal(INNOVATIONDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as attribute value for INNOVATION_DESCRIPTION using the alias name InnovationDescription.
     * @param value value to set the INNOVATION_DESCRIPTION
     */
    public void setInnovationDescription(String value)
    {
        setAttributeInternal(INNOVATIONDESCRIPTION, value);
    }

    /**
     * Gets the attribute value for BENEFIT using the alias name Benefit.
     * @return the BENEFIT
     */
    public String getBenefit()
    {
        return (String)getAttributeInternal(BENEFIT);
    }

    /**
     * Sets <code>value</code> as attribute value for BENEFIT using the alias name Benefit.
     * @param value value to set the BENEFIT
     */
    public void setBenefit(String value)
    {
        setAttributeInternal(BENEFIT, value);
    }

    /**
     * Gets the attribute value for BUSINESS_VALUE using the alias name BusinessValue.
     * @return the BUSINESS_VALUE
     */
    public String getBusinessValue()
    {
        return (String)getAttributeInternal(BUSINESSVALUE);
    }

    /**
     * Sets <code>value</code> as attribute value for BUSINESS_VALUE using the alias name BusinessValue.
     * @param value value to set the BUSINESS_VALUE
     */
    public void setBusinessValue(String value)
    {
        setAttributeInternal(BUSINESSVALUE, value);
    }

    /**
     * Gets the attribute value for STATUS using the alias name Status.
     * @return the STATUS
     */
    public String getStatus()
    {
        return (String)getAttributeInternal(STATUS);
    }

    /**
     * Sets <code>value</code> as attribute value for STATUS using the alias name Status.
     * @param value value to set the STATUS
     */
    public void setStatus(String value)
    {
        setAttributeInternal(STATUS, value);
    }

    /**
     * Gets the attribute value for BUSINESS_OPTIMISATION using the alias name BusinessOptimisation.
     * @return the BUSINESS_OPTIMISATION
     */
    public String getBusinessOptimisation()
    {
        return (String)getAttributeInternal(BUSINESSOPTIMISATION);
    }

    /**
     * Sets <code>value</code> as attribute value for BUSINESS_OPTIMISATION using the alias name BusinessOptimisation.
     * @param value value to set the BUSINESS_OPTIMISATION
     */
    public void setBusinessOptimisation(String value)
    {
        setAttributeInternal(BUSINESSOPTIMISATION, value);
    }

    /**
     * Gets the attribute value for CONTACT_DETAILS using the alias name ContactDetails.
     * @return the CONTACT_DETAILS
     */
    public String getContactDetails()
    {
        return (String)getAttributeInternal(CONTACTDETAILS);
    }

    /**
     * Sets <code>value</code> as attribute value for CONTACT_DETAILS using the alias name ContactDetails.
     * @param value value to set the CONTACT_DETAILS
     */
    public void setContactDetails(String value)
    {
        setAttributeInternal(CONTACTDETAILS, value);
    }

    /**
     * Gets the attribute value for CASE_STUDY using the alias name CaseStudy.
     * @return the CASE_STUDY
     */
    public String getCaseStudy()
    {
        return (String)getAttributeInternal(CASESTUDY);
    }

    /**
     * Sets <code>value</code> as attribute value for CASE_STUDY using the alias name CaseStudy.
     * @param value value to set the CASE_STUDY
     */
    public void setCaseStudy(String value)
    {
        setAttributeInternal(CASESTUDY, value);
    }

    /**
     * Gets the attribute value for FLASH_ON using the alias name FlashOn.
     * @return the FLASH_ON
     */
    public String getFlashOn()
    {
        return (String)getAttributeInternal(FLASHON);
    }

    /**
     * Sets <code>value</code> as attribute value for FLASH_ON using the alias name FlashOn.
     * @param value value to set the FLASH_ON
     */
    public void setFlashOn(String value)
    {
        setAttributeInternal(FLASHON, value);
    }

    /**
     * Gets the attribute value for ADDITIONAL_COMMENTS using the alias name AdditionalComments.
     * @return the ADDITIONAL_COMMENTS
     */
    public String getAdditionalComments()
    {
        return (String)getAttributeInternal(ADDITIONALCOMMENTS);
    }

    /**
     * Sets <code>value</code> as attribute value for ADDITIONAL_COMMENTS using the alias name AdditionalComments.
     * @param value value to set the ADDITIONAL_COMMENTS
     */
    public void setAdditionalComments(String value)
    {
        setAttributeInternal(ADDITIONALCOMMENTS, value);
    }

    /**
     * Gets the attribute value for IDEA_SUBMITTED_BY using the alias name IdeaSubmittedBy.
     * @return the IDEA_SUBMITTED_BY
     */
    public String getIdeaSubmittedBy()
    {
        return (String)getAttributeInternal(IDEASUBMITTEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for IDEA_SUBMITTED_BY using the alias name IdeaSubmittedBy.
     * @param value value to set the IDEA_SUBMITTED_BY
     */
    public void setIdeaSubmittedBy(String value)
    {
        setAttributeInternal(IDEASUBMITTEDBY, value);
    }

    /**
     * Gets the attribute value for ADOPTED_BY using the alias name AdoptedBy.
     * @return the ADOPTED_BY
     */
    public String getAdoptedBy()
    {
        return (String)getAttributeInternal(ADOPTEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for ADOPTED_BY using the alias name AdoptedBy.
     * @param value value to set the ADOPTED_BY
     */
    public void setAdoptedBy(String value)
    {
        setAttributeInternal(ADOPTEDBY, value);
    }

    /**
     * Gets the attribute value for ADOPTED_DATE using the alias name AdoptedDate.
     * @return the ADOPTED_DATE
     */
    public Date getAdoptedDate()
    {
        return (Date)getAttributeInternal(ADOPTEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for ADOPTED_DATE using the alias name AdoptedDate.
     * @param value value to set the ADOPTED_DATE
     */
    public void setAdoptedDate(Date value)
    {
        setAttributeInternal(ADOPTEDDATE, value);
    }

    /**
     * Gets the attribute value for LAST_MODIFIED_BY using the alias name LastModifiedBy.
     * @return the LAST_MODIFIED_BY
     */
    public String getLastModifiedBy()
    {
        return (String)getAttributeInternal(LASTMODIFIEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_MODIFIED_BY using the alias name LastModifiedBy.
     * @param value value to set the LAST_MODIFIED_BY
     */
    public void setLastModifiedBy(String value)
    {
        setAttributeInternal(LASTMODIFIEDBY, value);
    }

    /**
     * Gets the attribute value for LAST_MODIFIED_DATE using the alias name LastModifiedDate.
     * @return the LAST_MODIFIED_DATE
     */
    public Date getLastModifiedDate()
    {
        return (Date)getAttributeInternal(LASTMODIFIEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_MODIFIED_DATE using the alias name LastModifiedDate.
     * @param value value to set the LAST_MODIFIED_DATE
     */
    public void setLastModifiedDate(Date value)
    {
        setAttributeInternal(LASTMODIFIEDDATE, value);
    }

    /**
     * Gets the attribute value for IDEA_ID using the alias name IdeaId.
     * @return the IDEA_ID
     */
    public Number getIdeaId()
    {
        return (Number)getAttributeInternal(IDEAID);
    }

    /**
     * Sets <code>value</code> as attribute value for IDEA_ID using the alias name IdeaId.
     * @param value value to set the IDEA_ID
     */
    public void setIdeaId(Number value)
    {
        setAttributeInternal(IDEAID, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception
    {
        if ((index >= AttributesEnum.firstIndex()) &&
            (index < AttributesEnum.count()))
        {
            return AttributesEnum.staticValues()[index -
                AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception
    {
        if ((index >= AttributesEnum.firstIndex()) &&
            (index < AttributesEnum.count()))
        {
            AttributesEnum.staticValues()[index -
                AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }

    public InnovationBean toBean()
    {
        InnovationBean result = new InnovationBean();

        result.setAdditionalComments(getAdditionalComments());
        result.setBenefit(getBenefit());
        result.setBusinessOptimisation(getBusinessOptimisation());
        result.setBusinessValue(getBusinessValue());
        result.setCaseStudy(getCaseStudy());
        result.setCategory(getCategory());
        result.setContactDetails(getContactDetails());
        result.setDateSubmitted(getDateSubmitted());
        result.setDivision(getDivision());
        result.setFlashOn(getFlashOn());
        result.setInitiativeName(getInitiativeName());
        result.setInnovationDescription(getInnovationDescription());
        result.setIrNumber(getIrNumber());
        result.setOwner(getOwner());
        result.setProject(getProject());
        result.setStatus(getStatus());
        result.setAdoptedBy(getAdoptedBy());
        result.setAdoptedDate(getAdoptedDate());
        result.setIdeaSubmittedBy(getIdeaSubmittedBy());
        result.setLastModifiedBy(getLastModifiedBy());
        result.setLastModifiedDate(getLastModifiedDate());
        result.setIdeaId(getIdeaId());

        return result;
    }

    public void fromBean(InnovationBean bean)
    {
        if (bean != null)
        {
            setAdditionalComments(bean.getAdditionalComments());
            setBenefit(bean.getBenefit());
            setBusinessOptimisation(bean.getBusinessOptimisation());
            setBusinessValue(bean.getBusinessValue());
            setCaseStudy(bean.getCaseStudy());
            setCategory(bean.getCategory());
            setContactDetails(bean.getContactDetails());
            setDateSubmitted(bean.getDateSubmitted());
            setDivision(bean.getDivision());
            setFlashOn(bean.getFlashOn());
            setInitiativeName(bean.getInitiativeName());
            setInnovationDescription(bean.getInnovationDescription());
            setIrNumber(bean.getIrNumber());
            setOwner(bean.getOwner());
            setProject(bean.getProject());
            setStatus(bean.getStatus());
            setAdoptedBy(bean.getAdoptedBy());
            setAdoptedDate(bean.getAdoptedDate());
            setIdeaSubmittedBy(bean.getIdeaSubmittedBy());
            setLastModifiedBy(bean.getLastModifiedBy());
            setLastModifiedDate(bean.getLastModifiedDate());
            setIdeaId(bean.getIdeaId());
        }
    }
}
