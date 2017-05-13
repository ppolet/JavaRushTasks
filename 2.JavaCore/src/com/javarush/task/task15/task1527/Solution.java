package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));

        String url= null;
        try {
            url = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }


        String substring = url.substring(url.indexOf('?') + 1);


        String[] str = splitString(substring);

        splitString2(str);


        if (substring.contains("obj")) {

            try {
                double d = Double.valueOf(getValue(substring));
                showString(str);
                alert(d);
            } catch (NumberFormatException e) {
                showString(str);
                alert(getValue(substring));
            }
        } else
            showString(str);


        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void showString(String[] str) {
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }

        System.out.println();
    }

    public static String getValue(String url) {
        String str;
        str = url.substring(url.indexOf("obj") + 4, url.indexOf('&'));


        return str;
    }

    public static void splitString2(String[] str) {

        for (int i = 0; i < str.length; i++) {
            if (str[i].contains("=")) {
                str[i] = str[i].substring(0, str[i].indexOf('='));

            }
        }
    }


    public static String[] splitString(String substring) {
        String[] str3 = substring.split("&");
        return str3;
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
