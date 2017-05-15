package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Looser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        key = reader.readLine();

        while ((key.equals("user")) || (key.equals("proger")) || (key.equals("coder")) || (key.equals("loser"))) {

            switch (key) {
                case "user":
                    person = new Person.User();
                    break;
                case "proger":
                    person = new Person.Proger();
                    break;
                case "coder":
                    person = new Person.Coder();
                    break;
                case "loser":
                    person = new Person.Loser();
                    break;
            }

            doWork(person);

            key= reader.readLine();

        }
    }



    public static void doWork(Person person) {
      if (person instanceof Person.User)
          ((Person.User) person).live();

      if(person instanceof Person.Loser)
          ((Person.Loser) person).doNothing();

      if(person instanceof Person.Coder)
          ((Person.Coder) person).coding();

      if(person instanceof Person.Proger)
          ((Person.Proger) person).enjoy();

    }
}
