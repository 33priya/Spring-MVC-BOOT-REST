package com.myBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoBeanScope {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		MyData myData = (MyData) context.getBean("myData");
		myData.display();
		myData.setData(120);
		System.out.print("After changing data: ");
		myData.display();
		MyData other = (MyData) context.getBean("myData");
		other.display();
	}

}
