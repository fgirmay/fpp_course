package employeeinfo;

import java.time.LocalDate;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
	}
	
	public void createNewChecking(double startAmount) {

		this.checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
	}

	public void createNewSavings(double startAmount) {
		this.savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);
	}

	public void createNewRetirement(double startAmount) {
		this.retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);
	}

	public String getFormattedAcctInfo() {

		String employeeInfo = "ACCOUNT INFO FOR " + this.name + ":\n\n";

		employeeInfo += "Account type: " + AccountType.CHECKING.toString().toLowerCase() + "\n";
		if (this.checkingAcct != null) {
			employeeInfo += "Current bal: " + this.checkingAcct.getBalance() + "\n";
		}

		employeeInfo += "Account type: " + AccountType.SAVINGS.toString().toLowerCase() + "\n";
		if (this.savingsAcct != null) {
			employeeInfo += "Current bal: " + this.savingsAcct.getBalance() + "\n";
		}

		employeeInfo += "Account type: " + AccountType.RETIREMENT.toString().toLowerCase() + "\n";
		if (this.retirementAcct != null) {
			employeeInfo += "Current bal: " + this.retirementAcct.getBalance() + "\n";
		}
		employeeInfo += "\n";

		return employeeInfo;
	}
	public void deposit(AccountType acctType, double amt){

		switch (acctType) {
			case CHECKING:
				checkingAcct.makeDeposit(amt);
				break;
			case SAVINGS:
				savingsAcct.makeDeposit(amt);
				break;
			case RETIREMENT:
				retirementAcct.makeDeposit(amt);
				break;
			default:
				break;
		}
	}
	public boolean withdraw(AccountType acctType, double amt){

		switch (acctType) {
			case CHECKING:
				if (checkingAcct.getBalance() >= amt) {
					checkingAcct.makeWithdrawal(amt);
					return true;
				}
				break;
			case SAVINGS:
				if (savingsAcct.getBalance() >= amt) {
					savingsAcct.makeWithdrawal(amt);
					return true;
				}
				break;
			case RETIREMENT:
				if (retirementAcct.getBalance() >= amt) {
					retirementAcct.makeWithdrawal(amt);
					return true;
				}
				break;
		}
		return false;
	}

}
