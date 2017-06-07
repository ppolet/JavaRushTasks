package com.javarush.task.task20.task2018;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* 
Найти ошибки
*/
public class Solution implements Serializable {
    public static class A {
        protected String name = "A";
        public A() {}
        public A(String name) {
            this.name += name;
        }
    }

    public class B extends A implements Serializable {
        public B(String name) {
            super(name);
            this.name += name;
        }
        private void writeObject(ObjectOutputStream out) throws IOException {
            out.defaultWriteObject();
            out.writeObject(name);
        }
        private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
          in.defaultReadObject();
            name = (String)in.readObject();
        }
    }
}
