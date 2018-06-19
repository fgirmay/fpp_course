package problem2;

/**
 * Created by fissehaye on 6/18/18.
 */
public class TestInsufficientBalanceException {

    public static void main(String[] args) throws InsufficientBalanceException, BalanceBelowThresholdException{

        CustomerAccount bbte = new CustomerAccount("Fissehaye", "F799387987", 500);

        bbte.withdraw(200);

        bbte.withdraw(400);

    }
}
