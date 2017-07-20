package io.hexlet.java.model;

public class Figure {

    private final String figure;

    int x0[][] = new int[2][2];
    int x5[][] = new int[][]{{}};
    int[] x6 = new int[2];
    int x7[][] = new int[][]{{2}, {3, 4}};
    int x8[][] = new int[2][];
    int[] x9 = {2, 5, 6};
    int[] x10 = new int[]{2, 3, 4};

    int x[][] = new int[][]{{2}, {3, 4}};

    public Figure(final String figure) {
        this.figure = figure;
    }

    public String getFigure() {
        return figure;
    }

    @Override
    public String toString() {
        return this.figure;
    }
}
