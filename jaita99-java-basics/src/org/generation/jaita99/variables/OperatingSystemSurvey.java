package org.generation.jaita99.variables;

import java.util.Scanner;

public class OperatingSystemSurvey {

  public static void main(String[] args) {
    // registro quanti utenti usano Mac o Win o Linux
    // mostro a video le percentuali di utenti Mac, Win e Linux

    // per leggere i valori delle variabili da tastiera devo istanziare uno Scanner
    Scanner keyboardReader = new Scanner(System.in);

    int macUsers;
    int windowsUsers;
    int linuxUsers;
    // in un secondo step chiediamo all'utente di darci i valori
    /*macUsers = 2;
    windowsUsers = 24;
    linuxUsers = 1;*/
    System.out.println("Number of Mac users");

    macUsers = keyboardReader.nextInt();
    System.out.println("Number of Windows users");
    windowsUsers = keyboardReader.nextInt();
    System.out.println("Number of Linux users");
    linuxUsers = keyboardReader.nextInt();

    System.out.println("Mac users: " + macUsers);
    System.out.println("Windows users: " + windowsUsers);
    System.out.println("Linux users: " + linuxUsers);


    // calcolo le percentuali valore/totale*100
    // variabile intermedia col totale
    int total = macUsers + windowsUsers + linuxUsers;
    System.out.println("total users " + total);


    // per trattare i numeri interi come double e quindi ottenere un risultato double faccio un cast
    double macPercentage = (double)macUsers/total*100; // 2.0/27*100
    double windowsPercentage = (double)windowsUsers/total*100;
    double linuxPercentage = (double)linuxUsers/total*100;

    String formattedMacPercentage = String.format("%.2f", macPercentage);
    String formattedWindowsPercentage = String.format("%.2f", windowsPercentage);
    String formattedLinuxPercentage = String.format("%.2f", linuxPercentage);

    System.out.println("% Mac: " + formattedMacPercentage);
    System.out.println("% Windows: " + formattedWindowsPercentage);
    System.out.println("% Linux: " + formattedLinuxPercentage);

    //System.out.printf("Percentage Mac: %.2f\n", macPercentage);



    // prima di terminare l'esecuzione chiudo lo Scanner
    keyboardReader.close();
  }
}
