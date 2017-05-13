package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1=reader.readLine();
        int a=Integer.parseInt(a1);
        String b1=reader.readLine();
        int b=Integer.parseInt(b1);

        if (a > 0 && b > 0) System.out.println("1");
        else if (a < 0 && b > 0) System.out.println("2");
        else if (a < 0 && b < 0) System.out.println("3");
        else if (a > 0 && b < 0) System.out.println("4");

    }
}