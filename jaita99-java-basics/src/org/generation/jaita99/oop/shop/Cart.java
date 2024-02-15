package org.generation.jaita99.oop.shop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Cart {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // preparo la categoria di default
    Category eProduct = new Category("e-product", "e-commerce product");

    // preparo una variabile cart come collection
    ArrayList<Product> cart = new ArrayList<>();

    // continuo a chiedere all'utente se vuole aggiungere un prodotto finchè non decide di terminare
    boolean stop = false;
    while(!stop) {
      System.out.print("Add a product? (y/n)");
      String choice = scanner.nextLine();
      switch(choice){
        case "y":
          // ad ogni iterazione devo chiedere quale tipo di prodotto
          System.out.print("Which product? 1-Smartphone 2-Television 3-HeadSet ");
          String type = scanner.nextLine();
          if(type.equals("1") || type.equals("2") || type.equals("3")) {
            System.out.println("You choose " + type);
            // chiedo tutti i generici per ogni prodotto
            String name = null;
            while (name == null || name.isEmpty()) {
              System.out.print("Name: ");
              name = scanner.nextLine();
              if(name.isEmpty()){
                System.out.println("Name must not be empty");
              }
            }
            System.out.print("Description: ");
            String description = scanner.nextLine();
            BigDecimal price = null;
            while (price == null || price.compareTo(new BigDecimal(0)) < 0) {
              try {
                System.out.print("Price: ");
                price = new BigDecimal(scanner.nextLine());
                if(price.compareTo(new BigDecimal(0))< 0){
                  System.out.println("Price must not be negative");
                }
              } catch (Exception e) {
                System.out.println("Invalid number");
              }
            }
            BigDecimal vat = null;
            while (vat == null || vat.compareTo(new BigDecimal(0)) < 0) {
              try {
                System.out.print("Vat: ");
                vat = new BigDecimal(scanner.nextLine());
                if(vat.compareTo(new BigDecimal(0))< 0){
                  System.out.println("Vat must not be negative");
                }
              } catch (Exception e) {
                System.out.println("Invalid number");
              }
            }
            // chiedo i dati specifici per il tipo scelto
            switch(type){
              case "1":
                // smartphone
                System.out.print("IMEI code: ");
                String imeiCode = scanner.nextLine();
                System.out.print("Memory: ");
                int memory = Integer.parseInt(scanner.nextLine());
                // creo un oggetto Smarphone
                Smartphone smartphone = new Smartphone(name, description, price, vat, eProduct, imeiCode, memory);
                // lo aggiungo al carrello
                cart.add(smartphone);
                break;
              case "2":
                // television
                System.out.print("Dimensions: ");
                int dimensions = Integer.parseInt(scanner.nextLine());
                System.out.println("Is smart? (y/n) ");
                String smartString = scanner.nextLine();
                boolean smart = smartString.equals("y");
                // creo un oggetto Television
                Television television = new Television(name, description, price, vat, eProduct, dimensions, smart);
                // la aggiungo al carrello
                cart.add(television);
                break;
              case "3":
                // headset
                System.out.print("Color: ");
                String color = scanner.nextLine();
                System.out.print("Wireless? (y/n) ");
                String wirelessString = scanner.nextLine();
                boolean wireless = wirelessString.equals("y");
                // creo un oggetto HeadSet
                HeadSet headSet = new HeadSet(name, description, price,vat,eProduct, color, wireless);
                // l'aggiungo al carrello
                cart.add(headSet);
                break;
              default:
                break;
            }
          } else {
            System.out.println("Invalid choice");
          }
          break;
        case "n":
          System.out.println("Finish");
          stop = true;
          break;
        default:
          System.out.println("Invalid choice");
          break;
      }

    }
    // terminato il ciclo stampo il carrello
    for(Product product : cart){
      System.out.println("- " + product);
    }

    scanner.close();
  }
}
