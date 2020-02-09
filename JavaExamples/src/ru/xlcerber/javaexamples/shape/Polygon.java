package ru.xlcerber.javaexamples.shape;

import java.util.Arrays;
import java.util.Objects;

public class Polygon implements Shape {
    private final int numberOfSides;
    private final int[] sideLength;

    public Polygon(int numberOfSides) {
        this.numberOfSides = numberOfSides;
        sideLength = new int[0];
    }

    public Polygon(int numberOfSides, int[] sideLength) {
        this.numberOfSides = numberOfSides;
        this.sideLength = sideLength;
    }

    public int getLongestSideLength() {
        int longest=Arrays.stream(sideLength)
                .max()
                .orElse(0);
        return longest;
    }

    @Override
    public int getNumberOfSides() {
        return numberOfSides;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfSides);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Polygon polygon = (Polygon) o;
        return numberOfSides == polygon.numberOfSides;
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "numberOfSides=" + numberOfSides +
                '}';
    }
}

