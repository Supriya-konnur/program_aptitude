package com.xworkz.java_programs.collection_programs.queue.watch_program;

public class Watch implements Comparable{

	String brand;
	String type;
	double price;
	
	public Watch(String brand, String type,double price) {
		this.brand=brand;
		this.type=type;
		this.price=price;
	}

	@Override
	public int compareTo(Object o) {
		Watch watch= (Watch)o;
		Double price1 = this.price;
		Double price2 = watch.price;
		//return price1.compareTo(price2);
		
		return price2.compareTo(price1);
	}

	@Override
	public String toString() {
		return "Watch [brand=" + brand + ", type=" + type + ", price=" + price + "]";
	}
	

	}


