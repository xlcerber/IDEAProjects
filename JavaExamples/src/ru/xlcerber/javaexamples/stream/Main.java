package ru.xlcerber.javaexamples.stream;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {

        List<Human> humans = asList(
                new Human("Sam", asList("Buddy", "Lucy")),
                new Human("Bob", asList("Frankie", "Rosie")),
                new Human("Marta", asList("Simba1", "Tilly1")),
                new Human("Marta", asList("Simba", "Tilly")));

        List<String> petNames = humans.stream()
                .filter(human -> "Marta".equals(human.getName()))
                .map(human -> human.getPets()) //преобразовываем Stream<Human> в Stream<List<Pet>>
                .flatMap(pets -> pets.stream())//"разворачиваем" Stream<List<Pet>> в Stream<Pet>
                .collect(Collectors.toList());


        petNames.forEach(System.out::println);
        System.out.println(petNames); // output [Buddy, Lucy, Frankie, Rosie, Simba, Tilly]

        Human marta = humans.stream()
                .filter(human -> "Marta".equals(human.getName()))
                .findAny()
                .orElse(null);

        System.out.println(marta);

        AwesomeClass awesomeClass = new AwesomeClass();
        String inverValue = awesomeClass.compute((a) -> a.toString(), marta);

    }




}

