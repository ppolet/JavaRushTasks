package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {

        Thread specialThread1= new Thread(new SpecialThread());
        Thread specialThread2= new Thread(new SpecialThread());
        Thread specialThread3= new Thread(new SpecialThread());
        Thread specialThread4= new Thread(new SpecialThread());
        Thread specialThread5= new Thread(new SpecialThread());
        //Add your code here - добавьте свой код
        list.add(specialThread1);
        list.add(specialThread2);
        list.add(specialThread3);
        list.add(specialThread4);
        list.add(specialThread5);

    }

    public static class SpecialThread extends Thread  {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
