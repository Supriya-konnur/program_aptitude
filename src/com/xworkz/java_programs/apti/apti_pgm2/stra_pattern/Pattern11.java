package com.xworkz.java_programs.apti.apti_pgm2.stra_pattern;
/*
   *
  ***
 *****
*******
 *****
  ***
   *

 */
public class Pattern11 {

	public static void main(String[] args) {
		int noOfLines = 7;
		int mid = noOfLines/2;
		int space=mid;
		int star=1;
		for(int i=0; i<noOfLines; i++) {
			for(int j=0; j<space; j++) {
				System.out.print(" ");
			}
			for(int k=star; k>0; k--) {
				System.out.print("*");
			}
			if(i<mid) {
				space--;
				star=star+2;
			}
			else {
				space++;
				star=star-2;
			}
			System.out.println();
		}

	}

}
