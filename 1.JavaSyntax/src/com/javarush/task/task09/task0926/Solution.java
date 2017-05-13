package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код

        ArrayList<int[]> arrayList= new ArrayList<>();
        int a1[]={3,4,573,4,6};
        int a2[]={5,54};
        int a3[]={};
        int a4[]={3,4,573,4,6,6,8};
        int a5[]={5,6,8,9};

        arrayList.add(a1);
        arrayList.add(a2);
        arrayList.add(a5);
        arrayList.add(a4);
        arrayList.add(a3);

        return arrayList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
