package com.xworkz.java_programs.apti.apti_number_programs;

public class PerfectSquare {

	public static void main(String[] args) {
		int num = 48;
		int count= 0;
		for (int i = 1; i <= num/2; i++) {
			if(i*i==num)
				count++;
	}
		if(count==0)
			System.out.println(num+ " is not a PerfectSquare");
		else
			System.out.println(num+ " is  a PerfectSquare");

	}
}
