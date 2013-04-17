package com.abhi.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;

public class TaskList {
    public TaskList() {
        super();
    }
    
    private java.util.List<Tasks> list = new ArrayList<Tasks>();

    public void setList(java.util.List<Tasks> list) {
        this.list = list;
    }

    public java.util.List<Tasks> getList() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        if(list.size() == 0) {
            
            Tasks first = new Tasks();
            Incident one = new Incident();
            one.setNumber("INC0000001");
            one.setDescription("Can't read email");
            one.setOpenedDate(format.parse("12/11/2012"));
            one.setActivityDesc("2011-06-14 11:24:13  pat  - Changed:  Assigned to, Configuration item, Impact, Incident state, Opened by, Priority\n Assigned to: Charlie Whitherspoon\n Configuration item: MailServerUS");
            one.setUrl("https://demo021.service-now.com/incident.do?sys_id=9c573169c611228700193229fff72400");
            first.setIncident(one);
            
            Tasks second = new Tasks();
            Incident two = new Incident();
            two.setNumber("INC0000002");
            two.setDescription("Can't get to network file shares");
            two.setOpenedDate(format.parse("18/11/2012"));
            two.setActivityDesc("2011-06-15 15:30:06  pat  - Changed:  Assigned to, Configuration item, Impact, Incident state, Opened by, Priority\n Assigned to: Howard Johnson\n Configuration item: FileServerFloor2\nImpact: 1 - High\nPriority: 4 - Low");
            two.setUrl("https://demo021.service-now.com/incident.do?sys_id=9d385017c611228701d22104cc95c371");
            second.setIncident(two);
            
            Tasks third = new Tasks();
            Incident three = new Incident();
            three.setNumber("INC0000003");
            three.setDescription("Wireless access not available on floor 3");
            three.setOpenedDate(format.parse("01/10/2012"));
            three.setActivityDesc("2011-05-06 07:41:46  System Administrator  - Changed:  Assigned to, Impact, Incident state, Opened by, Priority\nAssigned to: Beth Anglin\nImpact: 1 - High\nIncident state: New\nOpened by: ITIL User\nPriority: 4 - Low");
            three.setUrl("https://demo021.service-now.com/incident.do?sys_id=e8caedcbc0a80164017df472f39eaed1");
            third.setIncident(three);
            
            Tasks fourth = new Tasks();
            Incident four = new Incident();
            four.setNumber("INC0000004");
            four.setDescription("Forgot email password");
            four.setOpenedDate(format.parse("19/11/2012"));
            four.setActivityDesc("2011-06-14 15:34:12  pat  - Changed:  Assigned to, Impact, Incident state, Opened by, Priorit\nAssigned to: Bud Richman\nImpact: 1 - High\nIncident state: Closed\nOpened by: ITIL User\nPriority: 4 - Low");
            four.setUrl("https://demo021.service-now.com/incident.do?sys_id=9d3c1197c611228701cd1d94bc32d76d");
            fourth.setIncident(four);
            
            Tasks realFirst = new Tasks();
            realFirst.setDescription("Order approval");
            realFirst.setOpened(new java.util.Date());
            realFirst.setId("Ebiz0001");
            realFirst.setType("Oracle Apps");
                       
            Tasks realThird = new Tasks();
            realThird.setDescription("Invoice review");
            realThird.setOpened(new Date());
            realThird.setId("PRS:000001");
            realThird.setType("Invoice Review System");
            
            
            list.add(realFirst);
            list.add(second);
            list.add(realThird);
            list.add(first);
            list.add(third);
            list.add(fourth);
        }
        return list;
    }
}
