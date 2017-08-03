package io.hexlet.java.model;

import io.hexlet.java.model.exceptions.AlreadyOccupiedException;
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

    public Figure getFigure(final Point point) throws InvalidPointException
    {
        if ( !checkCoordinate( point ) )  {
            throw new InvalidPointException();
        }

        return field[point.getX()][point.getY()];
    }

    public void setFigure(final Point point, final Figure figure) throws InvalidPointException, AlreadyOccupiedException
    {
        if ( !checkCoordinate(point)) {
            throw new InvalidPointException();
        }

        if (this.getFigure(point) != null) {
            throw new AlreadyOccupiedException();
        }
        field[point.getX()][point.getY()] = figure;
    }

    private boolean checkCoordinate(Point point) {

        if (point.getX() < MIN_COORDINATE || point.getX() > filedSize - 1
                || point.getY() < MIN_COORDINATE || point.getY() > filedSize - 1) {
            return false;
        } else {
            return true;
        }
    }


}
