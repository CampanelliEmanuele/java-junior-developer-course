package org.generation.jaita99.oop.students;

public class Address {
  // ATTRIBUTI
  private String street;
  private int number;
  private String city;

  // COSTRUTTORI

  public Address(String street, int number, String city) {
    this.street = street;
    this.number = number;
    this.city = city;
  }

  // GETTER E SETTER

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  // METODI

  @Override
  public String toString() {
    return street + " n. " + number + " " + city;
  }
}
