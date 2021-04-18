package com.xworkz.java_programs.exception.custom_cheked_Exp.dMart;

public class Dmart {
	String fruits;
	String vegitables;
	String cloths;
	boolean isServerUp=true;
	
	void findItem(String itemName) throws DmartExp {
		if(itemName.equalsIgnoreCase("cloths") || itemName.equalsIgnoreCase("vegitables") || 
				itemName.equalsIgnoreCase("fruits")) {
			System.out.println("Item found please collect it");
		}
		else {
			DmartExp de = new DmartExp();
			throw de;
		}
	}

	public void payBill(int amount) {
		if(isServerUp) {
			System.out.println("thankyou visit again!");
		}
		else {
			System.out.println("please wait for sometime server is down");
		}
		
	}

}
