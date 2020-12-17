package com.xworkz.apti_programs.star_pattern;

public class Pattern {

	public static void main(String[] args) {
		int num =5;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if(i==j || i+j==num)
					System.out.print("*");
				else if(i==0 || j==0 || j==num || i==num) {
					System.out.print("@");
				}
				else
					System.out.print("_");
			}
			System.out.println();
			
			
		}

	}

}
