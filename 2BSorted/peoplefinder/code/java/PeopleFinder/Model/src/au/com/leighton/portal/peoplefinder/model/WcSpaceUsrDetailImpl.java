package au.com.leighton.portal.peoplefinder.model;

import oracle.jbo.Key;
import oracle.jbo.domain.Number;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Sep 30 10:47:24 EST 2011
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class WcSpaceUsrDetailImpl extends EntityImpl
{
    private static WcSpaceUsrDetailDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum
    {
        ApplicationId
        {
            public Object get(WcSpaceUsrDetailImpl obj)
            {
                return obj.getApplicationId();
            }

            public void put(WcSpaceUsrDetailImpl obj, Object value)
            {
                obj.setApplicationId((String)value);
            }
        }
        ,
        UserGuid
        {
            public Object get(WcSpaceUsrDetailImpl obj)
            {
                return obj.getUserGuid();
            }

            public void put(WcSpaceUsrDetailImpl obj, Object value)
            {
                obj.setUserGuid((String)value);
            }
        }
        ,
        SpaceId
        {
            public Object get(WcSpaceUsrDetailImpl obj)
            {
                return obj.getSpaceId();
            }

            public void put(WcSpaceUsrDetailImpl obj, Object value)
            {
                obj.setSpaceId((String)value);
            }
        }
        ,
        UserId
        {
            public Object get(WcSpaceUsrDetailImpl obj)
            {
                return obj.getUserId();
            }

            public void put(WcSpaceUsrDetailImpl obj, Object value)
            {
                obj.setUserId((String)value);
            }
        }
        ,
        IsGroup
        {
            public Object get(WcSpaceUsrDetailImpl obj)
            {
                return obj.getIsGroup();
            }

            public void put(WcSpaceUsrDetailImpl obj, Object value)
            {
                obj.setIsGroup((String)value);
            }
        }
        ,
        SpaceGuid
        {
            public Object get(WcSpaceUsrDetailImpl obj)
            {
                return obj.getSpaceGuid();
            }

            public void put(WcSpaceUsrDetailImpl obj, Object value)
            {
                obj.setSpaceGuid((String)value);
            }
        }
        ,
        SpaceRole
        {
            public Object get(WcSpaceUsrDetailImpl obj)
            {
                return obj.getSpaceRole();
            }

            public void put(WcSpaceUsrDetailImpl obj, Object value)
            {
                obj.setSpaceRole((String)value);
            }
        }
        ,
        PermissionAction
        {
            public Object get(WcSpaceUsrDetailImpl obj)
            {
                return obj.getPermissionAction();
            }

            public void put(WcSpaceUsrDetailImpl obj, Object value)
            {
                obj.setPermissionAction((String)value);
            }
        }
        ,
        Version
        {
            public Object get(WcSpaceUsrDetailImpl obj)
            {
                return obj.getVersion();
            }

            public void put(WcSpaceUsrDetailImpl obj, Object value)
            {
                obj.setVersion((Number)value);
            }
        }
        ,
        CreatedBy
        {
            public Object get(WcSpaceUsrDetailImpl obj)
            {
                return obj.getCreatedBy();
            }

            public void put(WcSpaceUsrDetailImpl obj, Object value)
            {
                obj.setCreatedBy((String)value);
            }
        }
        ,
        CreateDate
        {
            public Object get(WcSpaceUsrDetailImpl obj)
            {
                return obj.getCreateDate();
            }

            public void put(WcSpaceUsrDetailImpl obj, Object value)
            {
                obj.setCreateDate((Timestamp)value);
            }
        }
        ,
        UpdatedBy
        {
            public Object get(WcSpaceUsrDetailImpl obj)
            {
                return obj.getUpdatedBy();
            }

            public void put(WcSpaceUsrDetailImpl obj, Object value)
            {
                obj.setUpdatedBy((String)value);
            }
        }
        ,
        LastUpdateDate
        {
            public Object get(WcSpaceUsrDetailImpl obj)
            {
                return obj.getLastUpdateDate();
            }

            public void put(WcSpaceUsrDetailImpl obj, Object value)
            {
                obj.setLastUpdateDate((Timestamp)value);
            }
        }
        ,
        GroupSpaceType
        {
            public Object get(WcSpaceUsrDetailImpl obj)
            {
                return obj.getGroupSpaceType();
            }

            public void put(WcSpaceUsrDetailImpl obj, Object value)
            {
                obj.setGroupSpaceType((String)value);
            }
        }
        ,
        PermissionName
        {
            public Object get(WcSpaceUsrDetailImpl obj)
            {
                return obj.getPermissionName();
            }

            public void put(WcSpaceUsrDetailImpl obj, Object value)
            {
                obj.setPermissionName((String)value);
            }
        }
        ,
        WcSpaceHeader
        {
            public Object get(WcSpaceUsrDetailImpl obj)
            {
                return obj.getWcSpaceHeader();
            }

            public void put(WcSpaceUsrDetailImpl obj, Object value)
            {
                obj.setWcSpaceHeader((WcSpaceHeaderImpl)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(WcSpaceUsrDetailImpl object);

        public abstract void put(WcSpaceUsrDetailImpl object, Object value);

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
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
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
    public static final int APPLICATIONID = AttributesEnum.ApplicationId.index();
    public static final int USERGUID = AttributesEnum.UserGuid.index();
    public static final int SPACEID = AttributesEnum.SpaceId.index();
    public static final int USERID = AttributesEnum.UserId.index();
    public static final int ISGROUP = AttributesEnum.IsGroup.index();
    public static final int SPACEGUID = AttributesEnum.SpaceGuid.index();
    public static final int SPACEROLE = AttributesEnum.SpaceRole.index();
    public static final int PERMISSIONACTION = AttributesEnum.PermissionAction.index();
    public static final int VERSION = AttributesEnum.Version.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDATE = AttributesEnum.CreateDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int GROUPSPACETYPE = AttributesEnum.GroupSpaceType.index();
    public static final int PERMISSIONNAME = AttributesEnum.PermissionName.index();
    public static final int WCSPACEHEADER = AttributesEnum.WcSpaceHeader.index();

    /**
     * This is the default constructor (do not remove).
     */
    public WcSpaceUsrDetailImpl()
    {
    }

    /**
     * Gets the attribute value for ApplicationId, using the alias name ApplicationId.
     * @return the ApplicationId
     */
    public String getApplicationId()
    {
        return (String)getAttributeInternal(APPLICATIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ApplicationId.
     * @param value value to set the ApplicationId
     */
    public void setApplicationId(String value)
    {
        setAttributeInternal(APPLICATIONID, value);
    }

    /**
     * Gets the attribute value for UserGuid, using the alias name UserGuid.
     * @return the UserGuid
     */
    public String getUserGuid()
    {
        return (String)getAttributeInternal(USERGUID);
    }

    /**
     * Sets <code>value</code> as the attribute value for UserGuid.
     * @param value value to set the UserGuid
     */
    public void setUserGuid(String value)
    {
        setAttributeInternal(USERGUID, value);
    }

    /**
     * Gets the attribute value for SpaceId, using the alias name SpaceId.
     * @return the SpaceId
     */
    public String getSpaceId()
    {
        return (String)getAttributeInternal(SPACEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SpaceId.
     * @param value value to set the SpaceId
     */
    public void setSpaceId(String value)
    {
        setAttributeInternal(SPACEID, value);
    }

    /**
     * Gets the attribute value for UserId, using the alias name UserId.
     * @return the UserId
     */
    public String getUserId()
    {
        return (String)getAttributeInternal(USERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for UserId.
     * @param value value to set the UserId
     */
    public void setUserId(String value)
    {
        setAttributeInternal(USERID, value);
    }

    /**
     * Gets the attribute value for IsGroup, using the alias name IsGroup.
     * @return the IsGroup
     */
    public String getIsGroup()
    {
        return (String)getAttributeInternal(ISGROUP);
    }

    /**
     * Sets <code>value</code> as the attribute value for IsGroup.
     * @param value value to set the IsGroup
     */
    public void setIsGroup(String value)
    {
        setAttributeInternal(ISGROUP, value);
    }

    /**
     * Gets the attribute value for SpaceGuid, using the alias name SpaceGuid.
     * @return the SpaceGuid
     */
    public String getSpaceGuid()
    {
        return (String)getAttributeInternal(SPACEGUID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SpaceGuid.
     * @param value value to set the SpaceGuid
     */
    public void setSpaceGuid(String value)
    {
        setAttributeInternal(SPACEGUID, value);
    }

    /**
     * Gets the attribute value for SpaceRole, using the alias name SpaceRole.
     * @return the SpaceRole
     */
    public String getSpaceRole()
    {
        return (String)getAttributeInternal(SPACEROLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for SpaceRole.
     * @param value value to set the SpaceRole
     */
    public void setSpaceRole(String value)
    {
        setAttributeInternal(SPACEROLE, value);
    }

    /**
     * Gets the attribute value for PermissionAction, using the alias name PermissionAction.
     * @return the PermissionAction
     */
    public String getPermissionAction()
    {
        return (String)getAttributeInternal(PERMISSIONACTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for PermissionAction.
     * @param value value to set the PermissionAction
     */
    public void setPermissionAction(String value)
    {
        setAttributeInternal(PERMISSIONACTION, value);
    }

    /**
     * Gets the attribute value for Version, using the alias name Version.
     * @return the Version
     */
    public Number getVersion()
    {
        return (Number)getAttributeInternal(VERSION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Version.
     * @param value value to set the Version
     */
    public void setVersion(Number value)
    {
        setAttributeInternal(VERSION, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the CreatedBy
     */
    public String getCreatedBy()
    {
        return (String)getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(String value)
    {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CreateDate, using the alias name CreateDate.
     * @return the CreateDate
     */
    public Timestamp getCreateDate()
    {
        return (Timestamp)getAttributeInternal(CREATEDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreateDate.
     * @param value value to set the CreateDate
     */
    public void setCreateDate(Timestamp value)
    {
        setAttributeInternal(CREATEDATE, value);
    }

    /**
     * Gets the attribute value for UpdatedBy, using the alias name UpdatedBy.
     * @return the UpdatedBy
     */
    public String getUpdatedBy()
    {
        return (String)getAttributeInternal(UPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for UpdatedBy.
     * @param value value to set the UpdatedBy
     */
    public void setUpdatedBy(String value)
    {
        setAttributeInternal(UPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LastUpdateDate, using the alias name LastUpdateDate.
     * @return the LastUpdateDate
     */
    public Timestamp getLastUpdateDate()
    {
        return (Timestamp)getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdateDate.
     * @param value value to set the LastUpdateDate
     */
    public void setLastUpdateDate(Timestamp value)
    {
        setAttributeInternal(LASTUPDATEDATE, value);
    }

    /**
     * Gets the attribute value for GroupSpaceType, using the alias name GroupSpaceType.
     * @return the GroupSpaceType
     */
    public String getGroupSpaceType()
    {
        return (String)getAttributeInternal(GROUPSPACETYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for GroupSpaceType.
     * @param value value to set the GroupSpaceType
     */
    public void setGroupSpaceType(String value)
    {
        setAttributeInternal(GROUPSPACETYPE, value);
    }

    /**
     * Gets the attribute value for PermissionName, using the alias name PermissionName.
     * @return the PermissionName
     */
    public String getPermissionName()
    {
        return (String)getAttributeInternal(PERMISSIONNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for PermissionName.
     * @param value value to set the PermissionName
     */
    public void setPermissionName(String value)
    {
        setAttributeInternal(PERMISSIONNAME, value);
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
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count()))
        {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
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
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count()))
        {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }

    /**
     * @return the associated entity WcSpaceHeaderImpl.
     */
    public WcSpaceHeaderImpl getWcSpaceHeader()
    {
        return (WcSpaceHeaderImpl)getAttributeInternal(WCSPACEHEADER);
    }

    /**
     * Sets <code>value</code> as the associated entity WcSpaceHeaderImpl.
     */
    public void setWcSpaceHeader(WcSpaceHeaderImpl value)
    {
        setAttributeInternal(WCSPACEHEADER, value);
    }

    /**
     * @param applicationId key constituent
     * @param userGuid key constituent
     * @param spaceGuid key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(String applicationId, String userGuid,
                                       String spaceGuid)
    {
        return new Key(new Object[]{applicationId, userGuid, spaceGuid});
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject()
    {
        if (mDefinitionObject == null)
        {
            mDefinitionObject = (WcSpaceUsrDetailDefImpl)EntityDefImpl.findDefObject("au.com.leighton.portal.peoplefinder.model.WcSpaceUsrDetail");
        }
        return mDefinitionObject;
    }
}
