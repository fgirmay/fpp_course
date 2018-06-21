package december2016.problem1;

import java.util.Arrays;
import java.util.List;
import java.util.HashMap;

public class Main {

	@SuppressWarnings("serial")
	public static void main(String[] args) {
		List<String> ssns1 = Arrays.asList("234121244",
				                          "113145657",
				                          "342892138",
				                          "999234124",
				                          "523421589",
				                          "234112355",
				                          "553667742",
				                          "212341557",
				                          "115513151");
				
		HashMap<String, Employee> h1 = new HashMap<String, Employee>() {
			{
				put("234121244", new Employee("Bob", 78000, "234121244"));
				put("212341557", new Employee("Hank", 110000, "212341557"));
				put("999234124",new Employee("Ephraim", 66000, "999234124"));
				put("115513151",new Employee("Jonas", 76000, "115513151"));
				put("523421589", new Employee("Tom", 88000, "523421589"));
				put("113145657",new Employee("Rick", 92000, "113145657"));
				put("342892138",new Employee("Ibu", 100000, "342892138"));
				
			}
		};
											
		List<Employee> report = EmployeeAdmin.prepareReport(h1, ssns1);
		System.out.println(report);
									
		//Expected output:
		//[(113145657: Rick, 92000), (212341557: Hank, 110000), (342892138: Ibu, 100000), (523421589: Tom, 88000)]

	}

}
