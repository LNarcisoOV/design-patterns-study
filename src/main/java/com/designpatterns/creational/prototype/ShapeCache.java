package com.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

class ShapeCache {
	private static Map<String, Shape> shapeMap = new HashMap<String, Shape>();

	static Shape getShape(String shapeId) {
		Shape cachedShape = shapeMap.get(shapeId);
		return (Shape) cachedShape.clone();
	}

	static void loadCache() {
		Square square = new Square();
		square.setId("1");
		shapeMap.put(square.getId(), square);

		Rectangle rectangle = new Rectangle();
		rectangle.setId("2");
		shapeMap.put(rectangle.getId(), rectangle);
	}
}
