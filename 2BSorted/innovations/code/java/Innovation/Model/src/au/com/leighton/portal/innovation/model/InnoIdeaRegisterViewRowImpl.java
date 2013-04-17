package au.com.leighton.portal.innovation.model;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Aug 17 11:51:16 EST 2011
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class InnoIdeaRegisterViewRowImpl extends ViewRowImpl
{
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum
    {
        SubmittedInnovationId
        {
            public Object get(InnoIdeaRegisterViewRowImpl obj)
            {
                return obj.getSubmittedInnovationId();
            }

            public void put(InnoIdeaRegisterViewRowImpl obj, Object value)
            {
                obj.setSubmittedInnovationId((Number)value);
            }
        },
        Originator
        {
            public Object get(InnoIdeaRegisterViewRowImpl obj)
            {
                return obj.getOriginator();
            }

            public void put(InnoIdeaRegisterViewRowImpl obj, Object value)
            {
                obj.setOriginator((String)value);
            }
        },
        Status
        {
            public Object get(InnoIdeaRegisterViewRowImpl obj)
            {
                return obj.getStatus();
            }

            public void put(InnoIdeaRegisterViewRowImpl obj, Object value)
            {
                obj.setStatus((String)value);
            }
        },
        SubmittedBy
        {
            public Object get(InnoIdeaRegisterViewRowImpl obj)
            {
                return obj.getSubmittedBy();
            }

            public void put(InnoIdeaRegisterViewRowImpl obj, Object value)
            {
                obj.setSubmittedBy((String)value);
            }
        },
        Idea
        {
            public Object get(InnoIdeaRegisterViewRowImpl obj)
            {
                return obj.getIdea();
            }

            public void put(InnoIdeaRegisterViewRowImpl obj, Object value)
            {
                obj.setIdea((String)value);
            }
        },
        BusinessValue
        {
            public Object get(InnoIdeaRegisterViewRowImpl obj)
            {
                return obj.getBusinessValue();
            }

            public void put(InnoIdeaRegisterViewRowImpl obj, Object value)
            {
                obj.setBusinessValue((String)value);
            }
        },
        Division
        {
            public Object get(InnoIdeaRegisterViewRowImpl obj)
            {
                return obj.getDivision();
            }

            public void put(InnoIdeaRegisterViewRowImpl obj, Object value)
            {
                obj.setDivision((String)value);
            }
        },
        ContactDetails
        {
            public Object get(InnoIdeaRegisterViewRowImpl obj)
            {
                return obj.getContactDetails();
            }

            public void put(InnoIdeaRegisterViewRowImpl obj, Object value)
            {
                obj.setContactDetails((String)value);
            }
        },
        DateSubmitted
        {
            public Object get(InnoIdeaRegisterViewRowImpl obj)
            {
                return obj.getDateSubmitted();
            }

            public void put(InnoIdeaRegisterViewRowImpl obj, Object value)
            {
                obj.setDateSubmitted((Date)value);
            }
        },
        Comments
        {
            public Object get(InnoIdeaRegisterViewRowImpl obj)
            {
                return obj.getComments();
            }

            public void put(InnoIdeaRegisterViewRowImpl obj, Object value)
            {
                obj.setComments((String)value);
            }
        },
        Source
        {
            public Object get(InnoIdeaRegisterViewRowImpl obj)
            {
                return obj.getSource();
            }

            public void put(InnoIdeaRegisterViewRowImpl obj, Object value)
            {
                obj.setSource((String)value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(InnoIdeaRegisterViewRowImpl object);

        public abstract void put(InnoIdeaRegisterViewRowImpl object,
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
    public static final int SUBMITTEDINNOVATIONID =
        AttributesEnum.SubmittedInnovationId.index();
    public static final int ORIGINATOR = AttributesEnum.Originator.index();
    public static final int STATUS = AttributesEnum.Status.index();
    public static final int SUBMITTEDBY = AttributesEnum.SubmittedBy.index();
    public static final int IDEA = AttributesEnum.Idea.index();
    public static final int BUSINESSVALUE =
        AttributesEnum.BusinessValue.index();
    public static final int DIVISION = AttributesEnum.Division.index();
    public static final int CONTACTDETAILS =
        AttributesEnum.ContactDetails.index();
    public static final int DATESUBMITTED =
        AttributesEnum.DateSubmitted.index();
    public static final int COMMENTS = AttributesEnum.Comments.index();
    public static final int SOURCE = AttributesEnum.Source.index();

    /**
     * This is the default constructor (do not remove).
     */
    public InnoIdeaRegisterViewRowImpl()
    {
    }

    /**
     * Gets InnoIdeaRegister entity object.
     * @return the InnoIdeaRegister
     */
    public EntityImpl getInnoIdeaRegister()
    {
        return (EntityImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for SUBMITTED_INNOVATION_ID using the alias name SubmittedInnovationId.
     * @return the SUBMITTED_INNOVATION_ID
     */
    public Number getSubmittedInnovationId()
    {
        return (Number)getAttributeInternal(SUBMITTEDINNOVATIONID);
    }

    /**
     * Sets <code>value</code> as attribute value for SUBMITTED_INNOVATION_ID using the alias name SubmittedInnovationId.
     * @param value value to set the SUBMITTED_INNOVATION_ID
     */
    public void setSubmittedInnovationId(Number value)
    {
        setAttributeInternal(SUBMITTEDINNOVATIONID, value);
    }

    /**
     * Gets the attribute value for ORIGINATOR using the alias name Originator.
     * @return the ORIGINATOR
     */
    public String getOriginator()
    {
        return (String)getAttributeInternal(ORIGINATOR);
    }

    /**
     * Sets <code>value</code> as attribute value for ORIGINATOR using the alias name Originator.
     * @param value value to set the ORIGINATOR
     */
    public void setOriginator(String value)
    {
        setAttributeInternal(ORIGINATOR, value);
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
     * Gets the attribute value for SUBMITTED_BY using the alias name SubmittedBy.
     * @return the SUBMITTED_BY
     */
    public String getSubmittedBy()
    {
        return (String)getAttributeInternal(SUBMITTEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for SUBMITTED_BY using the alias name SubmittedBy.
     * @param value value to set the SUBMITTED_BY
     */
    public void setSubmittedBy(String value)
    {
        setAttributeInternal(SUBMITTEDBY, value);
    }

    /**
     * Gets the attribute value for IDEA using the alias name Idea.
     * @return the IDEA
     */
    public String getIdea()
    {
        return (String)getAttributeInternal(IDEA);
    }

    /**
     * Sets <code>value</code> as attribute value for IDEA using the alias name Idea.
     * @param value value to set the IDEA
     */
    public void setIdea(String value)
    {
        setAttributeInternal(IDEA, value);
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
     * Gets the attribute value for COMMENTS using the alias name Comments.
     * @return the COMMENTS
     */
    public String getComments()
    {
        return (String)getAttributeInternal(COMMENTS);
    }

    /**
     * Sets <code>value</code> as attribute value for COMMENTS using the alias name Comments.
     * @param value value to set the COMMENTS
     */
    public void setComments(String value)
    {
        setAttributeInternal(COMMENTS, value);
    }

    /**
     * Gets the attribute value for SOURCE using the alias name Source.
     * @return the SOURCE
     */
    public String getSource()
    {
        return (String)getAttributeInternal(SOURCE);
    }

    /**
     * Sets <code>value</code> as attribute value for SOURCE using the alias name Source.
     * @param value value to set the SOURCE
     */
    public void setSource(String value)
    {
        setAttributeInternal(SOURCE, value);
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

    public IdeaBean toBean()
    {
        IdeaBean result = new IdeaBean();

        result.setBusinessValue(getBusinessValue());
        result.setComments(getComments());
        result.setContactDetails(getContactDetails());
        result.setDateSubmitted(getDateSubmitted());
        result.setDivision(getDivision());
        result.setIdea(getIdea());
        result.setOriginator(getOriginator());
        result.setSource(getSource());
        result.setStatus(getStatus());
        result.setSubmittedBy(getSubmittedBy());
        result.setSubmittedId(getSubmittedInnovationId());

        return result;
    }

    public void fromBean(IdeaBean bean)
    {
        if (bean != null)
        {
            setBusinessValue(bean.getBusinessValue());
            setComments(bean.getComments());
            setContactDetails(bean.getContactDetails());
            setDateSubmitted(bean.getDateSubmitted());
            setDivision(bean.getDivision());
            setIdea(bean.getIdea());
            setOriginator(bean.getOriginator());
            setSource(bean.getSource());
            setStatus(bean.getStatus());
            setSubmittedBy(bean.getSubmittedBy());
            setSubmittedInnovationId(bean.getSubmittedId());
        }
    }
}
