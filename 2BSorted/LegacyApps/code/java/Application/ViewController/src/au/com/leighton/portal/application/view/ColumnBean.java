package au.com.leighton.portal.application.view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ColumnBean
{
    private List<GroupBean> _groups = new ArrayList<GroupBean>();
    private String _groupChannel;
    
    public ColumnBean()
    {
        super();
    }

    public List<GroupBean> getGroups()
    {
        return _groups;
    }

    protected void setGroupChannel(String groupChannel)
    {
        this._groupChannel = groupChannel;
    }

    protected String getGroupChannel()
    {
        return _groupChannel;
    }

    protected GroupBean getGroup(String groupTitle)
    {
        GroupBean result = null;
        
        if (groupTitle != null)
        {
            for (GroupBean group : _groups)
            {
                // do a case-sensative search. Maybe change to case insensative later if required
                if (group.getTitle().equals(groupTitle))
                {
                    result = group;
                    break;
                }
            }
        }
        return result;
    }
}
