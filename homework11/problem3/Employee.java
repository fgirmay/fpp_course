package problem3;

/**
 * Created by fissehaye on 6/15/18.
 */

/** NOTE: You must override equals in this class */
public class Employee {

    private String name;
    private int salary;
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "(" + name + ", " + salary + ")";
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Employee)) {
            return false;
        }

        Employee employee = (Employee) obj;

        if (employee.name.equals(this.name) && employee.salary == this.salary) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {

        int result = 29;

        result = result * 29 + salary;
        result = result * 29 + name.hashCode();

        return result;
    }
}