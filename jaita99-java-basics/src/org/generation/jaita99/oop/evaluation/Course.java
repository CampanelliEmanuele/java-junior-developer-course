package org.generation.jaita99.oop.evaluation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Course {
  // ATTRIBUTI
  private String name;
  private List<Student> students;

  // COSTRUTTORI
  public Course(String name) {
    this.name = name;
    this.students = new LinkedList<>();
  }

  // METODI
 // metodo che aggiunge uno Student alla lista students
  public void addStudent(Student student){
    students.add(student);
  }
  // metodo che rimuove uno Student dalla lista students
  public boolean removeStudent(Student student){
    return students.remove(student);
  }

  public double getPercentagePassed(){
    // quanti studenti ho nel corso
    int totalStudents = students.size();
    // quanti studenti sono promossi
    int passedStudents = 0;
    for(Student student : students){
      if(student.getPassed()){
        passedStudents++;
      }
    }
    // promossi/totale*100
    return (double)passedStudents/totalStudents*100;
  }


  @Override
  public String toString() {
    String s =  "Course " + name + ":\n";
    if(students.isEmpty()){
      s += "No students";
    } else {
      for(Student student : students){
        s += student + "(" + (student.getPassed() ? "PASSED" : "NOT PASSED") + ")\n";
      }
    }
    return s;
  }
}
