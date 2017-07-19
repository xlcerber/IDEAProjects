package io.hexlet.java.view;

import io.hexlet.java.controller.Game;

public class AdvancedConcoleView extends ConsoleView {

    public AdvancedConcoleView(Game game) {
        super(game);
    }

    @Override
    public void showGameName() {
        System.out.println("***");
        System.out.println(game.getGameName());
    }
}
