package org.generation.jaita99.oop.pets;

import java.util.Scanner;

public class CreateCat {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      System.out.print("Breed: ");
      String breed = scanner.nextLine();
      System.out.print("Age: ");
      int age = Integer.parseInt(scanner.nextLine());
      System.out.print("Gender(male/female): ");
      String gender = scanner.nextLine();
      System.out.print("Name: ");
      String name = scanner.nextLine();

      // coi dati presi dallo scanner creo un Cat
      Cat userCat = new Cat(breed, age, gender, name);
      // stampo il Cat
      System.out.println(userCat);
    } catch (IllegalArgumentException e) {
      System.out.println("Invalid data: " + e.getMessage());
    }
    scanner.close();
  }
}
