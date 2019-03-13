package com.designpatterns.structural.bridge;

class RedCircle implements DrawApi {

	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
	}

}
