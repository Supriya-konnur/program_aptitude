package com.xworkz.java_programs.apti.apti_number_programs;

public class PrintNumberWithoutLoop {

	public static void main(String[] args) {
		print(1);
	}
	static void print(int n) {
		if(n<=10) {
			System.out.println(n);
		print(n+1);
	}
	}

}
