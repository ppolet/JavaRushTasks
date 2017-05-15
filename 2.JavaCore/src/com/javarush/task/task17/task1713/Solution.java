package com.javarush.task.task17.task1713;

import java.util.*;

/* 
Общий список
*/

public class Solution implements List<Long> {
    private ArrayList<Long> original = new ArrayList<Long>();

    @Override
    public Long remove(int index) {
        return original.remove(index);
    }

    public static void main(String[] args) {

    }

    @Override
    public int size() {
        return original.size();
    }

    @Override
    public boolean isEmpty() {
        return original.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return original.contains(o);
    }

    @Override
    public Iterator iterator() {
        return original.iterator();
    }

    @Override
    public Object[] toArray() {
        return original.toArray();
    }

    @Override
    public boolean add(Long aLong) {
        return original.add(aLong);
    }

    @Override
    public Long get(int index) {
        return original.get(index);
    }

    @Override
    public Long set(int index, Long element) {
        return original.set(index,element);
    }

    @Override
    public void add(int index, Long element) {
        original.add(index,element);
    }

    @Override
    public boolean remove(Object o) {
        return original.remove((Long) o);
    }

    @Override
    public boolean addAll(Collection c) {
        return original.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return original.addAll(index, c);
    }

    @Override
    public void clear() {
        original.clear();
    }



    @Override
    public int indexOf(Object o) {
        return original.indexOf((Long)o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return original.lastIndexOf((Long)o);
    }

    @Override
    public ListIterator listIterator() {
        return original.listIterator();
    }

    @Override
    public ListIterator listIterator(int index) {
        return original.listIterator(index);
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return original.subList(fromIndex,toIndex);
    }

    @Override
    public boolean retainAll(Collection c) {
        return original.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection c) {
        return original.removeAll(c);
    }

    @Override
    public boolean containsAll(Collection c) {
        return original.containsAll(c);
    }

    @Override
    public Object[] toArray(Object[] a) {
        return original.toArray(a);
    }
}
