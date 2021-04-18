package com.xworkz.java_programs.apti.apti_pgm2.number_pattern;
/*
    0     
  1 1 2   
3 5 8 13 21 

 */
public class Fibonacci {

	public static void main(String[] args) {
		int row=3;
		int column= 5;
		int mid=column/2;
		int sum=0;
		int a=0;
		int b=1;
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if(i+j>=mid && j-i<=mid) {
					System.out.print(a+" ");
					sum=a+b;
					a=b;
					b=sum;
				}
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}
			
		}		

	}


