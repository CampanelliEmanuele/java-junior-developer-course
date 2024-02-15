package org.generation.jaita99.utilities;

import java.time.LocalDate;
import java.util.Random;

public class Main {

  public static void main(String[] args) {
    // libreria Random
    Random random = new Random();
    double randomNumber = random.nextDouble();

    // libreria Math
    double randomDouble = Math.random();



    // lavoro con le LocalDate
    LocalDate today = LocalDate.now();
    LocalDate christmas = LocalDate.parse("2023-12-25");


    int year2 = christmas.getYear();
    int year = today.getYear();



  }
}
