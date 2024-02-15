package org.generation.jaita99.abstraction;

public abstract class Animal {
  // ATTRIBUTI
  private String name;

  // COSTRUTTORI
  public Animal(String name){
    this.name = name;
  }

  // GETTER E SETTER
  public String getName() {
    return name;
  }

  // METODI
  public void sleep(){
    System.out.println("Zzzzzzzzz");
  }

  // METODI ASTRATTI cioè che non hanno il corpo
  public abstract void makeNoise();
}
