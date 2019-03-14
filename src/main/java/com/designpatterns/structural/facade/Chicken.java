package com.designpatterns.structural.facade;

class Chicken implements Action {

	@Override
	public void walk() {
		System.out.println("Chicken::walk()");
	}

}
