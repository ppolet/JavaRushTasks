package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        //add your code here - добавьте код тут

        t1.printResult();
        t2.printResult();
    }


    public static class Read3Strings extends Thread {
        StringBuilder stringBuilder= new StringBuilder();
        @Override
        public synchronized void run() {

            try {
                int count=0;


                while (count<3)
                {
                    String str= reader.readLine();
                    stringBuilder.append(str);
                    stringBuilder.append(" ");
                    count++;

                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void printResult() {
            System.out.println(stringBuilder);
        }
    }
}
