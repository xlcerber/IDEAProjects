package io.hexlet.java;

import io.hexlet.java.controller.CurrentMoveController;
import io.hexlet.java.controller.GameController;
import io.hexlet.java.model.*;
import io.hexlet.java.view.AdvancedConcoleView;
import io.hexlet.java.view.ConsoleView;


public class Main {

    public static void main(String... args) {

        String[][] figures = new String[3][3];
        figures[0][0] = "X";
//        figures[1][1] = "O";

        Field field = new Field(figures);
       System.out.println(field.getSize());


        Board board = new Board();
//        board.initArray();
//        board.showBoard();

        Player[] players = new Player[] {new Player("Max", new Figure("0")),
                new Player("Leo",new Figure("X"))};

    	final GameController gameController = new GameController("XO", players, board);

        final CurrentMoveController currentMoveController = new CurrentMoveController();
         System.out.println(currentMoveController.currentMove(field));

//        gameController.move(2, 2);
//    	final ConsoleView consoleView = new ConsoleView(gameController);
//        final ConsoleView advancedConcoleView = new AdvancedConcoleView(gameController);
//    	startGame(consoleView);
//        startGame(advancedConcoleView);
//        consoleView.showPlayers();
    }

    private static void startGame(final ConsoleView consoleView) {
    	consoleView.showGameName();
    }

}
