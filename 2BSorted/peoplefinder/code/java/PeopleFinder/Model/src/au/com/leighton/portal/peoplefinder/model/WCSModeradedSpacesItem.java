package au.com.leighton.portal.peoplefinder.model;

import java.io.Serializable;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.GregorianCalendar;

import javax.xml.bind.annotation.XmlElement;

import oracle.jbo.domain.Timestamp;

public class WCSModeradedSpacesItem implements Serializable{


    @SuppressWarnings("compatibility:-6446223384227533332")
    private static final long serialVersionUID = 1L;
  private String spaceId;
  private String spaceDisplayName;
  private String spaceDescription;
  private String spaceLogo;
  private String spaceCreateDate;
  private String spaceLastUpdate;
  private String spaceMemberCount;
  private String spaceuserid;
  private String spaceGuid;
  private String spaceRole;
  private String spacePermissionAction;

    public void setSpaceId(String spaceId) {
        this.spaceId = spaceId;
    }

    public String getSpaceId() {
        return spaceId;
    }

    public void setSpaceDisplayName(String spaceDisplayName) {
        this.spaceDisplayName = spaceDisplayName;
    }

    public String getSpaceDisplayName() {
        return spaceDisplayName;
    }

    public void setSpaceDescription(String spaceDescription) {
        this.spaceDescription = spaceDescription;
    }

    public String getSpaceDescription() {
        return spaceDescription;
    }

    public void setSpaceLogo(String spaceLogo) {
        this.spaceLogo = spaceLogo;
    }

    public String getSpaceLogo() {
        return spaceLogo;
    }

    public void setSpaceCreateDate(String spaceCreateDate) {
        this.spaceCreateDate = spaceCreateDate;
    }

    public String getSpaceCreateDate() {
        return spaceCreateDate;
    }

    public void setSpaceLastUpdate(String spaceLastUpdate) {
        this.spaceLastUpdate = spaceLastUpdate;
    }

    public String getSpaceLastUpdate() {
        
        

      StringBuffer result = new StringBuffer();

      if (spaceLastUpdate != null)
      {
          GregorianCalendar now = new GregorianCalendar();
          GregorianCalendar update = new GregorianCalendar();
          SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
          try {
                update.setTime(dateFormat.parse(spaceLastUpdate));
            } catch (ParseException e) {
              return "Last Activity "+spaceLastUpdate;
            }
          
          long n = now.getTimeInMillis();
          long u = update.getTimeInMillis();

          long milliseconds = n - u;

          int days = (int)(milliseconds / (1000L * 60L * 60L * 24L));

          result.append("Last Activity ");

          if (days == 0)
          {
              result.append("Today");
          }
          else
          {
              result.append(days);
              result.append(" day");

              if (days > 1)
              {
                  result.append("s");
              }

              result.append(" ago");
          }
      }

      return result.toString();        
      
    }

    public void setSpaceMemberCount(String spaceMemberCount) {
        this.spaceMemberCount = spaceMemberCount;
    }

    public String getSpaceMemberCount() {
        return spaceMemberCount;
    }

    public void setSpaceuserid(String spaceuserid) {
        this.spaceuserid = spaceuserid;
    }

    public String getSpaceuserid() {
        return spaceuserid;
    }

    public void setSpaceGuid(String spaceGuid) {
        this.spaceGuid = spaceGuid;
    }

    public String getSpaceGuid() {
        return spaceGuid;
    }

    public void setSpaceRole(String spaceRole) {
        this.spaceRole = spaceRole;
    }

    public String getSpaceRole() {
        return spaceRole;
    }

    public void setSpacePermissionAction(String spacePermissionAction) {
        this.spacePermissionAction = spacePermissionAction;
    }

    public String getSpacePermissionAction() {
        return spacePermissionAction;
    }
}
