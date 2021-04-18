package com.xworkz.java_programs.object_class_methods.equals_method;

public class BookTest {

	public static void main(String[] args) {
		Book book1 = new Book("classmate", 100, 40.00 );
		Book book2 = new Book("classmate", 100, 40.00 );
		boolean isEqual =book1.equals(book2);
		System.out.println(isEqual);

	}

}
