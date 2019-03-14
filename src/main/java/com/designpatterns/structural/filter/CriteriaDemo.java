package com.designpatterns.structural.filter;

import java.util.ArrayList;
import java.util.List;

class CriteriaDemo {
	public static void main(String args[]) {
		List<Person> persons = new ArrayList<Person>();

		persons.add(new Person("Robert", "Male", "Single"));
		persons.add(new Person("John", "Male", "Married"));
		persons.add(new Person("Laura", "Female", "Married"));
		persons.add(new Person("Diana", "Female", "Single"));
		persons.add(new Person("Mike", "Male", "Single"));
		persons.add(new Person("Bobby", "Male", "Single"));

		Criteria male = new CriteriaMale();
		Criteria female = new CriteriaFemale();
		Criteria single = new CriteriaSingle();
		Criteria maleSingle = new AndCriteria(male, single);
		Criteria singleOrFamale = new OrCriteria(female, single);

		System.out.println("Males");
		printPersons(male.meetCriteria(persons));
		
		System.out.println("\nFamales");
		printPersons(female.meetCriteria(persons));
		
		System.out.println("\nSingle Males");
		printPersons(maleSingle.meetCriteria(persons));
		
		System.out.println("\nSingle or Famales");
		printPersons(singleOrFamale.meetCriteria(persons));
	}

	public static void printPersons(List<Person> persons) {
		persons.stream().forEach(System.out::println);
	}
}
