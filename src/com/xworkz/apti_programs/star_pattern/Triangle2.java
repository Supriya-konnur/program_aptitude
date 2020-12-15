package com.xworkz.apti_programs.star_pattern;

public class Triangle2 {

	public static void main(String[] args) {

		int num=4;
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				if(j>=i && i+j>=num)
					System.out.print("*");
			
			else
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
