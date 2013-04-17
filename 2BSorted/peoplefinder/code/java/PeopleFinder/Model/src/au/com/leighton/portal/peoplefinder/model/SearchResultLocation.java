package au.com.leighton.portal.peoplefinder.model;

import java.util.ArrayList;
import java.util.List;

public class SearchResultLocation extends SearchResult
{
    @SuppressWarnings("compatibility:-2864985416779352253")
    private static final long serialVersionUID = 1L;
    private List<ResultItemLocation> _resultList =
        new ArrayList<ResultItemLocation>();

    public SearchResultLocation()
    {
        super();
    }

    public List<ResultItemLocation> getResults()
    {
        return _resultList;
    }
}
