package org.generation.jaita99.oop.evaluation;

import java.util.Random;

public class Main {

  public static void main(String[] args) {
    Random randomGenerator = new Random();

    Course course = new Course("Test Course");
    int numberOfStudents = randomGenerator.nextInt(10, 21);

    for (int i = 1; i <= numberOfStudents; i++) {
      // creo lo Student
      // id è i che è un numero progressivo
      // absences random tra 0 e 100
      int absences = randomGenerator.nextInt(0, 101);
      // averageGrades random double tra 0.0 e 5.0
      double averageGrades = randomGenerator.nextDouble(0.0, 5.0);
      Student student = new Student(i, absences,averageGrades);
      // aggiungo lo Student alla lista di studenti del corso
      course.addStudent(student);
    }
    System.out.println(course);
    System.out.println("%Passed: " + course.getPercentagePassed());


    Student newStudent = new Student(100, 30, 4.5);
    course.addStudent(newStudent);
    System.out.println("/*****add student*****/");
    System.out.println(course);
    Student studentToRemove = new Student(100, 50, 4.5);
    boolean removed=course.removeStudent(studentToRemove);
    System.out.println(removed);
    System.out.println("/*****add student*****/");
    System.out.println(course);
  }
}
