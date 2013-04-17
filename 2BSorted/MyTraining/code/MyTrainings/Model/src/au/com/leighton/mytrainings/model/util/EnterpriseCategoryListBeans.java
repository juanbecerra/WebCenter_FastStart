package au.com.leighton.mytrainings.model.util;

import oracle.adf.model.BindingContext;
import oracle.adf.model.RegionBinding;
import oracle.adf.model.RegionContext;
import oracle.adf.model.RegionController;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class EnterpriseCategoryListBeans  implements RegionController {
    public EnterpriseCategoryListBeans() {
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
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
        OperationBinding operationBinding = bindings.getOperationBinding("getTainingCategorybyList");
        Object result = operationBinding.execute();
         }

}