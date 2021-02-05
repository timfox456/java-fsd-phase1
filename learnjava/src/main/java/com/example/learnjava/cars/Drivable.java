package com.example.learnjava.cars;

public interface Drivable {

    default void DriveTo(String destination)
    {
        System.out.println("Drivable DriveTo " + destination);
    }
}
