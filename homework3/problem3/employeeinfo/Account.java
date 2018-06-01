package employeeinfo;
class Account {

	private final static double DEFAULT_BALANCE = 0.0;
	private AccountType acctType;
	private double balance;
	private Employee employee;

	Account(Employee emp, AccountType acctType, double balance) {
		this.employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "type = " + acctType.toString() + ", balance = " + balance;
	}

	//updates the balance field
	public void makeDeposit(double deposit) {
		// implement
		this.balance += deposit;
	}

	//updates the balance field and returns true, unless
	// withdrawal amount is too large; in that case,
	//it does not modify the balance field, and returns false
	public boolean makeWithdrawal(double amount) {

		if (amount > this.balance) {
			return false;
		}

		balance -= amount;
		return true;
	}

	public AccountType getAcctType() {
		return this.acctType;
	}

	public double getBalance() {
		return this.balance;
	}
}
