package org.generation.jaita99.inheritance.streamingplatform;

public class Series extends Content{
  // eredita tutti gli attributi e i metodi public del Content

  // ATTRIBUTI
  private int season;
  private int numberOfEpisode;

  // COSTRUTTORI
  public Series(String title, int season, int numberOfEpisode) {
    // prendo il parametro title e lo passo al costruttore della superclasse
    super(title);
    this.season = season;
    this.numberOfEpisode = numberOfEpisode;
  }

  public int getSeason() {
    return season;
  }

  public void setSeason(int season) {
    this.season = season;
  }

  public int getNumberOfEpisode() {
    return numberOfEpisode;
  }

  public void setNumberOfEpisode(int numberOfEpisode) {
    this.numberOfEpisode = numberOfEpisode;
  }

  @Override
  public void play() {
    System.out.println("Series: " + getTitle() + " (season " + season + ")");
    for (int i = 0; i < numberOfEpisode; i++) {
      System.out.println("You're watching episode " + (i+1));
    }
  }


}
