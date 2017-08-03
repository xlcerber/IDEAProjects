package io.hexlet.java.model;

public class Player {

	private final String playerName;

   private final Figure playerFigure;
//	private final String playerFigure;

	public Player(final String playerName, final Figure playerFigure) {
		this.playerName = playerName;
		this.playerFigure = playerFigure;
	}

	Player (PlayerBuilder playerBuilder) {
		this.playerName = playerBuilder.getName();
		this.playerFigure = playerBuilder.getFigure();
	}

	public String getPlayer() {
		return this.playerName;
	}

	public Figure getFigure() {
		return playerFigure;
	}


}




