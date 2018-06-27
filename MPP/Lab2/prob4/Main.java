package prob4;

import java.util.*;

/**
 * Shows how the design in this package of classes
 * allows you to navigate in the way that the class
 * diagram suggests
 */
public class Main {

    Student bob = new Student();
    Student tim = new Student();
    Student allen = new Student();
    Student[] students = new Student[3];
    Section bio1 = new Section();
    Section bio2 = new Section();
    Section math = new Section();

    public static void main(String[] args) {
        Main m = new Main();
        m.readDataFromDb();
        System.out.println(m.getTranscript(m.bob));
        System.out.println("Grades for math section:\n " + m.getGrades(m.math));
        System.out.println("Courses that Tim took: " + m.getCourseNames(m.tim));
        System.out.println("Students who got A's: " + m.getStudentsWith("A"));
    }

    private Transcript getTranscript(Student s) {
        return s.getTranscript();
    }

    private List<String> getCourseNames(Student s) {
        List<TranscriptEntry> all = s.grades;
        List<String> courseNames = new ArrayList<>();
        for (TranscriptEntry te : all) {
            courseNames.add(te.section.courseName);
        }
        return courseNames;
    }

    private List<String> getGrades(Section s) {
        List<String> grades = new ArrayList<>();
        for (TranscriptEntry t : s.gradeSheet) {
            grades.add(t.grade);
        }
        return grades;
    }

    private List<String> getStudentsWith(String grade) {
        List<String> studentNames = new ArrayList<>();
        for (Student s : students) {
            boolean found = false;
            for (TranscriptEntry te : s.grades) {
                if (!found) {
                    if (te.grade.equals(grade)) {
                        found = true;
                        studentNames.add(s.name);
                    }
                }
            }
        }
        return studentNames;
    }

    private void readDataFromDb() {

        StudentSectionFactory studentSectionFactory = new StudentSectionFactory();
        bob = studentSectionFactory.createStudent("1", "Bob");
        tim = studentSectionFactory.createStudent("2", "Tim");
        allen = studentSectionFactory.createStudent("3", "Allen");

        students[0] = bob;
        students[1] = tim;
        students[2] = allen;


        bio1 = studentSectionFactory.createSection(1, "Biology");
        bio2 = studentSectionFactory.createSection(2, "Biology");
        math = studentSectionFactory.createSection(3, "Mathematics");

        studentSectionFactory.newTranscriptEntry(bob, bio1, "A");
        studentSectionFactory.newTranscriptEntry(bob, math, "B");

        studentSectionFactory.newTranscriptEntry(tim, bio1, "B+");
        studentSectionFactory.newTranscriptEntry(tim, math, "A-");

        studentSectionFactory.newTranscriptEntry(allen, math, "B");
        studentSectionFactory.newTranscriptEntry(allen, bio2, "B+");

    }

}
