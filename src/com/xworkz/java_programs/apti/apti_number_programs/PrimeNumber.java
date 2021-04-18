package com.xworkz.java_programs.apti.apti_number_programs;

public class PrimeNumber {

	public static void main(String[] args) {
		int a= 6;
		int count =0;
		for (int i = 2; i < a/2; i++) {
			if(a%i==0)
				count++;
			
		}
		if(count==0) {
			System.out.println("given number is not a primenumber");
			
		}
		else
			System.out.println("given number is a primenumber");

	}

}
