//package prog3_1_startup;

import java.time.LocalDate;

public class Employee {
	// instance fields
	private String name;
	private String nickName;
	private double salary;
	private LocalDate hireDay;

	// constructor
	Employee(String name, String aNickName, double aSalary, int aYear,
			int aMonth, int aDay) {
		this.name = name;
		nickName = aNickName;
		salary = aSalary;
		hireDay = LocalDate.of(aYear, aMonth, aDay);
	}

	// instance methods
	public String getName() {
		return name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String aNickName) {
		nickName = aNickName;
	}

	public double getSalary() {
		return salary;
	}

	// needs to be improved
	public LocalDate getHireDay() {
		return this.hireDay;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	private String format = "name = %s, salary = %.2f, hireDay = %s";
	
	public String toString() {
		return String.format(format, name, salary, Util.localDateAsString(hireDay));
	}
}
