package com.example.learnjava.cars;

public class VehicleExample {

    VehicleCarrier vehicleCarrier = new VehicleCarrier();
    public void GetVehicles() {
        vehicleCarrier.CarryVehicle(new Motorcycle("Harley"));
        vehicleCarrier.CarryVehicle(new Car("Tesla"));
        vehicleCarrier.CarryVehicle(new Car("Sedan"));
        vehicleCarrier.CarryVehicle(new Motorcycle("Ducati"));
        vehicleCarrier.ParkAll();

        for (Vehicle v : vehicleCarrier.getVehiclesCarried()) {
            System.out.println(v.getModelName());
        }


    }

}
