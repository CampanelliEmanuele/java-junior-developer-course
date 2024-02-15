package org.generation.jaita99.abstraction;

import java.util.Random;

public class Cat extends Animal{
// ATTRIBUTI
  private String[] toys;
  // COSTRUTTORI
  public Cat(String name, String[] toys) {
    super(name);
    this.toys = toys;
  }
// METODI
  @Override
  public void makeNoise() {
    System.out.println("Meow");
  }

  public void play(){
    Random random = new Random();
    int index = random.nextInt(toys.length);
    System.out.println("I'm playng with " + toys[index]);
  }
}
