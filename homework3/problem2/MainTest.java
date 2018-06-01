/**
 * Created by fissehaye on 5/31/18.
 */
public class MainTest {

    public static void main(String[] args) {

        // Create an employee
        Employee employee = new Employee("Fissehaye", "Fish", 80000.0, 2019, 1, 6);

        // Create accounts for the employee
        Account checkingAccount = new Account(employee, AccountType.CHECKING, 300);
        Account savingAccount = new Account(employee, AccountType.SAVINGS, 300);
        Account retirementAccount = new Account(employee, AccountType.RETIREMENT, 300);

        // Make a deposit of 100 to each account type
        checkingAccount.makeDeposit(3000);
        savingAccount.makeDeposit(10000);
        retirementAccount.makeDeposit(2000);

        // Make withdrawal of 150 from each account type
        checkingAccount.makeWithdrawal(250);
        savingAccount.makeWithdrawal(100);
        retirementAccount.makeWithdrawal(50);

        System.out.println(checkingAccount.toString());
        System.out.println(savingAccount.toString());
        System.out.println(retirementAccount.toString());

        System.out.println("The employee info is " + employee.toString());
    }
}
