package au.com.leighton.portal.peoplefinder.view;


import au.com.leighton.portal.peoplefinder.model.Space;
import au.com.leighton.portal.peoplefinder.model.Utility;

import java.util.GregorianCalendar;


public class SpaceView
{
    private Space _space;

    public SpaceView()
    {
        super();
    }

    public void setSpace(Space space)
    {
        this._space = space;
    }

    public Space getSpace()
    {
        return _space;
    }

    public String getImageUrl()
    {
        StringBuilder sb = new StringBuilder(Utility.getSpacesImagePrefix());
        sb.append(getSpace().getSpaceHeader().getLogo());

        return sb.toString();
    }

  public String getDisplayName()
  {
      return getSpace().getSpaceHeader().getDisplayName();
  }
  
  public String getSpaceName()
  {
      return getSpace().getSpaceHeader().getSpaceId();
  }

    public String getMemberCount()
    {
        StringBuilder sb = new StringBuilder();

        if ((getSpace() != null) && (getSpace().getSpaceHeader() != null) &&
            (getSpace().getSpaceHeader().getMemberCount() != null))
        {
            sb.append(getSpace().getSpaceHeader().getMemberCount());

            sb.append(" Member");

            if (getSpace().getSpaceHeader().getMemberCount().intValue() != 1)
            {
                sb.append("s");
            }
        }
        else
        {
            sb.append("No Members");
        }

        return sb.toString();
    }

    public String getLastActivityText()
    {
        StringBuffer result = new StringBuffer();

        if (getSpace().getLastUpdatedDate() != null)
        {
            GregorianCalendar now = new GregorianCalendar();
            GregorianCalendar update = new GregorianCalendar();
            update.setTime(getSpace().getLastUpdatedDate().getValue());

            long n = now.getTimeInMillis();
            long u = update.getTimeInMillis();

            long milliseconds = n - u;

            int days = (int)(milliseconds / (1000L * 60L * 60L * 24L));

            result.append("Last Activity ");

            if (days == 0)
            {
                result.append("Today");
            }
            else
            {
                result.append(days);
                result.append(" day");

                if (days > 1)
                {
                    result.append("s");
                }

                result.append(" ago");
            }
        }

        return result.toString();
    }
}
