package com.xworkz.java_programs.ArrayExamples.arrays_class;
import java.util.Arrays;


public class ArrayClassDemo{

		public static void main(String[] args) {
			int[] array1 = {2,3,4,5};
			Arrays.sort(array1);
			System.out.println(Arrays.toString(array1));
			
			int[] copy =Arrays.copyOf(array1,3);
			System.out.println(Arrays.toString(copy));
			
			int[] copyRange = Arrays.copyOfRange(array1,2,4);
			System.out.println(Arrays.toString(copyRange));
			
			System.out.println(Arrays.binarySearch(array1,5));
			
			
			

		}

		
	

}
