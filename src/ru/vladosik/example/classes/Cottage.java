package ru.vladosik.example.classes;

import ru.vladosik.example.interfaces.Building;

public class Cottage implements Building {
	private int floors;
	private String material;

	public Cottage() {
		floors = 2;
		material = "brick";
	}

	public Cottage(int floors, String material) {
		this.floors = floors;
		this.material = material;
	}

	@Override
	public void build(Coordinate coordinates) {
		System.out.println("Cottage " + floors + " floors " + material + ";" + "(" + coordinates.getX() + ";" + coordinates.getY() + ")");
	}

}
