package org.generation.jaita99.abstraction;

public class Cow extends Animal{

  public Cow(String name) {
    super(name);
  }

  @Override
  public void makeNoise() {
    System.out.println("Moooooh");
  }
}
