package io.hexlet.java.view;

import io.hexlet.java.model.Field;
import io.hexlet.java.model.Point;
import io.hexlet.java.model.exceptions.InvalidPointException;

import java.util.Random;

public class RandomCoordinateGetter implements ICoordinateGetter {


    private Boolean fieldHasEmptyPoint(Field field) {
        for (int colNum = 0; colNum < field.getSize(); colNum++) {
            for (int rowNum = 0; rowNum < field.getSize(); rowNum++) {
                try {
                    if (field.getFigure(new Point(colNum, rowNum)) == null) {
                        return true;
                    }
                } catch (InvalidPointException e)
                {
                    System.out.println(e.getMessage());
                }
            }

        }
        return false;
    }

    @Override
    public Point getMoveCoordinate(Field field) {

        Point randomCoordinate = null;

        Boolean fieldHasEmptyPoint = false;

        Random random = new Random();

        while ( fieldHasEmptyPoint(field) ) {

            randomCoordinate = new Point(random.nextInt(3), random.nextInt(3));

            try {
                if (field.getFigure(randomCoordinate) == null) {
                    return randomCoordinate;
                }
            }catch (InvalidPointException e) {
                System.out.println(e.getMessage());
            }
        };

        return null;
    }
}
