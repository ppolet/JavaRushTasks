package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));


            File file= new File(reader.rea
                    dLine());
            FileReader reader1= new FileReader(file);
            BufferedReader bf=new BufferedReader(reader1);


            ArrayList<Integer> arrayList= new ArrayList<>();

            while (bf.ready())
            {
                arrayList.add(Integer.valueOf(bf.readLine()));
            }

            ArrayList<Integer> arrayList2= new ArrayList<>();


            for (int a:arrayList)
            {
                if(a%2==0&&a!=0)
                    arrayList2.add(a);

            }

            System.out.println(arrayList2);

            for (int a:arrayList2)
            {
                System.out.println(a);

            }

            reader.close();
            reader1.close();
            bf.close();



    }
}
