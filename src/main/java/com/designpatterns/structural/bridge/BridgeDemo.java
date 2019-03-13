package com.designpatterns.structural.bridge;

class BridgeDemo {
	public static void main(String[] args) {
		Shape redCircle = new Circle(152, 168, 1, new RedCircle());
		Shape greenCircle = new Circle(101, 666, 78, new GreenCircle());
		
		redCircle.draw();
		greenCircle.draw();
	}
}
