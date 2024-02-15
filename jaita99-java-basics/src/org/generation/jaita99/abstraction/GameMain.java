package org.generation.jaita99.abstraction;

import java.util.Scanner;

public class GameMain {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // creo gli array di oggetti gestiti dal videogame
    Flyers[] flyers = {new Baloon("red"), new Bird("Tweety"), new Baloon("green")};
    Swimmers[] swimmers = {new Duck("Duffy"), new Duck("Donald")};
    Animal[] animals = {new Cow("Lola"), new Cat("Thor", new String[]{"ball"}), new Bird("Gino")};
    // creo il videogame
    Videogame videogame = new Videogame(flyers, animals, swimmers);

    boolean exit = false;
    while(!exit) {
      System.out.println("Where do you want to go? 1-Sky 2-Pond 3-Farm other-exit");
      String choice = scanner.nextLine();
      switch(choice){
        case "1":
          System.out.println("Welcome to the sky");
          videogame.makeFly();
          break;
        case "2":
          System.out.println("Dive into the pond");
          videogame.makeSwim();
          break;
        case "3":
          System.out.println("Enjoy the farm");
          videogame.makeNoises();
          break;
        default:
          exit = true;
          System.out.println("Bye Bye");
      }

    }
    scanner.close();

  }
}
