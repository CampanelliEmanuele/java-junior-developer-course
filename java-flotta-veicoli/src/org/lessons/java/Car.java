package org.lessons.java;

public class Car extends Vehicle {
    private int doors;

    public Car(String plate, int registrationYear, int doors) throws IllegalArgumentException {
        super(plate, registrationYear);
        setDoors(doors);
    }

    /* EXERCISE FUNCTIONS */

    @Override
    public String toString() {
        return "Car{" +
                "doors=" + doors +
                "} " + super.toString();
    }

    /* VALIDATORS */

    private void validateDoors(int doors) throws IllegalArgumentException {
        if (doors > 4 || doors < 2)
            throw new IllegalArgumentException("Error: doors parameter must be between 2 and 4");
    }

    /* GETTERS AND SETTERS */

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) throws IllegalArgumentException {
        validateDoors(doors);
        this.doors = doors;
    }
}
