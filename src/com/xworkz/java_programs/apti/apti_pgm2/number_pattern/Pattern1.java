package com.xworkz.java_programs.apti.apti_pgm2.number_pattern;
/*
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 
1 2 
1 


 */
public class Pattern1 {

	public static void main(String[] args) {
		int noOfLines = 7;
		int mid = noOfLines/2;
		int time = 1;
		
		for(int i=0; i<=noOfLines; i++) {
			for(int j=1; j<=time; j++) {
				System.out.print(j+ " ");
			}
			if(i<mid) {
				time++;
			}
			else {
				time--;
			}
			System.out.println();
				
		}

	}

}
