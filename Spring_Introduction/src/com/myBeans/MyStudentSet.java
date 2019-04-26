package com.myBeans;

import java.util.Set;

public class MyStudentSet {

	private Set<Student> students;

	public MyStudentSet() {
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public void display() {
		students.stream().forEach(System.out::println);
	}

}
