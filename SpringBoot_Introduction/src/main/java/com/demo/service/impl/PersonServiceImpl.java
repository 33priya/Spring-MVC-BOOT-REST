package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.demo.beans.Person;
import com.demo.dao.PersonDAO;
import com.demo.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	@Qualifier("personDAOJPA")
	private PersonDAO personDAO;
	
	@Override
	public List<Person> getAllPerson() {
		return personDAO.getAllPerson();
	}

	@Override
	public Person getPerson(int id) {
		return personDAO.getPerson(id);
	}

	@Override
	public Person addPerson(Person person) {
		int rows = personDAO.addPerson(person);
		System.out.println(rows > 0 ? "record inserted" : "error");
		return person;
	}

	@Override
	public Person updatePerson(Person person) {
		return personDAO.updatePerson(person);
	}

	@Override
	public Person deletePerson(int id) {
		return personDAO.deletePerson(id);
	}

}
