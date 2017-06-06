package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Human implements Alive {
    private static int nextId = 0;
    private int id;
    protected int age;
    protected String name;
    private BloodGroup bloodGroup;

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public void printData() {
        System.out.println (getPosition ( ) + ": " + name);
    }

    public String getPosition() {
        return "Человек";
    }

    private List<Human> children = new ArrayList<>();

    Size size;

    public Human(String name, int age) {
        this.age = age;
        this.name = name;
        this.id=nextId;
        nextId++;
    }





    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getId() {
        return id;
    }



    public void printSize() {
        System.out.println("Рост: " + this.size.height + " Вес: " + this.size.weight);
    }

    public List<Human> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public void addChild(Human human) {
        children.add(human);
    }

    public void removeChild(Human human) {

        children.remove(human);
    }


    public class Size{

        public int height;
        public int weight;



    }


    @Override
    public void live() {

    }
}