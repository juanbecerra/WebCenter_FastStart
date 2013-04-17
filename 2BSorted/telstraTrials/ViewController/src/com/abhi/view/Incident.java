package com.abhi.view;

import java.util.Date;

public class Incident {
    public Incident() {
        super();
    }
    private String number;
    private String description;
    
    private String activityDesc;
    private Date openedDate;
    private Date closed;
    private String url;

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setActivityDesc(String activityDesc) {
        this.activityDesc = activityDesc;
    }

    public String getActivityDesc() {
        return activityDesc;
    }

    public void setOpenedDate(Date openedDate) {
        this.openedDate = openedDate;
    }

    public Date getOpenedDate() {
        return openedDate;
    }

    public void setClosed(Date closed) {
        this.closed = closed;
    }

    public Date getClosed() {
        return closed;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
