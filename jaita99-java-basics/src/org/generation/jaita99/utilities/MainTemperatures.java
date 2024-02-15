package org.generation.jaita99.utilities;

import java.util.Scanner;

public class MainTemperatures {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("1-Celsius to Farenheit 2-Farenheit to Celsius");
    String choice = scanner.nextLine();
    switch (choice){
      case "1":
        System.out.print("Value in C: ");
        double valueC = Double.parseDouble(scanner.nextLine());
       /* TemperatureConverter tc = new TemperatureConverter();*/
        System.out.println("Value in F: " + TemperatureConverter.fromCelsiusToFarenheit(valueC));
        break;
      case "2":
        System.out.print("Value in F: ");
        double valueF = Double.parseDouble(scanner.nextLine());
        System.out.println("Value in C: " + TemperatureConverter.fromFarenheitToCelsius(valueF));
        break;
      default:
        System.out.println("Invalid choice");
        break;
    }



    scanner.close();
  }
}
