package com.xworkz.java_programs.ternaryOperator;

public class AssignmentTernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10;
		int y=20;
		int z=30;
		
		int result=(x>y)?(x>z?x:z):(y>z?y:z);
		
		System.out.println("largest number:" +result);

	}

}
