package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Cook;
import com.javarush.task.task27.task2712.kitchen.Waiter;

import java.io.IOException;
import java.util.Observer;

/**
 * Created by Mike on 02.07.2017.
 */
public class Restaurant {

    public static void main(String[] args) throws IOException {

        Tablet tablet = new Tablet(5);
        Cook firstCook = new Cook("Amigo");
        Observer firstWaitor = new Waiter();
        tablet.addObserver(firstCook);
        firstCook.addObserver(firstWaitor);
        tablet.createOrder();


    }
}
