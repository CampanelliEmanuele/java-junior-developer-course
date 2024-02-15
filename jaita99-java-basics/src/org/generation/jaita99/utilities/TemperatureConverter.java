package org.generation.jaita99.utilities;

public class TemperatureConverter {
  // ATTRIBUTI
  public final static int CONSTANT_VALUE = 32;

  // COSTRUTTORI
  private TemperatureConverter(){
    // non fa niente ma è private così non posso creare istanze di TemperatureConverter
  }
  // METODI
  public static double fromCelsiusToFarenheit(double celsius){
    return (celsius * 9/5) + CONSTANT_VALUE;
  }

  public static double fromFarenheitToCelsius(double farenheit){
    return (farenheit-CONSTANT_VALUE)*5/9;
  }
}
