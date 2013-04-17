package au.com.leighton.portal.aggregatedtasklist.model.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtil
{
    public DateUtil()
    {
        super();
    }

    public static int daysDifference(Date first, Date second)
    {
        Calendar calFirst = new GregorianCalendar();
        Calendar calSecond = new GregorianCalendar();

        calFirst.setTime(first);
        calSecond.setTime(second);

        long milis1 = calFirst.getTimeInMillis();
        long milis2 = calSecond.getTimeInMillis();

        long diff = milis2 - milis1;

        int diffDays = (int)Math.floor(diff / (24 * 60 * 60 * 1000));

        return diffDays;
    }
}
