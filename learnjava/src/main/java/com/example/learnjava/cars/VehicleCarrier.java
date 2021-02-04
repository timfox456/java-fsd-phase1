package com.example.learnjava.cars;

import java.util.ArrayList;

public class VehicleCarrier extends Vehicle {
    ArrayList<Vehicle> vehiclesCarried = new ArrayList<>();

    public ArrayList<Vehicle> getVehiclesCarried() {
        return vehiclesCarried;
    }

    public void setVehiclesCarried(ArrayList<Vehicle> vehiclesCarried) {
        this.vehiclesCarried = vehiclesCarried;
    }

    public void CarryVehicle(Vehicle vehicleToCarry){
        vehiclesCarried.add(vehicleToCarry);
    }
    public void ParkAll() {
        for (Vehicle v : vehiclesCarried) {
            v.Park();  // Polymorphism
        }
    }
}
