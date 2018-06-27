package prob2A;

/**
 * Created by fissehaye on 6/26/18.
 */
public class Student {

    private String name;
    private GradeReport gradeReport;

    public Student(String name) {
        this.name = name;
        this.gradeReport = new GradeReport(this);
    }
}
