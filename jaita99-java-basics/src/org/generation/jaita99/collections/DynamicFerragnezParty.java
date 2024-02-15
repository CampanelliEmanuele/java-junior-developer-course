package org.generation.jaita99.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicFerragnezParty {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // creo la lista di invitati chiedendo all'utente di aggiungere un nome alla volta
    ArrayList<String> guests = new ArrayList<>();
    System.out.println(guests.size());
    boolean stop = false;
    while(!stop){
      // chiedo se vuole inserire un nuovo nome
      System.out.print("Add a new guest? (y/n)");
      String answer = scanner.nextLine();
      switch(answer){
        case "y":
          // inserisce nuovo nome
          System.out.print("Insert name: ");
          String name = scanner.nextLine();
          // aggiungo il nome alla lista
          guests.add(name);
          break;
        case "n":
          // esce
          System.out.println("OK");
          stop = true;
          break;
        default:
          // risposta non valida
          System.out.println("invalid answer");
          break;
      }

    }
    // quando esco dal while stampo a video la lista
    System.out.println(guests);
    // stampo la lista andano a capo ad ogni nome
    for (int i = 0; i < guests.size(); i++) { // nell'array sarebbe guests.length
      String currentElement = guests.get(i); // come nell'array sarebbe guests[i]
      System.out.println(currentElement);
    }





    // ora che la lista è pronta chiedo all'utente come si chiama
    System.out.print("What's your name?");
    String userName = scanner.nextLine();
    // verifico se la lista contiene quella stringa
    boolean found = guests.contains(userName);
    if(found){
      System.out.println("Welcome to the party!");
    } else {
      System.out.println("Sorry you're not in the list");
    }
    scanner.close();
  }
}
