package com.demo.dao.impl;

import java.sql.Types;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.Person;
import com.demo.dao.PersonDAO;
import com.demo.dao.mappers.PersonMapper;

@Repository
public class PersonDAOImpl implements PersonDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Person> getAllPerson() {
		String SELECT_ALL_QUERY = "select * from persons";
		return jdbcTemplate.query(SELECT_ALL_QUERY, new PersonMapper());
	}

	@Override
	public Person getPerson(int id) {
		String SELECT_QUERY = "select * from persons where personId = ?";
		try {
			return jdbcTemplate.queryForObject(SELECT_QUERY, new Object[] {id}, new PersonMapper());
		} catch (EmptyResultDataAccessException e) {
			return new Person();
		}
	}

	@Override
	public int addPerson(Person person) {
		String INSERT_QUERY = "insert into persons values(?,?,?)";
		Object[] params = new Object[] {person.getPersonId(), person.getName(), person.getBirthDate()};
		int[] types = {Types.INTEGER, Types.VARCHAR, Types.DATE};
		
		try {
			return jdbcTemplate.update(INSERT_QUERY, params, types);
		} catch (DuplicateKeyException e) {
			System.out.println("exception");
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Person updatePerson(Person person) {
		String UPDATE_QUERY = "update persons set name = ? where personId = ?";
		Object[] params = new Object[] {person.getName(), person.getPersonId()};
		int[] types = {Types.INTEGER, Types.VARCHAR, Types.DATE};
		
		try {
			jdbcTemplate.update(UPDATE_QUERY, params, types);
			return person;
		} catch (DuplicateKeyException e) {
			System.out.println("exception");
			e.printStackTrace();
			return person;
		}
	}

	@Override
	public Person deletePerson(int id) {
		String DELETE_QUERY = "delet * from persons where personId = ?";
		/*try {
			jdbcTemplate.update(DELETE_QUERY, new Object[] {id})
			return ;
		} catch (EmptyResultDataAccessException e) {
			return new Person();
		}*/
		return null;
	}
	
}
