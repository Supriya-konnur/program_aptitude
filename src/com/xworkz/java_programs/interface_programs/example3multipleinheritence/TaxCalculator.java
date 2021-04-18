package com.xworkz.java_programs.interface_programs.example3multipleinheritence;

public class TaxCalculator implements StateTax,CentralTax {

	
	public void roadTax() {
		System.out.println("raod tax of central");
	}

	
	public void waterTax() {
		System.out.println("water tax of state");
		
	}

}
