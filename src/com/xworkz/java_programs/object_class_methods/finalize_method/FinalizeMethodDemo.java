package com.xworkz.java_programs.object_class_methods.finalize_method;

public class FinalizeMethodDemo {

	public static void main(String[] args) {
		System.out.println("main started");
		Radio radio = new Radio();
		radio.brand= "abc";
		radio.price= 100.00;
		radio=null;
		System.gc();
		System.out.println("main ended");

	}

}
