package com.designpatterns.creational.singleton;

class SingletonObject {

	private static SingletonObject singletonObject = new SingletonObject();
	
	private SingletonObject(){}
	
	public static SingletonObject getInstance(){
		return singletonObject;
	}
	
	public void showMessage(){
		System.out.println("Hello world singleton!");
	}
}
