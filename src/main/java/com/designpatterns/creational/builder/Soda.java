package com.designpatterns.creational.builder;

class Soda extends ColdDrink {

	public String name() {
		return "SODA";
	}

	@Override
	public float price() {
		return 1.55f;
	}

}
