package com.xworkz.java_programs.exception.custom_cheked_Exp.custom_unchecked_Exp;

public class Public {

	public static void main(String[] args) {
		Election election = new Election();
		election.vote(19);

	
	try {
		election.vote(17);
	}
	catch(PubExp pubExp) {
		System.out.println(pubExp);
	}

}
}
