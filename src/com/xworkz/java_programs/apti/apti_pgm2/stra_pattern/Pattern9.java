package com.xworkz.java_programs.apti.apti_pgm2.stra_pattern;
/*
 *    * 
     * * 
    * * * 
   * * * * 
  * * * * * 
 * * * * * * 
* * * * * * * 

 */
public class Pattern9 {

	public static void main(String[] args) {
		
		int noOfLines=7;
		int space=noOfLines-1;
		for(int i=0; i<noOfLines; i++) {
			for(int j=0; j<space; j++) {
				System.out.print(" ");
			}
			for(int k=noOfLines-space; k>0; k--) {
				System.out.print("* ");
			}
			space--;
			System.out.println();
		}

	}

}
