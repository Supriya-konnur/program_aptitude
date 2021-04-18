package com.xworkz.java_programs.string.string_builder;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		System.out.println("capacity:"+sb.capacity());
		sb.append("String Builder demo");
		System.out.println(sb);
		
//		StringBuilder sb1=sb.substring(5);
//		System.out.println(sb1);

	}

}
