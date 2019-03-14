package com.designpatterns.structural.filter;

import java.util.List;
import java.util.stream.Collectors;

class OrCriteria implements Criteria {
	private Criteria criteria;
	private Criteria otherCriteria;

	public OrCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
		List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);

		firstCriteriaItems.addAll(
				otherCriteriaItems.stream().filter(p -> !firstCriteriaItems.contains(p)).collect(Collectors.toList()));

		return firstCriteriaItems;
	}
}
