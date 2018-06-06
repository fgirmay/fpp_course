package problem4;

/**
 * Created by fissehaye on 6/4/18.
 */
public class HourlyEmployee extends Employee {

    private double wage;
    private double hours;

    public HourlyEmployee(double wage, double hours) {
        this.wage = wage;
        this.hours = hours;
    }


    @Override
    public double getPayment() {
        // HourlyEmployee : wage * hours
        return this.wage * this.hours;
    }

}
