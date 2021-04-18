package com.xworkz.java_programs.apti.apti_pgm2.alphabet_pattern;
/* 
 * a 
   b c 
   d e f 
   g h i j 
   k l m n o 

 */
public class Pattern13Assignment {

	public static void main(String[] args) {
		
		int noOfLines =5;
		char c = 'a';
		for(int i=0; i<noOfLines; i++) {
			
			for(int j=0; j<=i; j++) {
				System.out.print(c +" ");
				c++;
			}
			System.out.println();
		}

	}

}
