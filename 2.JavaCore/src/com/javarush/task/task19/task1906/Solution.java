package com.javarush.task.task19.task1906;

/* 
Четные байты
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));

        FileReader reader= new FileReader(bufferedReader.readLine());
        FileWriter writer= new FileWriter(bufferedReader.readLine());

        int count=0;
        int a;
        while (reader.ready())
        {
            count++;
            a= reader.read();
            if(count%2==0)
            writer.write(a);
        }

        reader.close();
        writer.close();
        bufferedReader.close();
    }
}
