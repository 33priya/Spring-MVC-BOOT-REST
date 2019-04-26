package com.demo.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.beans.Person;
import com.demo.dao.PersonDAO;

@Repository(value = "personDAOJPA")
public class PersonDAOImpl_JPA implements PersonDAO {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Person> getAllPerson() {
		String SELECT_ALL_QUERY = "FROM com.demo.beans.Person as p ORDER BY p.personId";
		return (List<Person>) entityManager.createQuery(SELECT_ALL_QUERY).getResultList();
	}

	@Override
	public Person getPerson(int id) {
		return (Person) entityManager.find(Person.class, id);
	}

	@Transactional
	@Override
	public int addPerson(Person person) {
		entityManager.persist(person);
		return 1;
	}

	@Transactional
	@Override
	public Person updatePerson(Person person) {
		entityManager.persist(person);
		return person;
	}

	@Transactional
	@Override
	public Person deletePerson(int id) {
		Person personToBeDeleted = (Person) entityManager.find(Person.class, id);
		entityManager.remove(personToBeDeleted);
		return personToBeDeleted;
	}

}
