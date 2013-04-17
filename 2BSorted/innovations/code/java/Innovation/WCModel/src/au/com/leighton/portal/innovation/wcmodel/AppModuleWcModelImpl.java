package au.com.leighton.portal.innovation.wcmodel;

import au.com.leighton.portal.innovation.wcmodel.common.AppModuleWcModel;

import oracle.jbo.server.ApplicationModuleImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Aug 17 11:46:27 EST 2011
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleWcModelImpl extends ApplicationModuleImpl implements AppModuleWcModel
{
    /**
     * This is the default constructor (do not remove).
     */
    public AppModuleWcModelImpl()
    {
    }

    /**
     * Container's getter for WcAsActorDetailView1.
     * @return WcAsActorDetailView1
     */
    public WcAsActorDetailViewImpl getWcAsActorDetailView1()
    {
        return (WcAsActorDetailViewImpl)findViewObject("WcAsActorDetailView1");
    }

    public String getEmailForUsername(String username)
    {
        String result = null;

        getWcAsActorDetailView1().setusername(username);

        getWcAsActorDetailView1().executeQuery();

        WcAsActorDetailViewRowImpl row =
            (WcAsActorDetailViewRowImpl)getWcAsActorDetailView1().next();

        if (row != null)
        {
            result = row.getEmail();
        }

        return result;
    }
}