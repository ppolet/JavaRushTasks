package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution
{


    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String String = reader.readLine();
        int n = Integer.parseInt(String);


        if (n%2 == 0 && String.length() == 1 && n > 0) {
            System.out.println("четное однозначное число");
        }
        if (n%2 !=0 && String.length() == 1  && n > 0) {
            System.out.println("нечетное однозначное число");
        }
        if (n%2 == 0 && String.length() == 2  && n > 0){
            System.out.println("четное двузначное число");
        }
        if (n%2 != 0 && String.length() == 2  && n > 0) {
            System.out.println("нечетное двузначное число");
        }
        if (n%2 == 0 && String.length() == 3  && n > 0) {
            System.out.println("четное трехзначное число");
        }
        if (n%2 != 0 && String.length() == 3  && n > 0) {
            System.out.println("нечетное трехзначное число");
        }


        //напишите тут ваш код

    }
}
