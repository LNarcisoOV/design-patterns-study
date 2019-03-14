package com.designpatterns.structural.filter;

import java.util.List;
import java.util.stream.Collectors;

class CriteriaFemale implements Criteria{

	public List<Person> meetCriteria(List<Person> persons) {
		return persons.stream().filter(p -> p.getGender().equalsIgnoreCase("FEMALE"))
				.collect(Collectors.toList());
	}

}
