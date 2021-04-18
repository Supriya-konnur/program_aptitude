package com.xworkz.java_programs.apti.apti_pgm1;
/*        *
 *        *
 *        *
 *  * * * * * * *
 *        *
 *        *
 *        *
 */      
      

public class Assignment_pattarn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				if(i == 3 || j == 3 ) {
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
