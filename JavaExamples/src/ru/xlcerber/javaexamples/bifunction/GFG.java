package ru.xlcerber.javaexamples.bifunction;

import java.util.*;
import java.util.function.BiConsumer;

// Java-программа для демонстрации
// метод forEach (BiConsumer).

public class GFG {
    // Основной метод

    public static void main(String[] args)
    {

        Properties properties = new Properties();
        properties.put("Pen", 10);
        properties.put("Book", 500);
        properties.put("Clothes", 400);
        properties.put("Mobile", 5000);

        // Распечатать информацию о свойствах
        System.out.println("Properties 1: " + properties.toString());

        // Добавить 100 в каждое значение, используя forEach ()
        properties.forEach((k, v) -> {
            v = (int)v + 100;
            properties.replace(k, v);
        });

        // Распечатать новое отображение, используя forEcah ()
        properties.forEach( (k, v) -> System.out.println("Key : " + k + ", Value : " + v));


        // создаем HashMap и добавляем некоторые значения
        Map<String, Integer> map = new HashMap<>();
        map.put("geeks", 55);
        map.put("for", 13);
        map.put("geeks", 22);
        map.put("is", 11);
        map.put("heaven", 90);
        map.put("for", 100);
        map.put("geekies like us", 96);

        // создание собственного действия
        BiConsumer<String, Integer> action  = new MyBiConsumer();

        BiConsumer<String,Integer> action2 = (k,v) -> {
            System.out.println("Key: " + k + "\tValue: " + v);

            if ("for".equals(k)) {
                System.out.println("Its the " + "highest value\n");
            }
        };

        // вызов метода forEach
        map.forEach(action2);

    }

}

