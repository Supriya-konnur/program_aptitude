package com.xworkz.apti_programs.star_pattern;

public class LeftAngle1 {

	public static void main(String[] args) {
		int num=4;
		
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				if(j==num || i==num ||i+j==num)
					System.out.print("*");
			
			else
				System.out.print(" ");
			}
			System.out.println();
		}
		

	}

}
