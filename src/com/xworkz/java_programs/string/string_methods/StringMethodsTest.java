package com.xworkz.java_programs.string.string_methods;

import java.util.Arrays;

public class StringMethodsTest {

	public static void main(String[] args) {
		String s ="Rose";
		
		System.out.println("char at the position2:"+s.charAt(2));
		s.concat("flower");
		System.out.println(s);
		
		String concatString = s.concat("flower");
		System.out.println(concatString);
		
		System.out.println(s.contains("os"));//true
		System.out.println(s.contains("os1"));//false
		
		System.out.println(s.contentEquals("jasmine"));//false
		System.out.println(s.contentEquals("Rose"));//true
		
		System.out.println(s.endsWith("se"));//true
		System.out.println(s.indexOf('o'));//1
		
		System.out.println(s.isEmpty());//false
		System.out.println(s.length());//4
		
		System.out.println(s.replace('R', 'r'));
		
		String splittedString[] = s.split("o");
		System.out.println(Arrays.toString(splittedString));//[R, se]
		
		String subString = s.substring(1,3);
		System.out.println(subString);//os
		
		String lowerCaseString = s.toLowerCase();
		System.out.println(lowerCaseString);
		
		String upperCaseString = s.toUpperCase();
		System.out.println(upperCaseString);
		
		String s1 = " Asha is java trainer ";
		String stringTrim = s1.trim();
		System.out.println(stringTrim);
		
		String valueOfChar = s.valueOf('A');
		System.out.println(valueOfChar);//A
		
		String valueOfInt = s.valueOf(12);
		System.out.println(valueOfInt);//12
	}

}
