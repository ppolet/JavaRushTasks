package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String,Cat> hashMap= new HashMap<>();
        hashMap.put("cat1", new Cat("cat1"));
        hashMap.put("cat2", new Cat("cat2"));
        hashMap.put("cat3", new Cat("cat3"));
        hashMap.put("cat4", new Cat("cat4"));
        hashMap.put("cat5", new Cat("cat5"));
        hashMap.put("cat6", new Cat("cat6"));
        hashMap.put("cat7", new Cat("cat7"));
        hashMap.put("cat8", new Cat("cat8"));
        hashMap.put("cat9", new Cat("cat9"));
        hashMap.put("cat10", new Cat("cat10"));
        return hashMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код

        Set<Cat> cat= new HashSet<>();
        for (Map.Entry<String,Cat> val:map.entrySet())
        {

            cat.add(val.getValue());

        }

     return cat;


    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
