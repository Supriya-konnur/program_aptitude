package com.xworkz.java_programs.exception.custom_cheked_Exp.dMart;

public class DmartExp extends Exception {

	@Override
	public String toString() {
	
		return "items not found"; 
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "bank server is down";
	}
	
	
	
	

}
