package io.hexlet.java.controller;

import io.hexlet.java.model.Board;
import io.hexlet.java.model.Figure;
import io.hexlet.java.model.Player;

public class GameController {
	private final String gameName;

	private final Board board;

	private static final int MIN_COORDINATE = 0;

	private static final int MAX_COORDINATE = 3;

	private final Player[] players;

	public GameController(final String gameName, final Player[] players, Board board) {
		this.players = players;

		this.board = board;

		if (gameName == null || gameName.isEmpty()) {
			this.gameName = "XO";
		} else {
			this.gameName = gameName;
		}


	}

	public Board getBoard() {
		return board;
	}

	public String getGameName() {
		return gameName;
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
