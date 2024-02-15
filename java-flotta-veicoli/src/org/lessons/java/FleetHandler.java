package org.lessons.java;

import javax.naming.directory.SearchResult;
import java.util.List;

public class FleetHandler {

    List<Vehicle> vehicleList;

    public FleetHandler(List<Vehicle> vehicleList) {
        setVehicleList(vehicleList);
    }

    /* EXERCISE FUNCTIONS */

    public boolean addVehicle(Vehicle vehicle) {
        for (Vehicle v : vehicleList)
            if (vehicle.getPlate().equals(v.getPlate()))
                throw new IllegalArgumentException("Error: the vehicle entered is already present in the list.");
        return vehicleList.add(vehicle);
    }

    public int countType(Vehicle searchedType) {
        int counter = 0;
        for (Vehicle v : vehicleList)
            if (searchedType.getClass().equals(v.getClass()))
                counter++;
        return counter;
    }

    public Vehicle getVehicle(String plate) {
        for (Vehicle v : vehicleList)
            if (plate.equals(v.getPlate()))
                return v;
        return null;
    }

    /* VALIDATORS */

    private void validateVehicleList(List<Vehicle> vehicleList) {
        if (vehicleList.isEmpty())
            throw new IllegalArgumentException("Error: vehicleList parameter cannot be null.");
    }

    /* GETTERS AND SETTERS */

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        validateVehicleList(vehicleList);
        this.vehicleList = vehicleList;
    }
}
