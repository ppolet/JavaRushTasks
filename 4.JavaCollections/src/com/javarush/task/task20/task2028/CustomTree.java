package com.javarush.task.task20.task2028;

import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;

/* 
Построй дерево(1)
*/
public class CustomTree extends AbstractList<String>  implements Cloneable,Serializable{

    static class Entry<T>  implements Serializable
    {

        Entry<T> leftChild;
        Entry<T> parent;
        Entry<T> rightChild;
        String elementName;
        int lineNumber;
        boolean availableToAddLeftChildren;
        boolean availableToAddRightChildren;

        public Entry(String elementName)
        {
            this.elementName=elementName;
            availableToAddLeftChildren=true;
            availableToAddRightChildren= true;
        }

        void checkChildren()
        {
            if(leftChild!=null)
            {
                availableToAddLeftChildren=false;
            }

            if(rightChild!=null)
            {
                availableToAddRightChildren=false;
            }
        }

        boolean isAvailableToAddChildren()
        {

            return availableToAddLeftChildren||availableToAddRightChildren;
        }


    }
    public static void main(String[] args) {
        List<String> list = new CustomTree();
        for (int i = 1; i < 16; i++) {
            list.add(String.valueOf(i));
        }
        //System.out.println("Expected 3, actual is " + ((CustomTree) list).getParent("8"));
        list.remove("5");
        //System.out.println("Expected null, actual is " + ((CustomTree) list).getParent("11"));
    }



    @Override
    public String get(int index) {
        throw new  UnsupportedOperationException();
    }

    @Override
    public boolean add(String s) {
        throw new  UnsupportedOperationException();
    }


    @Override
    public void add(int index, String element) {
        throw new  UnsupportedOperationException();
    }

    @Override
    public String set(int index, String element) {
        throw new  UnsupportedOperationException();
    }

    @Override
    public String remove(int index) {
        throw new  UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection c) {
        throw new  UnsupportedOperationException();
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new  UnsupportedOperationException();
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        throw new  UnsupportedOperationException();
    }


    @Override
    public int size() {
        throw new  UnsupportedOperationException();
    }


}
