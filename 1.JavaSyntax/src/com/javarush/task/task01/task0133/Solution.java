package com.javarush.task.task01.task0133;

/* 
Не думать о секундах…
Не думать о секундах…
Реализуй метод getCountSecondsPassedInCurrentHour(int seconds). Метод на вход принимает целое число секунд, которые прошли с начала текущих суток. Нужно найти количество секунд, прошедших с начала последнего часа, и вернуть это число.

Пример:
Метод getCountSecondsPassedInCurrentHour вызывается с параметром 12345.

Пример вывода:
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getCountSecondsPassedInCurrentHour(12345));
    }

    public static int getCountSecondsPassedInCurrentHour(int seconds) {
        //напишите тут ваш код
        while (true) {
            if (seconds < 3600)
                break;

            seconds -= 3600;
        }

        return seconds;
    }
}