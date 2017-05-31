package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/


    //напишите тут ваш код
    public class Cat
    {
        public String name = null;
        public int weight = 5;
        public int age = 5;
        public String color = "Unknown";
        public String address = null;

        public void initialize(String name)
        {
            this.name = name;
        }
        public void initialize (String name, int weight, int age)
        {
            this.name = name;
            this.weight = weight;
            this.age = age;
        }
        public void initialize(String name, int age)
        {
            this.name = name;
            this.age = age;
        }
        public void initialize(int weight, String color)
        {
            this.weight = weight;
            this.color = color;
        }
        public void initialize(int weight, String color, String address)
        {
            this.weight = weight;
            this.color = color;
            this.address = address;
        }


    public static void main(String[] args) {

    }
}
