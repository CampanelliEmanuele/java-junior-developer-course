package org.generation.jaita99.oop.cars;

public class CustomCar {

  public static void main(String[] args) {
    Car customCar = new Car("blue", 6, true);

    System.out.println(customCar.getInfo());

    Car emptyCar = new Car();
  }
}
