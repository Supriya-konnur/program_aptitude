package com.xworkz.java_programs.array.singleDimentionalArray;

public class ArrayTest {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		int num=11;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=num;
			num++;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
