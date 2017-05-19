package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        // напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fname = new FileInputStream(br.readLine());
        Scanner s = new Scanner(fname);
        int temp = 1;
        int x;
        ArrayList<Integer> list = new ArrayList<>();

        while (s.hasNextInt())
        {
            temp = s.nextInt();
            if (temp %2 == 0)
            {
                list.add(temp);
            }
        }

        for (int i = 0; i < list.size(); i++)
        {
            for (int j = i; j < list.size(); j++)
            {
                if (list.get(i) > list.get(j))
                {
                    x = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i, x);
                }
            }
        }

        fname.close();
        for (int h = 0; h <  list.size(); h++)
        {
            System.out.println(list.get(h));
        }
    }
}