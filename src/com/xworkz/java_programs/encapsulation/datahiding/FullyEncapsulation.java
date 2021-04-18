package com.xworkz.java_programs.encapsulation.datahiding;

public class FullyEncapsulation {

	public static void main(String[] args) {
		Bag bag = new Bag();
		
		bag.setBrand("Wildcraft");
		bag.setColor("black");
		bag.setPrice(1000.00);
		
		System.out.println(bag.getBrand());
		System.out.println(bag.getColor());
		System.out.println(bag.getPrice());

	}

}
