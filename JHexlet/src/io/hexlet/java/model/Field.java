package io.hexlet.java.model;

import java.util.Arrays;

public class Field {
    private String[][] figures = new String[3][3];

    public Field(String[][] figures) {
        System.out.println("Start constructor of the Field class.");
        this.figures = figures;
    }

    public int getSize() {
        return figures.length;
    }

    public String getFigure(final Point point) {
        return this.figures[point.x][point.y];
    }

    public void setFigure(final Point point, final String figure) {
        this.figures[point.x][point.y] = figure;
    }
}
