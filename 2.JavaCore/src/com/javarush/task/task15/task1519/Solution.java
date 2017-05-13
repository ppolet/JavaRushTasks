package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();
        while (!str.toString().equals("exit")) {

            try {

                Double d= Double.valueOf(str);
                if (str.contains("."))
                    print(34.4d);

                Short sh = Short.valueOf(str);
                if (sh > 0 && sh < 128)
                    print(sh);
                 else {
                    Integer integer = Integer.valueOf(str);
                    print(integer);
                }
            }
            catch (NumberFormatException e)
            {
                print(str);
            }

            str = reader.readLine();
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
