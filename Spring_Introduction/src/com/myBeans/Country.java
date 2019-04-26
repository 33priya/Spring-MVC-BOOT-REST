package com.myBeans;

import java.util.Properties;

public class Country {

	private String name;
	private String continent;
	private Properties state_capitals;

	public void printCapitals() {
		for (String state : state_capitals.stringPropertyNames()) {
			System.out.println(state + ":\t" + state_capitals.getProperty(state));
		}
	}
	
	public Country() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public Properties getState_capitals() {
		return state_capitals;
	}

	public void setState_capitals(Properties state_capitals) {
		this.state_capitals = state_capitals;
	}

}
