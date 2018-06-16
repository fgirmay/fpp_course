package problem3;

/**
 * Created by fissehaye on 6/15/18.
 */
import problem3.util.Util;

import java.util.ArrayList;
import java.util.List;

public class EmployeeInfo {

    /**
     * Removes from a copy of the input list all duplicate Employees,
     * and then returns this list.
     *
     * An Employee instance is considered to be a duplicate of another Employee
     * instance if the two instances have the same name and salary.
     */
    public static List<Employee> removeDuplicates(List<Employee> employees) {
        //IMPLEMENT

        List<Employee> result = new ArrayList<>();

        for (Employee employee : employees) {

            if (!(result.contains(employee))) {
                result.add(employee);
            }
        }

        return result;
    }


    //DO NOT MODIFY
    /**
     * Use the main method to test your solution
     */
    public static void main(String[] args) {

        List<Employee> myDupsRemoved = removeDuplicates(TestData.originalList);
        boolean dupsCorrectlyRemoved = Util.listsAreEqual(TestData.dupsRemoved, myDupsRemoved);
        System.out.println("Is answer correct? " + dupsCorrectlyRemoved);
    }




}