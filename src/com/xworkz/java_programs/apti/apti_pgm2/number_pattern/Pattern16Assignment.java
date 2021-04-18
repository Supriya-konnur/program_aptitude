package com.xworkz.java_programs.apti.apti_pgm2.number_pattern;

/*
 *          0 
          1 0 1 
        2 1 0 1 2 
      3 2 1 0 1 2 3 
    4 3 2 1 0 1 2 3 4 

 * 
 */

public class Pattern16Assignment {

	public static void main(String[] args) {
		int noOfLines =9;
		int mid= noOfLines/2;
		int space=mid;
		int n = 1;
		
		for(int i=1; i<noOfLines-mid; i++) {
			
			for(int j=0; j<=space; j++) {
				System.out.print("  ");
			}
			
			for(int k=n/2; k>=0; k--) {
				System.out.print(k+" ");
			}
			for(int l=1; l<i; l++) {
				System.out.print(l+" ");
			}
		
			if(i<mid) {
				space--;
				n=n+2;	
			}
			
			System.out.println();
		}
		

	}

}
