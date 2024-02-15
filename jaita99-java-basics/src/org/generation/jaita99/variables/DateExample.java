package org.generation.jaita99.variables;

import java.time.LocalDate;
import java.util.Scanner;

public class DateExample {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    LocalDate today = LocalDate.now();
    System.out.println(today);

    System.out.print("Your birth data (yyyy-MM-dd) ");
    String dateString = scan.nextLine();
    LocalDate dateOfBirth = LocalDate.parse(dateString);
    System.out.println(dateOfBirth);
    int day = dateOfBirth.getDayOfMonth();
    int month = dateOfBirth.getMonthValue();
    int year = dateOfBirth.getYear();

    scan.close();
  }
}
