package com.javarush.task.task26.task2613;



import com.javarush.task.task26.task2613.exception.InterruptOperationException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ResourceBundle;

public class ConsoleHelper {

    private static BufferedReader bis;
    private static ResourceBundle res = ResourceBundle.getBundle(CashMachine.class.getPackage().getName() + ".resources.common_en");

    public static void writeMessage(String message) {
        System.out.println(message);

    }

    public static void printExitMessage()
    {
        ConsoleHelper.writeMessage(res.getString("the.end"));
    }

    //Чтобы считать номинал и количество банкнот
    public static String[] getValidTwoDigits(String currencyCode) throws InterruptOperationException {
        bis = new BufferedReader(new InputStreamReader(System.in));
        String[] masStr = null;

        while (true) {
            writeMessage(res.getString("choose.denomination.and.count.format"));
            String enter = "";
            while (true) {
                enter = readString();
                if (enter.matches("\\d+ \\d+")) break;
                writeMessage(res.getString("invalid.data"));
            }
            return enter.split(" ");
        }

    }


    public static Operation askOperation() throws InterruptOperationException {

        //writeMessage("Введите номер операции 1 - INFO, 2 - DEPOSIT, 3 - WITHDRAW, 4 - EXIT");
       writeMessage(String.format("Enter number of operation 1 - %s, 2 - %s, 3 - %s, 4 - %s",res.getString("operation.INFO"),res.getString("operation.DEPOSIT"),res.getString("operation.WITHDRAW"),res.getString("operation.EXIT")));


        String str= null;
        while (true) {
            str = readString();

            if (Integer.parseInt(str) > 0 && Integer.parseInt(str) < 5)
                break;
            else writeMessage(res.getString("invalid.data"));
        }

     return Operation.getAllowableOperationByOrdinal(Integer.parseInt(str));


    }


    //Чтобы считать код валюты
    public static String askCurrencyCode() throws InterruptOperationException {


        String str = null;

        System.out.println(res.getString("choose.currency.code"));
        try {
            str = readString();

            while (true) {
                if (str.length() == 3)
                    break;
                else {
                    writeMessage(res.getString("invalid.data"));
                    str = bis.readLine();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return str.toUpperCase();
    }

    public static String readString() throws InterruptOperationException {
        bis = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        try {
            str = bis.readLine();
            if (str.toLowerCase().equals("exit"))
            {

                throw new InterruptOperationException();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return str;
    }
}