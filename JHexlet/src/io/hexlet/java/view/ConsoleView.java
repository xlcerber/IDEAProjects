package io.hexlet.java.view;

import io.hexlet.java.controller.GameController;
import io.hexlet.java.model.*;
import io.hexlet.java.model.Player;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleView implements ICoordinateGetter {
	protected final GameController gameController;

	@Override
	public Point getMoveCoordinate(final Field<Figure> field) {
		return new Point(0, 0);
	}

	public ConsoleView(final GameController gameController) {
		this.gameController = gameController;
	}

	public void showGameName() {
		System.out.println(gameController.getGameName());
	}

	public void show(final Game game) {
		final Field<Figure> field = game.getField();
		final StringBuilder fieldBuilder = new StringBuilder();
		for (int x = 0; x < field.getSize(); x++) {
			if (x != 0)
				generateSeparator(fieldBuilder);
			generateLine(field, x, fieldBuilder);
		}
		System.out.println(fieldBuilder.toString());
	}

	public boolean move(final Game game) {
		return true;
	}

	void generateLine(final Field<Figure> field,
					  final int x,
					  final StringBuilder sb) {

		for (int y = 0; y < field.getSize(); y ++ ) {
			String figure;
			try {
				figure = field.getFigure(new Point(y, x)).toString();
			}
			catch (Exception e ) {
				figure = " ";
			};

			sb.append(" ").append(figure).append(" ");

			if (y != field.getSize() - 1) {
				sb.append("|");
			} else sb.append("\n");
		}
	}


	void generateSeparator(final StringBuilder sb) {
		// BEGIN (write your solution here)
		sb.append("~~~~~~~~~~~\n");
		// END
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