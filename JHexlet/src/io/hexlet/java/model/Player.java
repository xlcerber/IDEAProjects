package io.hexlet.java.model;

public class Player {

	private final String name;

	private final Figure figure;

	public Player(final String name, Figure figure) {
		this.name = name;
		this.figure = figure;
	}
}