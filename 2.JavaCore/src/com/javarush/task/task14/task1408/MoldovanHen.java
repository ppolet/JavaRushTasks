package com.javarush.task.task14.task1408;

/**
 * Created by Mike on 04.05.2017.
 */
public class MoldovanHen extends Hen {
    @Override
   public String getDescription() {
        return super.getDescription() + " Моя страна - "+ Country.MOLDOVA+ ". Я несу " + getCountOfEggsPerMonth() +" яиц в месяц.";
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return 20;

    }
}
