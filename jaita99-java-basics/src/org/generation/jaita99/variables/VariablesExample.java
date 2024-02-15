package org.generation.jaita99.variables;

public class VariablesExample {

  public static void main(String[] args) {
    String miaStringa;

    // assegnazione
    miaStringa = "ciao";
    // utilizzo/richiamo
    System.out.println(miaStringa);

    // assegnazione
     miaStringa += "arrivederci"; // += miaStringa = miaStringa + "arrivederci"
    // utilizzo/richiamo
    System.out.println(miaStringa);

    System.out.println("Il risultato: " + 8);

    // incremento e decremento
    int x = 5;
    //x++; // x = x + 1
    System.out.println("x vale " + ++x);
    System.out.println(x);

    // incremento x di 4
    x += 4; // x = x + 4;
    x *= 2; // x = x * 2;
    System.out.println("Incremented x " + x);

  }
}
