package ru.xlcerber.javaexamples.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {

    @Test
    void shouldHaveFoursSides() {
        Square square = new Square();

        int numberOfSides = square.getNumberOfSides();

        Assertions.assertEquals(4,numberOfSides);
    }
}