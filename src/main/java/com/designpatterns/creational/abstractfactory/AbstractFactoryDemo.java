package com.designpatterns.creational.abstractfactory;

class AbstractFactoryDemo {
	public static void main(String args[]) {
		
		System.out.println("Example of AbstractFactoryPattern.");
		
		AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
		AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);
		
		Shape shape1 = shapeFactory.getShape("RECTANGLE");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("CIRCLE");
		shape2.draw();
		
		Shape shape3 = roundedShapeFactory.getShape("RECTANGLE");
		shape3.draw();
		
		Shape shape4 = roundedShapeFactory.getShape("CIRCLE");
		shape4.draw();
	}
}
