package org.generation.jaita99.variables;

public class BookType {

  public static void main(String[] args) {
    // variabili che rappresentano le caratteristiche del libro
    int yearOfPublication = 2008;
    // String monthOfPublication = "agosto";
    int monthOfPublication = 8;
    int dayOfPublication = 1;
    String dateOfPublication = dayOfPublication + "/" + monthOfPublication + "/" + yearOfPublication;
    String title = "Clean Code: A Handbook of Agile Software Craftsmanship";
    String authors = "Robert C.Martin";

    boolean flexibleCover = true;
    boolean audioBook = true;
    boolean eBook = true;

    double flexibleCoverPrice = 28.27;
    System.out.println(flexibleCoverPrice);
    double audioBookPrice = 0;
    System.out.println(audioBookPrice);
    float eBookPrice = 15.28F;





    System.out.println(dateOfPublication);


  }
}
