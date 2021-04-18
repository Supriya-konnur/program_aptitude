package com.xworkz.java_programs.apti.apti_pgm2.stra_pattern;
/*
 * * 
  * * 
 * * * 
* * * * 
 * * * 
  * * 
   * 
 */
public class Pattern10 {

	public static void main(String[] args) {
		int noOfLines=7;
		int mid = noOfLines/2;
		int space=mid;
		
		for(int i=0; i<noOfLines-mid; i++) {
			for(int j=0; j<space; j++) {
				System.out.print(" ");
			}
			for(int k=mid-space+1;k>0;k--) {
				System.out.print("* ");
			}
			if(i<mid)
				space--;
			else
				space++;
			System.out.println();
		}

	}

}
