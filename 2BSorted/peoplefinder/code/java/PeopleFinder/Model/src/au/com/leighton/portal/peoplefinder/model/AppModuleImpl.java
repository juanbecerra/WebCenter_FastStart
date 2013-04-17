package au.com.leighton.portal.peoplefinder.model;

import au.com.leighton.portal.peoplefinder.model.common.AppModule;

import java.util.List;

import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Sep 30 10:41:04 EST 2011
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleImpl extends ApplicationModuleImpl implements AppModule
{
    /**
     * This is the default constructor (do not remove).
     */
    public AppModuleImpl()
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

    /**
     * Container's getter for WcPeopleConnConnectionView1.
     * @return WcPeopleConnConnectionView1
     */
    public WcPeopleConnConnectionViewImpl getWcPeopleConnConnectionView1()
    {
        return (WcPeopleConnConnectionViewImpl)findViewObject("WcPeopleConnConnectionView1");
    }

    /**
     * Container's getter for WcPeopleConnProfilePhotoView1.
     * @return WcPeopleConnProfilePhotoView1
     */
    public WcPeopleConnProfilePhotoViewImpl getWcPeopleConnProfilePhotoView1()
    {
        return (WcPeopleConnProfilePhotoViewImpl)findViewObject("WcPeopleConnProfilePhotoView1");
    }

    /**
     * Container's getter for WcSpaceHeaderView1.
     * @return WcSpaceHeaderView1
     */
    public WcSpaceHeaderViewImpl getWcSpaceHeaderView1()
    {
        return (WcSpaceHeaderViewImpl)findViewObject("WcSpaceHeaderView1");
    }

    /**
     * Container's getter for WcSpaceUsrDetailView1.
     * @return WcSpaceUsrDetailView1
     */
    public WcSpaceUsrDetailViewImpl getWcSpaceUsrDetailView1()
    {
        return (WcSpaceUsrDetailViewImpl)findViewObject("WcSpaceUsrDetailView1");
    }

    /**
     * Container's getter for WcSpaceHeaderView2.
     * @return WcSpaceHeaderView2
     */
    public WcSpaceHeaderViewImpl getWcSpaceHeaderView2()
    {
        return (WcSpaceHeaderViewImpl)findViewObject("WcSpaceHeaderView2");
    }

    /**
     * Container's getter for WcSpaceHeaderView3.
     * @return WcSpaceHeaderView3
     */
    public WcSpaceHeaderViewImpl getWcSpaceHeaderView3()
    {
        return (WcSpaceHeaderViewImpl)findViewObject("WcSpaceHeaderView3");
    }

    /**
     * Container's getter for WcSpaceUsrDetailView2.
     * @return WcSpaceUsrDetailView2
     */
    public WcSpaceUsrDetailViewImpl getWcSpaceUsrDetailView2()
    {
        return (WcSpaceUsrDetailViewImpl)findViewObject("WcSpaceUsrDetailView2");
    }

    /**
     * Container's getter for WcSpaceHeaderSecParentFkLink1.
     * @return WcSpaceHeaderSecParentFkLink1
     */
    public ViewLinkImpl getWcSpaceHeaderSecParentFkLink1()
    {
        return (ViewLinkImpl)findViewLink("WcSpaceHeaderSecParentFkLink1");
    }

    /**
     * Container's getter for WcSpaceHeaderParentFkLink1.
     * @return WcSpaceHeaderParentFkLink1
     */
    public ViewLinkImpl getWcSpaceHeaderParentFkLink1()
    {
        return (ViewLinkImpl)findViewLink("WcSpaceHeaderParentFkLink1");
    }

    /**
     * Container's getter for WcSpaceUsrDetailFkLink1.
     * @return WcSpaceUsrDetailFkLink1
     */
    public ViewLinkImpl getWcSpaceUsrDetailFkLink1()
    {
        return (ViewLinkImpl)findViewLink("WcSpaceUsrDetailFkLink1");
    }
  public Response getConnectionsForUser(String username)
  {
      Response result = new Response();

      if (StdUtility.isNullOrEmpty(username))
      {
          result.setErrorMessage("Invalid username");
      }
      else
      {
          try
          {
              ActorDetail user =
                  getWcAsActorDetailView1().getDetailForUsername(username);

              if (user == null)
              {
                  result.setErrorMessage("Unable to retrieve details for user " +
                                         username);
              }
              else
              {
                  List<PeopleConnection> connections =
                      getWcPeopleConnConnectionView1().getConnectionsForOwnerId(user.getActorId());

                  if ((connections != null) && (connections.size() > 0))
                  {
                      for (PeopleConnection connection : connections)
                      {
                          // get the detail of the connection
                          ActorDetail connectionDetail =
                              getWcAsActorDetailView1().getDetailForActorId(connection.getConnecteeId());

                          if (connectionDetail != null)
                          {
                              connectionDetail.setPhoto(selectPhotoToUse(connectionDetail));

                              result.getConnections().add(connectionDetail);
                          }
                      }
                  }
              }
          }
          catch (Exception e)
          {
              result.setError("Unable to get connections for user " +
                              username, e);
          }
      }
      return result;
  }

  private ActorPhoto selectPhotoToUse(ActorDetail actorDetail)
  {
      ActorPhoto result = null;

      // get the photo associated with the connection
      List<ActorPhoto> photos =
          getWcPeopleConnProfilePhotoView1().getPhotosForUserGuidId(actorDetail.getActorId(),
                                                                    "SMALL");

      if ((photos != null) && (photos.size() > 0))
      {
          // get the one with the highest version number, or if no versions exist, take the first one
          for (ActorPhoto photo : photos)
          {
              if (result == null)
              {
                  result = photo;
              }
              else
              {
                  if (photo.getVersion() != null)
                  {
                      if (result.getVersion() == null)
                      {
                          // the versioned copy takes precidance over the non-versioned one
                          result = photo;
                      }
                      else if (photo.getVersion().intValue() >
                               result.getVersion().intValue())
                      {
                          result = photo;
                      }
                  }
                  else
                  {
                      if (result.getVersion() == null)
                      {
                          // both are unversioned so keep the first one
                      }
                  }
              }
          }
      }

      return result;
  }

  public Response getSpacesForUserAndRole(String username,
                                          String[] validRoles)
  {
      Response result = new Response();

      if (StdUtility.isNullOrEmpty(username))
      {
          result.setErrorMessage("Invalid username");
      }
      else
      {
          try
          {
              List<Space> spaceList =
                  getWcSpaceUsrDetailView1().getSpacesForUser(username);

              if (spaceList != null)
              {
                  for (Space space : spaceList)
                  {
                      boolean isValidRole = true;

                      if ((validRoles != null) && (validRoles.length > 0))
                      {
                          isValidRole = false;

                          for (String validRole : validRoles)
                          {
                              if (validRole.equalsIgnoreCase(space.getSpaceRole()))
                              {
                                  isValidRole = true;
                                  break;
                              }
                          }
                      }

                      if (isValidRole)
                      {
                          SpaceHeader header =
                              getWcSpaceHeaderView1().getHeaderForSpace(space);

                          if (header != null)
                          {
                              space.setSpaceHeader(header);
                              result.getSpaceList().add(space);
                          }
                      }
                  }
              }
          }
          catch (Exception e)
          {
              result.setError("Unable to get spaces for user " + username,
                              e);
          }
      }

      return result;
  }
}