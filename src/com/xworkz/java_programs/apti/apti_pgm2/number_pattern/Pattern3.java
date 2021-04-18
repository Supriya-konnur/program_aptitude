package com.xworkz.java_programs.apti.apti_pgm2.number_pattern;
/*
 * 1
  21
 321
4321

 */
public class Pattern3 {

	public static void main(String[] args) {
		int noOfLines=4;
		int space = noOfLines-1;
		
		for(int i=0; i<noOfLines; i++) {
			for (int j=0; j<space; j++) {
				System.out.print(" ");
			}
			for(int k=noOfLines-space; k>0; k--) {
				System.out.print(k);
			}
			space--;
			System.out.println();
		}
		

	}

}
