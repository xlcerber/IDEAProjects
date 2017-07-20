package io.hexlet.java.controller;

import io.hexlet.java.model.Field;
import io.hexlet.java.model.Point;

public class CurrentMoveController {

    public String currentMove(final Field field) {

        int xCounter = 0;
        int yCounter = 0;

        for (int i = 0; i < field.getSize(); i++) {
            for (int j = 0; j < field.getSize(); j++) {

                Point point = new Point(i,j);

                if (field.getFigure(point) == "X" ) {
                    xCounter++;
                }

                if (field.getFigure(point) == "O" ) {
                    yCounter++;
                }
            }
        }

        if (xCounter <= yCounter ) {
            return "X";
        } else {
            return "O";
        }
    }
}