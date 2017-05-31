package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;

/* 
Чтение файла
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String strFileName = bufferedReader.readLine();
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(strFileName);
            BufferedReader br = new BufferedReader(new InputStreamReader(fileInputStream));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (Exception e) {
            if (fileInputStream != null)
                fileInputStream.close();
        } finally {
            if (fileInputStream != null)
                fileInputStream.close();
        }
        bufferedReader.close();
    }

}