package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.io.Serializable;

/**
 * Created by Mike on 07.06.2017.
 */
public class Message implements Serializable {

    private final MessageType type;
    private final String data;


    //Constructors
    public Message(MessageType type, String data) {
        this.type = type;
        this.data = data;
    }

    public Message(MessageType type) {
        this.type = type;
        this.data = null;
    }


    //getters

    public MessageType getType() {
        return type;
    }

    public String getData() {
        return data;
    }
}