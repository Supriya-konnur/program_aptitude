package com.xworkz.java_programs.exception.custom_cheked_Exp.dMart;

public class Customer {

	public static void main(String[] args) {
		Dmart dmart = new Dmart();
		try {
			dmart.findItem("furnitures");
			dmart.payBill(1000);
		}
		catch(DmartExp de) {
			if(dmart.isServerUp)
			System.out.println(de);
			else
				System.out.println(de.getMessage());
		}

	}

}
