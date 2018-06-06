package problem4;

/**
 * Created by fissehaye on 6/4/18.
 */
public class SalariedEmployee extends Employee {

    private double weeklySalary;

    public SalariedEmployee(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double getPayment() {
        return weeklySalary;
    }
}
