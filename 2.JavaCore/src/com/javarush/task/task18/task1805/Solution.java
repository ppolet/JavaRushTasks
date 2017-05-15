package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        String str;
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        str=reader.readLine();


        FileInputStream fileInputStream= new FileInputStream(str);
        ArrayList<Integer> arrayList= new ArrayList<>();

        int min=fileInputStream.read();
        while (fileInputStream.available()>0)
        {
           arrayList.add(fileInputStream.read());
        }


        TreeSet set = new TreeSet();
        set.addAll(arrayList);

       for (Object a:set)
       {
           System.out.print(a+" ");
       }

        reader.close();
        fileInputStream.close();



    }
}
