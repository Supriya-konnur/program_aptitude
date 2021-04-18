package com.xworkz.java_programs.ArrayExamples.jaggedArray;
import java.util.Scanner;
public class JaggedArrayTest1 {

	public static void main(String[] args) {
		
		
		int[][] arr = new int[3][];

		arr[0] = new int[4];
		arr[1] = new int[3];
		arr[2] = new int[2];
		
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=s.nextInt();
			}
		}
		System.out.println("the elements of array is:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
			s.close();
		
		}

	}

