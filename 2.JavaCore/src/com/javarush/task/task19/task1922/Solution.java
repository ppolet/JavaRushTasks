package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        reader.close();

        BufferedReader in = new BufferedReader(new FileReader(file1));

        while(in.ready()){
            String readedString = in.readLine();
            String[] readedWords  = readedString.split(" ");
            int matcher = 0;
            for (int i = 0; i < readedWords.length; i++) {
                if(words.contains(readedWords[i]))
                    matcher++;
            }
            if(matcher == 2)
                System.out.println(readedString);
        }
        in.close();
    }

}
