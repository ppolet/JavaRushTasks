package com.javarush.task.task33.task3310;

import java.math.BigInteger;
import java.security.SecureRandom;

/**
 * Created by Mike on 07.08.2017.
 */
public class Helper {

    static String generateRandomString() {
        SecureRandom random = new SecureRandom();
        return new BigInteger(130, random).toString(32);
    }

    static void printMessage(String message)
    {
        System.out.println(message);
    }
}


