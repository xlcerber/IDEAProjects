package io.hexlet.java;

import io.hexlet.java.controller.MoveController;
import io.hexlet.java.controller.GameController;
import io.hexlet.java.model.*;
import io.hexlet.java.model.Figure;
import io.hexlet.java.model.exceptions.AlreadyOccupiedException;
import io.hexlet.java.model.exceptions.InvalidPointException;
import io.hexlet.java.view.ConsoleView;


public class Main {

    public static void main(String... args) {

//        Figure[][] figures = new Figure [][] {{Figure.X, null, Figure.O},{null, Figure.O, null},{Figure.O,null,null}};
//        final Field<Figure> field = new Field(figures);

        final Field<Figure> field = new Field<>(3);
//        final WinnerController winnerController = new WinnerController();
//        System.out.println(winnerController.getWinner(field));
//
        Board board = new Board();
//        board.initArray();
//        board.showBoard();

        Player[] players = new Player[] {new Player("Max", Figure.O), new Player("Leo",Figure.X)};
        final GameController gameController = new GameController("XO", players, board);





//        final Player p = new PlayerBuilder().name("Slava").figure(Figure.X).build();
//        final Player p2 = new PlayerBuilder().name("Gleg").figure(Figure.O).build();
//        final Game game= new GameBuilder().player1(p).player2(p2).field(field).name("XO").build();
//
//        final ConsoleView consoleView = new ConsoleView(gameController);
//        consoleView.show(game);
//
//        Str s = new Str();
//        System.out.println(s.task1("Input string"));
//        System.out.println(s.task2("input string to the method test2"));
//        System.out.println(s.task3("input string to the method test2", 't'));

        try {
            field.setFigure (new Point(1, 1), Figure.X);
            MoveController.applyFigure(field, new Point(1, 1), Figure.X);
            throw new RuntimeException("MoveController do not throw Exception when the Point is already occupied.");
        } catch (final AlreadyOccupiedException e) {

        } catch (final InvalidPointException e) {
            throw new RuntimeException("AlreadyOccupiedException was expected (for the point 1, 1 & Figure.X), but got InvalidPointException.");
        }


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
