package com.javarush.task.task32.task3210;

import java.io.IOException;
import java.io.RandomAccessFile;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) throws IOException {
        RandomAccessFile file=new RandomAccessFile(args[0],"rw");
        int n=Integer.parseInt(args[1]);
        file.seek(n);
        String text=args[2];
        byte[] fileText=new byte[(int)file.length()];
        file.read(fileText,0,text.length());
        file.seek(file.length());
        String shoudBeWritten="";
        if(convertByteToString(fileText).equals(text))shoudBeWritten="true";
        else if(!convertByteToString(fileText).equals(text))shoudBeWritten="false";
        file.writeChars(shoudBeWritten);
        file.close();
    }
    private static String convertByteToString(byte readBytes[]){
        return String.valueOf(readBytes);
    }

}
