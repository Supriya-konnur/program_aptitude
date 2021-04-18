package com.xworkz.java_programs.constructor.constructor_overloading;

public class ConstructorOverloadingDemo {

	public static void main(String[] args) {
		
		Amb amb = new Amb();
		System.out.println(amb.name);
		System.out.println(amb.noOfParticipents);
		
		Amb amb1 = new Amb("Amb");
		System.out.println(amb1.name);
		System.out.println(amb1.noOfParticipents);
		
		Amb amb2 = new Amb("Amb",17);
		System.out.println(amb2.name);
		System.out.println(amb2.noOfParticipents);
	

	}

}
