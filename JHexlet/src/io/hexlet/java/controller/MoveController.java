package io.hexlet.java.controller;

import io.hexlet.java.model.Field;
import io.hexlet.java.model.Figure;
import io.hexlet.java.model.Point;

public class MoveController {

    public boolean applyFigure(final Field field,
                               final Point point,
                               final Figure figure) {

        if (!checkCoordinate(point.getX()) || !checkCoordinate(point.getY())) {
            return false;
        }

        field.setFigure(point, figure);
        return true;
    }

    private static boolean checkCoordinate (final int coordinate) {
        if (coordinate < 0) {
            return false;
        }

        return true;
    }
}
