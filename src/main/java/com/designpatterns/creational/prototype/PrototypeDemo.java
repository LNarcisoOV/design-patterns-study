package com.designpatterns.creational.prototype;

class PrototypeDemo {
	public static void main(String... args) {
		ShapeCache.loadCache();

		Shape clonedShape1 = ShapeCache.getShape("1");
		Shape clonedShape2 = ShapeCache.getShape("2");
		System.out.println("Shape : " + clonedShape1.getType());
		System.out.println("Shape : " + clonedShape2.getType());
	}
}
