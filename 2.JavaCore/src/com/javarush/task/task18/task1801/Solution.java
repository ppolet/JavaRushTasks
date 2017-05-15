package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {


        String str;
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        str=reader.readLine();
        int max=0;
        int current;
        FileInputStream fileInputStream= new FileInputStream(str);
        while (fileInputStream.available()>0)
        {
            current=fileInputStream.read();
            if(max<current)
              max=current;
        }

        reader.close();
        fileInputStream.close();
        System.out.println(max);


    }
}
