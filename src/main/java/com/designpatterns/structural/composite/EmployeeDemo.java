package com.designpatterns.structural.composite;

class EmployeeDemo {
	public static void main(String... args) {
		Employee ceo = new Employee("John", "CEO", 30000);

		Employee headSales = new Employee("Robert", "Head Sales", 20000);

		Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);

		Employee clerk1 = new Employee("Laura", "Marketing", 10000);
		Employee clerk2 = new Employee("Bob", "Marketing", 10000);

		Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
		Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);

		ceo.add(headSales);
		ceo.add(headMarketing);

		headSales.add(salesExecutive1);
		headSales.add(salesExecutive2);

		headMarketing.add(clerk1);
		headMarketing.add(clerk2);

		System.out.println("CEO: " + ceo);
		System.out.println("CEO subordinates: ");
		ceo.getSubordinates().forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("HEADSALES: " + headSales);
		System.out.println("headSales subordinates: ");
		headSales.getSubordinates().forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("HEADMARKETING: " + headMarketing);
		System.out.println("headMarketing subordinates: ");
		headMarketing.getSubordinates().forEach(System.out::println);
	}
}
