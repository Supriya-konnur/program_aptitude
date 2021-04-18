package com.xworkz.java_programs.apti.apti_string;

public class DifferentiateAlphaAndSpecialChar {

	public static void main(String[] args) {
		String str="@-/abc*$";
		char[]alphaArray= new char[str.length()];
		char[]specCharArray = new char[str.length()];
		
		
		for (int i = 0; i < str.length() ; i++) {
			if(str.charAt(i)>=65 && str.charAt(i)>=90 || str.charAt(i)>=97 && str.charAt(i)<=122){
				alphaArray[i]=str.charAt(i);
			}
			else
				specCharArray[i]=str.charAt(i);
			
		}
		System.out.println("Alpha array elements:");
		
		for (int i = 0; i < alphaArray.length; i++) {
			System.out.print(alphaArray[i]);
		}
		System.out.println();
		System.out.println("special char Array elements:");
		for (int i = 0; i < specCharArray.length; i++) {
			System.out.print(specCharArray);
		}

	}

}
