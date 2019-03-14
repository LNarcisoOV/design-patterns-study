package com.designpatterns.structural.filter;

import java.util.List;

interface Criteria {
	List<Person> meetCriteria(List<Person> persons);
}
