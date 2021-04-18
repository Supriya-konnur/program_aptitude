package com.xworkz.java_programs.map.hashMap.mobileAndSpecification;

public class Specification {
	String RAM;
	String storage;
	int batteryCapacity;
	double price;
	
	public Specification(String RAM, String storage, int batteryCapacity,double price) {
		this.RAM=RAM;
		this.storage=storage;
		this.batteryCapacity=batteryCapacity;
		this.price=price;
	}

	@Override
	public String toString() {
		return "Specification [RAM=" + RAM + ", storage=" + storage + ", batteryCapacity=" + batteryCapacity
				+ ", price=" + price + "]";
	}

	

	
	
	

}
