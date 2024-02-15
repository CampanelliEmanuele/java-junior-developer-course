package org.generation.jaita99.abstraction;

public class Bird extends Animal implements Flyers{

  public Bird(String name) {
    super(name);
  }

  @Override
  public void makeNoise() {
    System.out.println("Cheep");
  }

  @Override
  public void fly(int times) {
    for (int i = 0; i < times; i++) {
      System.out.println("I'm flying");
    }
  }
}
