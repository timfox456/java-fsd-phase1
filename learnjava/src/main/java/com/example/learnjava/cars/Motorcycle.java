package com.example.learnjava.cars;

public class Motorcycle extends Vehicle implements Drivable, SecondDrivable {


    private boolean kickstand = false;
    public void Park() {
        kickstand = true;
        System.out.println("Parking the " + getModelName());
        super.Park();
    }

    public void DriveTo(String destination) {
        kickstand = false;
        super.DriveTo(destination);  //VEHICLE
        SecondDrivable.super.DriveTo(destination);  //SecondDrivable
        System.out.println("Motorcycle Driving " + destination);
        super.Move(destination);
    }

    public Motorcycle() {
        super();

    }
    public Motorcycle(String name) {
        super(name);
    }
}
