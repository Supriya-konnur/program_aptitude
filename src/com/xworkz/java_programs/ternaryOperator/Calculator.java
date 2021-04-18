package com.xworkz.java_programs.ternaryOperator;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=32 ;
		int b=3;
		String c;
		 Scanner s= new Scanner(System.in);
			System.out.println("enter thwe symbol");
		c= s.nextLine();
	
		if(c=="+")
			System.out.println("sum=" +(a+b));
		else if(c =="-")
			System.out.println("sub =" +(a-b));
		else if(c == "*")
			System.out.println("mul =" +(a*b));
		else if(c == "/")
			System.out.println("div=" +(a/b));

	}

}
