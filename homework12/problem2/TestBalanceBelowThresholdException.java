package problem2;

/**
 * Created by fissehaye on 6/18/18.
 */
public class TestBalanceBelowThresholdException {

    public static void main(String[] args) throws InsufficientBalanceException, BalanceBelowThresholdException{

        CustomerAccount bbte = new CustomerAccount("Fissehaye", "F965439644", 500);

        bbte.withdraw(300);

        bbte.withdraw(150);

    }
}
