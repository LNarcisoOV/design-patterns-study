package com.designpatterns.structural.facade;

class Cat implements Action {

	@Override
	public void walk() {
		System.out.println("Cat::walk()");
	}

}
