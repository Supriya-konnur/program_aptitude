package com.xworkz.java_programs.has_a_relationship.aggregation;

public class AggregationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library library = new Library();
		System.out.println("Library name : " +library.name);
		System.out.println("Library has a student : " 
							+library.student.name);

	}

}
