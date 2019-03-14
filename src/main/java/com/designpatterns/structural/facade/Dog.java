package com.designpatterns.structural.facade;

class Dog implements Action{

	@Override
	public void walk() {
		System.out.println("Dog::walk()");
	}

}
