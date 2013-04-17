package au.com.leighton.portal.aggregatedtasklist.model.tasklistaggregrator;


import au.com.leighton.portal.aggregatedtasklist.model.util.DateUtil;

import au.com.leighton.portal.aggregatedtasklist.model.util.LogUtility;

import java.io.Serializable;

import java.util.Date;

public class AggregatorTask implements Serializable{

    private static final long serialVersionUID = 1L;
    private int id;
    private String system;
    private String subject;
    private Date dueDate;
    private String url;
    private int daysRemaining;
    private int daysRemainingSort;

    public AggregatorTask(int id) {
        super();
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getSystem() {
        return system;
    }

    public void setSubject(String description) {
        this.subject = description;
    }

    public String getSubject() {
        return subject;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public int getDaysRemaining() {
        int daysRemaining = 0;
        if (getDueDate() != null) {
            Date now = new Date();
            Date dateDue = getDueDate();
            if (now.equals(dateDue)) {
                // Due now or overdue
                daysRemaining = 0;
            } else {
                daysRemaining = DateUtil.daysDifference(now, dateDue);
            }
        }
        return daysRemaining;
    }

    public int getDaysRemainingSort() {
        int daysRemainingSort = 10000;
        if (getDueDate() != null) {
            daysRemainingSort = getDaysRemaining();
        }
        LogUtility.logFine("daysRemainingSort for " + getSystem() + "=" + daysRemainingSort);

        return daysRemainingSort;
    }

}
