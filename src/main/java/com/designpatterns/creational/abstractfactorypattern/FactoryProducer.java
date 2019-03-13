package com.designpatterns.creational.abstractfactorypattern;

class FactoryProducer {

	static AbstractFactory getFactory(boolean rounded){
		if(rounded){
			return new RoundedShapeFactory();
		}else{
			return new ShapeFactory();
		}
	}
}
