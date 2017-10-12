package com.javarush.task.task33.task3310;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Mike on 06.08.2017.
 */
public class Solution {

    public static void main(String[] args) {

    }


    static Set<Long> getIds(Shortener shortener, Set<String> strings)
    {

        Set<Long> idSet= new HashSet<>();
        for (String s :strings)
        {
            idSet.add(shortener.getId(s));
        }
        return idSet;
    }

    static Set<String> getStrings(Shortener shortener, Set<Long> keys)
    {
        Set<String> setOfStrings = new HashSet<>();

        for (Long value:keys)
        {
            setOfStrings.add(shortener.getString(value));

        }
        return  setOfStrings;

    }



}

