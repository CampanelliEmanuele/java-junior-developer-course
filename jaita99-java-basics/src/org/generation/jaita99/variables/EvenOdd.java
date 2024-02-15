package org.generation.jaita99.variables;

import java.util.Scanner;

public class EvenOdd {

  public static void main(String[] args) {
    // chiedo all'utente un numero intero
    // stampo a video se è pari o dispari

    // creo una variabile di tipo Scanner per leggere da tastiera
    Scanner scan = new Scanner(System.in);

    // chiedo all'utente il numero
    System.out.print("Insert an integer: ");
    int number = scan.nextInt();
    System.out.println("You number: " + number);
    if(number % 2 == 0){
      // se il resto è 0 (pari) eseguo questo codice
      System.out.println("The number is even");
    } else {
      // se il resto non è zero (dispari) eseguo questo codice
      System.out.println("The number is odd");
    }

    // prima della fine del programma chiudo lo scanner
    scan.close();
  }
}
