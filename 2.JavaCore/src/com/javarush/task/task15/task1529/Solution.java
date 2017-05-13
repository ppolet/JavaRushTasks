package com.javarush.task.task15.task1529;



/* 
Осваивание статического блока
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        //add your code here - добавьте код тут


        reset();

    }

    public static Flyable result;

    public static void reset() {
        //add your code here - добавьте код тут

        BufferedReader reader= new BufferedReader(new InputStreamReader( System.in));
        String str= null;
        try {
            str= reader.readLine();

            if(str.equals("helicopter"))
                result= new Helicopter();

            else
                if(str.equals("plane"))
                {
                    str=reader.readLine();
                    result=new Plane(Integer.parseInt(str));
                }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
