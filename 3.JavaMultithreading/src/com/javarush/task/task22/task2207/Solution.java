package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* 
Обращенные слова
В методе main с консоли считать имя файла, который содержит слова, разделенные пробелами.
Найти в тексте все пары слов, которые являются обращением друг друга. Добавить их в result.
Использовать StringBuilder.

Пример содержимого файла
рот тор торт о
о тот тот тот

Вывод:
рот тор
о о
тот тот


Требования:
1. Метод main должен считывать имя файла с клавиатуры.
2. В методе main должен быть использован StringBuilder
3. Список result должен быть заполнен корректными парами согласно условию задачи.
4. В классе Solution должен содержаться вложенный класс Pair.
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        // write your code here


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader readerFromFile = new BufferedReader(new FileReader(bufferedReader.readLine()));
        StringBuilder stringBuilder = new StringBuilder();
        while (readerFromFile.ready()) {

            stringBuilder.append(readerFromFile.readLine());
            stringBuilder.append(" ");
        }

        String[] str = stringBuilder.toString().split(" ");
        HashMap<String, String> hashMap = new HashMap<>();


        StringBuilder stringBuilder1 = new StringBuilder();
        for (int j = 0; j < str.length; j++) {

            stringBuilder1.append(str[j]);
            stringBuilder1.reverse();

            for (int i = j; i < str.length; i++) {
                if (stringBuilder1.toString().equals(str[i])) {
                    // System.out.println(String.format("строка: %s перевертыш :%s ", str[i], stringBuilder1.reverse().toString()));
                    hashMap.put(str[i], stringBuilder1.reverse().toString());
                    break;
                }
            }
            stringBuilder1 = new StringBuilder();

        }



        for (Map.Entry<String,String> value:hashMap.entrySet()) {
            Pair pair= new Pair();
            pair.first=value.getValue();
            pair.second= value.getKey();
            result.add(pair);
        }


    }

    public static class Pair {
        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                            second == null && first != null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}

