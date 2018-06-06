package problem2;

import java.time.LocalDate;

/**
 * Created by fissehaye on 6/4/18.
 */
public class DeptEmployee {

    String name;
    LocalDate hireDate;
    double salary;

    public DeptEmployee() {
        this.name = "";
        this.hireDate = LocalDate.now();
        this.salary = 0.0;
    }

    public DeptEmployee(String name, LocalDate hireDate, double salary) {
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public double computeSalary() {
        return this.salary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return this.hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
}
