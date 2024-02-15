package org.lessons.java.valutazioni;

import java.time.chrono.IsoChronology;
import java.util.ArrayList;

public class Course {

    ArrayList<Student> studentsArrayList = new ArrayList<>();

    public Course(ArrayList<Student> studentsArrayList) throws IllegalArgumentException {
        setStudentArrayList(studentsArrayList);
    }

    /* EXERCISE FUNCTIONS */

    public void showStudent() {
        for (Student student: studentsArrayList)
            System.out.println(student.toString());
    }

    public double getPromotedPercentage() {
        int counter = 0;
        for (Student student : studentsArrayList) {
            if (student.isPassed())
                counter++;
        }
        return studentsArrayList.size() * ((double) counter / 100);
    }

    public void addStudent(Student student) throws IllegalArgumentException {
        validStudent(student);
        studentsArrayList.add(student);
    }

    public boolean removeStudent(Student student) {
        return studentsArrayList.remove(student);
    }

    /* VALIDATORS */

    private void validStudentsArrayList(ArrayList<Student> studentsArrayList) throws IllegalArgumentException {
        if (studentsArrayList == null || studentsArrayList.isEmpty())
            throw new IllegalArgumentException("Error: the student list can be neither empty nor null.");
    }

    private void validStudent(Student student) throws IllegalArgumentException {
        if (student == null)
            throw new IllegalArgumentException("Error: Student object cannot be null.");
    }

    /* GETTERS AND SETTERS */

    public ArrayList<Student> getStudentArrayList() {
        return studentsArrayList;
    }

    public void setStudentArrayList(ArrayList<Student> studentArrayList) {
        validStudentsArrayList(studentArrayList);
        this.studentsArrayList = studentArrayList;
    }
}
