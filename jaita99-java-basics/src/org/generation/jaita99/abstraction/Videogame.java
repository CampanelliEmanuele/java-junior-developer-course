package org.generation.jaita99.abstraction;

public class Videogame {
  private Flyers[] flyingObjects;
  private Animal[] animals;
  private Swimmers[] swimmingObjects;

  public Videogame(Flyers[] flyingObjects, Animal[] animals, Swimmers[] swimmingObjects) {
    this.flyingObjects = flyingObjects;
    this.animals = animals;
    this.swimmingObjects = swimmingObjects;
  }

  public void makeFly(){
    for (int i = 0; i < flyingObjects.length; i++) {
      flyingObjects[i].fly(i);
    }
  }

  public void makeSwim(){
    for (int i = 0; i < swimmingObjects.length; i++) {
      swimmingObjects[i].swim();
    }
  }

  public void makeNoises(){
    for (int i = 0; i < animals.length; i++) {
      animals[i].makeNoise();
    }
  }
}
