package com.xworkz.apti_programs.number_program;

import java.util.logging.Logger;

public class PrimeNumberUsingWhileLoop {


	public static void main(String[] args) {
		int num= 4;
		int i=2;
		int count =0;

		while(i<=num/2) {	
		if(num%i==0) {
				count++;
			break;
			
		}
		i++;
		}
	System.out.println("number itration= "+i);

		if(count==0) {
	System.out.println("given number is a primenumber");
			
		}
		else
			System.out.println("given number is not a primenumber");


	}

}
