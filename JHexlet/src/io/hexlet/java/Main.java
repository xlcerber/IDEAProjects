package io.hexlet.java;

import io.hexlet.java.controller.GameController;
import io.hexlet.java.model.Field;
import io.hexlet.java.model.Point;
import io.hexlet.java.view.AdvancedConcoleView;
import io.hexlet.java.view.ConsoleView;

import io.hexlet.java.model.Board;


public class Main {

    public static void main(String... args) {

        Field field = new Field();
       System.out.println(field.getSize());

        System.out.println(field.getFigure(new Point()));

        Board board = new Board();
        board.initArray();
        board.showBoard();

    	final GameController game = new GameController();
        game.move(2, 2);
    	final ConsoleView consoleView = new ConsoleView(game);
        final ConsoleView advancedConcoleView = new AdvancedConcoleView(game);
    	startGame(consoleView);
        startGame(advancedConcoleView);
    }

    private static void startGame(final ConsoleView consoleView) {
    	consoleView.showGameName();
    }

}
