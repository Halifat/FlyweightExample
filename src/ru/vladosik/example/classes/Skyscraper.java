package ru.vladosik.example.classes;

import ru.vladosik.example.interfaces.Building;

public class Skyscraper implements Building {
	private int floors;

	public Skyscraper() {
		floors = 50;
	}

	public Skyscraper(int floors) {
		this.floors = floors;
	}

	@Override
	public void build(Coordinate coordinates) {
		System.out.println("Skyscraper " + floors + " floors " + ";" + "(" + coordinates.getX() + ";" + coordinates.getY() + ")");
	}

}
