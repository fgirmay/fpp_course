package problem4;

/**
 * Created by fissehaye on 6/12/18.
 */
public class Marketing {

    private String employeeName;
    private String productName;
    private double salesAmount;

    public Marketing(String employeeName, String productName, double salesAmount) {

        this.employeeName = employeeName;
        this.productName = productName;
        this.salesAmount = salesAmount;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getProductName() {
        return productName;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    public String toString() {

        return "[" + employeeName + "," + productName + "," + salesAmount + "]";
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Marketing)) {
            return false;
        }

        Marketing marketing = (Marketing)obj;

        if (marketing.employeeName.equals(this.employeeName)) {

            return true;
        }

        return false;
    }
}
