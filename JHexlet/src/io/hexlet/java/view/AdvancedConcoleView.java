package io.hexlet.java.view;

import io.hexlet.java.controller.GameController;

public class AdvancedConcoleView extends ConsoleView {

    public AdvancedConcoleView(GameController game) {
        super(game);
    }

    @Override
    public void showGameName() {
        System.out.println("***");
        System.out.println(game.getGameName());
    }
}
