package com.xworkz.java_programs.interface_programs.example2Mobile;

public class MobileTest {

	public static void main(String[] args) {
		
		ServiceProvider airtel = new Airtel();
		ServiceProvider idea = new Idea();
		
		MiMobile mobile = new MiMobile();
		
		mobile.simSlot(airtel);
		mobile.simSlot(idea);
		

	}

}
