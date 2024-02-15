package org.lessons.java.geometria;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Nel progetto java-oop-geometria creare un package org.lessons.java.geometria in cui inserire le classi:
 *  1. una classe Rettangolo con due attributi interi: base e altezza.
 *      Aggiungere un opportuno costruttore con parametri.
 *      Aggiungere due metodi: calcolaArea e calcolaPerimetro che calcolano e restituiscono, rispettivamente, l’area e il
 *      perimetro del rettangolo.
 *  2. una classe Main contenente il metodo main(), nel quale chiedete all’utente di inserire, da terminale, i valori di
 *      base e di altezza con cui creare un nuovo Rettangolo. Dopo averlo istanziato, stampate a video il perimetro e l’area.
 *
 * BONUS
 * Aggiungere alla classe Rettangolo un metodo “disegna” che disegna in console il rettangolo con le sue dimensioni,
 * come nell’immagine allegata
 */

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base length of the rectangle: ");
        double inBase = scanner.nextDouble();

        System.out.println("Enter the height length of the rectangle: ");
        double inHeight = scanner.nextDouble();

        scanner.close();

        Rectangle rectangle = new Rectangle(inBase, inHeight);
        System.out.println(rectangle.toString());

        rectangle.printOnConsole("* ","  ");

        // base == height case
        System.out.println("base == height case");
        rectangle.setBase(5);
        rectangle.setheight(5);
        rectangle.printOnConsole("* ","  ");
        System.out.println();

        // base < height case
        System.out.println("base < height case");
        rectangle.setBase(5);
        rectangle.setheight(10);
        rectangle.printOnConsole("* ","  ");
        System.out.println();

        // base > height case
        System.out.println("base > height case");
        rectangle.setBase(10);
        rectangle.setheight(5);
        rectangle.printOnConsole("* ","  ");
        System.out.println();

    }
}
