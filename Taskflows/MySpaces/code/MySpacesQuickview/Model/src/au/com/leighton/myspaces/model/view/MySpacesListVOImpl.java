package au.com.leighton.myspaces.model.view;

import au.com.leighton.myspaces.model.EnvironmentUtil;

import au.com.leighton.myspaces.model.LogUtility;
import au.com.leighton.myspaces.model.view.common.MySpacesListVO;

import oracle.jbo.ViewObject;
import oracle.jbo.server.DBTransaction;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon May 14 16:54:35 IST 2012
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MySpacesListVOImpl extends ViewObjectImpl implements MySpacesListVO {
    /**
     * This is the default constructor (do not remove).
     */
    public MySpacesListVOImpl() {
    }

    /**
     * Returns the bind variable value for userName.
     * @return bind variable value for userName
     */
    public String getuserName() {
        return (String)getNamedWhereClauseParam("userName");
    }

    /**
     * Sets <code>value</code> for bind variable userName.
     * @param value value to bind as userName
     */
    public void setuserName(String value) {
        setNamedWhereClauseParam("userName", value);
    }
    public void getMySpaceLists(String username) {
        username = EnvironmentUtil.getUsername();
        try {
            DBTransaction bTransaction = getDBTransaction();
            ViewObject vo = bTransaction.findViewObject("MySpacesListVO1");
            vo.setNamedWhereClauseParam("userName", username);
            vo.executeQuery();
        } catch (Exception e) {
            String message = e.getMessage();
            LogUtility.logSevere(EnvironmentUtil.class, message, e);
        }
    }
    
    
}
