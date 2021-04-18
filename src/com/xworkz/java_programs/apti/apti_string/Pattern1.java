package com.xworkz.java_programs.apti.apti_string;

import java.util.Scanner;

public class Pattern1 {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.nextLine();
		sc.close();
		char[] a =s.toCharArray();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(a[j]);
				
			}
			System.out.println();
		}

	}
}
