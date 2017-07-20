package io.hexlet.java.model;

public class Player {

	private final String playerName;

	private final Figure playerFigure;

	public Player(final String playerName, final Figure playerFigure) {
		this.playerName = playerName;
		this.playerFigure = playerFigure;
	}

	public String getPlayer() {
		return this.playerName;
	}
}