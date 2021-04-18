package com.xworkz.java_programs.exception.custom_cheked_Exp.assignment_ATM;

public class Person {

	public static void main(String[] args) {
		//int amount = 500;
		int amount = 550;
		
		ATM atm = new ATM();
		try {
			atm.draw(amount);
			
		}catch(Exception e) {
			if(amount>5000|| amount <100)
			System.out.println(e);
			else
				System.out.println(e.getMessage());
		}

	}

}
