package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class University {

    String name;
    int age;

    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public University(String name, int age) {

    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        //TODO:
        int index = 0;
        for (int i = 0; i < students.size(); i++)
            if (averageGrade == students.get(i).getAverageGrade())
                index = i;

        return students.get(index);
    }

    public Student getStudentWithMaxAverageGrade() {
        //TODO:
        double max = students.get(0).getAverageGrade();
        int index = 0;
        for (int i = 1; i < students.size(); i++)
            if (max < students.get(i).getAverageGrade()) {
                max = students.get(i).getAverageGrade();
                index=i;
            }

        return students.get(index);
    }



    public Student getStudentWithMinAverageGrade(){

        double min = students.get(0).getAverageGrade();
        int index = 0;
        for (int i = 1; i < students.size(); i++)
            if (min > students.get(i).getAverageGrade()) {
                min = students.get(i).getAverageGrade();
                index=i;
            }

        return students.get(index);

    }


    public void expel(Student student){
        students.remove(student);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}