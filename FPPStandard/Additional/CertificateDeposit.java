package Additional;

public class CertificateDeposit implements Accounts{
	private double balance;
	private double interest;

	public CertificateDeposit(double balance, double interest) {
		this.balance = balance;
		this.interest = interest;
	}

	public double computeTotal() {

		return balance + (balance * interest / 10);
	}
}
