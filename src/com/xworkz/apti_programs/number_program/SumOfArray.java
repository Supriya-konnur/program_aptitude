package com.xworkz.apti_programs.number_program;

public class SumOfArray {

	public static void main(String[] args) {
		int arr1[][] = {{1,2,3},
						{4,5,6},
						{7,8,9}};
		
		int primarysum=0;
		int secondarysum=0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(i==j)
					primarysum = primarysum+arr1[i][j];
				if(i+j==2)
					secondarysum = secondarysum+arr1[i][j];	
			}
			
		}
		System.out.println("sum of primary diagonals= "+primarysum);
		System.out.println("sum of secondary diagonals= "+secondarysum);
		

	}

}
