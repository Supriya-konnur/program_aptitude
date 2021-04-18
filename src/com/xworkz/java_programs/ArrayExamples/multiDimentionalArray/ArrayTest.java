package com.xworkz.java_programs.array.multiDimentionalArray;

public class ArrayTest {

	public static void main(String[] args) {
		int[][]arr = new int[3][3];
		int num=100;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j]=num;
				num++;
			}
		}
		System.out.println("the element of array is:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
