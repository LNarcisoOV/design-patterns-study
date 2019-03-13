package com.designpatterns.creational.builder;

class BuilderDemo {
	
	public static void main(String args[]){
		Meal veganBurger = prepareVegMeal();
		veganBurger.showItems();
		veganBurger.getCost();
		System.out.println("TOTAL: " + veganBurger.getCost());
		
		System.out.println();
		
		Meal chickenBurguer = prepareNonVegMeal();
		chickenBurguer.showItems();
		System.out.println("TOTAL: " + chickenBurguer.getCost());
	}

	private static Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VeganBurger());
		meal.addItem(new Coke());
		return meal;
	}

	private static Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Soda());
		return meal;
	}
}
