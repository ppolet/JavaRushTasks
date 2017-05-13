package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) {
        try {
            divisionByZero();
        }
        catch (ArithmeticException ex)
        {

            ex.printStackTrace();
        }
    }

    public static void divisionByZero() throws ArithmeticException
    {
        int a=5;
        System.out.println(5/0);
    }

}
