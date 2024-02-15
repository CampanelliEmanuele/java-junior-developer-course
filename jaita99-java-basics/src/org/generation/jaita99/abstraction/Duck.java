package org.generation.jaita99.abstraction;

public class Duck extends Animal implements Flyers, Swimmers{

  public Duck(String name) {
    super(name);
  }

  @Override
  public void makeNoise() {
    System.out.println("Quack");
  }

  @Override
  public void fly(int times) {
    System.out.println("I fly " + times + " times");
  }

  @Override
  public void swim() {
    System.out.println("I'm swimming on the surface");
  }
}
