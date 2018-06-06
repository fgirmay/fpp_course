package problem2;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Created by fissehaye on 6/4/18.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to see the salary info in the department?");

        String userResponse = scanner.next();

        switch (userResponse) {

            case "Y" :
                displaySalaryInfo();
                break;
            case "N" :
                break;
        }
    }

    public static void displaySalaryInfo() {

        double professorSalarySum = 0;
        double secretarySalarySum = 0;
        double totalSalarySum = 0;

        DeptEmployee[] deptEmployees = new DeptEmployee[5];

        String profName1 = "Mark";
        LocalDate profHireDate1 = LocalDate.now();
        double profSalary1 = 80000;

        String profName2 = "John";
        LocalDate profHireDate2 = LocalDate.of(2018, 5, 20);
        double profSalary2 = 100000;

        String profName3 = "Liza";
        LocalDate profHireDate3 = LocalDate.of(2015, 3, 14);
        double profSalary3 = 120000;

        String secName1 = "Sara";
        LocalDate secHireDate1 = LocalDate.of(2010, 2, 19);
        double secSalary1 = 50000;

        String secName2 = "David";
        LocalDate secHireDate2 = LocalDate.of(2009, 12, 8);
        double secSalary2 = 60000;

        Professor prof1 = new Professor(profName1, profHireDate1, profSalary1);
        Professor prof2 = new Professor(profName2, profHireDate2, profSalary2);
        Professor prof3 = new Professor(profName3, profHireDate3, profSalary3);

        Secretary sec1 = new Secretary(secName1, secHireDate1, secSalary1);
        Secretary sec2 = new Secretary(secName2, secHireDate2, secSalary2);

        deptEmployees[0] = prof1;
        deptEmployees[1] = prof2;
        deptEmployees[2] = prof3;
        deptEmployees[3] = sec1;
        deptEmployees[4] = sec2;

        for (DeptEmployee deptEmployee : deptEmployees) {
            totalSalarySum += deptEmployee.computeSalary();

            if (deptEmployee instanceof Secretary) {
                secretarySalarySum += deptEmployee.computeSalary();
            } else if (deptEmployee instanceof Professor) {
                professorSalarySum += deptEmployee.computeSalary();
            }
        }

        System.out.println("The sum of all secretary salary in the department is " + secretarySalarySum);
        System.out.println("The sum of all salaries in the department is " + totalSalarySum);
        System.out.println("The sum of all professor salary in the department is " + professorSalarySum);
    }
}
