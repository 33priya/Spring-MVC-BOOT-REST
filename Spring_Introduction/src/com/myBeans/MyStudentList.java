package com.myBeans;

import java.util.List;

public class MyStudentList {

	private List<Student> students;

	public MyStudentList() {}
	
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public void display() {
		students.stream().forEach(System.out::println);
	}
	
}
