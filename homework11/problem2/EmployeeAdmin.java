package problem2;

/**
 * Created by fissehaye on 6/15/18.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class EmployeeAdmin {

    /**
     Returns a list of Employees whose social security number is on the input list socSecNums
     and whose salary is > 80000. The list must be ordered by social security number,
     from lowest to highest. To sort, you must use a Collections sorting method
     and you must define your own Comparator to be used to compare Employees by ssn.
     */
    public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {

        List<Employee> result = new ArrayList<>();

        Employee employee = null;

        for (String key : socSecNums) {

            employee = table.get(key);

            if (employee != null && employee.getSalary() > 80000) {

                result.add(employee);
            }
        }

        Collections.sort(result, new EmployeeComparator());

        return result;

    }

}
