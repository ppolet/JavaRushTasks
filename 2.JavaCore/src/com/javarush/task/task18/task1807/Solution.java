package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        File file = new File(url);

        FileInputStream fileReader = new FileInputStream(file);

        int count = 0;
        while (fileReader.available() > 0) {
            int a = fileReader.read();
            if (a == 44) {
                count++;
            }
        }
        System.out.println(count);
        reader.close();
        fileReader.close();

    }
}
