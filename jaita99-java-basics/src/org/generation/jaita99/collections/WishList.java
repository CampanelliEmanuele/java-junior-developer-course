package org.generation.jaita99.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class WishList {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> wishList = new ArrayList<>();

    boolean stop = false;
    while(!stop){
      // continuo a chiedere se vuole aggiungere un regalo
      System.out.print("Add a new present? (1-yes 2-no)") ;
      String choice = scanner.nextLine();
      switch (choice){
        case "1":
          // inserisce regalo
          System.out.print("Present: ");
          String present = scanner.nextLine();
          /*boolean isAdded = false;
          for (int i = 0; i < wishList.size(); i++) {
            if(wishList.get(i).equalsIgnoreCase(present)){
             isAdded = true;
             break;
            }
          }*/
          present = present.toLowerCase();
          if(wishList.contains(present)){
            System.out.println("You already added this present");
          } else {
            wishList.add(present);
            System.out.println("Now you have " + wishList.size() + " presents in the wishlist");
          }

         /* // aggiungo il regalo al set
          boolean added = wishList.add(present);
          // verifico se il regalo c'era già
          if(!added){
            System.out.println("You already added this present");
          } else {
            // mostro la lunghezza della lista
            System.out.println("Now you have " + wishList.size() + " presents in the wishlist");
          }*/
          break;
        case "2":
          // termina
          stop = true;
          break;
        default:
          System.out.println("Invalid choice");
          break;
      }
    }

    // ordino la lista in ordine alfabetico
    Collections.sort(wishList);

    // stampo tutti i regali della lista
    for (String element : wishList) {
      System.out.println("- " + element);
    }

    scanner.close();
  }
}
