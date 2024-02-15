package org.generation.jaita99.abstraction;

public class Main {

  public static void main(String[] args) {
    /*Animal animal = new Animal("pieroangela");
    animal.sleep();*/




    Cow cow = new Cow("Lola");

    cow.makeNoise();
    cow.sleep();

    Cat thor = new Cat("Thor", new String[]{"ball", "mouse", "couch"});
    thor.makeNoise();
    thor.sleep();
    thor.play();


    Animal[] animals = new Animal[3];
    animals[0] = cow;
    animals[1] = thor;
    animals[2] = new Cat("Emmenthal", new String[]{"ball", "doll"});

    for (Animal animal : animals){
      System.out.println(animal.getName());
      animal.sleep();
      animal.makeNoise();
      if(animal instanceof Cat){
        Cat cat = (Cat)animal;
        cat.play();
      }
    }

  }
}
