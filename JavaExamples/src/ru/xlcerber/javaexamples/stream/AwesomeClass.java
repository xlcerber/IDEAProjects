package ru.xlcerber.javaexamples.stream;

import java.util.function.Function;

public class AwesomeClass {

    public static String compute(Function<Human, String> function, Human value) {
        return function.apply(value);
    }

}
