package com.xworkz.java_programs.exception.custom_cheked_Exp.custom_unchecked_Exp;

public class Election {
	void vote(int age) {
		
		if(age<18) {
			PubExp pubExp= new PubExp();
			throw pubExp;
		}
		else
			System.out.println("thank you for voting..!");
	}

}
