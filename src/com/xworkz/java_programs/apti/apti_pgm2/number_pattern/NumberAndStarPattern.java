package com.xworkz.java_programs.apti.apti_pgm2.number_pattern;
/*
   1
  1*2
 1*2*3
1*2*3*4

 */
public class NumberAndStarPattern {

	public static void main(String[] args) {
		int noOfLines=4;
		int space=noOfLines-1;
		int colLength=1;
		for(int i=0;i<noOfLines;i++) {
			int x=1;
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < colLength; k++) {
				if(!(k%2==0)) {
					System.out.print("*");
				}
				else {
					System.out.print(x);
					x++;
				}
			}
			colLength+=2;
			space--;
			System.out.println();
		}


	}

}
