package org.generation.jaita99.oop.travel;

import java.math.BigDecimal;
import java.util.Objects;
import org.generation.jaita99.oop.travel.exceptions.InvalidDateException;
import org.generation.jaita99.oop.travel.exceptions.NullParameterException;

public class Trip {
 // ATTRIBUTI
  private String city;
  private int duration;
  private BigDecimal price;

  // COSTRUTTORI

  public Trip(String city, int duration, BigDecimal price) throws IllegalArgumentException{
    if(city == null || city.isEmpty())
      throw new NullParameterException("city must not be empty");
    if(duration <= 0)
      throw  new IllegalArgumentException("duration must be positive");
    if(price == null || price.compareTo(new BigDecimal(0))<0)
      throw new IllegalArgumentException("price must be positive");
    this.city = city;
    this.duration = duration;
    this.price = price;
  }

  // GETTER E SETTER

  public String getCity() {
    return city;
  }

  public int getDuration() {
    return duration;
  }

  public BigDecimal getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return "Trip to " + city + " of " + duration + " hours, price: " + price + "€";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Trip trip = (Trip) o;
    return getDuration() == trip.getDuration() && Objects.equals(getCity(), trip.getCity())
        && Objects.equals(getPrice(), trip.getPrice());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getCity(), getDuration(), getPrice());
  }

  /*@Override
  public boolean equals(Object obj) {
    // se occupiamo lo stesso spazio di memoria siamo uguali
    if(this == obj)
      return true;
    // se l'altro oggetto è nullo siamo sicuramente diversi perchè io (this) non sono null
    if(obj == null)
      return false;
    // se l'altro oggetto non è un Trip non siamo uguali
    if(obj instanceof Trip){ // instanceOf ritorna vero se la classe di obj è Trip
      // ci confrontiamo
      Trip otherTrip = (Trip) obj; // cast->trasformo un oggetto in un altro oggetto
      return this.city.equals(otherTrip.city)
          && this.duration == otherTrip.getDuration()
          && this.price.equals(otherTrip.price);
    } else {
      return false;
    }
  }*/
}
