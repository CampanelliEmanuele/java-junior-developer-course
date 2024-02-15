package org.generation.jaita99.oop.geometry;

public class Rectangle {
  // 1. ATTRIBUTI
  private int base;
  private int height;

  // 2. COSTRUTTORI
  public Rectangle(int base, int height){
    // perchè siano validi base e height devono essere > 0
    /*if(base > 0){
      this.base = base;
    } else {
      // se base non è valida assegno il valore di default che è 1
      this.base = 1;
    }*/
    // oppure con operatore ternario
    // this.base = base > 0 ? base : 1;

  /*  if(height > 0) {
      this.height = height;
    } else {
      this.height = 1;
    }*/
    this.base = valueOrDefault(base);
    this.height = valueOrDefault(height);
  }


  // 3. GETTER e SETTER

  public int getBase() {
    return base;
  }

  public int getHeight() {
    return height;
  }

  public void setBase(int base) {
    this.base = valueOrDefault(base);
  }

  public void setHeight(int height) {
    this.height = valueOrDefault(height);
  }

  // 4. METODI
  // metodo che calcola l'area del rettangolo a partire dalle sue dimensioni
  public int getArea(){
    return base*height;
  }
  // metodo che calcola il perimetro a partire dalle sue dimensioni
  public int getPerimeter(){
    return 2*base + 2*height;
  }

  // metodo di servizio che prende un valore e restituisce quel valore se è > 0 altrimenti il default
  private int valueOrDefault(int value){
    if(value > 0)
      return value;
    else return 1;
  }
}
