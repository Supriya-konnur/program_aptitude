package com.xworkz.java_programs.inheritence.multilevelinheritence.assignment1_MultilevelInheritence;

public class Assignment1_MultilevelInheritenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Properties of Vehicle");
		Vehicle v = new Vehicle();
		v.wheels();
		v.seats();
		
		System.out.println();
		System.out.println("Properties of Maruticar");
		Maruti m1 = new Maruti();
		m1.wheels();
		m1.seats();
		m1.gearbox();
		m1.speed();
		
		System.out.println();
		System.out.println("Properties of Maruti800car");
		 Maruti800 m2 = new  Maruti800();
		 m2.wheels();
		 m2.seats();
		 m2.fueltype();
		 m2.fueltankcapacity();
		

	}

}
