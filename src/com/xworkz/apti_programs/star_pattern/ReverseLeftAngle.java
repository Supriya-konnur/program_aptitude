package com.xworkz.java_programs.aptitude_programs.star_pattern;

public class ReverseLeftAngle {

	public static void main(String[] args) {
		int num=4;

		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				if(j>=i)
					System.out.print("*");
			
			else
				System.out.print(" ");
			}
			System.out.println();
		}
		


	}

}
