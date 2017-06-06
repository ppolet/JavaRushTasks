package com.javarush.task.task07.task0724;

/*
Семейная перепись
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human gFather1 = new Human("GrandFather1", true, 55, null, null);
        Human gMother1 = new Human("GrandMother1", false, 54, null, null);
        Human gFather2 = new Human("GrandFather2", true, 57, null, null);
        Human gMother2 = new Human("GrandMother2", false, 56, null, null);
        Human father1 = new Human("Father", true, 45, gFather1, gMother1);
        Human mother1 = new Human("Mother", false, 44, gFather2, gMother2);
        Human kids1 = new Human("Kid1", true, 24, father1, mother1);
        Human kids2 = new Human("Kid2", true, 24, father1, mother1);
        Human kids3 = new Human("Kid3", true, 24, father1, mother1);

        System.out.println(gFather1);
        System.out.println(gMother1);
        System.out.println(gFather2);
        System.out.println(gMother2);
        System.out.println(father1);
        System.out.println(mother1);
        System.out.println(kids1);
        System.out.println(kids2);
        System.out.println(kids3);
    }

    public static class Human
    {
        private String name;
        private int age;
        private Boolean sex;
        private Human mother;
        private Human father;

        Human (String name, Boolean sex, int age, Human father, Human mother){
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.father=father;
            this.mother=mother;
        }


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















