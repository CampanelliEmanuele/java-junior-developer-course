package org.generation.jaita99.oop.travel;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import org.generation.jaita99.oop.travel.exceptions.InvalidDateException;
import org.generation.jaita99.oop.travel.exceptions.NullParameterException;

public class Holiday {

  // ATTRIBUTI
  private String destination; // not null
  private LocalDate startDate; // not null, non già passata
  private LocalDate endDate; // not null
  // startDate <= endDate

  private ArrayList<Trip> tripList;

  // COSTRUTTORI

  public Holiday(String destination, LocalDate startDate, LocalDate endDate) throws InvalidDateException, NullParameterException{
    ValidationHelper.checkNull(destination, "destination");
    ValidationHelper.checkNull(startDate, "start date");
    ValidationHelper.checkNull(endDate, "end date");
    ValidationHelper.checkDateNotInThePast(startDate);
    ValidationHelper.checkStartEndDate(startDate, endDate);
    this.destination = destination;
    this.startDate = startDate;
    this.endDate = endDate;
    this.tripList = new ArrayList<>();
  }

  public Holiday(String destination, String startDateString, String endDateString) throws InvalidDateException, NullParameterException{
    // validazione
    ValidationHelper.checkNull(destination, "destination");
    ValidationHelper.checkNull(startDateString, "start date");
    ValidationHelper.checkNull(endDateString, "end date");
    LocalDate startDateInput = null;
    LocalDate endDateInput = null;
    try {
      startDateInput = LocalDate.parse(startDateString);
      ValidationHelper.checkDateNotInThePast(startDateInput);
    } catch (DateTimeParseException e) {
      throw new InvalidDateException("Invalid date format for start date");
    }
    try {
      endDateInput = LocalDate.parse(endDateString);
    } catch (DateTimeParseException e) {
      throw new InvalidDateException("Invalid date format for end date");
    }
    ValidationHelper.checkStartEndDate(startDateInput, endDateInput);
    // se ho passato tutte le validazioni posso concludere il costruttore
    this.startDate = startDateInput;
    this.endDate = endDateInput;
    this.destination = destination;
    this.tripList = new ArrayList<>();
  }



  // GETTER E SETTER
  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) throws NullParameterException{
    ValidationHelper.checkNull(destination, "destination");
    this.destination = destination;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public List<Trip> getTripList() {
    return tripList;
  }

  public void setStartDate(LocalDate startDate) throws NullParameterException, InvalidDateException{
    ValidationHelper.checkNull(startDate, "start date");
    ValidationHelper.checkDateNotInThePast(startDate);
    ValidationHelper.checkStartEndDate(startDate, this.endDate);
    this.startDate = startDate;
  }

  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) throws NullParameterException, InvalidDateException{
    ValidationHelper.checkNull(endDate, "end date");
    ValidationHelper.checkStartEndDate(this.startDate, endDate);
    this.endDate = endDate;
  }

  // METODI
  public long getHolidayLength(){
    return ChronoUnit.DAYS.between(startDate, endDate);
  }

/*  private void checkNull(Object value, String parameter) throws NullParameterException{
    if(value == null){
      throw new NullParameterException(parameter);
    }
  }

  private void checkDateNotInThePast(LocalDate date) throws InvalidDateException{
    if(date.isBefore(LocalDate.now())){
      throw new InvalidDateException(date + " is in the past");
    }
  }

  private void checkStartEndDate(LocalDate startDate, LocalDate endDate) throws InvalidDateException{
    if(endDate.isBefore(startDate)){
      throw  new InvalidDateException(endDate + " is before " + startDate);
    }
  }
*/
  @Override
  public String toString() {
    String s =  "Holiday to " + destination + " of " + getHolidayLength() + " days, from " + startDate + " to " + endDate;
    if(!tripList.isEmpty()){
      s += "\nTrips:\n";
      for(Trip trip : tripList){
        s += trip.toString() + "\n";
      }
    }
    return s;
  }
}
