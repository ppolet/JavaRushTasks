package com.javarush.task.task14.task1421;

import java.text.SimpleDateFormat;

/**
 * Created by Mike on 12.04.2017.
 */
public class Singleton {

   private static Singleton instance;

    private  Singleton()
    {
        super();
    }
   public static Singleton getInstance()
   {
       if(instance== null)
       {
           instance= new Singleton();
       }
       return instance;
   }


}
