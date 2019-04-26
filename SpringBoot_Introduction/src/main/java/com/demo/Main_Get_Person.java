package com.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.client.RestTemplate;

import com.demo.beans.Person;

public class Main_Get_Person {

	public static void main(String[] args) {
		RestTemplate template = new RestTemplate();
		Person personResult = template.getForObject("http://localhost:8081/ws/persons/person/18845", Person.class);
		System.out.println(personResult);
		
		/*SimpleDateFormat dateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		Date newDate = null;
		String strDate = "2019-04-26 08:36:11";
		try {
			newDate = dateFormat.parse(strDate);
			System.out.println(newDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Person request = new Person("Priya", 18845, newDate);
		Person insertedPerson = template.postForObject("http://localhost:8081/ws/persons/", request, Person.class);
		
		System.out.println(insertedPerson);*/
	}
}
