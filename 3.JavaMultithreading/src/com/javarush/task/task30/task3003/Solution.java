package com.javarush.task.task30.task3003;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;

/* 
Экономим время
*/

public class Solution {
    /*
    1. Создайте класс Producer. Для этого на красном имени класса нажмите Alt+Enter -> Create Class ...
    2. Станьте на имени аргумента в конструкторе (queue) и нажмите Alt+Enter -> Create Field for Parameter 'queue' -> Enter -> Enter
    3. Станьте на подчеркнутой строке - описании класса. Далее Alt+Enter -> Implement Methods -> Enter
    4. Проделайте п.1-3 для класса Consumer
     */

    public static void main(String[] args) throws InterruptedException {
        TransferQueue<ShareItem> queue = new LinkedTransferQueue<>();

        Thread producer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new Consumer(queue));
        producer.start();
        consumer.start();

        Thread.sleep(1500);

        producer.interrupt();
        consumer.interrupt();
    }

}