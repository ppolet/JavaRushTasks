package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] srt = new String[10];
        int[] val = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < srt.length; i++) {
            String s = reader.readLine();
            srt[i] = s;
        }

        for (int i = 0; i < val.length; i++) {
            val[i] = srt[i].length();
        }

        for (int i = 0; i < val.length; i++) {
            System.out.println(val[i]);
        }

    }
}