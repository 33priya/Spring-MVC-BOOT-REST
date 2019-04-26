package com.demo.dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.demo.beans.Person;

public class PersonMapper implements RowMapper<Person> {

	@Override
	public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
		Person person = new Person();
		person.setPersonId(rs.getInt(1));
		person.setName(rs.getString(2));
		person.setBirthDate(rs.getDate(3));
		return person;
	}

}
