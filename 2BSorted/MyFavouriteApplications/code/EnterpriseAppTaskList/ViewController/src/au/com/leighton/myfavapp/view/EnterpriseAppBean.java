package au.com.leighton.myfavapp.view;

import oracle.adf.controller.v2.lifecycle.PagePhaseEvent;
import oracle.adf.controller.v2.lifecycle.PagePhaseListener;
import oracle.adf.model.BindingContext;

import oracle.adf.model.RegionBinding;
import oracle.adf.model.RegionContext;
import oracle.adf.model.RegionController;
import oracle.adf.view.rich.context.AdfFacesContext;
import oracle.adf.view.rich.render.ClientEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class EnterpriseAppBean implements RegionController {
    public EnterpriseAppBean() {
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }


    public void onLoadlist(ClientEvent clientEvent) {
        // Add event code here...
       
    }


    public boolean refreshRegion(RegionContext regionContext) {

        int refreshFlag = regionContext.getRefreshFlag();
        if (refreshFlag == RegionBinding.PREPARE_MODEL) {
            // Invoke Initialization method
          //  System.out.println(":::: Initialization Method Invoked");
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
    public void initializeMethod() {
     //   AdfFacesContext adfFacesContext = AdfFacesContext.getCurrentInstance();
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("getenterpiseList");
        Object result = operationBinding.execute();
      
       // adfFacesContext.getPageFlowScope().put("InitializationText",
                                           //    "Initialization Text set during on load of page fragement");
    }
}
