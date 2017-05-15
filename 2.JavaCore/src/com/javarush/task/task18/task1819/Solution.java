package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        File file1= new File(reader.readLine());
        File file2=new File(reader.readLine());
        FileInputStream fileInputStream1= new FileInputStream(file1);
        FileInputStream fileInputStream2 = new FileInputStream(file2);

        int sizeOfbuuf1=fileInputStream1.available();
        int sizeOfbuuf2=fileInputStream2.available();

        byte [] buff= new byte[fileInputStream1.available()];
        byte [] buff2= new byte[fileInputStream2.available()];

        fileInputStream1.read(buff);
        fileInputStream2.read(buff2);

        FileOutputStream fileOutputStream= new FileOutputStream(file1);
        fileOutputStream.write(buff2);
        fileOutputStream.write(buff);

        fileInputStream1.close();
        fileInputStream2.close();
        fileOutputStream.close();

    }
}
