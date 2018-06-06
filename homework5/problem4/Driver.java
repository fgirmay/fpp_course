package problem4;

/**
 * Created by fissehaye on 6/4/18.
 */
public class Driver {

    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        double totalSalary = 0;

        // double wage, double hours
        CommissionEmployee commissionEmployee = new CommissionEmployee(70000, 70);
        commissionEmployee.setFirstName("Fissehaye");
        commissionEmployee.setLastName("Girmay");
        commissionEmployee.setSocialSecurityNumber("2344423");

        BasedCommissionEmployee basedCommissionEmployee = new BasedCommissionEmployee(3000, 40000, 20);
        basedCommissionEmployee.setFirstName("Temesgen");
        basedCommissionEmployee.setLastName("Kahsay");
        basedCommissionEmployee.setSocialSecurityNumber("9872364");

        HourlyEmployee hourlyEmployee = new HourlyEmployee(15, 10);
        hourlyEmployee.setFirstName("Selam");
        hourlyEmployee.setLastName("Asfeha");
        hourlyEmployee.setSocialSecurityNumber("9141638");


        SalariedEmployee salariedEmployee = new SalariedEmployee(2000);
        salariedEmployee.setFirstName("Mihret");
        salariedEmployee.setLastName("Hilfti");
        salariedEmployee.setSocialSecurityNumber("9866698");


        employees[0] = commissionEmployee;
        employees[1] = basedCommissionEmployee;
        employees[2] = hourlyEmployee;
        employees[3] = salariedEmployee;
        employees[4] = commissionEmployee;

        for (Employee employee: employees) {
            System.out.println(employee);
            totalSalary += employee.getPayment();
        }

        System.out.println("The total salary is " + totalSalary);
    }
}
