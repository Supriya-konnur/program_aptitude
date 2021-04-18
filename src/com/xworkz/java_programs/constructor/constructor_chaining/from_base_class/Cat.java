package com.xworkz.java_programs.constructor.constructor_chaining.from_base_class;

public class Cat extends Animal{
	String name;
	
	Cat(){
		super(4);
		
		System.out.println("cat is created");
	}
	
	Cat(String name1){
		super(4);
		name=name1;
		System.out.println("a parameterizes constructor");
	}
	
}
