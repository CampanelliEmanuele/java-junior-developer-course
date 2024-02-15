package org.generation.jaita99.oop.students;

import java.time.LocalDate;

/*
* ogni studente è caratterizzato da nome, cognome, email e data di nascita
* dello studente mostro il nome completo e l'età
* */
public class Student {
  // ATTRIBUTI
  private String firstName;
  private String lastName;
  private String email;
  private LocalDate dateOfBirth;

  private Address address;

  // COSTRUTTORI

  public Student(String firstName, String lastName, String email, LocalDate dateOfBirth) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.dateOfBirth = dateOfBirth;
  }

  // GETTER E SETTER

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getEmail() {
    return email;
  }

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  // METODI
  // metodo che restituisce il nome completo (firstName lastName)
  public String getFullName(){
    return firstName + " " + lastName;
  }

  // metodo che calcola l'età facendo la differenza tra l'anno corrente e l'anno di nascita
  public int getAge(int currentYear){
    return currentYear - dateOfBirth.getYear();
  }
}
