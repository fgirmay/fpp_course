package prob4;

import java.util.ArrayList;

/**
 * Created by group7 on 6/27/18.
 */
public class StudentSectionFactory {

    public Section createSection(int secNum, String courseName) {

        Section newSection = new Section();
        newSection.sectionNumber = secNum;
        newSection.courseName = courseName;

        return newSection;
    }
    public Student createStudent(String id, String name) {

        Student newStudent = new Student();
        newStudent.id = id;
        newStudent.name = name;

        return newStudent;
    }
    public void newTranscriptEntry(Student s, Section sect, String grade){

        TranscriptEntry newTranscriptEntry = new TranscriptEntry();
        newTranscriptEntry.student = s;
        newTranscriptEntry.section = sect;
        newTranscriptEntry.grade = grade;

        s.grades.add(newTranscriptEntry);

        sect.gradeSheet.add(newTranscriptEntry);
    }

}
