package com.myBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component(value = "obj")
public class MyClass implements BeanPostProcessor {
	
	@Value(value = "100")
	private int id;
	
	@Value(value = "Sync")
	private String name;
	
	@Autowired
	@Qualifier(value="address1")
	private Address address;
	
	/*public void display() {
		System.out.println("Welcome to annotation: " + address);
	}*/

	@Override
	public String toString() {
		return "MyClass [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
