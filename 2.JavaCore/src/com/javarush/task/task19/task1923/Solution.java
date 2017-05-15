package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader fileIn = new BufferedReader(new FileReader(args[0]));
        FileWriter fileOut = new FileWriter(args[1]);

        String line;
        String[] words;
        while ((line = fileIn.readLine()) != null){
            words = line.split(" ");
            for (String word : words){
                if (word.matches(".+[0-9].+")){
                    fileOut.write(word + " ");
                }
            }
        }

        fileIn.close();
        fileOut.close();
    }
}