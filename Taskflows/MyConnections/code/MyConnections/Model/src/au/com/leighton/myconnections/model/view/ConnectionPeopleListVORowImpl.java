package au.com.leighton.myconnections.model.view;

import com.sun.org.apache.xml.internal.security.utils.Base64;

import oracle.jbo.domain.BlobDomain;
import oracle.jbo.domain.Date;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu May 17 16:45:51 IST 2012
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ConnectionPeopleListVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Username {
            public Object get(ConnectionPeopleListVORowImpl obj) {
                return obj.getUsername();
            }

            public void put(ConnectionPeopleListVORowImpl obj, Object value) {
                obj.setUsername((String)value);
            }
        },
        ConnectionId {
            public Object get(ConnectionPeopleListVORowImpl obj) {
                return obj.getConnectionId();
            }

            public void put(ConnectionPeopleListVORowImpl obj, Object value) {
                obj.setConnectionId((String)value);
            }
        },
        ConnectionUsername {
            public Object get(ConnectionPeopleListVORowImpl obj) {
                return obj.getConnectionUsername();
            }

            public void put(ConnectionPeopleListVORowImpl obj, Object value) {
                obj.setConnectionUsername((String)value);
            }
        },
        ConnectionDisplayName {
            public Object get(ConnectionPeopleListVORowImpl obj) {
                return obj.getConnectionDisplayName();
            }

            public void put(ConnectionPeopleListVORowImpl obj, Object value) {
                obj.setConnectionDisplayName((String)value);
            }
        },
        ConnectionEmail {
            public Object get(ConnectionPeopleListVORowImpl obj) {
                return obj.getConnectionEmail();
            }

            public void put(ConnectionPeopleListVORowImpl obj, Object value) {
                obj.setConnectionEmail((String)value);
            }
        },
        CreationDate {
            public Object get(ConnectionPeopleListVORowImpl obj) {
                return obj.getCreationDate();
            }

            public void put(ConnectionPeopleListVORowImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        },
        Id {
            public Object get(ConnectionPeopleListVORowImpl obj) {
                return obj.getId();
            }

            public void put(ConnectionPeopleListVORowImpl obj, Object value) {
                obj.setId((String)value);
            }
        },
        UserGuid {
            public Object get(ConnectionPeopleListVORowImpl obj) {
                return obj.getUserGuid();
            }

            public void put(ConnectionPeopleListVORowImpl obj, Object value) {
                obj.setUserGuid((String)value);
            }
        },
        PhotoSize {
            public Object get(ConnectionPeopleListVORowImpl obj) {
                return obj.getPhotoSize();
            }

            public void put(ConnectionPeopleListVORowImpl obj, Object value) {
                obj.setPhotoSize((String)value);
            }
        },
        ImageData {
            public Object get(ConnectionPeopleListVORowImpl obj) {
                return obj.getImageData();
            }

            public void put(ConnectionPeopleListVORowImpl obj, Object value) {
                obj.setImageData((BlobDomain)value);
            }
        },
        profileImage {
            public Object get(ConnectionPeopleListVORowImpl obj) {
                return obj.getprofileImage();
            }

            public void put(ConnectionPeopleListVORowImpl obj, Object value) {
                obj.setprofileImage((String)value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(ConnectionPeopleListVORowImpl object);

        public abstract void put(ConnectionPeopleListVORowImpl object,
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


    public static final int USERNAME = AttributesEnum.Username.index();
    public static final int CONNECTIONID = AttributesEnum.ConnectionId.index();
    public static final int CONNECTIONUSERNAME =
        AttributesEnum.ConnectionUsername.index();
    public static final int CONNECTIONDISPLAYNAME =
        AttributesEnum.ConnectionDisplayName.index();
    public static final int CONNECTIONEMAIL =
        AttributesEnum.ConnectionEmail.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int ID = AttributesEnum.Id.index();
    public static final int USERGUID = AttributesEnum.UserGuid.index();
    public static final int PHOTOSIZE = AttributesEnum.PhotoSize.index();
    public static final int IMAGEDATA = AttributesEnum.ImageData.index();
    public static final int PROFILEIMAGE = AttributesEnum.profileImage.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ConnectionPeopleListVORowImpl() {
    }

    /**
     * Gets WcPeopleConnProfilePhoto entity object.
     * @return the WcPeopleConnProfilePhoto
     */
    public EntityImpl getWcPeopleConnProfilePhoto() {
        return (EntityImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for the calculated attribute Username.
     * @return the Username
     */
    public String getUsername() {
        return (String)getAttributeInternal(USERNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Username.
     * @param value value to set the  Username
     */
    public void setUsername(String value) {
        setAttributeInternal(USERNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ConnectionId.
     * @return the ConnectionId
     */
    public String getConnectionId() {
        return (String)getAttributeInternal(CONNECTIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ConnectionId.
     * @param value value to set the  ConnectionId
     */
    public void setConnectionId(String value) {
        setAttributeInternal(CONNECTIONID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ConnectionUsername.
     * @return the ConnectionUsername
     */
    public String getConnectionUsername() {
        return (String)getAttributeInternal(CONNECTIONUSERNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ConnectionUsername.
     * @param value value to set the  ConnectionUsername
     */
    public void setConnectionUsername(String value) {
        setAttributeInternal(CONNECTIONUSERNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ConnectionDisplayName.
     * @return the ConnectionDisplayName
     */
    public String getConnectionDisplayName() {
        return (String)getAttributeInternal(CONNECTIONDISPLAYNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ConnectionDisplayName.
     * @param value value to set the  ConnectionDisplayName
     */
    public void setConnectionDisplayName(String value) {
        setAttributeInternal(CONNECTIONDISPLAYNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ConnectionEmail.
     * @return the ConnectionEmail
     */
    public String getConnectionEmail() {
        return (String)getAttributeInternal(CONNECTIONEMAIL);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ConnectionEmail.
     * @param value value to set the  ConnectionEmail
     */
    public void setConnectionEmail(String value) {
        setAttributeInternal(CONNECTIONEMAIL, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CreationDate.
     * @return the CreationDate
     */
    public Date getCreationDate() {
        return (Date)getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CreationDate.
     * @param value value to set the  CreationDate
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for ID using the alias name Id.
     * @return the ID
     */
    public String getId() {
        return (String)getAttributeInternal(ID);
    }

    /**
     * Sets <code>value</code> as attribute value for ID using the alias name Id.
     * @param value value to set the ID
     */
    public void setId(String value) {
        setAttributeInternal(ID, value);
    }

    /**
     * Gets the attribute value for USER_GUID using the alias name UserGuid.
     * @return the USER_GUID
     */
    public String getUserGuid() {
        return (String)getAttributeInternal(USERGUID);
    }

    /**
     * Sets <code>value</code> as attribute value for USER_GUID using the alias name UserGuid.
     * @param value value to set the USER_GUID
     */
    public void setUserGuid(String value) {
        setAttributeInternal(USERGUID, value);
    }

    /**
     * Gets the attribute value for PHOTO_SIZE using the alias name PhotoSize.
     * @return the PHOTO_SIZE
     */
    public String getPhotoSize() {
        return (String)getAttributeInternal(PHOTOSIZE);
    }

    /**
     * Sets <code>value</code> as attribute value for PHOTO_SIZE using the alias name PhotoSize.
     * @param value value to set the PHOTO_SIZE
     */
    public void setPhotoSize(String value) {
        setAttributeInternal(PHOTOSIZE, value);
    }

    /**
     * Gets the attribute value for IMAGE_DATA using the alias name ImageData.
     * @return the IMAGE_DATA
     */
    public BlobDomain getImageData() {
        return (BlobDomain)getAttributeInternal(IMAGEDATA);
    }

    /**
     * Sets <code>value</code> as attribute value for IMAGE_DATA using the alias name ImageData.
     * @param value value to set the IMAGE_DATA
     */
    public void setImageData(BlobDomain value) {
        setAttributeInternal(IMAGEDATA, value);
    }


    /**
     * Gets the attribute value for the calculated attribute profileImage.
     * @return the profileImage
     */
    public String getprofileImage() {
        byte[] byteimg = getImageData().toByteArray();
        String pfImage="";
        if(byteimg.length>1){
        StringBuffer sb = new StringBuffer("data:image/jpg;base64,");
        sb.append(Base64.encode(byteimg));
         pfImage = sb.toString();
        }else{
            pfImage = "/nophoto.png";
        }
        return pfImage;
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute profileImage.
     * @param value value to set the  profileImage
     */
    public void setprofileImage(String value) {
        setAttributeInternal(PROFILEIMAGE, value);
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
    
}
