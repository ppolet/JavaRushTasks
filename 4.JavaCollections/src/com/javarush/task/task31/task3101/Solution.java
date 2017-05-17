package com.javarush.task.task31.task3101;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
Проход по дереву файлов
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        File path = new File(args[0]);
        File resultFileAbsolutePath = new File(args[1]);
        //Переименовывем файл
        FileUtils.renameFile(resultFileAbsolutePath, new File(resultFileAbsolutePath.getParent() + "/allFilesContent.txt"));
        //Пройдись по всем файлам в директории, которая приходит первым параметром в main, и всех ее поддиректориях. Файлы с размером более 50 байт нужно удалить используя метод FileUtils.deleteFile
        ArrayList<File> files = cleanAndSort(path.listFiles());
        //Создаем поток на записи в файл
        try (FileOutputStream out = new FileOutputStream(resultFileAbsolutePath.getParent() + "/allFilesContent.txt")) {
            //Содержимое всех файлов, размер которых не превышает 50 байт, должно быть записано в файл allFilesContent.txt в отсортированном по имени файла порядке.
            for (File each : files) {
                BufferedReader br = new BufferedReader(new FileReader(each));
                String s;
                while ((s = br.readLine()) != null) {
                    out.write((s + '\n').getBytes());
                }
                br.close();
            }
            //Поток для записи в файл нужно закрыть.
            out.close();
        }
    }

    public static ArrayList<File> cleanAndSort(File[] files) {
        ArrayList<File> allFiles = new ArrayList<>();
        for (File file : files) {
            if (file.isDirectory())
                allFiles.addAll(cleanAndSort(file.listFiles()));
            else if (file.isFile() && file.length() > 50)
                FileUtils.deleteFile(file);
            else if (file.isFile() && file.length() <= 50)
                allFiles.add(file);
        }
        //Сортируем оставшиеся файлы по имени
        Collections.sort(allFiles, new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return allFiles;
    }

    public static void deleteFile(File file) {
        if (!file.delete()) System.out.println("Can not delete file with name " + file.getName());
    }
}