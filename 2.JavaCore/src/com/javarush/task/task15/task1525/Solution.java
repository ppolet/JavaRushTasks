package com.javarush.task.task15.task1525;

import com.sun.corba.se.impl.orbutil.closure.Constant;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {



    public static List<String> lines = new ArrayList<String>();

    static{

        try {
            BufferedReader reader = new BufferedReader(new FileReader(Statics.FILE_NAME));
            String str =reader.readLine();
           while (str!=null) {
               lines.add(str);
               str=reader.readLine();
           }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
