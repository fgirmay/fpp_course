package december2016.problem1;

import java.util.Comparator;

/**
 * Created by fissehaye on 6/20/18.
 */
public class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.getSsn().compareTo(o1.getSsn());
    }
}
