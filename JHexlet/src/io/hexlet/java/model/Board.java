package io.hexlet.java.model;

import java.util.Arrays;

public class Board {

    int SIZE_FIELD = 3;

    private Figure[][] figures = new Figure[SIZE_FIELD][SIZE_FIELD];

    public void initArray() {
        figures[0][0] = new Figure("X");
        figures[1][1] = new Figure("O");
    }

    public void showBoard() {
        System.out.println(Arrays.deepToString(this.figures));
    }

    public Figure[][] getFigures() {
        return figures;
    }
}