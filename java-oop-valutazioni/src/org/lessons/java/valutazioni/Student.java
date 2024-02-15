package org.lessons.java.valutazioni;

public class Student {
    private int id;
    private int absencesPercentage;
    private double gradeAverage;

    public Student(int id, int absencesPercentage, double gradeAverage) throws IllegalArgumentException {
        setId(id);
        setAbsencesPercentage(absencesPercentage);
        setGradeAverage(gradeAverage);
    }

    /* EXERCISE FUNCTIONS */

    public boolean isPassed() {
        if (absencesPercentage > 50)            /* 100 >= absencesPercentage > 50 */
            return false;
        else if (absencesPercentage >= 25)      /* 50 >= absencesPercentage >= 25 */
            return gradeAverage > 2;
        else                                    /* 25 > absencesPercentage >= 0 */
            return gradeAverage >= 2;
    }

    @Override
    public String toString() {
        return "Student\t\tid: " + id +
                "\tabsencesPercentage: " + absencesPercentage +
                "\tgradeAverage: " + gradeAverage;
    }

    /* VALIDATORS */

    private void validId(int id) throws IllegalArgumentException {
        if (id <= 0)
            throw new IllegalArgumentException("Error: student id cannot be a negative number or equal to 0.");
    }

    private void validAbsencesPercentage(int absencesPercentage) throws IllegalArgumentException {
        if (absencesPercentage < 0 || absencesPercentage > 100)
            throw new IllegalArgumentException("Error: student absences percentage must be between 0 and 100 (inclusive).");
    }

    private void validGradeAverage(double gradeAverage) throws IllegalArgumentException {
        if (gradeAverage < 0 || gradeAverage > 5)
            throw new IllegalArgumentException("Error: student grade average must be between 0 and 5 (inclusive).");
    }

    /* GETTERS AND SETTERS */

    public int getId() {
        return id;
    }

    public void setId(int id) throws IllegalArgumentException {
        validId(id);
        this.id = id;
    }

    public int getAbsencesPercentage() {
        return absencesPercentage;
    }

    public void setAbsencesPercentage(int absencesPercentage) throws IllegalArgumentException {
        validAbsencesPercentage(absencesPercentage);
        this.absencesPercentage = absencesPercentage;
    }

    public double getGradeAverage() {
        return gradeAverage;
    }

    public void setGradeAverage(double gradeAverage) throws IllegalArgumentException {
        validGradeAverage(gradeAverage);
        this.gradeAverage = gradeAverage;
    }
}
