package com.javarush.task.task15.task1530;

/**
 * Created by Mike on 14.04.2017.
 */
public class LatteMaker extends DrinkMaker {
    @Override
    void getRightCup() {
        System.out.println("Берем чашку для латте");
    }

    @Override
    void putIngredient() {
        System.out.println("Делаем кофе");


    }

    @Override
    void pour() {

        System.out.println("Заливаем молоком с пенкой");
    }
}
