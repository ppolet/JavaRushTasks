package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man= new Man("Витя",34,"Boston");
        Man man2= new Man("Витя2",34,"Boston");
        Woman woman1= new Woman("Оля1",34,"Boston");
        Woman woman2= new Woman("Оля2",34,"Boston");

        System.out.println(man);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);
    }


    public static class  Man
    {
        String name;
        int age;
        String  address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Man(String name, int age) {

            this.name = name;
            this.age = age;
        }

        public Man(String name) {

            this.name = name;
        }


        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }
    }



    public static class  Woman
    {

        String name;
        int age;
        String  address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Woman(String name, int age) {

            this.name = name;
            this.age = age;
        }


        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }

        public Woman(String name) {

            this.name = name;
        }



    }

    //напишите тут ваш код
}

