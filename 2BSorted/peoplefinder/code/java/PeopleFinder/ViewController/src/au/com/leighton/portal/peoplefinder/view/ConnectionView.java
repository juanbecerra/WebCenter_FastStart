package au.com.leighton.portal.peoplefinder.view;


import au.com.leighton.portal.peoplefinder.model.ActorDetail;

import com.sun.org.apache.xml.internal.security.utils.Base64;

public class ConnectionView
{
    private ActorDetail _actorDetail;

    public ConnectionView()
    {
        super();
    }

    public void setActorDetail(ActorDetail actorDetail)
    {
        this._actorDetail = actorDetail;
    }

    public ActorDetail getActorDetail()
    {
        return _actorDetail;
    }


    public boolean isPhotoAvailable()
    {
        return (getActorDetail() != null) &&
            (getActorDetail().getPhoto() != null) &&
            (getActorDetail().getPhoto().getImageData() != null) &&
            (getActorDetail().getPhoto().getImageData().length > 0);
    }

    public String getPhotoSource()
    {
        String result = null;

        if (isPhotoAvailable())
        {
            StringBuffer sb = new StringBuffer("data:image/jpg;base64,");

            sb.append(Base64.encode(getActorDetail().getPhoto().getImageData()));

            result = sb.toString();
        }
        else
        {
            result = "/nophoto.png";
        }

        return result;
    }

    public String getDisplayName()
    {
        return getActorDetail() == null ? "Unnamed" :
               getActorDetail().getDisplayName();
    }

}
