package com.designpatterns.creational.builder;

class ChickenBurger extends Burger {

	public String name() {
		return "CHICKEN BURGUER";
	}

	@Override
	public float price() {
		return 19.30f;
	}

}
