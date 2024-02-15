package org.generation.jaita99.oop.cars;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

   /* Car myCar;
    myCar = new Car();*/
    Car superCar = new Car();
    System.out.println(superCar.getInfo());
 /*   superCar.color = "gold";
    superCar.numberOfAirbags = 10;
    superCar.isHybrid = false;*/
    superCar.defineOptionals( 10, false );

    /*System.out.println("Color: " + superCar.color);
    System.out.println("Number of airbags: " + superCar.numberOfAirbags);
    System.out.println("Is hybrid: " + superCar.isHybrid);*/

    System.out.println(superCar.getInfo());

    System.out.println("Redefine optionals");
    System.out.print("Color: ");
    String newColor = scanner.nextLine();
    System.out.print("Number of airbags: ");
    int newNumberOfAirbags = Integer.parseInt(scanner.nextLine());
    System.out.print("Is hybrid?(y/n): ");
    String choice = scanner.nextLine();
    boolean newIsHybrid;
    if(choice.equalsIgnoreCase("y")){
      newIsHybrid = true;
    } else {
      newIsHybrid = false;
    }

    // chiamo di nuovo il metodo defineOptionals con i valori presi dallo scanner
    superCar.defineOptionals(newColor, newNumberOfAirbags, newIsHybrid);
    System.out.println(superCar.getInfo());
    /*System.out.println("Color: " + superCar.color);
    System.out.println("Number of airbags: " + superCar.numberOfAirbags);
    System.out.println("Is hybrid: " + superCar.isHybrid);*/
    /*myCar.color = "white";
    myCar.numberOfAirbags = 2;
    myCar.isHybrid = true;
    System.out.println("Color: " + myCar.color);
    System.out.println("Number of airbags: " + myCar.numberOfAirbags);
    System.out.println("Is hybrid: " + myCar.isHybrid);*/

    scanner.close();
  }
}
