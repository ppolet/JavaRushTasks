package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        //add your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream in = new FileInputStream(br.readLine());

        while (in.available()>0) {
            System.out.print((char)in.read());
        }

        in.close();
        br.close();
    }


    }
