package com.designpatterns.creational.factorypattern;

public class FactoryPatternDemo {
	public static void main(String args[]) {
		ShapeFactory sf = new ShapeFactory();

		System.out.println("Example of FactoryPattern.");
		
		Shape shape1 = sf.getShape("CIRCLE");
		shape1.draw();

		Shape shape2 = sf.getShape("RECTANGLE");
		shape2.draw();
	}
}
