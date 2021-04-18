package com.xworkz.java_programs.apti.apti_pgm2.stra_pattern;
/*
 *    1 
    2 1 
  3 2 1 
4 3 2 1 
  3 2 1 
    2 1 
      1 

 */
public class Pattern8 {

	public static void main(String[] args) {
		int noOfLines = 7;
		int mid = noOfLines/2;
		int space = mid;
		
		for(int i=0; i<noOfLines; i++) {
			for(int j=0; j<space; j++) {
				System.out.print("  ");
			}
			
			for(int k=mid-space+1; k>0; k--) {
				System.out.print(k+" ");
			}
			if(i<mid)
				space--;
			else
				space++;
			System.out.println();

	}
		
		
	}

}
