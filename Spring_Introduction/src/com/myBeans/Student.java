package com.myBeans;

public class Student {

	private String name;
	private int rollNo;
	private int std;
	private Address address;
	
	public Student() {}

	public Student(String name, int rollNo, int std) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.std = std;
	}
	
	public Student(String name, int rollNo, int std, Address address) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.std = std;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", std=" + std + ", address=" + address + "]";
	}

}
