package au.com.leighton.portal.innovation.wcmodel;

import au.com.leighton.portal.innovation.wcmodel.common.WcAsActorDetailView;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Aug 17 11:44:56 EST 2011
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class WcAsActorDetailViewImpl extends ViewObjectImpl implements WcAsActorDetailView
{
    /**
     * This is the default constructor (do not remove).
     */
    public WcAsActorDetailViewImpl()
    {
    }

    /**
     * Returns the bind variable value for username.
     * @return bind variable value for username
     */
    public String getusername()
    {
        return (String)getNamedWhereClauseParam("username");
    }

    /**
     * Sets <code>value</code> for bind variable username.
     * @param value value to bind as username
     */
    public void setusername(String value)
    {
        setNamedWhereClauseParam("username", value);
    }
}
