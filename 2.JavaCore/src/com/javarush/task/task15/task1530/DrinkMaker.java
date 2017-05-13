package com.javarush.task.task15.task1530;

/**
 * Created by Mike on 14.04.2017.
 */
public abstract   class DrinkMaker {
    abstract  void getRightCup();
    abstract  void putIngredient();
    abstract  void pour();

    public void makeDrink()
    {

        getRightCup();
        putIngredient();
        pour();

    }
}
