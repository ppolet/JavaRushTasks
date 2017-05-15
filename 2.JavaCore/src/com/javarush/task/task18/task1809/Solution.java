package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
        String str1= bufferedReader.readLine();
        String str2= bufferedReader.readLine();

        InputStream inputStream = new FileInputStream(str1);
        OutputStream outputStream= new FileOutputStream(str2);

        byte [] buff= new byte[inputStream.available()];
        inputStream.read(buff);

        for(int i=buff.length-1;i>=0;i-- )
        {
            outputStream.write(buff[i]);

        }
        outputStream.close();
        inputStream.close();
    }
}
