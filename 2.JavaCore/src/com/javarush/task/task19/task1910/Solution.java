package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileReader inFile = new FileReader(reader.readLine());
        FileWriter outFile = new FileWriter(reader.readLine());

        String fileContains = "";

        while (inFile.ready()){
            fileContains += (char) inFile.read();
        }

        fileContains = fileContains.replaceAll("\\p{Punct}", "").replaceAll("\n", "");
        //System.out.println(fileContains);

        outFile.write(fileContains);

        reader.close();
        inFile.close();
        outFile.close();
    }
}