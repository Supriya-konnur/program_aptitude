package com.xworkz.java_programs.apti.matrix;

import java.util.Scanner;

public class AdditionMatrix {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the row lenth:");
		int rowlenght =s.nextInt();
		System.out.println("Enter the col lenth:");
		int colLength = s.nextInt();
		int[][] arr = new int[rowlenght][colLength];
		int[][] arr1 = new int[rowlenght][colLength];
		
		System.out.println("Enter the elements for matrix1:");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j] = s.nextInt();
				
			}
		}
		System.out.println("Enter the elements for matrix2:");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr1[i][j] = s.nextInt();
			}
		}
		System.out.println("the addition of matrix1 and matrix2 is:");
		int[][] result= new int[rowlenght][colLength];
		for(int i=0;i<arr.length;i++) { 
			for(int j=0;j<arr.length;j++) {
				result[i][j] = arr[i][j]+arr1[i][j];
				System.out.println(result[i][j]);
			}
			System.out.println();
		}
		
		s.close();		
				

	}

}
