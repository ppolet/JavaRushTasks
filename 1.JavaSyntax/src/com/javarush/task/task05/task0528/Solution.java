package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        SimpleDateFormat format1 = new SimpleDateFormat("dd MM yyyy" );
        Date date= new Date();
        System.out.println(format1.format(date));
    }
}
