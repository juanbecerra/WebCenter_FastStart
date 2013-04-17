package au.com.leighton.mytrainingadmin.model.view;

import au.com.leighton.mytrainingadmin.model.view.common.MyTrainingCategory_VORow;

import java.sql.SQLIntegrityConstraintViolationException;

import oracle.jbo.AttributeDef;
import oracle.jbo.DMLConstraintException;
import oracle.jbo.JboException;
import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jun 06 19:24:52 IST 2012
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MyTrainingCategory_VORowImpl extends ViewRowImpl implements MyTrainingCategory_VORow {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        CategoryId {
            public Object get(MyTrainingCategory_VORowImpl obj) {
                return obj.getCategoryId();
            }

            public void put(MyTrainingCategory_VORowImpl obj, Object value) {
                obj.setCategoryId((Number)value);
            }
        },
        Name {
            public Object get(MyTrainingCategory_VORowImpl obj) {
                return obj.getName();
            }

            public void put(MyTrainingCategory_VORowImpl obj, Object value) {
                obj.setName((String)value);
            }
        },
        MyCourses_VO1 {
            public Object get(MyTrainingCategory_VORowImpl obj) {
                return obj.getMyCourses_VO1();
            }

            public void put(MyTrainingCategory_VORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        MyTrainingCategory_VO1 {
            public Object get(MyTrainingCategory_VORowImpl obj) {
                return obj.getMyTrainingCategory_VO1();
            }

            public void put(MyTrainingCategory_VORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(MyTrainingCategory_VORowImpl object);

        public abstract void put(MyTrainingCategory_VORowImpl object,
                                 Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() +
                AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int CATEGORYID = AttributesEnum.CategoryId.index();
    public static final int NAME = AttributesEnum.Name.index();
    public static final int MYCOURSES_VO1 =
        AttributesEnum.MyCourses_VO1.index();
    public static final int MYTRAININGCATEGORY_VO1 =
        AttributesEnum.MyTrainingCategory_VO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MyTrainingCategory_VORowImpl() {
    }

    /**
     * Gets MytrainingCategories_EO entity object.
     * @return the MytrainingCategories_EO
     */
    public EntityImpl getMytrainingCategories_EO() {
        return (EntityImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for CATEGORY_ID using the alias name CategoryId.
     * @return the CATEGORY_ID
     */
    public Number getCategoryId() {
        return (Number)getAttributeInternal(CATEGORYID);
    }

    /**
     * Sets <code>value</code> as attribute value for CATEGORY_ID using the alias name CategoryId.
     * @param value value to set the CATEGORY_ID
     */
    public void setCategoryId(Number value) {
        setAttributeInternal(CATEGORYID, value);
    }

    /**
     * Gets the attribute value for NAME using the alias name Name.
     * @return the NAME
     */
    public String getName() {
        return (String)getAttributeInternal(NAME);
    }

    /**
     * Sets <code>value</code> as attribute value for NAME using the alias name Name.
     * @param value value to set the NAME
     */
    public void setName(String value) {
        setAttributeInternal(NAME, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> MyCourses_VO1.
     */
    public RowSet getMyCourses_VO1() {
        return (RowSet)getAttributeInternal(MYCOURSES_VO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> MyTrainingCategory_VO1.
     */
    public RowSet getMyTrainingCategory_VO1() {
        return (RowSet)getAttributeInternal(MYTRAININGCATEGORY_VO1);
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
        if ((index >= AttributesEnum.firstIndex()) &&
            (index < AttributesEnum.count())) {
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
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) &&
            (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index -
                AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }

    public void deletCategory(Number CategoryId) {
        RowSet rowsList = null;
        RowSet categoryrowsList = null;

        rowsList = getMyCourses_VO1();
        categoryrowsList = getMyTrainingCategory_VO1();
        
        Row[] rowscount = rowsList.getFilteredRows("CategoryId", CategoryId);
        Row[] rowsdelete = categoryrowsList.getFilteredRows("CategoryId", CategoryId);
       
        if (rowscount.length > 0) {
            System.out.println("Exception Duplicate Key on refference Table");
            throw new JboException("Cannot delete Category Name used in Other Tables.",
                                   "", null);
        } else {
                Row rw = rowsdelete[0];
                rw.remove();
              //  this.getDBTransaction().commit();
            }
           
       

    }


}