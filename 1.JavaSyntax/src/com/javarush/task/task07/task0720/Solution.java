package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.valueOf(reader.readLine());
        int M= Integer.valueOf(reader.readLine());
        ArrayList<String> arrayList= new ArrayList<>();

        for (int i=0;i<N;i++)
        {
            arrayList.add(reader.readLine());
        }

        ArrayList<String> newArrayLinst=new ArrayList<>();


        for (int i=0;i<M;i++)
        {
            newArrayLinst.add(arrayList.get(i));
        }
        for (int i=0;i<M;i++)
        arrayList.remove(i);

        int lengs=arrayList.size();
        for (int i=0;i<M;i++)
        {
            arrayList.add(lengs+i,newArrayLinst.get(i));
        }

        for (String s:arrayList)
        {

            System.out.println(s);
        }



        //напишите тут ваш код
    }
}
