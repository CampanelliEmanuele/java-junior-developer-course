package org.generation.jaita99.array;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("How many numbers? ");
    int size = scanner.nextInt();
    // creo una variabile di tipo Random
    Random randomGenerator = new Random();


    // creo un array di interi vuoto
    int[] randomNumbers = new int[size]; // array vuoto di tante posizioni quante mi ha detto l'utente
    // stampo l'array appena creato
    for (int i = 0; i < randomNumbers.length; i++) {
      System.out.println(randomNumbers[i]);
    }

    // ad ogni iterazione del ciclo for genero un numero casuale e lo inserisco nell'array
    for (int i = 0; i < randomNumbers.length; i++) {
      randomNumbers[i] = randomGenerator.nextInt();
    }
    // stampo tutti i valori dell'array
    for (int i = 0; i < randomNumbers.length; i++) {
      System.out.println(randomNumbers[i]);
    }


    scanner.close();
  }
}
