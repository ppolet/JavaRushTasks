package com.javarush.task.task15.task1516;

/* 
Значения по-умолчанию
1. Создать 7 public полей класса. Убедитесь, что они инициализируются дефолтными значениями.
intVar типа int
doubleVar типа double
DoubleVar типа Double
booleanVar типа boolean
ObjectVar типа Object
ExceptionVar типа Exception
StringVar типа String
2. В методе main вывести их значения в заданном порядке.


Требования:
1. В классе Solution должно быть объявлено поле intVar типа int.
2. В классе Solution должно быть объявлено поле doubleVar типа double.
3. В классе Solution должно быть объявлено поле DoubleVar типа Double.
4. В классе Solution должно быть объявлено поле booleanVar типа boolean.
*/

public class Solution {
    static public int intVar;
    static public double doubleVar;
    static public Double DoubleVar;
    static public boolean booleanVar;
    static public Object ObjectVar;
    static public Exception ExceptionVar;
    static public String StringVar;

    public static void main( String[] args )
    {
        System.out.println( intVar );
        System.out.println( doubleVar );
        System.out.println( DoubleVar );
        System.out.println( booleanVar );
        System.out.println( ObjectVar );
        System.out.println( ExceptionVar );
        System.out.println( StringVar );
    }
}
