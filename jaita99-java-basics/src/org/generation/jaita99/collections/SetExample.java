package org.generation.jaita99.collections;

import java.util.HashSet;
import java.util.Scanner;

public class SetExample {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // creo un insieme di nomi ma senza duplicati
    HashSet<String> guests = new HashSet<>();

    boolean stop = false;
    while(!stop){
      System.out.println("Insert new guest?(y/n)");
      String answer = scanner.nextLine();
      switch (answer){
        case "y":
          // aggiungo nome
          System.out.print("Name: ");
          String name = scanner.nextLine();
          boolean added = guests.add(name);
          if(!added){
            System.out.println("Name already added");
          }
          break;
        case "n":
          // esco
          stop = true;
          break;
        default:
          System.out.println("invalid answer");
          break;
      }

    }

    System.out.println(guests);

    for(String element : guests){
      System.out.println(element.toUpperCase());
    }

    scanner.close();
  }
}
