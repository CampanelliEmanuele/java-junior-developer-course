package org.generation.jaita99.array;



import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SearchNumber {

  public static void main(String[] args) {
    // genero un array di numeri random compresi tra 1 e 10
    // chiedo all'utente di dirmi un numero compreso tra 1 e 10
    // gli dico se è presente nell'array oppure no
    Scanner scanner = new Scanner(System.in);
    Random randomGenerator = new Random();
    // chiedo all'utente la dimensione dell'array
    System.out.print("How many numbers? ");
    int arraySize = Integer.parseInt(scanner.nextLine());
    // creo l'array di quella dimensione
    int[] numbers = new int[arraySize];
    // riempio l'array con i numeri random
    for (int i = 0; i < numbers.length; i++) {
      // alla posizione i dell'array inserisco un numero casuale
      numbers[i] = randomGenerator.nextInt(1,11);
    }
    // per debug stampo l'array generato
    System.out.println(Arrays.toString(numbers));

    // chiedo all'utente il numero da cercare
    System.out.print("Number to search: ");
    int numberToSearch = Integer.parseInt(scanner.nextLine());
    // devo fare la ricerca

    boolean found = false;
    for (int i = 0; i < numbers.length && !found; i++) {
      // confronto il numero da cercare con l'elemento corrente
      if(numberToSearch == numbers[i]){
        // se ho trovato il numero cambio il valore di found
        found = true;
       // break;
      }
    }
    // if(found) è come found == true
    // if(!found) è come found == false

    // alla fine del ciclo guardo il valore della variabile foud
    if(!found){ // come dire found == false
      System.out.println("Number not found");
    } else {
      System.out.println("Number found!");
    }




    scanner.close();
  }
}
