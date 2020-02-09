package ru.xlcerber.javaexamples.stream;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static java.util.Arrays.asList;

public class HumanTest {

    @Test
    public void shouldReturnCorrectAge() {
        Human human = new Human("Martin", asList("Starky","Jack"));
        int age = human.getAge(42);

        Assertions.assertEquals(42, age);
    }
}