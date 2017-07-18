package io.hexlet.java;


import io.hexlet.java.controller.Game;
import io.hexlet.java.view.ConsoleView;

public class Main {

    public static void main(String... args) {
    	final Game game = new Game();
    	final ConsoleView consoleview = new ConsoleView(game);
    	startGame(consoleview);
    }

    private static void startGame(final ConsoleView consoleview) {
    	consoleView.showGameName();
    }

}