package io.hexlet.java.model;

import java.util.Arrays;

public class Field {
    public String[][] figures = new String[3][3];


    public int getSize() {
        return figures.length;
    }

    public String getFigure(final Point point) {
        // BEGIN (write your solution here)

        return this.figures[point.x][point.y];

        // END
    }

    public void setFigure(final Point point, final String figure) {
        // BEGIN (write your solution here)

        this.figures[point.x][point.y] = figure;

        // END
    }
}
