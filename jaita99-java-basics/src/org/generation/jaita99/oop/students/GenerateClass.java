package org.generation.jaita99.oop.students;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class GenerateClass {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("How many students in the class? ");
    int classSize = Integer.parseInt(scanner.nextLine());
    // a partire dalla dimensione della classe creo l'array vuoto
    Student[] students = new Student[classSize];
    System.out.println(Arrays.toString(students));

    // per ogni posizione dell'array
    for (int i = 0; i < students.length; i++) {
      // chiedo i dati dello studente
      System.out.println("Student " + (i+1));
      System.out.print("First name: ");
      String firstName = scanner.nextLine();
      System.out.print("Last name: ");
      String lastName = scanner.nextLine();
      System.out.print("Email: ");
      String email = scanner.nextLine();
      System.out.print("Date of birth(yyyy-MM-dd): ");
      String dobString = scanner.nextLine();
      LocalDate dob = LocalDate.parse(dobString);
      // creo lo studente
      Student student = new Student(firstName, lastName, email, dob);
      // chiedo i campi dell'indirizzo
      System.out.println("Address info");
      System.out.print("Street: ");
      String street = scanner.nextLine();
      System.out.print("Number: ");
      int number = Integer.parseInt(scanner.nextLine());
      System.out.print("City: ");
      String city = scanner.nextLine();
      Address address = new Address(street, number, city);
      student.setAddress(address);
      // aggiungo lo studente alla posizione i dell'array
      students[i] = student;
    }
    int currentYear = LocalDate.now().getYear();

    System.out.println("Class list");
    for (int i = 0; i < students.length; i++) {
      // stampo nome completo ed età dello studente corrente
      System.out.println(students[i].getFullName() + " " + students[i].getAge(currentYear) + " " + students[i].getAddress().toString()) ;
    }


    scanner.close();
  }
}
