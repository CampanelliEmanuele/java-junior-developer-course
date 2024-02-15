package org.generation.jaita99.oop.shop;

import java.math.BigDecimal;

public class HeadSet extends Product{
  // ATTRIBUTI
  private String color;
  private boolean wireless;

  // COSTRUTTORI

  public HeadSet(String name, String description, BigDecimal price,
      BigDecimal vat, Category category, String color, boolean wireless)
      throws IllegalArgumentException {
    super(name, description, price, vat, category);
    this.color = color;
    this.wireless = wireless;
  }

  // GETTER E SETTER
  public String getColor() {
    return color;
  }

  public boolean isWireless() {
    return wireless;
  }

  @Override
  public String toString() {
    String wirelessString = wireless ? "wireless" : "cabled";
    return "HeadSet { color: " + color + ", " + wirelessString + ", "  + super.toString() + "}";
  }
}
