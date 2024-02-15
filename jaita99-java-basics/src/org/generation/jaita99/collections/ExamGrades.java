package org.generation.jaita99.collections;

import java.util.HashMap;

public class ExamGrades {

  public static void main(String[] args) {
    // mappa con i risultati dell'esame degli studenti di un corso
    // la chiave è il nome dello studente
    // il valore è il voto
    // Max: 25, Dustin: 30, Will: 18

    HashMap<String, Double> grades = new HashMap<>(); // <String, Double> prima la chiave, poi il valore
    System.out.println(grades);
    // aggiungo delle coppie studente-voto
    grades.put("Max", 25.5);
    grades.put("Will", 18.0);
    grades.put("Dustin", 29.9);
    System.out.println(grades);
    System.out.println(grades.size());
    grades.put("Will", 27.0);
    System.out.println(grades);
  }
}
