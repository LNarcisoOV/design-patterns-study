package com.designpatterns.creational.builder;

class Coke extends ColdDrink {

	public String name() {
		return "COKE";
	}

	@Override
	public float price() {
		return 2.0f;
	}

}
