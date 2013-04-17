package au.com.leighton.portal.profile.model;


import au.com.leighton.portal.profile.IWorkHistory;
import au.com.leighton.portal.profile.IWorkHistoryItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Encapsulates the work history of a profile.
 */
public class WorkHistory extends AbstractBase implements IWorkHistory
{
    @SuppressWarnings("compatibility:-9200619173793482796")
    private static final long serialVersionUID = 1L;
    private List<IWorkHistoryItem> _workHistoryItems =
        new ArrayList<IWorkHistoryItem>();

    /**
     * @return
     */
    public List<IWorkHistoryItem> getWorkHistoryItems()
    {
        return _workHistoryItems;
    }

    public String toString()
    {
        return "Work history(" +
            (_workHistoryItems == null ? 0 : _workHistoryItems.size()) +
            " Items)";
    }
}
