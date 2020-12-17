package com.xworkz.apti_programs.number_program;

public class PrimeNumberUsingForLoop {

	public static void main(String[] args) {
		int num= 12;
		int count =0;
		for (int i = 2; i < num/2; i++) {
			if(num%i==0)
				count++;
			break;
			
		}
		if(count==0) {
			System.out.println("given number is a primenumber");
			
		}
		else
			System.out.println("given number is not a primenumber");


	}

}
