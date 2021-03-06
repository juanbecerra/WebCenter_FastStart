package au.com.leighton.portal.peoplefinder.model;

import oracle.jbo.domain.Number;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Sep 30 10:47:51 EST 2011
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class WcAsActorDetailViewRowImpl extends ViewRowImpl
{
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum
    {
        ActivityActorDetailId
        {
            public Object get(WcAsActorDetailViewRowImpl obj)
            {
                return obj.getActivityActorDetailId();
            }

            public void put(WcAsActorDetailViewRowImpl obj, Object value)
            {
                obj.setActivityActorDetailId((String)value);
            }
        },
        ActorId
        {
            public Object get(WcAsActorDetailViewRowImpl obj)
            {
                return obj.getActorId();
            }

            public void put(WcAsActorDetailViewRowImpl obj, Object value)
            {
                obj.setActorId((String)value);
            }
        },
        ActorName
        {
            public Object get(WcAsActorDetailViewRowImpl obj)
            {
                return obj.getActorName();
            }

            public void put(WcAsActorDetailViewRowImpl obj, Object value)
            {
                obj.setActorName((String)value);
            }
        },
        DisplayName
        {
            public Object get(WcAsActorDetailViewRowImpl obj)
            {
                return obj.getDisplayName();
            }

            public void put(WcAsActorDetailViewRowImpl obj, Object value)
            {
                obj.setDisplayName((String)value);
            }
        },
        Email
        {
            public Object get(WcAsActorDetailViewRowImpl obj)
            {
                return obj.getEmail();
            }

            public void put(WcAsActorDetailViewRowImpl obj, Object value)
            {
                obj.setEmail((String)value);
            }
        },
        Department
        {
            public Object get(WcAsActorDetailViewRowImpl obj)
            {
                return obj.getDepartment();
            }

            public void put(WcAsActorDetailViewRowImpl obj, Object value)
            {
                obj.setDepartment((String)value);
            }
        },
        JobTitle
        {
            public Object get(WcAsActorDetailViewRowImpl obj)
            {
                return obj.getJobTitle();
            }

            public void put(WcAsActorDetailViewRowImpl obj, Object value)
            {
                obj.setJobTitle((String)value);
            }
        },
        UpdatedOn
        {
            public Object get(WcAsActorDetailViewRowImpl obj)
            {
                return obj.getUpdatedOn();
            }

            public void put(WcAsActorDetailViewRowImpl obj, Object value)
            {
                obj.setUpdatedOn((Timestamp)value);
            }
        },
        Version
        {
            public Object get(WcAsActorDetailViewRowImpl obj)
            {
                return obj.getVersion();
            }

            public void put(WcAsActorDetailViewRowImpl obj, Object value)
            {
                obj.setVersion((Number)value);
            }
        },
        Status
        {
            public Object get(WcAsActorDetailViewRowImpl obj)
            {
                return obj.getStatus();
            }

            public void put(WcAsActorDetailViewRowImpl obj, Object value)
            {
                obj.setStatus((String)value);
            }
        },
        ManagerId
        {
            public Object get(WcAsActorDetailViewRowImpl obj)
            {
                return obj.getManagerId();
            }

            public void put(WcAsActorDetailViewRowImpl obj, Object value)
            {
                obj.setManagerId((String)value);
            }
        },
        ApplicationId
        {
            public Object get(WcAsActorDetailViewRowImpl obj)
            {
                return obj.getApplicationId();
            }

            public void put(WcAsActorDetailViewRowImpl obj, Object value)
            {
                obj.setApplicationId((String)value);
            }
        },
        EnterpriseId
        {
            public Object get(WcAsActorDetailViewRowImpl obj)
            {
                return obj.getEnterpriseId();
            }

            public void put(WcAsActorDetailViewRowImpl obj, Object value)
            {
                obj.setEnterpriseId((Number)value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(WcAsActorDetailViewRowImpl object);

        public abstract void put(WcAsActorDetailViewRowImpl object,
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

    public static final int ACTIVITYACTORDETAILID =
        AttributesEnum.ActivityActorDetailId.index();
    public static final int ACTORID = AttributesEnum.ActorId.index();
    public static final int ACTORNAME = AttributesEnum.ActorName.index();
    public static final int DISPLAYNAME = AttributesEnum.DisplayName.index();
    public static final int EMAIL = AttributesEnum.Email.index();
    public static final int DEPARTMENT = AttributesEnum.Department.index();
    public static final int JOBTITLE = AttributesEnum.JobTitle.index();
    public static final int UPDATEDON = AttributesEnum.UpdatedOn.index();
    public static final int VERSION = AttributesEnum.Version.index();
    public static final int STATUS = AttributesEnum.Status.index();
    public static final int MANAGERID = AttributesEnum.ManagerId.index();
    public static final int APPLICATIONID =
        AttributesEnum.ApplicationId.index();
    public static final int ENTERPRISEID = AttributesEnum.EnterpriseId.index();

    /**
     * This is the default constructor (do not remove).
     */
    public WcAsActorDetailViewRowImpl()
    {
    }

    /**
     * Gets the attribute value for the calculated attribute ActivityActorDetailId.
     * @return the ActivityActorDetailId
     */
    public String getActivityActorDetailId()
    {
        return (String)getAttributeInternal(ACTIVITYACTORDETAILID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ActivityActorDetailId.
     * @param value value to set the  ActivityActorDetailId
     */
    public void setActivityActorDetailId(String value)
    {
        setAttributeInternal(ACTIVITYACTORDETAILID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ActorId.
     * @return the ActorId
     */
    public String getActorId()
    {
        return (String)getAttributeInternal(ACTORID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ActorId.
     * @param value value to set the  ActorId
     */
    public void setActorId(String value)
    {
        setAttributeInternal(ACTORID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ActorName.
     * @return the ActorName
     */
    public String getActorName()
    {
        return (String)getAttributeInternal(ACTORNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ActorName.
     * @param value value to set the  ActorName
     */
    public void setActorName(String value)
    {
        setAttributeInternal(ACTORNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute DisplayName.
     * @return the DisplayName
     */
    public String getDisplayName()
    {
        return (String)getAttributeInternal(DISPLAYNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DisplayName.
     * @param value value to set the  DisplayName
     */
    public void setDisplayName(String value)
    {
        setAttributeInternal(DISPLAYNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Email.
     * @return the Email
     */
    public String getEmail()
    {
        return (String)getAttributeInternal(EMAIL);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Email.
     * @param value value to set the  Email
     */
    public void setEmail(String value)
    {
        setAttributeInternal(EMAIL, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Department.
     * @return the Department
     */
    public String getDepartment()
    {
        return (String)getAttributeInternal(DEPARTMENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Department.
     * @param value value to set the  Department
     */
    public void setDepartment(String value)
    {
        setAttributeInternal(DEPARTMENT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute JobTitle.
     * @return the JobTitle
     */
    public String getJobTitle()
    {
        return (String)getAttributeInternal(JOBTITLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute JobTitle.
     * @param value value to set the  JobTitle
     */
    public void setJobTitle(String value)
    {
        setAttributeInternal(JOBTITLE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute UpdatedOn.
     * @return the UpdatedOn
     */
    public Timestamp getUpdatedOn()
    {
        return (Timestamp)getAttributeInternal(UPDATEDON);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute UpdatedOn.
     * @param value value to set the  UpdatedOn
     */
    public void setUpdatedOn(Timestamp value)
    {
        setAttributeInternal(UPDATEDON, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Version.
     * @return the Version
     */
    public Number getVersion()
    {
        return (Number)getAttributeInternal(VERSION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Version.
     * @param value value to set the  Version
     */
    public void setVersion(Number value)
    {
        setAttributeInternal(VERSION, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Status.
     * @return the Status
     */
    public String getStatus()
    {
        return (String)getAttributeInternal(STATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Status.
     * @param value value to set the  Status
     */
    public void setStatus(String value)
    {
        setAttributeInternal(STATUS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ManagerId.
     * @return the ManagerId
     */
    public String getManagerId()
    {
        return (String)getAttributeInternal(MANAGERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ManagerId.
     * @param value value to set the  ManagerId
     */
    public void setManagerId(String value)
    {
        setAttributeInternal(MANAGERID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ApplicationId.
     * @return the ApplicationId
     */
    public String getApplicationId()
    {
        return (String)getAttributeInternal(APPLICATIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ApplicationId.
     * @param value value to set the  ApplicationId
     */
    public void setApplicationId(String value)
    {
        setAttributeInternal(APPLICATIONID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute EnterpriseId.
     * @return the EnterpriseId
     */
    public Number getEnterpriseId()
    {
        return (Number)getAttributeInternal(ENTERPRISEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute EnterpriseId.
     * @param value value to set the  EnterpriseId
     */
    public void setEnterpriseId(Number value)
    {
        setAttributeInternal(ENTERPRISEID, value);
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

    public ActorDetail toBean()
    {
        ActorDetail result = new ActorDetail();

        result.setActivityActorDetailId(getActivityActorDetailId());
        result.setActorId(getActorId());
        result.setActorName(getActorName());
        result.setDisplayName(getDisplayName());
        result.setEmail(getEmail());
        result.setDepartment(getDepartment());
        result.setJobTitle(getJobTitle());
        result.setUpdatedOn(getUpdatedOn());
        result.setVersion(getVersion());
        result.setStatus(getStatus());
        result.setManagerId(getManagerId());
        result.setApplicationId(getApplicationId());
        result.setEnterpriseId(getEnterpriseId());

        return result;
    }
}
