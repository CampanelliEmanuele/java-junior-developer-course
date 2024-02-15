package org.lessons.java;

import java.time.LocalDate;

public abstract class Vehicle {
    public String plate;
    public int registrationYear;

    public Vehicle(String plate, int registrationYear) throws IllegalArgumentException {
        setPlate(plate);
        setRegistrationYear(registrationYear);
    }

    /* EXERCISE FUNCTIONS */

    @Override
    public String toString() {
        return "Vehicle{" +
                "plate='" + plate + '\'' +
                ", registrationYear=" + registrationYear +
                '}';
    }

    /* VALIDATORS */

    private void validatePlate(String plate) throws IllegalArgumentException {
        if (plate == null || plate.isEmpty())
            throw new IllegalArgumentException("Error: Illegal plate cannot be nighter null nor empty.");
    }

    private void validateRegistrationYear(int registrationYear) throws IllegalArgumentException {
        LocalDate regYear = LocalDate.of(registrationYear, 1, 1);
        if (regYear.isAfter(LocalDate.now()))
            throw new IllegalArgumentException("Error: registration year must have passed.");
    }

    /* GETTERS AND SETTERS */

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        validatePlate(plate);
        this.plate = plate;
    }

    public int getRegistrationYear() {
        return registrationYear;
    }

    public void setRegistrationYear(int registrationYear) {
        validateRegistrationYear(registrationYear);
        this.registrationYear = registrationYear;
    }
}
