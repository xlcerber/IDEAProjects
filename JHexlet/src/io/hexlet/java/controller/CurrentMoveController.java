package io.hexlet.java.controller;

import io.hexlet.java.model.Field;
import io.hexlet.java.model.Figure;
import io.hexlet.java.model.Point;

public class CurrentMoveController {

//    public String currentMove(final Field field) {
//
//        int xCounter = 0;
//        int yCounter = 0;
//
//        for (int i = 0; i < field.getSize(); i++) {
//            for (int j = 0; j < field.getSize(); j++) {
//
//                Point point = new Point(i,j);
//
//                if (field.getFigure(point) == "X" ) {
//                    xCounter++;
//                }
//
//                if (field.getFigure(point) == "O" ) {
//                    yCounter++;
//                }
//            }
//        }
//
//        if (xCounter <= yCounter ) {
//            return "X";
//        } else {
//            return "O";
//        }
//    }


    public
        // BEGIN (write your solution here)
        Figure
        // END
    currentMove(final Field field) {
        int countFigure = 0;
        for (int x = 0; x < field.getSize(); x++) {
            countFigure += countFiguresInTheRow(field, x);
        }

        if (countFigure == field.getSize() * field.getSize())
            return null;

        if (countFigure % 2 == 0)
        // return "X";
        // BEGIN (write your solution here)
        return Figure.X;
        // END

        // return "O";
        // BEGIN (write your solution here)
        return Figure.O;
        // END
    }

    private int countFiguresInTheRow(final Field field, final Integer row) {
        int countFigure = 0;
        for (int x = 0; x < field.getSize(); x++) {
            final Point p = new Point(x, row);
            if (field.getFigure(p) != null)
                countFigure++;
        }
        return countFigure;
    }
}