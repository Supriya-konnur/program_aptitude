package com.xworkz.java_programs.apti.matrix;

public class Multiplication {

	public static void main(String[] args) {
		int arr1[][] = {{1,2,3},{4,5,6},{1,2,3}};
		int arr2[][] = {{1,2,3},{1,1,1},{1,2,3}};
		
		int product[][]= new int[3][3];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				for(int k=0; k<3; k++) {
					 product[i][j]+=arr1[i][j]*arr2[i][j];
					 
				}
				System.out.print(product[i][j]+" ");
			}
			System.out.println();
		}

	}

}
