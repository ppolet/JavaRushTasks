package com.javarush.task.task33.task3310.strategy;

import org.apache.commons.collections.bidimap.DualHashBidiMap;

/**
 * Created by Mike on 19.10.2017.
 */



public class DualHashBidiMapStorageStrategy implements StorageStrategy {

    private DualHashBidiMap data = new DualHashBidiMap();
    @Override
    public boolean containsKey(Long key) {
        return data.containsKey(key);
    }
    @Override
    public boolean containsValue(String value) {
        return data.containsValue(value);
    }
    @Override
    public void put(Long key, String value) {
        data.put(key, value);
    }

    @Override
    public Long getKey(String value) {
        return null;
    }

    @Override
    public String getValue(Long key) {
        return null;
    }


}
