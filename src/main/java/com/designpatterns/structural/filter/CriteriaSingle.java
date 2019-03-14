package com.designpatterns.structural.filter;

import java.util.List;
import java.util.stream.Collectors;

class CriteriaSingle implements Criteria {

	public List<Person> meetCriteria(List<Person> persons) {
		return persons.stream().filter(p -> p.getMaritalStatus().equalsIgnoreCase("SINGLE"))
				.collect(Collectors.toList());
	}

}
