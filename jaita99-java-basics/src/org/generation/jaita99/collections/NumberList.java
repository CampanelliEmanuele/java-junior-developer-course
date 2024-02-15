package org.generation.jaita99.collections;

import java.util.ArrayList;
import java.util.Random;

public class NumberList {

  public static void main(String[] args) {
    // aggiungo numeri random (0-100) a una lista
    // fino a che non esce un numero compreso tra 10 e 20
    ArrayList<Integer> numbers = new ArrayList<>();

    Random random = new Random();
    boolean exit = false; // flag
    while(!exit){
      // ad ogni iterazione genero un numero random
      int number = random.nextInt(0, 100);
      System.out.println("Number: " + number);
      // verifico se è compreso tra 10 e 20
      if(number >= 10 && number <= 20){
        // esco
        System.out.println("Number between 10 and 20. Exit");
        exit = true;
      } else {
        System.out.println("Add number to list");
        numbers.add(number);
      }
    }
    // stampo la lista finale
    System.out.println(numbers);
  }
}
