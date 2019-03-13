package com.designpatterns.creational.singleton;

class SingletonDemo {
	public static void main(String args[]){
		System.out.println("Example of SingletonPattern.");
		SingletonObject singletonObject = SingletonObject.getInstance();
		singletonObject.showMessage();
	}
}
