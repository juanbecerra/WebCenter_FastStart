package au.com.leighton.mylinks.model.entity;

import au.com.leighton.mylinks.model.util.EnvironmentUtil;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Jun 07 12:08:40 IST 2012
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class Mylinks_EOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        MylinksId {
            public Object get(Mylinks_EOImpl obj) {
                return obj.getMylinksId();
            }

            public void put(Mylinks_EOImpl obj, Object value) {
                obj.setMylinksId((Number)value);
            }
        }
        ,
        Displayname {
            public Object get(Mylinks_EOImpl obj) {
                return obj.getDisplayname();
            }

            public void put(Mylinks_EOImpl obj, Object value) {
                obj.setDisplayname((String)value);
            }
        }
        ,
        Url {
            public Object get(Mylinks_EOImpl obj) {
                return obj.getUrl();
            }

            public void put(Mylinks_EOImpl obj, Object value) {
                obj.setUrl((String)value);
            }
        }
        ,
        Username {
            public Object get(Mylinks_EOImpl obj) {
                return obj.getUsername();
            }

            public void put(Mylinks_EOImpl obj, Object value) {
                obj.setUsername((String)value);
            }
        }
        ,
        Newpage {
            public Object get(Mylinks_EOImpl obj) {
                return obj.getNewpage();
            }

            public void put(Mylinks_EOImpl obj, Object value) {
                obj.setNewpage((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(Mylinks_EOImpl object);

        public abstract void put(Mylinks_EOImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int MYLINKSID = AttributesEnum.MylinksId.index();
    public static final int DISPLAYNAME = AttributesEnum.Displayname.index();
    public static final int URL = AttributesEnum.Url.index();
    public static final int USERNAME = AttributesEnum.Username.index();
    public static final int NEWPAGE = AttributesEnum.Newpage.index();

    /**
     * This is the default constructor (do not remove).
     */
    public Mylinks_EOImpl() {
    }

    /**
     * Gets the attribute value for MylinksId, using the alias name MylinksId.
     * @return the MylinksId
     */
    public Number getMylinksId() {
        return (Number)getAttributeInternal(MYLINKSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for MylinksId.
     * @param value value to set the MylinksId
     */
    public void setMylinksId(Number value) {
        setAttributeInternal(MYLINKSID, value);
    }

    /**
     * Gets the attribute value for Displayname, using the alias name Displayname.
     * @return the Displayname
     */
    public String getDisplayname() {
        return (String)getAttributeInternal(DISPLAYNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for Displayname.
     * @param value value to set the Displayname
     */
    public void setDisplayname(String value) {
        setAttributeInternal(DISPLAYNAME, value);
    }

    /**
     * Gets the attribute value for Url, using the alias name Url.
     * @return the Url
     */
    public String getUrl() {
        return (String)getAttributeInternal(URL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Url.
     * @param value value to set the Url
     */
    public void setUrl(String value) {
        setAttributeInternal(URL, value);
    }

    /**
     * Gets the attribute value for Username, using the alias name Username.
     * @return the Username
     */
    public String getUsername() {
        return (String)getAttributeInternal(USERNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for Username.
     * @param value value to set the Username
     */
    public void setUsername(String value) {
        setAttributeInternal(USERNAME, value);
    }

    /**
     * Gets the attribute value for Newpage, using the alias name Newpage.
     * @return the Newpage
     */
    public String getNewpage() {
        return (String)getAttributeInternal(NEWPAGE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Newpage.
     * @param value value to set the Newpage
     */
    public void setNewpage(String value) {
        setAttributeInternal(NEWPAGE, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
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
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }

    /**
     * @param mylinksId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number mylinksId) {
        return new Key(new Object[]{mylinksId});
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("au.com.leighton.mylinks.model.entity.Mylinks_EO");
        }
        return mDefinitionObject;
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        String username = EnvironmentUtil.getUsername();
        setUsername(username);
        super.create(attributeList);
    }
}
