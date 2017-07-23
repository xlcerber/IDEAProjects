package io.hexlet.java.model;

import java.util.Arrays;

public class Field {
    private Figure[][] figures = new Figure[3][3];

    public Field(Figure[][] figures) {
        this.figures = figures;
    }

    public int getSize() {
        return figures.length;
    }

    public Figure getFigure(final Point point) {
        return this.figures[point.getX()][point.getY()];
    }

    public void setFigure(final Point point, Figure figure) {
        this.figures[point.getX()][point.getY()] = figure;
    }
}
