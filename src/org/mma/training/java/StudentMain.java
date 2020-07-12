package org.mma.training.java;

public class StudentMain {

	public static void main(String[] args) {
	
		
		//No-Arg-Constructor  
		Student student = new Student();
		student.setId(001);
		student.setName("Hazera");
		student.setMajor("IT");
		student.setYear("Freshman");
		
		// Field Constructor
		Student student1 = new Student(002, "Obaid", "ComputerScience", "Senior");
		Student student2 = new Student(003, "Laaibah", "MED", "Junior");
		Student student3 = new Student(004, "Saibah", "Pharmacy", "Freshman");
		Student student4 = new Student(005, "Ismail", "PA", "Freshman");
		Student student5 = new Student(006, "Khadijah", "Pharmacy", "Freshman");
		
		System.out.println(student.getId() + " "+ student.getName() + " " + student.getMajor() + " " + student.getYear());
		System.out.println(student1.getId() + " "+ student1.getName() + " " + student1.getMajor() + " " + student1.getYear());
		System.out.println(student2.getId() + " "+ student2.getName() + " " + student2.getMajor() + " " + student2.getYear());
		System.out.println(student3.getId() + " "+ student3.getName() + " " + student3.getMajor() + " " + student3.getYear());
		System.out.println(student4.getId() + " "+ student4.getName() + " " + student4.getMajor() + " " + student4.getYear());
		System.out.println(student5.getId() + " "+ student5.getName() + " " + student5.getMajor() + " " + student5.getYear());
		
		//System.out.println("student "+ student.toString());
		//System.out.println(student.getName()+" " + student.getMajor());
		//System.out.println("student1 " + student1.toString());
		
	}

}


