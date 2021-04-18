package com.xworkz.java_programs.constructor.constructor_chaining.within_same_class;

public class Pen {
	String brand;
	String color;
	
	Pen(){
		this("Renold");
		System.out.println("pen is created with default value");
	}

	Pen(String brand1) {
		this(brand1,"blue");
		System.out.println("a parameterizes constructor");
		brand=brand1;
		
	}

	 Pen(String brand1, String color1) {
		System.out.println("2 parameterizes constructor");
		brand=brand1;
		color =color1;
	}

}
