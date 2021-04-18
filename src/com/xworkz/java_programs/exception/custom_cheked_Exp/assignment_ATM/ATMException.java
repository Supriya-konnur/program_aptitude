package com.xworkz.java_programs.exception.custom_cheked_Exp.assignment_ATM;

public class ATMException extends Exception {
	
	public String toSTring() {
		return "sorry, you are crossing the limit";
		
	}

	@Override
	public String getMessage() {
		
		return "invalid amount";
	}
	

}
