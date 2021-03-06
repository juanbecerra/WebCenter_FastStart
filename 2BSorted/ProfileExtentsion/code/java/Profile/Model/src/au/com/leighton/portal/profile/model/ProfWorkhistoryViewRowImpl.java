package au.com.leighton.portal.profile.model;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jul 27 08:59:39 EST 2011
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ProfWorkhistoryViewRowImpl extends ViewRowImpl
{
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum
    {
        Id
        {
            public Object get(ProfWorkhistoryViewRowImpl obj)
            {
                return obj.getId();
            }

            public void put(ProfWorkhistoryViewRowImpl obj, Object value)
            {
                obj.setId((Number)value);
            }
        },
        Username
        {
            public Object get(ProfWorkhistoryViewRowImpl obj)
            {
                return obj.getUsername();
            }

            public void put(ProfWorkhistoryViewRowImpl obj, Object value)
            {
                obj.setUsername((String)value);
            }
        },
        Role
        {
            public Object get(ProfWorkhistoryViewRowImpl obj)
            {
                return obj.getRole();
            }

            public void put(ProfWorkhistoryViewRowImpl obj, Object value)
            {
                obj.setRole((String)value);
            }
        },
        Company
        {
            public Object get(ProfWorkhistoryViewRowImpl obj)
            {
                return obj.getCompany();
            }

            public void put(ProfWorkhistoryViewRowImpl obj, Object value)
            {
                obj.setCompany((String)value);
            }
        },
        Location
        {
            public Object get(ProfWorkhistoryViewRowImpl obj)
            {
                return obj.getLocation();
            }

            public void put(ProfWorkhistoryViewRowImpl obj, Object value)
            {
                obj.setLocation((String)value);
            }
        },
        Startdate
        {
            public Object get(ProfWorkhistoryViewRowImpl obj)
            {
                return obj.getStartdate();
            }

            public void put(ProfWorkhistoryViewRowImpl obj, Object value)
            {
                obj.setStartdate((Date)value);
            }
        },
        Enddate
        {
            public Object get(ProfWorkhistoryViewRowImpl obj)
            {
                return obj.getEnddate();
            }

            public void put(ProfWorkhistoryViewRowImpl obj, Object value)
            {
                obj.setEnddate((Date)value);
            }
        },
        Jobdescription
        {
            public Object get(ProfWorkhistoryViewRowImpl obj)
            {
                return obj.getJobdescription();
            }

            public void put(ProfWorkhistoryViewRowImpl obj, Object value)
            {
                obj.setJobdescription((String)value);
            }
        },
        Deleted
        {
            public Object get(ProfWorkhistoryViewRowImpl obj)
            {
                return obj.getDeleted();
            }

            public void put(ProfWorkhistoryViewRowImpl obj, Object value)
            {
                obj.setDeleted((Number)value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(ProfWorkhistoryViewRowImpl object);

        public abstract void put(ProfWorkhistoryViewRowImpl object,
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
    public static final int ID = AttributesEnum.Id.index();
    public static final int USERNAME = AttributesEnum.Username.index();
    public static final int ROLE = AttributesEnum.Role.index();
    public static final int COMPANY = AttributesEnum.Company.index();
    public static final int LOCATION = AttributesEnum.Location.index();
    public static final int STARTDATE = AttributesEnum.Startdate.index();
    public static final int ENDDATE = AttributesEnum.Enddate.index();
    public static final int JOBDESCRIPTION =
        AttributesEnum.Jobdescription.index();
    public static final int DELETED = AttributesEnum.Deleted.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ProfWorkhistoryViewRowImpl()
    {
    }

    /**
     * Gets ProfWorkhistory entity object.
     * @return the ProfWorkhistory
     */
    public EntityImpl getProfWorkhistory()
    {
        return (EntityImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for ID using the alias name Id.
     * @return the ID
     */
    public Number getId()
    {
        return (Number)getAttributeInternal(ID);
    }

    /**
     * Sets <code>value</code> as attribute value for ID using the alias name Id.
     * @param value value to set the ID
     */
    public void setId(Number value)
    {
        setAttributeInternal(ID, value);
    }

    /**
     * Gets the attribute value for USERNAME using the alias name Username.
     * @return the USERNAME
     */
    public String getUsername()
    {
        return (String)getAttributeInternal(USERNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for USERNAME using the alias name Username.
     * @param value value to set the USERNAME
     */
    public void setUsername(String value)
    {
        setAttributeInternal(USERNAME, value);
    }

    /**
     * Gets the attribute value for ROLE using the alias name Role.
     * @return the ROLE
     */
    public String getRole()
    {
        return (String)getAttributeInternal(ROLE);
    }

    /**
     * Sets <code>value</code> as attribute value for ROLE using the alias name Role.
     * @param value value to set the ROLE
     */
    public void setRole(String value)
    {
        setAttributeInternal(ROLE, value);
    }

    /**
     * Gets the attribute value for COMPANY using the alias name Company.
     * @return the COMPANY
     */
    public String getCompany()
    {
        return (String)getAttributeInternal(COMPANY);
    }

    /**
     * Sets <code>value</code> as attribute value for COMPANY using the alias name Company.
     * @param value value to set the COMPANY
     */
    public void setCompany(String value)
    {
        setAttributeInternal(COMPANY, value);
    }

    /**
     * Gets the attribute value for LOCATION using the alias name Location.
     * @return the LOCATION
     */
    public String getLocation()
    {
        return (String)getAttributeInternal(LOCATION);
    }

    /**
     * Sets <code>value</code> as attribute value for LOCATION using the alias name Location.
     * @param value value to set the LOCATION
     */
    public void setLocation(String value)
    {
        setAttributeInternal(LOCATION, value);
    }

    /**
     * Gets the attribute value for STARTDATE using the alias name Startdate.
     * @return the STARTDATE
     */
    public Date getStartdate()
    {
        return (Date)getAttributeInternal(STARTDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for STARTDATE using the alias name Startdate.
     * @param value value to set the STARTDATE
     */
    public void setStartdate(Date value)
    {
        setAttributeInternal(STARTDATE, value);
    }

    /**
     * Gets the attribute value for ENDDATE using the alias name Enddate.
     * @return the ENDDATE
     */
    public Date getEnddate()
    {
        return (Date)getAttributeInternal(ENDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for ENDDATE using the alias name Enddate.
     * @param value value to set the ENDDATE
     */
    public void setEnddate(Date value)
    {
        setAttributeInternal(ENDDATE, value);
    }

    /**
     * Gets the attribute value for JOBDESCRIPTION using the alias name Jobdescription.
     * @return the JOBDESCRIPTION
     */
    public String getJobdescription()
    {
        return (String)getAttributeInternal(JOBDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as attribute value for JOBDESCRIPTION using the alias name Jobdescription.
     * @param value value to set the JOBDESCRIPTION
     */
    public void setJobdescription(String value)
    {
        setAttributeInternal(JOBDESCRIPTION, value);
    }

    /**
     * Gets the attribute value for DELETED using the alias name Deleted.
     * @return the DELETED
     */
    public Number getDeleted()
    {
        return (Number)getAttributeInternal(DELETED);
    }

    /**
     * Sets <code>value</code> as attribute value for DELETED using the alias name Deleted.
     * @param value value to set the DELETED
     */
    public void setDeleted(Number value)
    {
        setAttributeInternal(DELETED, value);
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

    public WorkHistoryItem toBean()
    {
        WorkHistoryItem result = new WorkHistoryItem();

        result.setCompany(getCompany());
        result.setFromDate(getStartdate() == null ? null :
                           getStartdate().getValue());
        result.setJobDescription(getJobdescription());
        result.setLocation(getLocation());
        result.setRole(getRole());
        result.setToDate(getEnddate() == null ? null :
                         getEnddate().getValue());
        result.setUsername(getUsername());
        result.setDeleted(getDeleted() == null ? false :
                          getDeleted().intValue() > 0);
        result.setId(getId() == null ? 0 : getId().longValue());

        return result;
    }
}
