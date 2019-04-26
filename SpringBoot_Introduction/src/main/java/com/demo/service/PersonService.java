package com.demo.service;

import java.util.List;

import com.demo.beans.Person;

public interface PersonService {
	public List<Person> getAllPerson();
	public Person getPerson(int id);
	public Person addPerson(Person person);
	public Person updatePerson(Person person);
	public Person deletePerson(int id);
}
