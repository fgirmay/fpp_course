package problem4;

/**
 * Created by fissehaye on 6/4/18.
 */
public class CommissionEmployee extends Employee {

    private double grossSales;
    private double commissionRate;

    public CommissionEmployee() {
        this.grossSales = 0;
        this.commissionRate = 0;
    }

    public CommissionEmployee(double grossSales, double commissionRate) {
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double getPayment() {
        return grossSales * commissionRate / 100;
    }

    public double getGrossSales() {
        return this.grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return this.commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

}
