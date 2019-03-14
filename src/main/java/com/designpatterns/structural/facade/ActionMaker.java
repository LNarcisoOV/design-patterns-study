package com.designpatterns.structural.facade;

class ActionMaker {
	private Action cat;
	private Action dog;
	private Action chicken;

	public ActionMaker() {
		this.cat = new Cat();
		this.dog = new Dog();
		this.chicken = new Chicken();
	}

	public void catWalk() {
		cat.walk();
	}

	public void dogWalk() {
		dog.walk();
	}

	public void chickenWalk() {
		chicken.walk();
	}
}
