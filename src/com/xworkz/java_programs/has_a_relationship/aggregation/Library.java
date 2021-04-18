package com.xworkz.java_programs.has_a_relationship.aggregation;

public class Library {
	String name = "Bharathi";
	Student student = new Student();
	
	void maintainBooks() {
		System.out.println("maintains all kinds of books");
	}
	
	void regiter() {
		
		System.out.println("register all visitors");
	}

}
