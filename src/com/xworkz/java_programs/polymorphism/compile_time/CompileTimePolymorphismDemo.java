package com.xworkz.java_programs.polymorphism.compile_time;

public class CompileTimePolymorphismDemo {

	public static void main(String[] args) {
		short i = 10;
		short j = 20;
		int result = sum(i,j);
		//int result = sum(5,10,10);
		System.out.println(result);

	}
	
	static int sum(int a, int b) {
		return a+b;
	}
	
	static int sum(int a, int b, int c) {
		return a+b+c;
	}
	static int sum(short a, short b) {
		System.out.println("executing method which has short parameter");
		return a+b;
	}

}
