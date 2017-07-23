package io.hexlet.java.model;

public class GameBuilder {

    public Player player1;

    public Player player2;

    public Field field;

    public String name;

    public GameBuilder player1(Player player1) {
        this.player1 = player1;
        return this;
    }

    public GameBuilder player2(Player player2) {
        this.player2 = player2;
        return this;
    }

    public GameBuilder field(Field field) {
        this.field = field;
        return this;
    }

    public GameBuilder name(String name) {
        this.name = name;
        return this;
    }


    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public Field getField() {
        return field;
    }

    public String getName() {
        return name;
    }

    public Game build(){
        return new Game(this);
    }

}
