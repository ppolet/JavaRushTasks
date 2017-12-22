package com.javarush.task.task26.task2613.command;

import com.javarush.task.task26.task2613.CashMachine;
import com.javarush.task.task26.task2613.ConsoleHelper;
import com.javarush.task.task26.task2613.exception.InterruptOperationException;

import java.util.ResourceBundle;

public class LoginCommand implements Command {


    String cardNumber, cardPinNumber;
    private  ResourceBundle validCreditCards=ResourceBundle.getBundle(CashMachine.RESOURCE_PATH + "verifiedCards");
    private ResourceBundle res = ResourceBundle.getBundle(CashMachine.RESOURCE_PATH + "login_en");

    @Override
    public void execute() throws InterruptOperationException {


        while (true) {

            ConsoleHelper.writeMessage(res.getString("before"));

            ConsoleHelper.writeMessage(res.getString("specify.data"));
            cardNumber = ConsoleHelper.readString();
            cardPinNumber = ConsoleHelper.readString();

            if ((cardPinNumber == null || cardPinNumber == null || cardNumber.length() != 12 || cardPinNumber.length() != 4)) {
                ConsoleHelper.writeMessage(res.getString("try.again.with.details"));
                ConsoleHelper.writeMessage(res.getString("try.again.or.exit"));
            }


            if (validCreditCards.containsKey(cardNumber) && validCreditCards.getString(cardNumber).equals(cardPinNumber)) {
                ConsoleHelper.writeMessage(res.getString("success.format"));
                break;
            } else
            {
                ConsoleHelper.writeMessage(res.getString("not.verified.format"));
                ConsoleHelper.writeMessage(res.getString("try.again.or.exit"));

            }
        }


    }



}
