package problem2;

/**
 * Created by fissehaye on 6/18/18.
 */
public class CustomerAccount {

    private String cus_Name;
    private String acc_No;
    private double balance;

    public CustomerAccount(String cus_Name, String acc_No, double balance) {
        this.cus_Name = cus_Name;
        this.acc_No = acc_No;
        this.balance = balance;
    }

    public void deposit(double amount) {

        balance = balance + amount;
    }

    public void withdraw(double amount) throws InsufficientBalanceException, BalanceBelowThresholdException {

        if (amount > balance) {

            throw new InsufficientBalanceException("You don't have enough balance in your account!");

        } else if (balance - amount < 100) {
            throw new BalanceBelowThresholdException();
        }

        balance = balance - amount;
        System.out.println("You have withdrawn: " + amount + " and the your remaining balance is: " + balance);

    }

}
