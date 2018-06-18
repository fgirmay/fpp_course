package problem2;

/**
 * Created by fissehaye on 6/18/18.
 */
public class CustomerAccount {

    // Cus_name, Acc_No, Balance

    private String cus_Name;
    private String acc_No;
    private double balance;

    public void deposit(double amount) {

        balance = balance + amount;
    }

    public void withdraw(double amount) throws InsufficientBalanceException, BalanceBelowThresholdException {

        if (amount > balance) {

            throw new InsufficientBalanceException("You don't have enough balance to withdraw");

        } else if (balance - amount < 100) {

            throw new BalanceBelowThresholdException();
        }

        balance = balance - amount;

        System.out.println("You have withdrawn: " + amount + " and the your remaining balance is: " + balance);

    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
