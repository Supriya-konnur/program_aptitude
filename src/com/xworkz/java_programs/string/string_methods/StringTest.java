package com.xworkz.java_programs.string.string_methods;

public class StringTest {

	public static void main(String[] args) {
		String s = "java";
		String s2 = new String("java");
		System.out.println(s==s2);
		System.out.println(s.hashCode());
		s=new String("java");
		System.out.println(s.hashCode());
		String s1 ="java";
		System.out.println(s==s1);
		System.out.println(s1.hashCode());
		s="programming";
		System.out.println(s.hashCode());
		System.out.println(s==s1);
        
	}

}
