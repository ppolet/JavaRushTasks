package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream= new FileInputStream(args[0]);
        int count=0;
        while (fileInputStream.available()>0)
        {
            if(isEnglishWord(fileInputStream.read()))
                count++;
        }
        System.out.println(count);
        fileInputStream.close();
    }


    public  static boolean isEnglishWord(int x) {

         if(x>=65&&x<=90||x>=97&&x<=122)
        return  true;
         else return false;
    }

}


