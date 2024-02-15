package org.generation.jaita99.oop.shop;

import java.math.BigDecimal;

public class Television extends Product{
  // ATTRIBUTI
  private int dimensions;
  private boolean smart;

  // COSTRUTTORI

  public Television(String name, String description, BigDecimal price,
      BigDecimal vat, Category category, int dimensions, boolean smart)
      throws IllegalArgumentException {
    super(name, description, price, vat, category);
    this.dimensions = dimensions;
    this.smart = smart;
  }

  public int getDimensions() {
    return dimensions;
  }

  public boolean isSmart() {
    return smart;
  }

  @Override
  public String toString() {
    String smartString = smart ? "is smart" : "not smart";
    return "Television { dimensions: " + dimensions +"\", " + smartString + ", " + super.toString() + "}";
  }
}
