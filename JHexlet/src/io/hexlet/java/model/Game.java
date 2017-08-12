package io.hexlet.java.model;

public class Game<F> {

    private final Player player1;

    private final Player player2;

    private final Field<F> field;

    private final String name;

    Game (GameBuilder gameBuilder) {
        this.player1 = gameBuilder.getPlayer1();
        this.player2 = gameBuilder.getPlayer2();
        this.field = gameBuilder.getField();
        this.name = gameBuilder.getName();
    }

    public Player getPlayer1() {
        return this.player1;
    }

    public Player getPlayer2() {
        return this.player2;
    }

    public Field<F> getField() {
        return field;
    }

    public String getName() {
        return name;
    }

}
