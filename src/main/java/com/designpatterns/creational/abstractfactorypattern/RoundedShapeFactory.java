package com.designpatterns.creational.abstractfactorypattern;

class RoundedShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new RoundedRectangle();
		} else if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new RoundedCircle();
		}
		return null;
	}

}
