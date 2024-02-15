package org.learning.randomdice.model;

public class Player {

  // ATTRIBUTI
  private String name;
  private long score;
  // COSTRUTTORI

  public Player(String name, long score) {
    this.name = name;
    this.score = score;
  }

  // METODI

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getScore() {
    return score;
  }

  public void setScore(long score) {
    this.score = score;
  }

  @Override
  public String toString() {
    return "Player{" +
        "name='" + name + '\'' +
        ", score=" + score +
        '}';
  }
}
