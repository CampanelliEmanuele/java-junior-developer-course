package org.generation.jaita99.inheritance.streamingplatform;

public class Content {
  // ATTRIBUTI
  private String title;

  public String getTitle() {
    return title;
  }
  // COSTRUTTORI
  public Content(String title) {
    this.title = title;
  }

  // GETTER e SETTER
  public void setTitle(String title) {
    this.title = title;
  }

  // METODI
  public void play(){
    System.out.println("You're watching " + title);
  }

  @Override
  public String toString() {
    return "Content: title = " + title;
  }
}
