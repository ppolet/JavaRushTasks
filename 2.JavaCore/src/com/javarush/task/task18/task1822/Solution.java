package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {



        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        BufferedReader fileBufReader = new BufferedReader(fileReader);

        String res;
        if(args.length == 0){
            throw new IllegalArgumentException();
        }
        while((res = fileBufReader.readLine()) != null){
            if(res.startsWith(args[0] + " ")){
                System.out.println(res);
                break;
            }
        }

        reader.close();
        fileBufReader.close();
        fileBufReader.close();

    }
}