package com.javarush.task.task32.task3209;

import javax.swing.*;
import javax.swing.text.html.HTMLDocument;
import java.io.File;

/**
 * Created by Mike on 28.06.2017.
 */
public class Controller {
    private View view;
    private HTMLDocument document;
    private File currentFile;


    public void init() {


    }

    public Controller(View view) {
        this.view = view;
    }


    public void exit()
    {
        System.exit(0);
    }


    public static void main(String[] args) {
        View view = new View();
        //Создавать контроллер, используя представление
        Controller controller = new Controller(view);
        //Устанавливать у представления контроллер
        view.setController(controller);
        //Инициализировать представление
        view.init();
        //Инициализировать контроллер. Контроллер должен инициализироваться после представления
        controller.init();

    }

    public static void initColorMenu(View view, JMenuBar menuBar) {

    }

}
