package com.xworkz.java_programs.apti.apti_pgm2.number_pattern;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int result=0;
		int numCopy=num;
		while(num>0) {
		int rem=num%10;
		num/=10;
		result+=(rem*rem*rem);
		}

	
	if(result==numCopy)
		System.out.println(numCopy+" is a arm strong number");
	else
		System.out.println(numCopy+" is not a arm strong number");
	}
}
