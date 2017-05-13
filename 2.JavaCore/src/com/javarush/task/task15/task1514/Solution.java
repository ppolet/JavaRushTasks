package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики 1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(555.43d,"dsd");
        labels.put(555.44d,"dsd2");
        labels.put(556.44d,"dsd5");
        labels.put(559.42d,"dsd55");
        labels.put(54359.42d,"ds12d55");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
