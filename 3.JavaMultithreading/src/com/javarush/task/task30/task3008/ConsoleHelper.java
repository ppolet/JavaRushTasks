package com.javarush.task.task30.task3008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Mike on 07.06.2017.
 */
public class ConsoleHelper {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    static void writeMessage(String message) {
        System.out.println(message);
    }

    public static   String readString() {
        String string;

        while (true) {
            try {
                string = reader.readLine();
                break;
            } catch (IOException e) {
                System.out.println("Произошла ошибка при попытке ввода текста. Попробуйте еще раз.");
            }
        }
        return string;

    }

    public static int readInt() {

        int i;

        while (true) {

            try {
                i = Integer.parseInt(readString());
                break;

            } catch (NumberFormatException e) {
                System.out.println("Произошла ошибка при попытке ввода текста. Попробуйте еще раз.");
            }
        }
        return i;
    }
}




