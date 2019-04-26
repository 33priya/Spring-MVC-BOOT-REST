package com.demo.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity(name = "persons_hib")
public class Person {

	@Id
	private int personId;
	@Column
	private String name;
	@Column
	private Date birthDate;
	
	public Person() {
	}
	
	public Person(String name, int personId, Date birthDate) {
		super();
		this.name = name;
		this.personId = personId;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", birthDate=" + birthDate + "]";
	}
	
}
