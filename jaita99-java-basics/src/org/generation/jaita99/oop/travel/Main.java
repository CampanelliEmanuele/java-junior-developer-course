package org.generation.jaita99.oop.travel;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Holiday holiday = new Holiday("Napoli", LocalDate.parse("2023-12-14"), LocalDate.parse("2023-12-24"));
    System.out.println(holiday);

    List<Trip> holidayTrips = holiday.getTripList();
    System.out.println(holidayTrips);
    Trip firstTrip = new Trip("Vesuvio", 5, new BigDecimal("20"));
    holidayTrips.add(firstTrip);
    Trip secondTrip = new Trip("Capri", 8, new BigDecimal(100));
    holidayTrips.add(secondTrip);



    System.out.println(holiday);


    boolean containsFirstTrip = holidayTrips.contains(new Trip("Vesuvio", 5, new BigDecimal("20")));
    System.out.println("Contains trip to Vesuvio " + containsFirstTrip);

    ArrayList<BigDecimal> prices = new ArrayList<>();
    prices.add(new BigDecimal(0));
    System.out.println(prices);
    System.out.println(prices.contains(new BigDecimal(0)));



  }
}
