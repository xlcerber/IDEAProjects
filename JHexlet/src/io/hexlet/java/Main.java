package io.hexlet.java;

import io.hexlet.java.controller.Game;
import io.hexlet.java.view.AdvancedConcoleView;
import io.hexlet.java.view.ConsoleView;

public class Main {

    public static void main(String... args) {
    	final Game game = new Game();
    	final ConsoleView consoleView = new ConsoleView(game);
        final ConsoleView advancedConcoleView = new AdvancedConcoleView(game);
    	startGame(consoleView);
        startGame(advancedConcoleView);
    }

    private static void startGame(final ConsoleView consoleView) {
    	consoleView.showGameName();
    }

}
