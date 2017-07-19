package io.hexlet.java.controller;

import io.hexlet.java.model.Figure;
import io.hexlet.java.model.Player;

public class GameController {
	public static final String GAME_NAME = "XO";

	private static final int MIN_COORDINATE = 0;

	private static final int MAX_COORDINATE = 3;

	private Player[] players = new Player[] {new Player("Max", new Figure("0")),
			new Player("Leo",new Figure("X"))};

	public String getGameName() {
		return GAME_NAME;
	}

	public Player currentPlayer() {
		return null;
	}

	public boolean move(final int x, final int y)  {

		assert x >= 0;
		assert y >= 0;

		if (!checkCoordinate(x) || !checkCoordinate(y)) {
			return false;
		}

		//TODO

		return true;
	}

	public Player[] getPlayers () {
		return players;
	}

	private static boolean checkCoordinate (final int coordinate) {
		if (coordinate < MIN_COORDINATE || coordinate > MAX_COORDINATE) {
			return false;
		}

		return true;
	}
}
