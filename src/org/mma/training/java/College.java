package org.mma.training.java;

//POJO -- Plain Old Java Object

public class College {
	
	// 1. Declare Variables 
	private String code; // Java Sting data type
	private String name;
	private String address;
	private int established; // Primitive data type
	private Teacher teacher; // Teacher user-defined data type
	
	// 2. No-Arg Constructor
	public College() {}
	
	// 3.Field Constructor
	public College(String code, String name, String address, int established, Teacher teacher) {
		super();
		this.code = code;
		this.name = name;
		this.address = address;
		this.established = established;
		this.teacher = teacher;
	}
	
	// 4. Getters & Setters
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getEstablished() {
		return established;
	}

	public void setEstablished(int established) {
		this.established = established;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	// 5. To-String
	@Override
	public String toString() {
		return "College [code=" + code + ", name=" + name + ", address=" + address + ", established=" + established
				+ ", teacher=" + teacher + "]";
	}
	

	

	
	
	
	
}
