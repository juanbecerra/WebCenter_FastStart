package portal.oakton.com;

import javax.faces.event.ActionEvent;

import oracle.adf.view.page.editor.mode.ModeContext;

public class PersonaliseBean {
    public PersonaliseBean() {
    }

    public void changeMode(ActionEvent actionEvent) {
        // Add event code here...
        ModeContext mc = ModeContext.getCurrent();
        mc.setEditMode();
    }
}
