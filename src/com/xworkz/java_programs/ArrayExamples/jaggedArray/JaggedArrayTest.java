package com.xworkz.java_programs.ArrayExamples.jaggedArray;

public class JaggedArrayTest {

	public static void main(String[] args) {
		int[][] arr = new int[3][];
		
		arr[0] = new int[4];
		arr[1] = new int[3];
		arr[2] = new int[2];
		
		int num=100;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print((arr[i][j]=num)+" " );
				num++;
			}
			System.out.println();
		}

	}

}
