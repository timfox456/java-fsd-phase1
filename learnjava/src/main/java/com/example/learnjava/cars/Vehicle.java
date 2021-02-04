package com.example.learnjava.cars;

public abstract class Vehicle {

    private String modelName;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    private float topSpeed;

    private String engine;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getSteeringMechanism() {
        return steeringMechanism;
    }

    public void setSteeringMechanism(String steeringMechanism) {
        this.steeringMechanism = steeringMechanism;
    }

    private String steeringMechanism;

    public float getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(float topSpeed) {
        this.topSpeed = topSpeed;
    }

    public Vehicle() {
        this.isParked = true;
    }

    public Vehicle(String modelName) {
        this.modelName = modelName;
        this.isParked = true;
    }

    boolean isParked;

    public void Park() {

        isParked = true;
    }

    String currentLocation;

    public void Move(String destination) {
        currentLocation = destination;
    }


}
