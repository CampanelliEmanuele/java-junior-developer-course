package org.generation.jaita99.oop.travel;

import java.time.LocalDate;
import org.generation.jaita99.oop.travel.exceptions.InvalidDateException;
import org.generation.jaita99.oop.travel.exceptions.NullParameterException;

public class ValidationHelper {
// costruttore private perchè è solo una classe di utilità

  private ValidationHelper() {
  }


  // metodi di utilità per le validazioni
  public static void checkNull(Object value, String parameter) throws NullParameterException {
    if(value == null){
      throw new NullParameterException(parameter);
    }
  }

  public static void checkDateNotInThePast(LocalDate date) throws InvalidDateException {
    if(date.isBefore(LocalDate.now())){
      throw new InvalidDateException(date + " is in the past");
    }
  }

  public static void checkStartEndDate(LocalDate startDate, LocalDate endDate) throws InvalidDateException{
    if(endDate.isBefore(startDate)){
      throw  new InvalidDateException(endDate + " is before " + startDate);
    }
  }
}
