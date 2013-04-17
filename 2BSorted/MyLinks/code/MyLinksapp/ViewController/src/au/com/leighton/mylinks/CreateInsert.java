package au.com.leighton.mylinks;


import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.event.PopupFetchEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class CreateInsert {
    public CreateInsert() {
    }

    public void CreateInsertdata(PopupFetchEvent popupFetchEvent) {
        // Add event code here...
        BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
        OperationBinding createOperationBinding = bindings.getOperationBinding("CreateInsert");
        createOperationBinding.execute();
    }
}
