package au.com.leighton.portal.peoplefinder.model;

import java.util.ArrayList;
import java.util.List;

public class SearchResultPeople extends SearchResult
{
    @SuppressWarnings("compatibility:-1712148935274654781")
    private static final long serialVersionUID = 1L;
    private List<ResultItemPerson> _resultList =
        new ArrayList<ResultItemPerson>();

    public SearchResultPeople()
    {
        super();
    }

    public List<ResultItemPerson> getResults()
    {
        return _resultList;
    }
}
