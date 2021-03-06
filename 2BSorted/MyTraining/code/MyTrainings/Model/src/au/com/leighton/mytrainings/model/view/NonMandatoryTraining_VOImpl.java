package au.com.leighton.mytrainings.model.view;

import au.com.leighton.mytrainings.model.util.EnvironmentUtil;

import au.com.leighton.mytrainings.model.util.LogUtility;
import au.com.leighton.mytrainings.model.view.common.NonMandatoryTraining_VO;

import oracle.jbo.ViewObject;
import oracle.jbo.server.DBTransaction;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue May 29 20:23:21 IST 2012
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class NonMandatoryTraining_VOImpl extends ViewObjectImpl implements NonMandatoryTraining_VO {
    /**
     * This is the default constructor (do not remove).
     */
    public NonMandatoryTraining_VOImpl() {
      
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
    public void getNonMandatoryList() {
        String username = EnvironmentUtil.getUsername();
         if (username != null && !username.equals("")) {
            try {
                DBTransaction bTransaction = getDBTransaction();
                ViewObject vo =
                    bTransaction.findViewObject("NonMandatoryTraining_VO1");
                vo.setNamedWhereClauseParam("userName", username);
                vo.executeQuery();

            } catch (Exception e) {
                String message = e.getMessage();
                 LogUtility.logSevere(EnvironmentUtil.class, message, e);
            }
        }
    }
}

