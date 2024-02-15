package org.generation.jaita99.oop.cars;

public class Car {
  // ATTRIBUTI
  String color;
  int numberOfAirbags;
  boolean isHybrid;

  // COSTRUTTORI
  Car(){
    System.out.println("Ciao sono il costruttore");
    // nel costruttore inizializzo gli attributi dell'oggetto
    color = "white";
    numberOfAirbags = 2;
    isHybrid = false;
  }
  // costruttore con parametri


  Car(String color, int numberOfAirbags, boolean isHybrid) {
    this.color = color;
    this.numberOfAirbags = numberOfAirbags;
    this.isHybrid = isHybrid;
  }

  // METODI
  void defineOptionals(String color,int numberOfAirbagsOptional, boolean isHybridOptional){
    // prendo i valori dei parametri e li assegno agli attributi dell'oggetto
    this.color = color;
    numberOfAirbags = numberOfAirbagsOptional;
    isHybrid = isHybridOptional;
  }

  void defineOptionals(int numberOfAirbags, boolean isHybrid){
    color = "white";
    this.numberOfAirbags = numberOfAirbags;
    this.isHybrid = isHybrid;
  }

  String getInfo(){
    String info =  "Color: " + color + ", number of airbags: " + numberOfAirbags;
    String isHybridInfo;
    isHybridInfo = isHybrid ? "is hybrid" : "is not hybrid";
 /*   if(isHybrid){
      isHybridInfo = "is hybrid";
    } else {
      isHybridInfo = "is not hybrid";
    }*/
    return info + ", " + isHybridInfo;
  }

}
