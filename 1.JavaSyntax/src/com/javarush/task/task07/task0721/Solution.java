package com.javarush.task.task07.task0721;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] a= new int[20];

        for (int i=0;i<a.length;i++)
        {
            a[i]=Integer.parseInt(reader.readLine());
        }

        LinkedList<Integer> linkdList= new LinkedList<>();
        for (int i=0;i<a.length;i++)
        {

            linkdList.add(a[i]);
        }

        Collections.sort(linkdList);


        int maximum=linkdList.getLast();
        int minimum=linkdList.getFirst();




        //напишите тут ваш код

        System.out.println(maximum);
        System.out.println(minimum);
    }
}
