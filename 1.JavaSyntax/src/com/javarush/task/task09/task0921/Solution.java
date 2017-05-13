package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution
{
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        try{
            while( true ){
                int nextNumber = Integer.parseInt(reader.readLine());
                numberList.add(nextNumber);
            }
        }
        catch (Exception e){
            for(int i = 0; i < numberList.size(); i++){
                System.out.println(numberList.get(i));
            }
        }
    }
}