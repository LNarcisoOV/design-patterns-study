package com.designpatterns.creational.builder;

abstract class ColdDrink implements Item {

	public Packing packing() {
		return new Bottler();
	}

	public abstract float price();

}
