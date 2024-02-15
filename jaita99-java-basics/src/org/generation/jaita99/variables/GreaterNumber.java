package org.generation.jaita99.variables;

import java.util.Random;
import java.util.Scanner;

public class GreaterNumber {

  public static void main(String[] args) {
    // genero un numero random compreso tra 0 e 10
    // chiedo all'utente di dirmi un numero compreso tra 0 e 10
    // mostro a video se ha indovinato il numero o se è maggiore o se è minore di quello random

    // creo la variabile Scanner
    Scanner scan = new Scanner(System.in);
    // creo la variabile Random per generare numeri casuali
    Random randomGenerator = new Random();
    // genero il numero
    // limite inferiore incluso, limite superiore escluso
    int randomNumber = randomGenerator.nextInt(0, 11);

    // interagiamo con l'utente
    System.out.println("Guess my number (0-10)");
    // salvo in una variabile il numero dell'utente
    int userNumber = scan.nextInt();

    System.out.println("Random: "+ randomNumber);
    System.out.println("User: "+ userNumber);
    // prima controllo se il numero è compreso tra 0 e 10
    if(userNumber >= 0 && userNumber <= 10){
      System.out.println("Valid number");
      if(randomNumber == userNumber){
        System.out.println("You win!");
      } else if(randomNumber > userNumber){
        System.out.println("Your number is too small");
      } else {
        System.out.println("Your number is too big");
      }
    } else {
      System.out.println("Invalid number");
    }

 /*   // numero valido: verifico se ha indovinato
    if(randomNumber == userNumber){
      System.out.println("You win!");
    } else if(randomNumber > userNumber){
      System.out.println("Your number is too small");
    } else {
      System.out.println("Your number is too big");
    }*/




    // chiudo lo scanner
    scan.close();
  }
}
