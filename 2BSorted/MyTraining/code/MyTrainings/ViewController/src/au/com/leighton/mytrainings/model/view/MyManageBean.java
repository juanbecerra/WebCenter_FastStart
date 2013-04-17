    package au.com.leighton.mytrainings.model.view;

import javax.faces.context.FacesContext;

import oracle.adf.model.BindingContext;

import oracle.adf.view.rich.event.PopupFetchEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;

public class MyManageBean {
    public MyManageBean() {
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String cb3_action() {
        System.out.println("cb3_action*****");
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("getTainingCategorybyList");
        Object result = operationBinding.execute();
        return null;
    }

    public String cb2_action() {
        System.out.println("cb2_action*****");
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("getTainingCategorybyList");
        Object result = operationBinding.execute();
        return null;
    }



    public String cb4_action2() {  
        System.out.println("cb4_action*****");
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("getNonMandatoryList");
        Object result = operationBinding.execute();
        return null;
    }

    public void PageRefresh(PopupFetchEvent popupFetchEvent) {
        // Add event code here...
        System.out.println("poup listener*****");
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("getNonMandatoryList");
        Object result = operationBinding.execute();
    }
}
