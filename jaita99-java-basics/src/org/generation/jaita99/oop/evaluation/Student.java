package org.generation.jaita99.oop.evaluation;

public class Student {
  // ATTRIBUTI
  private int id;
  private int absences; // 0-100
  private double averageGrades; // 0.0-5.0

  // costruttore


  public Student(int id, int absences, double averageGrades) throws InvalidPercentageException{
    validateAbsences(absences);
    validateAverageGrades(averageGrades);
    this.id = id;
    this.absences = absences;
    this.averageGrades = averageGrades;
  }

  public int getId() {
    return id;
  }

  public int getAbsences() {
    return absences;
  }

  public double getAverageGrades() {
    return averageGrades;
  }

  public void setAbsences(int absences) {
    this.absences = absences;
  }

  public void setAverageGrades(double averageGrades) {
    this.averageGrades = averageGrades;
  }

  public boolean getPassed(){
    if(absences > 50){ // assenze superiori al 50%
      return false;
    } else if(absences > 25){ // assenze tra il 25 e il 50
      return averageGrades > 2.0;
    } else { // meno o uguale al 25
     return averageGrades >= 2.0;
    }
  }

  private void validateAbsences(int absences) throws InvalidPercentageException{
    if(absences < 0 || absences > 100){
      // numero non valido
      throw new InvalidPercentageException("absences must be 0-100");
    }
  }

  private void validateAverageGrades(double averageGrades) throws InvalidAverageGradesException{
    if(averageGrades < 0.0 || averageGrades > 5.0){
      throw new InvalidAverageGradesException("average grades must be 0.0-5.0");
    }
  }

  @Override
  public String toString() {
    return "Student (id:" + id + ", absences: " + absences + "%, average grades: " + averageGrades + ")";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Student student = (Student) o;

    return getId() == student.getId();
  }

  @Override
  public int hashCode() {
    return getId();
  }
}
