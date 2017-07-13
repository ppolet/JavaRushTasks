package com.javarush.task.task37.task3702.female;

import com.javarush.task.task37.task3702.AbstractFactory;
import com.javarush.task.task37.task3702.Human;

/**
 * Created by Mike on 12.07.2017.
 */
public class FemaleFactory implements AbstractFactory {

    public Human getPerson(int age) {
        if (age <= KidGirl.MAX_AGE) {
            return new KidGirl();
        } else if (age <= TeenGirl.MAX_AGE && age > KidGirl.MAX_AGE) {
            return new TeenGirl();
        } else {
            return new Woman();
        }
    }

}
