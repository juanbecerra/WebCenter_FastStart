package au.com.leighton.portal.application.view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;

public class GroupBean
{
    private String _title;
    private List<LinkBean> _links = new ArrayList<LinkBean>();
    private boolean _standardGroupType;
    
    public GroupBean()
    {
        super();
    }

    protected void setTitle(String title)
    {
        this._title = title;
    }

    public String getTitle()
    {
        return _title;
    }
    
    protected void addLink(LinkBean link)
    {
      _links.add(link);
      Collections.sort(_links, new LinkComparator());
    }
    
    public List<LinkBean> getLinks()
    {
        return Collections.unmodifiableList(_links);
    }

    protected void setStandardGroupType(boolean standardGroupType)
    {
        this._standardGroupType = standardGroupType;
    }

    public boolean isStandardGroupType()
    {
        return _standardGroupType;
    }
}
