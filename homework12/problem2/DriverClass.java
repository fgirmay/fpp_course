package problem2;

/**
 * Created by fissehaye on 6/18/18.
 */
public class DriverClass {

    public static void main(String[] args) throws InsufficientBalanceException, BalanceBelowThresholdException{

        CustomerAccount bbte = new CustomerAccount();

        bbte.setBalance(500);

        bbte.withdraw(300);

        bbte.withdraw(150);

    }
}
