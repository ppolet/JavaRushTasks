package com.javarush.task.task20.task2002;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = new File("a.txt");
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);
            SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
            JavaRush javaRush = new JavaRush();
            User user = new User();
            user.setFirstName("Smth");
            user.setLastName("Again");
            user.setBirthDate(format.parse("hahaha"));
            user.setMale(true);
            user.setCountry(User.Country.RUSSIA);
            javaRush.users.add(user);
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            System.out.println(javaRush.equals(loadedObject));

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
            PrintWriter writer = new PrintWriter(outputStream);
            if (this.users != null) {
                for (User user : users) {
                    writer.println(user.getFirstName());
                    writer.println((user.getLastName()));
                    writer.println(formatter.format(user.getBirthDate()));
                    writer.println(user.isMale());
                    writer.println(user.getCountry().getDisplayedName());
                }
            }
            writer.close();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                User user = new User();
                user.setFirstName(line);
                user.setLastName(reader.readLine());
                Date formatter = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH).parse(reader.readLine());
                user.setBirthDate(formatter);
                user.setMale(Boolean.parseBoolean(reader.readLine()));
                String countries = reader.readLine();
                switch (countries) {
                    case "Ukraine":
                        user.setCountry(User.Country.UKRAINE);
                        break;
                    case "Russia":
                        user.setCountry(User.Country.RUSSIA);
                        break;
                    default:
                        user.setCountry(User.Country.OTHER);
                        break;
                }
                this.users.add(user);
            }
            reader.close();
        }
    }
}