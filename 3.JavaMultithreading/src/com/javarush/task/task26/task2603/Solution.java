package com.javarush.task.task26.task2603;

/* 
Убежденному убеждать других не трудно
*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Solution {
    public static class CustomizedComparator<T> implements Comparator<T> {

        private Comparator<T>[] comparators;
        public CustomizedComparator(Comparator<T> ...comparators) {
            this.comparators=comparators;
        }

        @Override
        public int compare(T o1, T o2)
        {
            int result=0;
            for (Comparator c: comparators) {
                result = c.compare(o1,o2);
                if (result!=0) {return result;}
            }
            return result;
        }

    }
}