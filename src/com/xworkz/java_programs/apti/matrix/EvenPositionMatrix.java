package com.xworkz.java_programs.apti.matrix;

import java.util.Scanner;

public class EvenPositionMatrix {

	public static void main(String[] args) {
		//int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("eneter the element");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
					
		}
		
		System.out.println("elements of th given array present on even position:");
		
		for (int i = 1; i < arr.length; i=i+2) {
			System.out.print(arr[i]+" ");
		}

	}

}
