package org.generation.jaita99.variables;

public class OperatorsExample {

  public static void main(String[] args) {
    int x = 5;
    int y = 8;

    System.out.println((x > 10 && x < y) || (x < 10 && x > (y+1)) );
  }
}
