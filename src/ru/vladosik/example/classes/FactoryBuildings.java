package ru.vladosik.example.classes;

import java.util.HashMap;

import ru.vladosik.example.interfaces.Building;

public final class FactoryBuildings {
	private static final HashMap<String, Cottage> cottages;
	private static final HashMap<String, Skyscraper> skyscrapers;

	private FactoryBuildings() {
	}
	static {
		cottages = new HashMap<>();
		cottages.put("type1", new Cottage(3, "wood"));
		skyscrapers = new HashMap<>();
		skyscrapers.put("type1", new Skyscraper(40));
	}

	public static Building getCottage(String type) {
		Cottage cottage = (Cottage) cottages.get(type);
		if (cottage == null) {
			cottage = new Cottage();
			cottages.put(type, cottage);
		}
		return cottage;
	}

	public static Building getSkyscraper(String type) {
		Skyscraper skyscraper = (Skyscraper) skyscrapers.get(type);
		if (skyscraper == null) {
			skyscraper = new Skyscraper();
			skyscrapers.put(type, skyscraper);
		}
		return skyscraper;

}
}
