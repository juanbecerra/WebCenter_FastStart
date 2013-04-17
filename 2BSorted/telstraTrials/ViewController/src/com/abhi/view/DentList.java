package com.abhi.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.component.UIXTable;

import oracle.adf.view.rich.component.rich.RichPopup;




import org.apache.myfaces.trinidad.event.SelectionEvent;

public class DentList {
    public DentList() {
        super();
    }
    private java.util.List<Incident> list = new ArrayList<Incident>();
    private Incident currentIncident;

    public void setList(java.util.List<Incident> list) {
        this.list = list;
    }

    public java.util.List<Incident> getList() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        if (list.size() == 0) {
            Incident one = new Incident();
            one.setNumber("INC0000001");
            one.setDescription("Can't read email");
            one.setOpenedDate(format.parse("12/11/2012"));
            one.setActivityDesc("2011-06-14 11:24:13  pat  - Changed:  Assigned to, Configuration item, Impact, Incident state, Opened by, Priority\n Assigned to: Charlie Whitherspoon\n Configuration item: MailServerUS");
            one.setUrl("https://demo021.service-now.com/incident.do?sys_id=9c573169c611228700193229fff72400");
            
            Incident two = new Incident();
            two.setNumber("INC0000002");
            two.setDescription("Can't get to network file shares");
            two.setOpenedDate(format.parse("18/11/2012"));
            two.setActivityDesc("2011-06-15 15:30:06  pat  - Changed:  Assigned to, Configuration item, Impact, Incident state, Opened by, Priority\n Assigned to: Howard Johnson\n Configuration item: FileServerFloor2\nImpact: 1 - High\nPriority: 4 - Low");
            two.setUrl("https://demo021.service-now.com/incident.do?sys_id=9d385017c611228701d22104cc95c371");
            
            Incident three = new Incident();
            three.setNumber("INC0000003");
            three.setDescription("Wireless access not available on floor 3");
            three.setOpenedDate(format.parse("01/10/2012"));
            three.setActivityDesc("2011-05-06 07:41:46  System Administrator  - Changed:  Assigned to, Impact, Incident state, Opened by, Priority\nAssigned to: Beth Anglin\nImpact: 1 - High\nIncident state: New\nOpened by: ITIL User\nPriority: 4 - Low");
            three.setUrl("https://demo021.service-now.com/incident.do?sys_id=e8caedcbc0a80164017df472f39eaed1");
            
            Incident four = new Incident();
            four.setNumber("INC0000004");
            four.setDescription("Forgot email password");
            four.setOpenedDate(format.parse("19/11/2012"));
            four.setActivityDesc("2011-06-14 15:34:12  pat  - Changed:  Assigned to, Impact, Incident state, Opened by, Priorit\nAssigned to: Bud Richman\nImpact: 1 - High\nIncident state: Closed\nOpened by: ITIL User\nPriority: 4 - Low");
            four.setUrl("https://demo021.service-now.com/incident.do?sys_id=9d3c1197c611228701cd1d94bc32d76d");
            list.add(one);
            list.add(two);
            list.add(three);
            list.add(four);
        }
        return list;
    }

    public void select(SelectionEvent selectionEvent) {
        // Add event code here...
     UIXTable table = (UIXTable)selectionEvent.getSource();
     Incident incident = (Incident)table.getSelectedRowData();
     currentIncident = incident;
    }

    public void setCurrentIncident(Incident currentIncident) {
        this.currentIncident = currentIncident;
    }

    public Incident getCurrentIncident() {
        return currentIncident;
    }

    public void doIt(ActionEvent actionEvent) {
        // Add event code here...
        UIComponent source = (UIComponent)actionEvent.getSource();
        RichPopup popup = (RichPopup)source.findComponent("booya");
        RichPopup.PopupHints hints = new RichPopup.PopupHints();
        hints.add(RichPopup.PopupHints.HintTypes.HINT_ALIGN_ID,
                  source).add(RichPopup.PopupHints.HintTypes.HINT_LAUNCH_ID,
                              source).add(RichPopup.PopupHints.HintTypes.HINT_ALIGN,
                                          RichPopup.PopupHints.AlignTypes.ALIGN_OVERLAP);
        popup.show(hints);
    }

    public void doItNow(ActionEvent actionEvent) {
        // Add event code here...
        FacesContext fc = FacesContext.getCurrentInstance();
            String callbackUrl = "//webcenter/faces/oracle/webcenter/page/scopedMD/s673818e8_600c_4afb_9c56_c0acf9f24ba3/Page5.jspx";
            try
            {
              fc.getExternalContext().redirect(callbackUrl);
            }
            catch (Exception e)
            {
          
            }
    }
}
