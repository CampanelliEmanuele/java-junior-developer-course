package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product prod;
        Category category = new Category("category1", "category1Description");

        try {
            // Getting inputs
            System.out.println("Enter in the following order: product's name, product's description, product's iva and product's price.");
            String prodName = scanner.nextLine();
            String prodDesc = scanner.nextLine();
            double prodIva = Double.parseDouble(scanner.nextLine());
            double prodPrice = Double.parseDouble(scanner.nextLine());

            // Object creation and info printing
            prod = new Product(prodName, prodDesc, prodIva, prodPrice, category);
            printInfos(prod);
        } catch (IllegalArgumentException e) {
            System.out.println("INVALID INPUTS DETECTED: automatic creation of the product object with arbitrary values.");

            // Automatic object creation and info printing
            prod = new Product("prodName", "prodDescription", 23.0d, 10.00d, category);
            printInfos(prod);
        } finally {
            scanner.close();
        }

    }

    private static void printInfos(Product prod) {
        System.out.println("Full name: " + prod.getFullName());
        System.out.println("Price without iva: " + prod.showPrice(false) + "€");
        System.out.println("Price with iva (" + prod.getIva() + "%): " + prod.showPrice(true) + "€");

        System.out.println("Product category information:");
        System.out.println("Category name: " + prod.getProdCategory().getName());
        System.out.println("Category description: " + prod.getProdCategory().getDescription());
    }
}