package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());

        byte[] buff = new byte[fileInputStream.available()];
        fileInputStream.read(buff);

        HashMap<Byte, Integer> hashMap = new HashMap<>();

        int count = 0;
        for (int i = 0; i < buff.length; i++) {
            for (int j = 0; j < buff.length; j++)
                if (buff[i] == buff[j]) {
                    count++;
                }
            hashMap.put(buff[i], count);
            count = 0;
        }

        maxIndex(hashMap);
        fileInputStream.close();

    }

    public static void maxIndex(Map<Byte, Integer> hashMap) {

        ArrayList<Byte> maxIndex = new ArrayList<>();

        int max = 266;
        for (Map.Entry<Byte, Integer> aa : hashMap.entrySet()) {
            if (max > aa.getValue())
                max = aa.getValue();
        }


        for (Map.Entry<Byte, Integer> aa : hashMap.entrySet()) {
            if (max == aa.getValue())
                maxIndex.add(aa.getKey());
        }

        for (Byte b : maxIndex) {
            System.out.print(b+" ");
        }

    }



}

