package com.xworkz.java_programs.apti.apti_pgm2.number_pattern;
/*
 * 0
  101
 21012
3210123

 */

public class Pattern16 {

	public static void main(String[] args) {
		int rowlength =4;
		int space = rowlength-1;
		int colLength=1;
		
		for(int i=0; i<rowlength; i++) {
			int num= rowlength-space-1;
			for(int j=0; j<space; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=colLength; k++) {
				System.out.print(num);
				if(k<=colLength/2)
					num--;
				else
					num++;
			}
			colLength+=2;
			space--;
			System.out.println();
		}

	}

}
