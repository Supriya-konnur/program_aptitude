package com.xworkz.apti_programs.alphabet_pattern;

public class I {

	public static void main(String[] args) {
		
			int n=4;
			
			for (int i = 0; i <= n; i++) {
				for (int j = 0; j <= n; j++) {
					if( i==0|| j==n/2-1 ||i==n) 
						System.out.print("* ");
					else
						System.out.print("   ");
				}
				System.out.println();
				
			}

	}

}
