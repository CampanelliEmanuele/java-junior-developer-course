package org.generation.jaita99.exceptions;

import java.util.Scanner;

public class ExceptionExample {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);




    System.out.println("Insert a number");
    try {
      int number = scanner.nextInt();
      System.out.println("Your number is " + number);
    } catch(Exception pippo){
      System.out.println("This is not a number");
      //System.out.println(e.getMessage());
      System.out.println(pippo);
    } finally{
      System.out.println("Bye");
      scanner.close();
    }



  }
}
