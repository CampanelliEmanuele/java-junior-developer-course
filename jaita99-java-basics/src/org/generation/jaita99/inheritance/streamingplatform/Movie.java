package org.generation.jaita99.inheritance.streamingplatform;

public class Movie extends Content{
// ATTRIBUTI
  private long length;
// COSTRUTTORI


  public Movie(String title, long length) {
    super(title);
    this.length = length;
  }

  public long getLength() {
    return length;
  }

  public void setLength(long length) {
    this.length = length;
  }

  @Override
  public void play() {
    super.play();
    System.out.println("Length: " + length);
  }

  @Override
  public String toString() {
    return "Movie: title " + getTitle() + ", length " + length;
  }
}
