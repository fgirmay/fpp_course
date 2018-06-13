package problem4;

import java.util.Comparator;

/**
 * Created by fissehaye on 6/12/18.
 */
public class MarketingComparator implements Comparator<Marketing> {
    @Override
    public int compare(Marketing o1, Marketing o2) {
        return o1.getEmployeeName().compareTo(o2.getEmployeeName());
    }
}
