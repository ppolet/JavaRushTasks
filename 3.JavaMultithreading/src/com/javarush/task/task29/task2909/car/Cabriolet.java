package com.javarush.task.task29.task2909.car;

/**
 * Created by Mike on 04.06.2017.
 */
public class Cabriolet extends Car {

    private final int MAX_CABRIOLET_SPEED = 90;


    public Cabriolet(int numberOfPassengers) {
        super(Car.CABRIOLET, numberOfPassengers);
    }

    public int getMaxSpeed()
    {

        return MAX_CABRIOLET_SPEED;
    }
}
