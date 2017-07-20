package io.hexlet.java.controller;

import io.hexlet.java.model.Field;
import io.hexlet.java.model.Point;

public class MoveController {

    public boolean applyFigure(final Field field,
                               final Point point,
                               final String figure) {

        if (!checkCoordinate(point.x) || !checkCoordinate(point.y)) {
            return false;
        }

//        if (field.figures[point.x][point.y] != null) return false;
//
//        field.figures[point.x][point.y] = figure;

        return true;
    }

    // BEGIN (write your solution here) //You may want to check the coordinates in a separate method ???
    private static boolean checkCoordinate (final int coordinate) {
        if (coordinate < 0) {
            return false;
        }

        return true;
    }
    // END
}
