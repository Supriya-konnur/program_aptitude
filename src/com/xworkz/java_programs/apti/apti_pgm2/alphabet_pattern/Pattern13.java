package com.xworkz.java_programs.apti.apti_pgm2.alphabet_pattern;
/*
 * a 
   a b 
   a b c 
   a b c d 

 */

public class Pattern13 {

	public static void main(String[] args) {
		int noOfLines =4;
	
		for(int i=0; i<noOfLines; i++) {
			char c = 'a';
			
			for(int j=0; j<=i; j++) {
				System.out.print(c +" ");
				c++;
			}
			System.out.println();
		}

	}

}
