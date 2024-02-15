package org.generation.jaita99.oop.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class MainWithExceptions {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // categoria di default
    Category freshProduct = new Category("fresh product", "product with a expire date, stays in the refrigerator");
    System.out.println("Create a fresh product");
    // chiedo all'utente tutti i dati del prodotto
    System.out.print("Name: ");
    String nameInput = scanner.nextLine();
    System.out.print("Description: ");
    String descriptionInput = scanner.nextLine();

    BigDecimal price = null;
    while (price == null) {
      System.out.print("Price: ");
      String priceInput = scanner.nextLine();
      try {
        price = new BigDecimal(priceInput);
      } catch (Exception e) {
        System.out.println("Invalid number");
      }
    }

    BigDecimal vat = null;
    while (vat == null){
        System.out.print("Vat: ");
        String vatInput = scanner.nextLine();
      try{
        vat = new BigDecimal(vatInput);
      } catch(NumberFormatException e){
        System.out.println("Invalid number");
      }
    }




    try {
      Product product = new Product(nameInput, descriptionInput,price , vat, freshProduct);
      System.out.println(product);
    } catch(NumberFormatException numberFormatException){
      System.out.println("The price or vat is not a number");
    } catch (IllegalArgumentException illegalArgumentException) {
      System.out.println("Sorry invalid parameters: " + illegalArgumentException.getMessage());
    }



    scanner.close();
  }
}
