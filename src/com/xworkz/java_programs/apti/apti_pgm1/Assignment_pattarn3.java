package com.xworkz.java_programs.apti.apti_pgm1;
/*
 *                 * 
 *  *           *  * 
 *     *     *     * 
 *        *        * 
 *     *     *     * 
 *  *           *  * 
 *                 * 

 */

public class Assignment_pattarn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lines=7;
		
		for(int i=0; i<lines; i++) {
			for(int j=0; j<lines; j++) {
				if(j == 0 || j == 6 || i == j || i+j == lines-1) {
					System.out.print(" * ");
				}
			
				else {
					System.out.print("   ");
				}
		}
			System.out.println();
		}
	}
}
	

