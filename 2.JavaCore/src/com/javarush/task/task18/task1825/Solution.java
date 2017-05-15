package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        String fileName;

        while(!(fileName = bufferedReader.readLine()).equals("end"))
            list.add(fileName);

        bufferedReader.close();
        Collections.sort(list);

        String[] stringArray = list.get(0).split(".part");
        String summaryFileName = stringArray[0];

        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream = new FileOutputStream(summaryFileName, true);
        byte[] buffer;

        for (String aList : list)
        {
            fileInputStream = new FileInputStream(aList);
            buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer);
            fileInputStream.close();
            fileOutputStream.write(buffer);
        }

        fileOutputStream.close();
    }
}