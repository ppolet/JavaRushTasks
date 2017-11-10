package com.javarush.task.task33.task3310.strategy;


import com.javarush.task.task33.task3310.ExceptionHandler;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
/**
 * Created by Mike on 19.10.2017.
 */
public class FileBucket {

    private Path path;
    public FileBucket() {
        try {
            path = Files.createTempFile(null, null);
            Files.deleteIfExists(path);
            Files.createFile(path);
        } catch (IOException e) {
            ExceptionHandler.log(e);
        }
        path.toFile().deleteOnExit();
    }

    public long getFileSize(){
        Long a=0l;
        try
        {
            a= Files.size(path);
        }
        catch (IOException e)
        {
        }
        return a;
    }

    public void putEntry(Entry entry) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(path))) {
            objectOutputStream.writeObject(entry);
        } catch (IOException e) {
            ExceptionHandler.log(e);
        }
    }

    public Entry getEntry()
    {
        if (getFileSize() <= 0) return null;
        try (ObjectInputStream in = new ObjectInputStream(Files.newInputStream(path)))
        {
            return (Entry) in.readObject();
        }
        catch (Exception e) {
            ExceptionHandler.log(e);
        }
        return null;
    }

    public void remove() {
        try {
            Files.delete(path);
        }
        catch (IOException e) {
            ExceptionHandler.log(e);
        }
    }
}
