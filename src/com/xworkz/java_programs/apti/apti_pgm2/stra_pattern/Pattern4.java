package com.xworkz.java_programs.apti.apti_pgm2.stra_pattern;
/*
   *
  *
 *
** * * 
 *
  *
   *

 */
public class Pattern4 {

	public static void main(String[] args) {
		int noOfLines = 7;
		int mid = noOfLines/2;
		int space = mid;
		
		for(int i=0; i<noOfLines; i++) {
			for(int j=0; j<space; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
		
		if(i<mid) {
			space--;
		}
		else if(i==mid) {
			for(int k=1; k<=mid; k++)
			System.out.print("* ");
			space++;
		}
		else {
			space++;
		}
		System.out.println();
		}
		

	}

}
