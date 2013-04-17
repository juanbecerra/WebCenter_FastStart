package au.com.leicon.socialmedia.entity;

import java.io.Serializable;

import javax.xml.datatype.XMLGregorianCalendar;

public class Twitter implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String fromName;
    private String fromId;
    private String title;
    private String message;
    private XMLGregorianCalendar createdTime;
    private String createdTimeText;
    private String img;
    private String link;
    private long commentsCount;
    private long likeCount;

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

    public void setFromId(String fromId) {
        this.fromId = fromId;
    }

    public String getFromId() {
        return fromId;
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

    public void setCommentsCount(long commentsCount) {
        this.commentsCount = commentsCount;
    }

    public long getCommentsCount() {
        return commentsCount;
    }

    public void setLikeCount(long likeCount) {
        this.likeCount = likeCount;
    }

    public long getLikeCount() {
        return likeCount;
    }

    public void setCreatedTimeText(String createdTimeText) {
        this.createdTimeText = createdTimeText;
    }

    public String getCreatedTimeText() {
        return createdTimeText;
    }
}
