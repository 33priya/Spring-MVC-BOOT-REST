package com.myBeans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyData implements InitializingBean, DisposableBean, BeanPostProcessor {

	private int data;
	private String name;
	
	public MyData() {
		System.out.println("default constructor called");
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		System.out.println("setter called for data:-" + data);
		this.data = data;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setter called for name:-" + name);
		this.name = name;
	}

	public void myInit() {
		System.out.println("custom init method called");
		this.name = "Hello, " + name;
		System.out.println("new name:-" + name);
	}
	
	public void display() {
		System.out.println("data:-" + data + "\t" + "name:-" + name);
	}
	
	public void myDestroy() {
		System.out.println("bean destroyed");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet method called");
		this.name = name + " how are you?";
		this.data = data + 10;
		System.out.println("Modified data:-" + data + "\t" + "name:-" + name);
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("bean destroyed using Disposable Bean");
	}
	
}
