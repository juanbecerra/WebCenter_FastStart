package au.com.leighton.portal.application.view;

import java.math.BigDecimal;

import java.util.Comparator;

public class LinkComparator implements Comparator
{
    public LinkComparator()
    {
        super();
    }

    public int compare(Object o1, Object o2)
    {
        if ((o1 instanceof LinkBean) && (o2 instanceof LinkBean))
        {
          BigDecimal bd1 = ((LinkBean)o1).getGroupOrder();
          BigDecimal bd2 = ((LinkBean)o2).getGroupOrder();
          
           return bd1.compareTo(bd2);
        }
        else
        {
          return -1;
        }
    }
}
