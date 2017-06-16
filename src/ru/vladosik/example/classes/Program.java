package ru.vladosik.example.classes;

import ru.vladosik.example.interfaces.Building;

public class Program {

	public static void main(String[] args) {
		Coordinate coordinate = new Coordinate(50, 120);
		Building building = FactoryBuildings.getCottage("type1");
		building.build(coordinate);
		System.out.println(building.hashCode());
		System.out.println(building.getClass());
		coordinate = new Coordinate();
		building = (Skyscraper) FactoryBuildings.getSkyscraper("type451");
		System.out.println(building.hashCode());
		System.out.println(building.getClass());
		building.build(coordinate);
		building = FactoryBuildings.getCottage("type1");
		System.out.println(building.hashCode());
		System.out.println(building.getClass());
		building.build(coordinate);

	}

}
