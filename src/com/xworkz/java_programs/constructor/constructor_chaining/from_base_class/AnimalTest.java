package com.xworkz.java_programs.constructor.constructor_chaining.from_base_class;

public class AnimalTest {

	public static void main(String[] args) {
		Cat cat = new Cat("siri");
		
		System.out.println("cat name is:"+cat.name);
		System.out.println("cat has " +cat.legs+ " legs");

	}

}
