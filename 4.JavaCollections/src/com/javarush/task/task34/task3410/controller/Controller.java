package com.javarush.task.task34.task3410.controller;

import com.javarush.task.task34.task3410.model.Model;
import com.javarush.task.task34.task3410.view.View;

public class Controller {
    private View view;
    private Model model;


    /*
    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

*/

    public Controller() {
        view= new View(this);
        model= new Model();

    }

    public static void main(String[] args) {

        Controller controller = new Controller();
    }
}
