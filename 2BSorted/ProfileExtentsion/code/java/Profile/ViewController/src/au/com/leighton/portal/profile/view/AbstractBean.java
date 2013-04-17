package au.com.leighton.portal.profile.view;


import au.com.leighton.portal.profile.IAbstractBase;
import au.com.leighton.portal.profile.Utility;

import java.io.Serializable;

/**
 * Base class to all beans, primarily to contain common initialisation code
 */
public abstract class AbstractBean implements Serializable
{
    @SuppressWarnings("compatibility:8362995955150057688")
    private static final long serialVersionUID = 1L;
    private IAbstractBase _abstractBase;

    public AbstractBean()
    {
        super();
    }

    protected LeightonProfileBean getProfileBean()
    {
        LeightonProfileBean result = null;

        Object obj =
            Utility.getFacesValue(Utility.FacesValue.LEIGHTON_PROFILE);

        if (obj instanceof LeightonProfileBean)
        {
            result = (LeightonProfileBean)obj;
        }

        return result;
    }

    //    protected void setError(Exception e)
    //    {
    //        ProfileResponse pr = new ProfileResponse();
    //        pr.setException(e);
    //        setProfileResponse(pr);
    //    }
    //
    //    protected ProfileResponse getProfileResponse()
    //    {
    //        return _response;
    //    }
    //
    //    protected String getCurrentUsername()
    //    {
    //        String username = null;
    //
    //        FacesContext context = FacesContext.getCurrentInstance();
    //
    //        if (context != null)
    //        {
    //            Application application = context.getApplication();
    //
    //            if (application != null)
    //            {
    //                username =
    //                        (String)application.createValueBinding("#{securityContext.userName}").getValue(context);
    //            }
    //        }
    //
    //        return username;
    //    }
    //

    public long getId()
    {
        return _abstractBase == null ? 0 : _abstractBase.getId();
    }

    protected void setAbstractBase(IAbstractBase _abstractBase)
    {
        this._abstractBase = _abstractBase;
    }

    protected IAbstractBase getAbstractBase()
    {
        return _abstractBase;
    }

    //    protected AppModule getAppModule()
    //    {
    //        return _appModule;
    //    }
}
