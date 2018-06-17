package june2017;

import java.util.ArrayList;
import java.util.List;

public class Admin {
	public static List<Student> convertArray(Object[] studentArray) {

		List<Student> students = new ArrayList<>();

		for(Object stud: studentArray){

			students.add((Student)stud);
		}




		return students;
	}
	
	
	public static double computeAverageGpa(List<Student> studentList) {

		double totalGPA = 0.0;

		for(Student stud: studentList){
			totalGPA += stud.computeGpa();
		}
		return totalGPA / studentList.size();
	}
}
