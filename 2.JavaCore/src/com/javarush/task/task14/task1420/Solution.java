package com.javarush.task.task14.task1420;

/* 
НОД
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

        try {

            int a = Integer.parseInt(reader.readLine());

            int b = Integer.parseInt(reader.readLine());
            if(a<=0||b<=0)
                throw  new NumberFormatException();
            nod(a, b);

        }

        catch (IOException e)
        {
            System.out.println(e);
        }



    }
    public static void nod(int a, int b)
    {
        if (a > b) a = a - b; else b = b - a;
        if (b == 0)
        {
            System.out.println(a);
            return;
        }
        nod(a, b); //рИкурсивно вызываю функцию с Валерой и его Машей, где она весит 160кг, а он трогает её матку.
    }
}