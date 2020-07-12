package org.mma.training.java;

public class CollegeTest {

	public static void main(String[] args) {
		
		//No-Arg-Constructor
		College college = new College();
		college.setCode("GMU");
		college.setName("George Mason University");
		college.setAddress("123 Main St");
		college.setEstablished(1949);
		
		Teacher teacher = new Teacher(123, "Mohammed Islam", "CIS", "Associate Professor");
		college.setTeacher(teacher);
		
		System.out.println(college);
		
		College college1 = new College();
		college1.setCode("GMU");
		college1.setName("George Mason University");
		college1.setAddress("123 Main St");
		college1.setEstablished(1949);
		
		Teacher teacher1 = new Teacher(123, "Mohammed Islam", "CIS", "Associate Professor");
		college.setTeacher(teacher1);
		
		System.out.println(college1);
	}

}
