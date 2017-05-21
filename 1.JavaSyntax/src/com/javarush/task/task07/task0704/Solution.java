package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        int[] array1 = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<array1.length;i++){
            array1[i]=Integer.parseInt(reader.readLine());
        }
        for (int i=array1.length-1;i>=0;i--){
            System.out.println(array1[i]);
        }

    }
}

