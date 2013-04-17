package au.com.leicon.socialmedia.entity;

import java.io.Serializable;

import javax.xml.datatype.XMLGregorianCalendar;

public class YouTube implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String fromName;
    private String title;
    private String message;
    private XMLGregorianCalendar createdTime;
    private String createdTimeText;
    private String img;
    private String link;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getFromName() {
        return fromName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setCreatedTime(XMLGregorianCalendar createdTime) {
        this.createdTime = createdTime;
    }

    public XMLGregorianCalendar getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTimeText(String createdTimeText) {
        this.createdTimeText = createdTimeText;
    }

    public String getCreatedTimeText() {
        return createdTimeText;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getImg() {
        return img;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }
}
