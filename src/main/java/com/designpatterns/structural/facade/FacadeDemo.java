package com.designpatterns.structural.facade;

class FacadeDemo {
	public static void main(String[] args) {
		ActionMaker action = new ActionMaker();
		
		action.catWalk();
		action.dogWalk();
		action.chickenWalk();
	}
}
