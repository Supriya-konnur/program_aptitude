package com.xworkz.java_programs.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		Waterbottle waterbottle = new Waterbottle();
		waterbottle.setColor("blue");
		waterbottle.setPrice(30.00);
		
		
		System.out.println(waterbottle.getColor());
		System.out.println(waterbottle.getPrice());

	}

}
