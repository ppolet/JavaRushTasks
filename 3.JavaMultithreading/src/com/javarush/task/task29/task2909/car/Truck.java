package com.javarush.task.task29.task2909.car;

/**
 * Created by Mike on 04.06.2017.
 */
public class Truck extends Car {
    private final int MAX_TRUCK_SPEED = 80;


    public Truck(int numberOfPassengers) {
        super(Car.TRUCK, numberOfPassengers);
    }

    public  int getMaxSpeed() {
    return  MAX_TRUCK_SPEED;
    }
}
