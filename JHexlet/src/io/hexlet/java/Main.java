package io.hexlet.java;

import io.hexlet.java.controller.CurrentMoveController;
import io.hexlet.java.controller.GameController;
import io.hexlet.java.controller.WinnerController;
import io.hexlet.java.model.*;
import io.hexlet.java.model.Figure;
import io.hexlet.java.view.AdvancedConcoleView;
import io.hexlet.java.view.ConsoleView;


public class Main {

    public static void main(String... args) {

        Figure[][] figures = new Figure [][] {{Figure.X, null, Figure.O},{null, Figure.O, null},{Figure.O,null,null}};

        final Field field = new Field(figures);
        final WinnerController winnerController = new WinnerController();
        System.out.println(winnerController.getWinner(field));
        
        Board board = new Board();
//        board.initArray();
//        board.showBoard();


        Player[] players = new Player[] {new Player("Max", Figure.O),
                new Player("Leo",Figure.X)};

//        Figure f = Figure.X;

/*        int f0 = Figure.X.getFigure();

        String a;
                = new Char("X");

        switch (a.toLowerCase()) {
            case "X": {
                System.out.println("X");
                break;
            }

        }*/

    	final GameController gameController = new GameController("XO", players, board);

        final Player p = new PlayerBuilder().name("Slava").figure(Figure.X).build();
        final Player p2 = new PlayerBuilder().name("Gleg").figure(Figure.O).build();
        final Game game= new GameBuilder().player1(p).player2(p2).field(field).name("XO").build();

        final ConsoleView consoleView = new ConsoleView(gameController);
        consoleView.show(game);




//        final CurrentMoveController currentMoveController = new CurrentMoveController();
//        System.out.println(currentMoveController.currentMove(field));

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
