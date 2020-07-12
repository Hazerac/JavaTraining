package org.mma.training.java;

// POJO --- Plain Old Java Object

public class Student {

	// 1.Declare Variables
	private int id;
	private String name;
	private String major;
	private String year;
	
	// 2. No-Arg Constructor
	public Student() {}
	
	// 3.Field Constructor
	public Student(int id, String name, String major, String year) {
		super();
		this.id = id;
		this.name = name;
		this.major = major;
		this.year = year;
	}

	// 4. Getters & Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	// 5. To-String
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", major=" + major + ", year=" + year + "]";
	}
	
}
