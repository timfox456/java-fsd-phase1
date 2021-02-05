package com.example.learnjava.cars;

public interface SecondDrivable {
    default void DriveTo(String destination)
    {
        System.out.println("Second Drivable DriveTo " + destination);
    }
}
