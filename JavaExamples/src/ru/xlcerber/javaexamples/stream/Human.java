package ru.xlcerber.javaexamples.stream;

import java.util.List;

public class Human {
        private final String name;
        private final List<String> pets;

    public Human(String humanName, List<String> humanPets) {
        name = humanName;
        pets = humanPets;
    }

    public List<String> getPets() {
        return pets;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", pets=" + pets +
                '}';
    }

    public int getAge(int age) {
        return age;
    }
//constructors, getter
}
