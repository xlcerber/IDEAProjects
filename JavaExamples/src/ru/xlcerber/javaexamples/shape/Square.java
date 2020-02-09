package ru.xlcerber.javaexamples.shape;

public class Square implements Shape {

    private final int numberOfSides;

    public Square() {
        numberOfSides = 4;
    }

    @Override
    public int getNumberOfSides() {
        return numberOfSides;
    }
}
