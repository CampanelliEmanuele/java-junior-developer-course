package org.generation.jaita99.oop.pets;

public class Cat {
  // ATTRIBUTI
  String breed; // non deve essere nulla o vuota
  int age; // non deve essere < 0
  String gender; // deve essere o male o female
  String name; // non deve essere nullo o vuoto

  // COSTRUTTORI
 Cat(String breed, int age, String gender, String name) throws IllegalArgumentException{
   if(breed == null || breed.isEmpty()){
     // se il valore di breed non è valido sollevo una eccezione
     throw new IllegalArgumentException("breed must not be empty");
   }
   if(age < 0){
     throw new IllegalArgumentException("age must be >= 0");
   }
   if(gender == null || (!gender.equalsIgnoreCase("male") && !gender.equalsIgnoreCase("female"))){
     throw new IllegalArgumentException("Gender must be male or female");
   }
   if(name == null || name.isEmpty()){
     throw new IllegalArgumentException("Name must not be empty");
   }
    this.breed = breed;
    this.age = age;
    this.gender = gender;
    this.name = name;
  }

  // METODI
  // metodo che incrementa l'età dell'oggetto
  void grow(){
   age++;
  }


  // metodo che rappresenta come stringa i dati dell'oggetto
  @Override
  public String toString() {
    return "Cat{" +
        "breed='" + breed + '\'' +
        ", age=" + age +
        ", gender='" + gender + '\'' +
        ", name='" + name + '\'' +
        '}';
  }
}
