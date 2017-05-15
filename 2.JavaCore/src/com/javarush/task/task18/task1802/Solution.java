package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        String str;
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        str=reader.readLine();

        int current;
        FileInputStream fileInputStream= new FileInputStream(str);
        int min=fileInputStream.read();
        while (fileInputStream.available()>0)
        {
            current=fileInputStream.read();
            if(min>current)
                min=current;
        }

        reader.close();
        fileInputStream.close();
        System.out.println(min);



    }
}
