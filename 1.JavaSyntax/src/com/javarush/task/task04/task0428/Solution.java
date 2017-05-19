package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader av=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(av.readLine());
        int b=Integer.parseInt(av.readLine());
        int c=Integer.parseInt(av.readLine());
        ArrayList<Integer> arrayList= new ArrayList<>();
        arrayList.add(a);
        arrayList.add(b);
        arrayList.add(c);

        int count=0;
        for(int i:arrayList)
        {
            if(i>0)
                count++;

        }
        System.out.println(count);

    }
}
