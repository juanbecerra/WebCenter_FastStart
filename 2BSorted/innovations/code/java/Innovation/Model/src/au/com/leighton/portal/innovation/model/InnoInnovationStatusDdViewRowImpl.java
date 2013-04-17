package au.com.leighton.portal.innovation.model;

import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Aug 17 11:51:41 EST 2011
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class InnoInnovationStatusDdViewRowImpl extends ViewRowImpl
{
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum
    {
        StatusName
        {
            public Object get(InnoInnovationStatusDdViewRowImpl obj)
            {
                return obj.getStatusName();
            }

            public void put(InnoInnovationStatusDdViewRowImpl obj,
                            Object value)
            {
                obj.setStatusName((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(InnoInnovationStatusDdViewRowImpl object);

        public abstract void put(InnoInnovationStatusDdViewRowImpl object,
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
    public static final int STATUSNAME = AttributesEnum.StatusName.index();

    /**
     * This is the default constructor (do not remove).
     */
    public InnoInnovationStatusDdViewRowImpl()
    {
    }

    /**
     * Gets the attribute value for the calculated attribute StatusName.
     * @return the StatusName
     */
    public String getStatusName()
    {
        return (String) getAttributeInternal(STATUSNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute StatusName.
     * @param value value to set the  StatusName
     */
    public void setStatusName(String value)
    {
        setAttributeInternal(STATUSNAME, value);
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
}
