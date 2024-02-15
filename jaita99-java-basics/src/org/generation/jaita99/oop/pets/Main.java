package org.generation.jaita99.oop.pets;

public class Main {

  public static void main(String[] args) {
    Cat emmenthal = new Cat("European", 2, "male", "Emmenthal");
    Cat thor = new Cat("Main Coon", 3, "male", "Thor");

   String emmenthalString =  emmenthal.toString();
   String thorString = thor.toString();

    System.out.println(emmenthal);
    System.out.println(thor);

    emmenthal.grow();
    System.out.println(emmenthal);

    thor.grow();
    System.out.println(thor);
  }
}
