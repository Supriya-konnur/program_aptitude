package com.xworkz.java_programs.polymorphism.runtime;

public class RuntimePolymorphismDemo {

	public static void main(String[] args) {
		Father f = new Son();
		f.drive();
		
		Father s = new Father();
		s.drive();

	}

}
