package com.oops;

public class StudentDemo {

	public static void main(String[] args) {
		 
		Student student1 = new Student();
		student1.Name = "praveen";
		student1.rollNo = 123456;
		
		System.out.println("student name is"+student1.Name);
		System.out.println("student rollNo is" + student1.rollNo);
		
		Student student2 = new Student();
		student1.Name = "dinu";
		student1.rollNo = 8765434;
		
		System.out.println("student name is"+student1.Name);
		System.out.println("student rollNo is" + student1.rollNo);
	}
}
