package december2016.problem2;
import java.util.*;
public class Statistics {
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */
	public static double computeSumOfSalaries(List<EmployeeData> aList) {
		Double totalSalary=0.0;
		for(EmployeeData ed: aList){
			totalSalary+=ed.getSalary();
		}
		return totalSalary;

	}
}
