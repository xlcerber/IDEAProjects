package io.hexlet.java.model;

public class PlayerBuilder {

    private String name = null;

    private Figure figure = null;

    public PlayerBuilder name (final String name) {
        this.name = name;
        return this;
    }

    public PlayerBuilder figure (final Figure figure) {
        this.figure = figure;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Figure getFigure() {
        return this.figure;
    }

    public Player build() {
        return new Player(this);
    }
}
