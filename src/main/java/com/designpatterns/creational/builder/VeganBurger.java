package com.designpatterns.creational.builder;

class VeganBurger extends Burger {

	public String name() {
		return "VEGAN BURGUER";
	}

	@Override
	public float price() {
		return 12.30f;
	}

}
