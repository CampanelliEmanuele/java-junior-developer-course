package org.generation.jaita99.oop.shop;

import java.math.BigDecimal;

public class Smartphone extends Product{
  // ATTRIBUTI
  private String imeiCode;
  private int memory;

  // COSTRUTTORI


  public Smartphone(String name, String description, BigDecimal price,
      BigDecimal vat, Category category, String imeiCode, int memory)
      throws IllegalArgumentException {
    super(name, description, price, vat, category);
    this.imeiCode = imeiCode;
    this.memory = memory;
  }

  //GETTER E SETTER
  public String getImeiCode() {
    return imeiCode;
  }

  public int getMemory() {
    return memory;
  }

  @Override
  public String toString() {
    return "Smartphone{ imei: " + imeiCode + ", memory: " + memory + " GB, " + super.toString() + "}";
  }
}
