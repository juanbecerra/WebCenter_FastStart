package com.abhi.view;

import java.util.Date;

public class Tasks {
    public Tasks() {
        super();
    }
    private String type;
    private Incident incident;
    private String source;
    private Date opened;
    private String description;
    private String id;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        if(incident != null) {
            return "Service Now";
        }
        return type;
    }

    public void setIncident(Incident incident) {
        this.incident = incident;
    }

    public Incident getIncident() {
        return incident;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return source;
    }

    public void setOpened(Date opened) {
        this.opened = opened;
    }

    public Date getOpened() {
        if (incident == null)
            return opened;
        else
            return incident.getOpenedDate();

    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        if (incident == null)
            return description;
        else
            return incident.getDescription();
    }

    public Date getOpened1() {
        return opened;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        if(incident == null)
        return id;
        else
            return incident.getNumber();
    }
}
