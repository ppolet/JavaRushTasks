package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(Integer.parseInt(reader.readLine()));
        }
        Collections.sort(arrayList);

        for (int a : arrayList) {
            System.out.println(a);
        }

        //напишите тут ваш код
    }
}
