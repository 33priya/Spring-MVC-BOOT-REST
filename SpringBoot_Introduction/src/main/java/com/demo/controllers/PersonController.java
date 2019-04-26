package com.demo.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.beans.Person;
import com.demo.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@GetMapping("/persons/person")
	public Person getPerson() {
		Date birthDate = new Date(); 
		return new Person("Priya", 18845, birthDate);
	}
	
	@GetMapping("/persons")
	public List<Person> getAllPerson() {
		return personService.getAllPerson();
	}
	
	@GetMapping("/persons/person/{id}")
	public Person getPerson(@PathVariable("id") int id) {
		return personService.getPerson(id);
	}
	
	@PostMapping(name = "/persons", produces = "application/json")
	public Person addPerson(@RequestBody Person person) {
		return personService.addPerson(person);
	}
	
	@PutMapping(name = "/persons", produces = "application/json")
	public Person updatePerson(@RequestBody Person person) {
		return personService.updatePerson(person);
	}
	
	@DeleteMapping("/persons/person/{id}")
	public Person deletePerson(@PathVariable("id") int id) {
		return personService.deletePerson(id);
	}
}
