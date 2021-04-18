package com.xworkz.java_programs.string.string_buffer;



public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sbr = new StringBuffer("machine");
		System.out.println(sbr);
		
		StringBuffer sbr1 = sbr.append("learing");
		System.out.println(sbr==sbr1);//true
		System.out.println(sbr1);
		
		StringBuffer sbr2 = new StringBuffer();
		System.out.println("capacity:" +sbr2.capacity());
		sbr2.append("StringBuffer Demo");
		System.out.println(sbr2);
		
		sbr1.reverse();
		System.out.println(sbr1);
		
	
		
		

	}

}
