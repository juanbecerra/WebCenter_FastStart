package au.com.leighton.portal.peoplefinder.view;


import au.com.leighton.portal.peoplefinder.model.LogUtility;
import au.com.leighton.portal.peoplefinder.model.Response;
import au.com.leighton.portal.peoplefinder.model.Space;
import au.com.leighton.portal.peoplefinder.model.StdUtility;
import au.com.leighton.portal.peoplefinder.model.Utility;
import au.com.leighton.portal.peoplefinder.model.common.AppModule;

import java.util.ArrayList;
import java.util.List;


public class ModeratedSpacesBean
{
    private List<SpaceView> _moderatedSpaces = null;

    public ModeratedSpacesBean()
    {
        super();
    }

    public boolean isSpacesOk()
    {
        return (getModeratedSpaces() != null) &&
            (getModeratedSpaces().size() > 0);
    }

    public List<SpaceView> getModeratedSpaces()
    {
        if (_moderatedSpaces == null)
        {
            AppModule appModule = null;

            try
            {
                appModule = Utility.createApplicationModule();

                if (appModule != null)
                {
                    Response resp =
                        appModule.getSpacesForUserAndRole((String)StdUtility.getFacesValue("#{pageFlowScope.username}"),
                                                          new String[]
                            { "Moderator" });

                    if ((resp != null) && !resp.isErrored())
                    {
                        _moderatedSpaces = new ArrayList<SpaceView>();

                        for (Space space : resp.getSpaceList())
                        {
                            SpaceView spaceView = new SpaceView();
                            spaceView.setSpace(space);

                            _moderatedSpaces.add(spaceView);
                        }
                    }
                    else
                    {
                        if (resp != null)
                        {
                            //  StdUtility.addError(resp.getErrorMessage());
                        }
                    }
                }
                else
                {
                    LogUtility.logWarning("Unable to retrieve moderated spaces",
                                          null);
                    // StdUtility.addError("Unable to retrieve moderated spaces");
                }
            }
            catch (Exception e)
            {
                LogUtility.logWarning("Unable to retrieve moderated spaces",
                                      e);
                // StdUtility.addError("Unable to retrieve moderated spaces");
            }
            finally
            {
                Utility.releaseApplicationModule(appModule);
            }
        }

        return _moderatedSpaces;
    }
}
