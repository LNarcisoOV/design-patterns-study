package com.designpatterns.creational.singletonpattern;

class SingletonPatternDemo {
	public static void main(String args[]){
		SingletonObject singletonObject = SingletonObject.getInstance();
		singletonObject.showMessage();
	}
}
