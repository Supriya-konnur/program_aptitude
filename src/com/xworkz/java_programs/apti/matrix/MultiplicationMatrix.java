package com.xworkz.java_programs.apti.matrix;

import java.util.Scanner;

public class MultiplicationMatrix {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		int[][] arr1 = new int[3][3];
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the elements for matrix1:");
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				arr[i][j]=s.nextInt();
			}
		}
		System.out.println("enter the elements for matrix2:");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				arr1[i][j]=s.nextInt();
			}
		}
		System.out.println("multiplication of matricx1 and matrix2 is:");
		
		int[][] product = new int[3][3];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				for(int k=0; k<3; k++) {
					product[i][j]+= arr[i][k]*arr1[k][j];
					
				}
				System.out.print(product[i][j]+" ");
				}
			System.out.println();
			}
		s.close();
		}
		

	}


