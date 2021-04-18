package com.xworkz.java_programs.exception.custom_cheked_Exp.assignment_ATM;

public class ATM {
	void draw(int amount)throws ATMException{
		
		if(amount <100 || amount>50000 || amount%100!=0) {
			
		ATMException atmExp = new ATMException();
		throw atmExp;

	}
	else {
		System.out.println("pleas collect the cash...");
	}
	}

}
