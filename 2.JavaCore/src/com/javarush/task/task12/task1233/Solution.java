package com.javarush.task.task12.task1233;

/* 
Изоморфы наступают
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("Minimum is " + result.x);
        System.out.println("Index of minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

        //напишите тут ваш код


        HashMap<Integer,Integer> arrayList= new HashMap();
        for (int i=0;i<array.length;i++)
            arrayList.put(i,array[i]);


        int min= array[0];
        for(int j=0;j<array.length;j++)
        if(min>array[j])
            min=array[j];

        int passition=0;

        for(Map.Entry<Integer,Integer> ss:arrayList.entrySet())
            if(ss.getValue()==min)
                passition=ss.getKey();





        return new Pair<Integer, Integer>(min, passition);
    }


    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
