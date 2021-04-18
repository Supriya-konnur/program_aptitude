package com.xworkz.java_programs.apti.apti_number_programs;

public class PerfectNumber {

	public static void main(String[] args) {
		int num = 28;
		int sum= 0;
		for (int i = 1; i <= num/2; i++) {
			if(num%i==0)
				sum+=i;
		}
		if(num==sum)
			System.out.println(num+" is a PerfectNumber");
		else
			System.out.println(num+" is not a PerfectNumber");

	}

}
