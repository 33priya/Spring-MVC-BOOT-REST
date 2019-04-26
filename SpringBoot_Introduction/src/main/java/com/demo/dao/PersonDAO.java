package com.demo.dao;

import java.util.List;

import com.demo.beans.Person;

public interface PersonDAO {
	public List<Person> getAllPerson();
	public Person getPerson(int id);
	public int addPerson(Person person);
	public Person updatePerson(Person person);
	public Person deletePerson(int id);
}
