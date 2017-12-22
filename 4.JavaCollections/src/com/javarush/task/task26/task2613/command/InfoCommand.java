package com.javarush.task.task26.task2613.command;

import com.javarush.task.task26.task2613.CashMachine;
import com.javarush.task.task26.task2613.ConsoleHelper;
import com.javarush.task.task26.task2613.CurrencyManipulator;
import com.javarush.task.task26.task2613.CurrencyManipulatorFactory;

import java.util.ResourceBundle;

class InfoCommand implements Command {

    private ResourceBundle res = ResourceBundle.getBundle(CashMachine.RESOURCE_PATH + "info_en");

    @Override
    public void execute() {

        System.out.println(res.getString("before"));
        for (CurrencyManipulator val : CurrencyManipulatorFactory.getAllCurrencyManipulators()) {
            if (val.hasMoney())
                ConsoleHelper.writeMessage(val.getCurrencyCode() + " - " + val.getTotalAmount());
            else
                ConsoleHelper.writeMessage(res.getString("no.money"));
        }

        if (CurrencyManipulatorFactory.getAllCurrencyManipulators().isEmpty())
            ConsoleHelper.writeMessage(res.getString("no.money"));

    }
}
