package org.generation.jaita99.counter;

public class Main {

  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      Counter c = new Counter();
      System.out.println("ID: " + c.getId());
    }
  }
}
