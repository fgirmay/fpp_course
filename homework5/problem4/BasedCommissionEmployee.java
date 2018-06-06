package problem4;

/**
 * Created by fissehaye on 6/4/18.
 */
public class BasedCommissionEmployee extends CommissionEmployee {

    private double baseSalary;

    public BasedCommissionEmployee(double baseSalary, double grossSales, double commissionRate) {

        this.baseSalary = baseSalary;
        this.setGrossSales(grossSales);
        this.setCommissionRate(commissionRate);
    }

    @Override
    public double getPayment() {
        return this.baseSalary + (getGrossSales() * getCommissionRate() / 100);
    }

}
