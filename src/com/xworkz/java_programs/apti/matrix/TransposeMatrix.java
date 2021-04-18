package com.xworkz.java_programs.apti.matrix;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the elements for original matrix:");
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				arr[i][j]=s.nextInt();
			}
		}
		System.out.println("enter the elements for Transpose matrix:");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
		s.close();
				

	}

}
