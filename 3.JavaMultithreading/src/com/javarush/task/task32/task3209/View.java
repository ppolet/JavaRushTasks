package com.javarush.task.task32.task3209;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Mike on 28.06.2017.
 */
public class View extends JFrame implements ActionListener {
    private Controller controller;

    public void init() {

    }


    public void exit() {
        System.exit(0);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }
}
