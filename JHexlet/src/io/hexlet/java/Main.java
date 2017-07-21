package io.hexlet.java;

import io.hexlet.java.controller.CurrentMoveController;
import io.hexlet.java.controller.GameController;
import io.hexlet.java.controller.WinnerController;
import io.hexlet.java.model.*;
import io.hexlet.java.view.AdvancedConcoleView;
import io.hexlet.java.view.ConsoleView;


public class Main {

    public static void main(String... args) {

        String [][] figures = new String [][] {{"X",null,"O"},{null,"O",null},{"O",null,null}};

        final Field field = new Field(figures);
        final WinnerController winnerController = new WinnerController();
        System.out.println(winnerController.getWinner(field));
        
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
