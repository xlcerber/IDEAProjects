package ru.xlcerber.javaexamples.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PolygonTest {

    @Test
    void shouldHaveArbitaryNumberOfSides() {
        Shape polygon = new Polygon(5);
        Assertions.assertEquals(5, polygon.getNumberOfSides());
    }

    @Test
    void shouldReturnLengthOfLongestSide() {
        final Polygon polygon = new Polygon(3, new int[]{7, 9, 8});
        Assertions.assertEquals(9, polygon.getLongestSideLength());
    }
}
