package com.myBeans;

import java.util.Map;

public class DemoMap {
	private Map<String, Student> map;
	
	public DemoMap() {
	}
	
	public Map<String, Student> getMap() {
		return map;
	}

	public void setMap(Map<String, Student> map) {
		this.map = map;
	}
	
	public void display() {
		map.entrySet().forEach(System.out::println);
	}

}
