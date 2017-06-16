package ru.vladosik.example.classes;

public class Coordinate {
	private int x;
	private int y;

	public Coordinate() {
		x = 20;
		y = 40;
	}

	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}
