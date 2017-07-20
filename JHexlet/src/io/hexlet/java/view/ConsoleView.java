package io.hexlet.java.view;

import io.hexlet.java.controller.GameController;
import io.hexlet.java.model.Player;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleView {
	protected final GameController gameController;

	public ConsoleView(final GameController gameController) {
		this.gameController = gameController;
	}

	public void showGameName() {
		System.out.println(gameController.getGameName());
	}

	public void showPlayers() {
		for (Player player : gameController.getPlayers()) {
			System.out.println(player.getPlayer());
		}
	}

	public void ShowBoard() {
		for (int i = 0; i < 3; i++) {
			ShowBoardLine(i);
		}
	}

	public void ShowBoardLine(final int row) {
		for (int i = 0; i < 3; i++) {
			System.out.print(gameController.getBoard().getFigures()[row][i]);
		}
		System.out.println();
	}

	public void Start() {
		getCoordinate("X");
		getCoordinate("Y");
	}

	private int getCoordinate(final String coordinateName) {
		int counter = 3;
		do {
			System.out.print(String.format("Input the coordinate %s ", coordinateName));
			try {
				Scanner in = new Scanner(System.in);
				return in.nextInt();
			} catch (final InputMismatchException e) {
				System.out.println("Coordinate is incorrect");
			}
		} while (counter < 3);

		return -1;
	}
}