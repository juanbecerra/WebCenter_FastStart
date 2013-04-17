package au.com.leighton.myspaces.view;

import oracle.adf.model.BindingContext;
import oracle.adf.model.RegionBinding;
import oracle.adf.model.RegionContext;
import oracle.adf.model.RegionController;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class MySpacesManageBean implements RegionController {
    public MySpacesManageBean() {
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public boolean refreshRegion(RegionContext regionContext) {
        int refreshFlag = regionContext.getRefreshFlag();
        if (refreshFlag == RegionBinding.PREPARE_MODEL) {
            this.initializeMethod();
        }
        regionContext.getRegionBinding().refresh(refreshFlag);
        return false;
    }

    public boolean validateRegion(RegionContext regionContext) {
        return false;
    }

    public boolean isRegionViewable(RegionContext regionContext) {
        return false;
    }

    public String getName() {
        return null;
    }
    /* Onload Method check */

    public void initializeMethod() {
        //   AdfFacesContext adfFacesContext = AdfFacesContext.getCurrentInstance();
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("getMySpaceLists");
        Object result = operationBinding.execute();

        // adfFacesContext.getPageFlowScope().put("InitializationText",
        //    "Initialization Text set during on load of page fragement");
    }
}
