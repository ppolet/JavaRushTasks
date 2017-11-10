package com.javarush.task.task33.task3310.strategy;

/**
 * Created by Mike on 19.10.2017.
 */
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;


public class Entry<key, value> implements Serializable {

    final int hash;
    final Long key;
    String value;
    Entry<key, value> next;


    public Entry(int hash, Long key, String value, Entry<key, value> next) {
        this.hash = hash;
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public Long getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Entry<?, ?> entry = (Entry<?, ?>) o;

        if (!key.equals(entry.key)) return false;
        return value.equals(entry.value);
    }

    @Override
    public int hashCode() {
        int result = key.hashCode();
        result = 31 * result + value.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return new String(key + "=" + value);
    }

}