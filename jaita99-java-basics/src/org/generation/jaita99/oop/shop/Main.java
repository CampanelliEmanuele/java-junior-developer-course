package org.generation.jaita99.oop.shop;

import java.math.BigDecimal;

public class Main {

  public static void main(String[] args) {
    Category freshProduct = new Category("fresh product", "product with a expire date, stays in the refrigerator");
    Product product = new Product("yogurt", "strawberry yogurt",new BigDecimal("2.55"), new BigDecimal("0.22"), freshProduct);
    System.out.println(product);
  }
}
