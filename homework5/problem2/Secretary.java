package problem2;

import java.time.LocalDate;

/**
 * Created by fissehaye on 6/4/18.
 */
public class Secretary extends DeptEmployee {

    private double overtimeHours;

    public Secretary(String name, LocalDate hireDate, double salary) {
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public double getOvertimeHours() {
        return this.overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double computeSalary() {
        return this.salary + 12 * this.overtimeHours;
    }
}
