package com.myBeans;

public class MyData /*implements MyInterface */{

	private int data;
	private String name;
	
	public MyData() {}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println("data:-" + data + "\t" + "name:-" + name);
	}
}
