package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

/* 
Разные методы для разных типов
*/


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String input;
        while(true){
            input = reader.readLine();
            if(input.equals("exit")){
                break;
            }

            list.add(input);
        }


        for(String val : list){
            if(val.contains(".")){
                print(Double.valueOf(val));
            } else {
                try{
                    Integer in = Integer.valueOf(val);
                    if(in > 0 && in < 128){
                        print(Short.valueOf(val));
                    } else if(in >= 128){
                        print(in);
                    } else {
                        print(val);
                    }
                } catch (NumberFormatException e){
                    print(val);
                }
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}