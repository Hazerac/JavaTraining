package org.mma.training.java;

public class Teacher {

	// 1. Declare Variables
	private int id;
	private String name;
	private String department;
	private String title;

	// 2. No-Arg Constructor
	public Teacher() {}

	// 3.Field Constructor
	public Teacher(int id, String name, String department, String title) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.title = title;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	// 5. To-String
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", department=" + department + ", title=" + title + "]";
	}







}
