package au.com.leighton.portal.peoplefinder.model;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Sep 30 10:47:51 EST 2011
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class WcAsActorDetailViewImpl extends ViewObjectImpl
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

    /**
     * Returns the bind variable value for actorid.
     * @return bind variable value for actorid
     */
    public String getactorid()
    {
        return (String)getNamedWhereClauseParam("actorid");
    }

    /**
     * Sets <code>value</code> for bind variable actorid.
     * @param value value to bind as actorid
     */
    public void setactorid(String value)
    {
        setNamedWhereClauseParam("actorid", value);
    }

    public ActorDetail getDetailForUsername(String username)
    {
        setactorid(null);
        setusername(username);

        return getDetail();
    }

    public ActorDetail getDetailForActorId(String actorId)
    {
        setactorid(actorId);
        setusername(null);

        return getDetail();
    }

    private ActorDetail getDetail()
    {
        executeQuery();

        WcAsActorDetailViewRowImpl row = (WcAsActorDetailViewRowImpl)next();

        ActorDetail result = null;

        if (row != null)
        {
            result = row.toBean();
        }

        return result;

    }
}
