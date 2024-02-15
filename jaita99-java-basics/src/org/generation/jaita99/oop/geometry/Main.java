package org.generation.jaita99.oop.geometry;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Create a rectangle");
    System.out.print("Base: ");
    int baseInput = Integer.parseInt(scanner.nextLine());
    System.out.print("Height: ");
    int heightInput = Integer.parseInt(scanner.nextLine());
    // creo una istanza di Rectangle usando i dati dell'utente
    Rectangle userRectangle = new Rectangle(baseInput, heightInput);


    Rectangle copyRectangle = new Rectangle(userRectangle.getBase(), userRectangle.getHeight());
    //userRectangle.base = -5;

    System.out.println("Perimeter: " + userRectangle.getPerimeter());
    System.out.println("Area: " + userRectangle.getArea());
    System.out.println("Base: " + userRectangle.getBase());
    System.out.println("Height: " + userRectangle.getHeight());
    scanner.close();
  }
}
