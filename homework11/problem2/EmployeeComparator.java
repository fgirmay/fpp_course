package problem2;

import java.util.Comparator;

/**
 * Created by fissehaye on 6/15/18.
 */
class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSsn().compareTo(o2.getSsn());
    }
}
