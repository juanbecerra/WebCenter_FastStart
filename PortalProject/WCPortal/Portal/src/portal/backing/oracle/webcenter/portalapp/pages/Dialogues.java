package portal.backing.oracle.webcenter.portalapp.pages;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import oracle.adf.controller.v2.lifecycle.Lifecycle;
import oracle.adf.controller.v2.lifecycle.PagePhaseEvent;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.nav.RichCommandButton;
import oracle.adf.view.rich.component.rich.output.RichMessages;

import oracle.adf.view.rich.context.AdfFacesContext;

import org.apache.myfaces.trinidad.component.UIXGroup;
import org.apache.myfaces.trinidad.event.AttributeChangeEvent;

public class Dialogues {
    private RichForm f1;
    private RichDocument d1;
    private RichMessages m1;
    private UIXGroup g1;
    private RichCommandButton cb1;

    public void setF1(RichForm f1) {
        this.f1 = f1;
    }

    public RichForm getF1() {
        return f1;
    }

    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
    }

    public void setM1(RichMessages m1) {
        this.m1 = m1;
    }

    public RichMessages getM1() {
        return m1;
    }
    
    public void beforePhase(PagePhaseEvent pagePhaseEvent) {
    if (pagePhaseEvent.getPhaseId() == Lifecycle.PREPARE_MODEL_ID) {
    onPageLoad();
    }
    }

    public void afterPhase(PagePhaseEvent pagePhaseEvent) {
    if (pagePhaseEvent.getPhaseId() == Lifecycle.PREPARE_RENDER_ID) {
    // onPagePreRender();
    }
    }

    public void onPageLoad() {
    if (!AdfFacesContext.getCurrentInstance().isPostback()) {
    // add your onPageLoad event here

    // to set the View Criteria on the Iterator
        setSampleMessage();
        }
    }
    
    public void setSampleMessage() {
        FacesMessage msg=new FacesMessage("This is a FacesMessage that shows Fatal Error --JavaCup");
         msg.setSeverity(FacesMessage.SEVERITY_FATAL);
         FacesContext fctx=FacesContext.getCurrentInstance();
         fctx.addMessage(null, msg);
    }
    
    /* FacesMessage msg=new FacesMessage("This is a FacesMessage that+
"shows Fatal Error --JavaCup");
 msg.setSeverity(FacesMessage.SEVERITY_FATAL);
 FacesContext fctx=FacesContext.getCurrentInstance();
 fctx.addMessage(null, msg); */


    public void setG1(UIXGroup g1) {
        this.g1 = g1;
    }

    public UIXGroup getG1() {
        return g1;
    }

    public void setCb1(RichCommandButton cb1) {
        this.cb1 = cb1;
    }

    public RichCommandButton getCb1() {
        return cb1;
    }

    public String cb1_action() {
        // Add event code here...
        FacesMessage msg=new FacesMessage("This is a FacesMessage that shows Fatal Error --JavaCup");
         msg.setSeverity(FacesMessage.SEVERITY_INFO);
         FacesContext fctx=FacesContext.getCurrentInstance();
         fctx.addMessage(null, msg);
        return null;
    }
}
