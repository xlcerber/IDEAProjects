package io.hexlet.java.model;

import java.util.Arrays;

public class Board {

    int SIZE_FIELD = 9;
    private Figure[][] figures = new Figure[SIZE_FIELD][SIZE_FIELD];

    public void initArray() {
        figures[0][0] = new Figure("X");
    }

    public void showBoard() {
        System.out.println(Arrays.deepToString(this.figures));
    }

}