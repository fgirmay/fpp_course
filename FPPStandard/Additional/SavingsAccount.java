package Additional;

public class SavingsAccount implements Accounts{
	private double balance;
	private double interest;

	public SavingsAccount(double balance, double interest) {
		this.balance = balance;
		this.interest = interest;
	}

	public double computeTotal() {
		return balance + (balance * interest / 100);
	}

}
