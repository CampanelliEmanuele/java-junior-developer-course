package org.generation.jaita99.abstraction;

public class Baloon implements Flyers{
  private String color;

  public Baloon(String color) {
    this.color = color;
  }

  @Override
  public void fly(int times) {
    System.out.println("I'm a " + color + " baloon and I fly " + times);
  }
}
