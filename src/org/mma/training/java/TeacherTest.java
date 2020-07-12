package org.mma.training.java;

public class TeacherTest {

	public static void main(String[] args) {
		
		//No-Arg-Constructor 
		Teacher teacher = new Teacher();
		teacher.setId(123);
		teacher.setName("Mohammed Khan");
		teacher.setDepartment("IT");
		teacher.setTitle("Associate Professor");
		
		// Field Constructor
		
		Teacher teacher1 = new Teacher(02, "Ahmed Khan", "CIS", "Associate professor");
		Teacher teacher2 = new Teacher(03, "John Tom", "IT", "Professor");
		Teacher teacher3 = new Teacher(04, "Nansy Pom", "NFS", "Associate professor");
		Teacher teacher4 = new Teacher(05, "Tomas Jon", "English", "Professor");
		Teacher teacher5 = new Teacher(06, "Hanry King", "Math", "Associate professor");
		
		System.out.println(teacher1.getId() + " " + teacher1.getName() + " " + teacher1.getDepartment() + " " + teacher1.getTitle());
		System.out.println(teacher2.getId() + " " + teacher2.getName() + " " + teacher2.getDepartment() + " " + teacher2.getTitle());
		System.out.println(teacher3.getId() + " " + teacher3.getName() + " " + teacher3.getDepartment() + " " + teacher3.getTitle());
		System.out.println(teacher4.getId() + " " + teacher4.getName() + " " + teacher4.getDepartment() + " " + teacher4.getTitle());
		System.out.println(teacher5.getId() + " " + teacher5.getName() + " " + teacher5.getDepartment() + " " + teacher5.getTitle());

	}

}

