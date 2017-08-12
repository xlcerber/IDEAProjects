package io.hexlet.java.controller;

import io.hexlet.java.model.Field;
import io.hexlet.java.model.Figure;
import io.hexlet.java.model.Point;
import io.hexlet.java.model.exceptions.AlreadyOccupiedException;
import io.hexlet.java.model.exceptions.InvalidPointException;

public class MoveController {

    public static void applyFigure(final Field<Figure> field,
                               final Point point,
                               final Figure figure) throws AlreadyOccupiedException, InvalidPointException {

        field.setFigure(point, figure);
    }

}
