package com.xworkz.java_programs.apti.apti_pgm2.stra_pattern;
/*
     *
    * *
   *   *
  *     *
 *       *
***********

 */

public class Pattern11Assignment6 {

	public static void main(String[] args) {

		int noOfLines = 11;
		int mid = noOfLines/2;
		int space=mid;
		int star=1;
		for(int i=0; i<noOfLines-mid; i++) {
			for(int j=0; j<space; j++) {
				System.out.print(" ");
			}
			for(int k=star; k>0; k--) {
				if(k==1 || k==star || k==space-1 || i==mid)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			if(i<mid) {
				space--;
				star=star+2;
			}
//			else {
//				space++;
//				star=star-2;
//			}
			System.out.println();
		}

	}

}
