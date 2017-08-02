package io.hexlet.java.model;

import io.hexlet.java.model.exceptions.InvalidPointException;

import java.util.Arrays;

public class Field {

    private final Figure[][] field;

    private static final int MIN_COORDINATE = 0;

    private final int filedSize;


    public Field(final int filedSize) {
        this.filedSize = filedSize;
        field = new Figure[filedSize][filedSize];
    }

    public int getSize() {
        return filedSize;
    }

    public Figure getFigure(final Point point)
            throws InvalidPointException
    {
        if ( !checkCoordinate( point.getX() ) || !checkCoordinate (point.getY() ) )  {
            throw new InvalidPointException();
        }
        return field[point.getX()][point.getY()];
    }

    public void setFigure(final Point point, final Figure figure)
            throws InvalidPointException
    {
        if ( !checkCoordinate( point.getX() ) || !checkCoordinate (point.getY() ) ) {
            throw new InvalidPointException();
        }
        field[point.getX()][point.getY()] = figure;
    }

    public boolean checkCoordinate(int coordinate) {

        if (coordinate < MIN_COORDINATE || coordinate > filedSize - 1 ) {
            return false;
        } else {
            return true;
        }
    }

}
