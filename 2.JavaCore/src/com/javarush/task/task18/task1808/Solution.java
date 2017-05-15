package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string1= reader.readLine();
        String string2= reader.readLine();
        String string3= reader.readLine();

        FileInputStream file1 = new FileInputStream(string1);
        FileOutputStream file2 = new FileOutputStream(string2);
        FileOutputStream file3 = new FileOutputStream(string3);

        int startCount = file1.available();

        int a = startCount / 2 + startCount % 2;
        int b = startCount - a;

        byte[] buffer = new byte[a+b];


        file1.read(buffer);


        file2.write(buffer, 0, a);
        file3.write(buffer, a, b);

        reader.close();
        file1.close();
        file2.close();
        file3.close();



    }
}
