package com.example.learnjava.cars;

public class Motorcycle extends Vehicle{


    private boolean kickstand = false;
    public void Park() {
x
        kickstand = true;
        System.out.println("Parking the " + getModelName());
        super.Park();
    }

    public void DriveTo(String destination) {
        kickstand = false;
        super.Move(destination);
    }

    public Motorcycle() {
        super();

    }
    public Motorcycle(String name) {
        super(name);
    }
}
