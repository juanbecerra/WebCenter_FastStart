package au.com.leighton.portal.peoplefinder.model;

import com.sun.org.apache.xml.internal.security.utils.Base64;

import java.io.Serializable;


public class WCSConnectionItem implements Serializable{

    @SuppressWarnings("compatibility:6036297802200899915")
    private static final long serialVersionUID = 1L; 
  private String ownerUsername;
  private String connectionUsername;
  private String connectionId;
  private String connectionDisplayName;
  private String connectionEmail;
  private String creationDate;
  private byte[] connectionLogo;
  private String connectionLogoImage;


    public void setOwnerUsername(String ownerUsername) {
        this.ownerUsername = ownerUsername;
    }

    public String getOwnerUsername() {
        return ownerUsername;
    }

    public void setConnectionUsername(String connectionUsername) {
        this.connectionUsername = connectionUsername;
    }

    public String getConnectionUsername() {
        return connectionUsername;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionDisplayName(String connectionDisplayName) {
        this.connectionDisplayName = connectionDisplayName;
    }

    public String getConnectionDisplayName() {
        return connectionDisplayName;
    }

    public void setConnectionEmail(String connectionEmail) {
        this.connectionEmail = connectionEmail;
    }

    public String getConnectionEmail() {
        return connectionEmail;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setConnectionLogo(byte[] connectionLogo) {
        this.connectionLogo = connectionLogo;
    }

    public byte[] getConnectionLogo() {
        return connectionLogo;
    }

    
    public String getConnectionLogoImage() {
        //getConnectionLogo!=null
      if (connectionLogoImage == null)
      {
                                     
      
        if (getConnectionLogo() != null && getConnectionLogo().length>0 )
        {
          StringBuffer sb = new StringBuffer("data:image/jpg;base64,");

          sb.append(Base64.encode(getConnectionLogo()));

          connectionLogoImage = sb.toString();
        }
        else
        {
          connectionLogoImage = "/nophoto.png";
        }

      }        
        
        return connectionLogoImage;
        
    }
}
