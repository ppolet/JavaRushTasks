package com.javarush.task.task17.task1721;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileOne = reader.readLine();
        String fileTwo = reader.readLine();

        writeInList(fileOne,allLines);
        writeInList(fileTwo, forRemoveLines);
    }



    public void joinData () throws CorruptedDataException {

        if (allLines.containsAll(forRemoveLines) ) {
            allLines.removeAll(forRemoveLines)  ;
            return;
        }

        for (String s : forRemoveLines) {
            if (!allLines.contains(s)){
                allLines.clear();
                throw  new CorruptedDataException();
            }

        }
    }

    public static void writeInList(String file, List<String> list) throws FileNotFoundException
    {
        BufferedReader in = new BufferedReader(new FileReader(file));
        try{
            String s;
            while((s = in.readLine()) != null){
                String[] strings = s.split(" ");

                for (String x : strings){
                    list.add(x);

                }
            }
        }catch (Exception e){

        }


    }
}