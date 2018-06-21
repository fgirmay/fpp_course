package Additional;

import java.util.*;

//You are not allowed to remove the 'final' keyword.
//You are allowed to change Object type in addAccount to another type, as necessary
public final class Bank {
	
	private List<Accounts> accountList = new ArrayList<>();
	
	public void addAccount(Accounts account) {

		accountList.add(account);
	}
	
	//IMPLEMENT - polymorphically determine the totals of
	//each account and then return the sum of all these totals 
	public double computeBalanceSum() {

		double total = 0.0;

		for(Accounts acc: accountList){

			total += acc.computeTotal();
		}


		return total;
	}
	
	

	
}
