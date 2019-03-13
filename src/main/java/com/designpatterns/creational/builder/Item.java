package com.designpatterns.creational.builder;

abstract interface Item {
	public String name();
	public Packing packing();
	public float price();
}
