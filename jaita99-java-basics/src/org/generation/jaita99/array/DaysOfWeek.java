package org.generation.jaita99.array;

public class DaysOfWeek {

  public static void main(String[] args) {
    String[] daysOfWeek = {"MON", "TUE", "WEN", "THU", "FRI", "SAT", "SUN"};
    System.out.println(daysOfWeek);
    System.out.println(daysOfWeek[0]);
    System.out.println(daysOfWeek[1]);
    System.out.println(daysOfWeek[2]);
    System.out.println(daysOfWeek[3]);
    System.out.println(daysOfWeek[4]);
    System.out.println(daysOfWeek[5]);
    System.out.println(daysOfWeek[6]);

    System.out.println("Array length: " + daysOfWeek.length);

    for (int i = 0; i < daysOfWeek.length; i++) { // i = i+1
      System.out.println(daysOfWeek[i].toLowerCase());
    }
    System.out.println("*******************");
    for (int i = daysOfWeek.length - 1; i >= 0 ; i--) {
      System.out.println(daysOfWeek[i]);
    }

  }
}
