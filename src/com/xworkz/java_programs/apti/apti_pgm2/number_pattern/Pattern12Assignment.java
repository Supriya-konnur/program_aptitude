package com.xworkz.java_programs.apti.apti_pgm2.number_pattern;
/*
 *       1
 *     2 2 2
 *   3 3 3 3 3
 * 4 4 4 4 4 4 4    
 */
public class Pattern12Assignment {

	public static void main(String[] args) {
		int noOfLines = 4;
		int mid = noOfLines/2;
		int space=mid;
		int star=1;
		for(int i=0; i<noOfLines; i++) {
			
			for(int j=0; j<space; j++) {
				System.out.print(" ");
			}
			
			for(int k=star; k>0; k--) {
				System.out.print(k);
			}
			if(i<mid) {
				space--;
				star=star+2;
			}
			System.out.println();

	}

}
}
