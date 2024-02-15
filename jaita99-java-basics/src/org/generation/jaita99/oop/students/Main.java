package org.generation.jaita99.oop.students;

import java.time.LocalDate;

public class Main {

  public static void main(String[] args) {
    Student student = new Student("Pinco", "Pallino", "pinco@email.com", LocalDate.parse("1999-05-20"));
    LocalDate today = LocalDate.now();
    System.out.println(student.getFullName() + " " + student.getAge(today.getYear()) + " years old");
  }
}
