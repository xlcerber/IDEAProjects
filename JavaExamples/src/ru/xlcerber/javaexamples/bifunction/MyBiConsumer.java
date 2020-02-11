package ru.xlcerber.javaexamples.bifunction;

import java.util.function.BiConsumer;

// Определение нашего действия в классе MyBiConsumer
class MyBiConsumer implements BiConsumer<String, Integer> {

    public void accept(String k, Integer v)
    {
        System.out.print("Key = " + k);
        System.out.print("\t Value = " + v);
        System.out.println();
    }
}
