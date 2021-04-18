package com.xworkz.java_programs.apti.array;

public class ArrayConcatination {

	public static void main(String[] args) {
		int [] arr1= {1,2,3,4,9,6};
		int [] arr2 = {5,6,7,8};
		int[] res=new int[arr1.length+arr2.length];
		int i=0;
		int k=0;
		for (;i<arr1.length && i < arr2.length ; i++) {
			res[k]=arr1[i];
			k++;
			res[k]=arr2[i];
			k++;
		}
		for (; i < arr1.length; i++) {
			res[k]=arr1[i];
			k++;
			
		}
		for (; i < arr2.length; i++) {
			res[k]=arr2[i];
			k++;
		}
		for (int j = 0; j < res.length; j++) {
			System.out.print(res[j]+" ");
		}

	}

}
