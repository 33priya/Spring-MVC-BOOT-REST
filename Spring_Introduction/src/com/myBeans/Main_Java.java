package com.myBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_Java {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		MyData myData = (MyData) context.getBean("myData");
//		Instantiating  object of a class using Interface
//		MyInterface myData = (MyInterface) context.getBean("myData");
		
//		Instantiating object of a class using Spring
//		MyData myData = (MyData) context.getBean("obj");
		
		//Traditional way to create object of a class
		/*MyData myData = new MyData();
		myData.setData(55);
		myData.setName("XYZ");*/
		
//		myData.display();
		
		//Setter Injection
		/*Student student = (Student) context.getBean("stu");
		System.out.println(student);*/
		//Constructor Injection
		/*Student student_constructor = (Student) context.getBean("stu_constructor");
		System.out.println(student_constructor);*/
		
		/*Address address = (Address) context.getBean("address");
		System.out.println(address);*/
		
		/*MyStudentList list  = (MyStudentList) context.getBean("students_list");
		list.display();
		System.out.println("**************************************");
		MyStudentSet set  = (MyStudentSet) context.getBean("students_set");
		set.display();*/
		
		/*System.out.println("**************************************");
		DemoMap map  = (DemoMap) context.getBean("student_map");
		map.display();*/
		
		System.out.println("**************************************");
		Country country = (Country) context.getBean("country");
		country.printCapitals();
	}

}
