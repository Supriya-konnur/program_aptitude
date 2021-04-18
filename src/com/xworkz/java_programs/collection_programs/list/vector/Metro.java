package com.xworkz.java_programs.collection_programs.list.vector;

public class Metro {
	String number;
	int noOfCars;
	double price;
	
	public Metro(String i, int j, double price) {
		this.number=i;
		this.noOfCars=j;
		this.price=price;
		
	}

	@Override
	public String toString() {
		return "Metro [number=" + number + ", noOfCars=" + noOfCars + ", price=" + price + "]";
	}
	

}
