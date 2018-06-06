package problem2;

import java.time.LocalDate;

/**
 * Created by fissehaye on 6/4/18.
 */
public class Professor extends DeptEmployee {

    private int numberOfPublications;

    public Professor(String name, LocalDate hireDate, double salary) {
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public int getNumberOfPublications() {
        return this.numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }
}
