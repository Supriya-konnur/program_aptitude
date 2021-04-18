package com.xworkz.java_programs.object_class_methods.finalize_method;

public class Radio {
	String brand;
	double price;
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize() method overriden");
	}
	
	

}
