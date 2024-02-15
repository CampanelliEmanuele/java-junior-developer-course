package org.generation.jaita99.inheritance;

import java.math.BigDecimal;
import java.time.LocalDate;
import org.generation.jaita99.oop.shop.Category;
import org.generation.jaita99.oop.shop.Product;

public class Examples {

  public static void main(String[] args) {
    Object[] objects = {new BigDecimal("10.5"), LocalDate.now(), new Product("test", "test", new BigDecimal("10"), new BigDecimal("0.18"), new Category("category test", ""))};

    for (Object o : objects) {
      System.out.println(o);
    }
  }
}
